package com.nathaliaCardoso.RunTheBank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {

    @Id
    private String documento;
    private String nome;
    private String endereco;
    private String email;
    private String senha;
//    private List<ContaEntity> contas;
}
