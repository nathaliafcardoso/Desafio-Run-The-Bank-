package com.nathaliaCardoso.RunTheBank.controller;

import com.nathaliaCardoso.RunTheBank.entity.ClienteEntity;
import com.nathaliaCardoso.RunTheBank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService service;

    @GetMapping
    public ResponseEntity getAllClientes() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/id")
    public ResponseEntity getClienteById(@RequestParam String id) {

        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping
    public ResponseEntity putClienteById(@RequestBody ClienteEntity cliente) {
        return ResponseEntity.ok(service.save(cliente));
    }

    @PostMapping
    public ResponseEntity createCustomer(@RequestBody ClienteEntity cliente){

        return ResponseEntity.ok(service.save(cliente));
    }

    @DeleteMapping
    public ResponseEntity deleteCustomer(@RequestBody String document) {
        service.delete(document);
        return ResponseEntity.ok(true);
    }
}
