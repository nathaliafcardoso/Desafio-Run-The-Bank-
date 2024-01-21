package com.nathaliaCardoso.RunTheBank.respository;

import com.nathaliaCardoso.RunTheBank.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <ClienteEntity, String>{
}
