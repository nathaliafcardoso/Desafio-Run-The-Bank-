package com.nathaliaCardoso.RunTheBank.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoEntityTest {

    @Test
    void testSetIdTransacao() {
        TransacaoEntity p1 = new TransacaoEntity();
        p1.setIdTransacao(1266L);
        assertEquals(1266L, p1.getIdTransacao());
        assertNotNull(p1);
    }

    @Test
    void setContaOrigem() {
        TransacaoEntity p1 = new TransacaoEntity();
        p1.setContaOrigem(1266L);
        assertEquals(1266L, p1.getContaOrigem());
        assertNotNull(p1);
    }

    @Test
    void setContaDestino() {
        TransacaoEntity p1 = new TransacaoEntity();
        p1.setContaDestino(1266L);
        assertEquals(1266L, p1.getContaDestino());
        assertNotNull(p1);
    }

    @Test
    void setValor() {
        TransacaoEntity p1 = new TransacaoEntity();
        p1.setValor(12.66);
        assertEquals(12.66, p1.getValor());
        assertNotNull(p1);
    }

    @Test
    void setRevertida() {
        TransacaoEntity p1 = new TransacaoEntity();
        p1.setRevertida(Boolean.FALSE);
        assertEquals(Boolean.FALSE, p1.getRevertida());
        assertNotNull(p1);
    }

    @Test
    void setData() {
        TransacaoEntity p1 = new TransacaoEntity();
        p1.setData("12/01/2024");
        assertEquals("12/01/2024", p1.getData());
        assertNotNull(p1);

    }
}