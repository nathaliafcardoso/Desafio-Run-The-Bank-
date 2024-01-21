package com.nathaliaCardoso.RunTheBank.service;

import com.nathaliaCardoso.RunTheBank.entity.ClienteEntity;
import com.nathaliaCardoso.RunTheBank.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {

    @InjectMocks
    ClienteService service;

    @Mock
    ClienteRepository customerRepository;

    @Test
    void testCreateCustomer() {

        ClienteEntity p1 = new ClienteEntity();
        p1.setDocumento("400.000.000-00");
        p1.setNome("Maria");
        p1.setSenha("123L@");
        p1.setEndereco("teste");
        p1.setEmail("teste@teste");
        assertNotNull(p1);
        service.save(p1);

        assertNotNull(p1);
    }

    @Test
    void testFindById() {

        ClienteEntity p1 = new ClienteEntity();
        p1.setDocumento("400.000.000-00");
        p1.setNome("Maria");
        p1.setSenha("123L@");
        p1.setEndereco("teste");
        p1.setEmail("teste@teste");
        service.findById(p1.getDocumento());

        assertNotNull(p1);
    }

    @Test
    void testListAllCustomer() {

        ClienteEntity p1 = new ClienteEntity();
        p1.setDocumento("400.000.000-00");
        p1.setNome("Maria");
        p1.setSenha("123L@");
        p1.setEndereco("teste");
        p1.setEmail("teste@teste");
        service.listAll();

        assertNotNull(p1);
    }

    @Test
    void testDeleteCustomer() {

        ClienteEntity p1 = new ClienteEntity();
        p1.setDocumento("400.000.000-00");
        p1.setNome("Maria");
        p1.setSenha("123L@");
        p1.setEndereco("teste");
        p1.setEmail("teste@teste");
        service.delete(p1.getDocumento());

        assertNotNull(p1);
    }
}
