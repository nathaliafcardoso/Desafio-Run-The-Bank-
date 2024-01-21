package com.nathaliaCardoso.RunTheBank.service;

import com.nathaliaCardoso.RunTheBank.entity.TransacaoEntity;
import com.nathaliaCardoso.RunTheBank.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {

    @Autowired
    TransacaoRepository repository;
    @Autowired
    ContaService contaService;

    public TransacaoEntity findById(Long id){
        return repository.findById(id).orElse(new TransacaoEntity());
    }

    public ResponseEntity transacao(Long contaOrigem, Long contaDestino, Long id){

        var emissor = contaService.findById(id);
        var emitente = contaService.findById(id);

        return null;
    }


}



