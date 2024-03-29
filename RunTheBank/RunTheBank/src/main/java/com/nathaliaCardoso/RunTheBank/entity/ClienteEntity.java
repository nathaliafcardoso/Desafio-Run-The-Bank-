package com.nathaliaCardoso.RunTheBank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {

    @Id
    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String documento;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String nome;

    @ManyToOne
    private Endereco endereco;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String email;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String senha;

    @OneToMany
    private List<ContaEntity> contas;
}
