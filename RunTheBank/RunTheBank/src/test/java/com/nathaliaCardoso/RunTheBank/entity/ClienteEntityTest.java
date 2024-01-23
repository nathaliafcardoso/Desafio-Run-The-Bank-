package com.nathaliaCardoso.RunTheBank.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteEntityTest {

    @Test
    void setDocumento() {

        ClienteEntity p1 = new ClienteEntity();
        p1.setDocumento("400.000.000-00");
        assertEquals("400.000.000-00", p1.getDocumento());
    }

    @Test
    void testSetNome() {

        ClienteEntity p1 = new ClienteEntity();
        p1.setNome("Maria Silva");
        assertEquals("Maria Silva", p1.getNome());
    }


    @Test
    void setEmail() {
        ClienteEntity p1 = new ClienteEntity();
        p1.setEmail("MariaSilva@gmail.com.br");
        assertEquals("MariaSilva@gmail.com.br", p1.getEmail());
    }

    @Test
    void testSetSenha() {

        ClienteEntity p1 = new ClienteEntity();
        p1.setSenha("MariaSilva@gmail.com.br");
        assertEquals("MariaSilva@gmail.com.br", p1.getSenha());
    }
}