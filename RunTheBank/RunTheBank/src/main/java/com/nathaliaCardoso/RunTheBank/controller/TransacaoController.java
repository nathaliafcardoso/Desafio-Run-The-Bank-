package com.nathaliaCardoso.RunTheBank.controller;

import com.nathaliaCardoso.RunTheBank.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    TransacaoService service;

    @PostMapping
    public ResponseEntity createTransaction(@RequestParam Long contaOrigem, @RequestParam Long contaDestino, @RequestParam  Double valor) {
        return ResponseEntity.ok(service.transacao(contaOrigem,contaDestino,valor));
    }

    @PutMapping
    public ResponseEntity reverterTransaction(@RequestParam Long idTransacao) {
        return ResponseEntity.ok(service.reverter(idTransacao));
    }

    @GetMapping("/idTransacao")
    public ResponseEntity getTransactionByidTransacao(@RequestParam Long idTransacao ) {

        return ResponseEntity.ok(service.findById(idTransacao));
    }

}
