package com.nathaliaCardoso.RunTheBank.service;

import com.nathaliaCardoso.RunTheBank.entity.ContaEntity;
import com.nathaliaCardoso.RunTheBank.repository.ContaRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    ContaRepository contaRepository;


    public ContaEntity createAccount(ContaEntity account) {
        contaRepository.save(account);
        return account;
    }

    public ContaEntity findById(Long id){
        return contaRepository.findById(id).orElse(new ContaEntity());
    }


    public List<ContaEntity> listAllAccount() {
        return contaRepository.findAll();
    }
    @SneakyThrows
    public ContaEntity updateAccount(ContaEntity account) {
        contaRepository.save(account);

        if(account.getSaldo() < 0){
            throw new Exception("Saldo da conta não é suficente");
        }
        return account;
    }

    public void deleteAccount(Long account) {
        contaRepository.deleteById(account);
    }
}
