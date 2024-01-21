package com.nathaliaCardoso.RunTheBank.repository;

import com.nathaliaCardoso.RunTheBank.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <ClienteEntity, String>{
}
