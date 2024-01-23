package com.nathaliaCardoso.RunTheBank.entity;

import com.nathaliaCardoso.RunTheBank.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ContaEntity {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ClienteEntity cliente;
    @NotNull
    @Column(unique = true)
    @NotNull(message = "Campo Obrigatorio!")
    private Integer agencia;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private Long conta;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private Status status;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private Double saldo;


}
