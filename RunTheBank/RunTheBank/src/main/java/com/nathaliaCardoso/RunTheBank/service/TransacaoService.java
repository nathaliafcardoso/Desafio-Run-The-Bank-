package com.nathaliaCardoso.RunTheBank.service;

import com.nathaliaCardoso.RunTheBank.entity.TransacaoEntity;
import com.nathaliaCardoso.RunTheBank.enums.Status;
import com.nathaliaCardoso.RunTheBank.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransacaoService {

    @Autowired
    TransacaoRepository repository;
    @Autowired
    ContaService contaService;

    public TransacaoEntity findById(Long id) {
        return repository.findById(id).orElse(new TransacaoEntity());
    }

    public String transacao(Long contaOrigem, Long contaDestino, Double valor) {

        var emissor = contaService.findById(contaOrigem);
        var emitente = contaService.findById(contaDestino);
        var transacao = new TransacaoEntity(contaOrigem, contaDestino, valor, false, LocalDateTime.now());

        if (emissor.getStatus() == Status.INATIVA || emitente.getStatus() == Status.INATIVA) {
            return "Ambas as contas devem estar ativas";
        }
        if (emissor.getSaldo() < valor) {
            return "Saldo insuficiente para realizar a transacao";
        }
        emissor.setSaldo(emissor.getSaldo() - valor);
        emitente.setSaldo(emitente.getSaldo() + valor);

        contaService.updateAccount(emissor);
        contaService.updateAccount(emitente);
        repository.save(transacao);

        return "Transacao realizada com sucesso";
    }

    public String reverter(Long idTransacao) {

        var transactionOptinal = repository.findById(idTransacao);

        if (transactionOptinal.isEmpty()) {
            return "Transacao nao encontrada";
        }

        var transaction = transactionOptinal.get();
        if(transaction.getRevertida()){
            return "transacao já revertida";
        }
        var responseReverse = this.transacao(transaction.getContaDestino(), transaction.getContaOrigem(), transaction.getValor());

        if (responseReverse == "Transacao realizada com sucesso") {

            transaction.setRevertida(true);
            repository.save(transaction);
            return "Transacao revertida com sucesso";
        }
        return "Saldo insuficiente para reverter a transacao ou conta Inativa";
    }
}



