package com.nathaliaCardoso.RunTheBank.entity;

import com.nathaliaCardoso.RunTheBank.enums.Status;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEntityTest {

    @Test
    void setId() {

        ContaEntity p1 = new ContaEntity();
        p1.setId(123L);
        assertEquals(123L, p1.getId());
        assertNotNull(p1);
    }

    @Test
    void setAgencia() {

        ContaEntity p1 = new ContaEntity();
        p1.setAgencia(123);
        assertEquals(123, p1.getAgencia());
        assertNotNull(p1);
    }

    @Test
    void setConta() {

        ContaEntity p1 = new ContaEntity();
        p1.setConta(123345L);
        assertEquals(123345L, p1.getConta());
        assertNotNull(p1);
    }

    @Test
    void setStatus() {

        ContaEntity p1 = new ContaEntity();
        p1.setStatus(Status.ATIVA);
        assertEquals(Status.ATIVA, p1.getStatus());
        assertNotNull(p1);
    }

    @Test
    void setSaldo() {

        ContaEntity p1 = new ContaEntity();
        p1.setSaldo(12.66);
        assertEquals(12.66, p1.getSaldo());
        assertNotNull(p1);
    }
}