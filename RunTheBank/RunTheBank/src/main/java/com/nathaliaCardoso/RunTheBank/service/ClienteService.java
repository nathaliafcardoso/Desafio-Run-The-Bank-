package com.nathaliaCardoso.RunTheBank.service;

import com.nathaliaCardoso.RunTheBank.entity.ClienteEntity;
import com.nathaliaCardoso.RunTheBank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public ClienteEntity save(ClienteEntity cliente) {
        repository.save(cliente);
        return cliente;
    }

    public void delete(String documento) {
        repository.deleteById(documento);
    }

    public List<ClienteEntity> listAll() {
        return repository.findAll();
    }

    public ClienteEntity findById(String id) {
        return repository.findById(id).orElse(new ClienteEntity());
    }
}
