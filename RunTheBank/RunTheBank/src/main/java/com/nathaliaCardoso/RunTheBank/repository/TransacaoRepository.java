package com.nathaliaCardoso.RunTheBank.repository;

import com.nathaliaCardoso.RunTheBank.entity.TransacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<TransacaoEntity, Long> {

}
