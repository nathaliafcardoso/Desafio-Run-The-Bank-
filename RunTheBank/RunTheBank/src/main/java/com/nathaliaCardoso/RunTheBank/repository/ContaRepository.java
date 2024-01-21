package com.nathaliaCardoso.RunTheBank.repository;

import com.nathaliaCardoso.RunTheBank.entity.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long> {

//    ContaEntity findByAccountAndAgencyNumber(Integer agency,Long account);
}
