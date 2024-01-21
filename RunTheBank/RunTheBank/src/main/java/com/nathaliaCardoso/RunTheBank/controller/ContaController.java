package com.nathaliaCardoso.RunTheBank.controller;

import com.nathaliaCardoso.RunTheBank.entity.ContaEntity;
import com.nathaliaCardoso.RunTheBank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/conta")
public class ContaController {
    @Autowired
    ContaService contaService;

    @PostMapping
    public ResponseEntity createAccount(@RequestBody ContaEntity account) {
        return ResponseEntity.ok(contaService.createAccount(account));
    }

    @PutMapping
    public ResponseEntity updateAccount(@RequestBody ContaEntity account) {
        return ResponseEntity.ok(contaService.updateAccount(account));
    }

    @GetMapping("/id")
    public ResponseEntity getAccount(@RequestParam Long id) {
        return ResponseEntity.ok(contaService.findById(id));
    }

//    @GetMapping("/agencia")
//    public ResponseEntity getAccount(@RequestParam String account, @RequestParam Integer agency){
////        return ResponseEntity.ok(contaService.findByAccountAndAgencyNumber(account,agency));
//    }

    @GetMapping
    public ResponseEntity getAllAccount() {
        return ResponseEntity.ok(contaService.listAllAccount());
    }

    @DeleteMapping
    public ResponseEntity deleteAccount(@RequestBody Long account) {
        contaService.deleteAccount(account);
        return ResponseEntity.ok(true);
    }
}



