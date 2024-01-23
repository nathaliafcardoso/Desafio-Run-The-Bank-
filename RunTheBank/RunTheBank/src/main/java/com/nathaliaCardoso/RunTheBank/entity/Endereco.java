package com.nathaliaCardoso.RunTheBank.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String cep;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String rua;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String numero;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String bairro;

    @Column(nullable = true)
    private String complemento;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private String cidade;

    @NotNull
    @Column(nullable = false)
    private String estado;
}
