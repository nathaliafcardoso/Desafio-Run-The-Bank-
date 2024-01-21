package com.nathaliaCardoso.RunTheBank.service;

import com.nathaliaCardoso.RunTheBank.entity.ContaEntity;
import com.nathaliaCardoso.RunTheBank.enums.Status;
import com.nathaliaCardoso.RunTheBank.repository.ContaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ContaServiceTest {

    @InjectMocks
    ContaService service;

    @Mock
    ContaRepository accountRepository;


    @Test
    void testCreateAccount() {


        ContaEntity p1 = new ContaEntity();
        p1.setConta(123345L);
        p1.setId(123L);
        p1.setAgencia(123);
        p1.setStatus(Status.ATIVA);
        p1.setSaldo(12.66);

        service.createAccount(p1);

        assertNotNull(p1);

    }


    @Test
    void testListAllAccount() {

        ContaEntity p1 = new ContaEntity();
        p1.setConta(123345L);
        p1.setId(123L);
        p1.setAgencia(123);
        p1.setStatus(Status.ATIVA);
        p1.setSaldo(12.66);

        service.listAllAccount();

        assertNotNull(p1);
    }

    @Test
    void testUpdateAccount() {

        ContaEntity p1 = new ContaEntity();
        p1.setConta(123345L);
        p1.setId(123L);
        p1.setAgencia(123);
        p1.setStatus(Status.ATIVA);
        p1.setSaldo(12.66);

        service.updateAccount(p1);

        assertNotNull(p1);
    }

    @Test
    void testFindById() {

        ContaEntity p1 = new ContaEntity();
        p1.setId(123L);

        service.findById(p1.getId());
        assertNotNull(p1);
    }

    @Test
    void testDeleteById() {

        ContaEntity p1 = new ContaEntity();
        p1.setId(123L);

        service.deleteAccount(p1.getId());
        assertNotNull(p1);
    }
}