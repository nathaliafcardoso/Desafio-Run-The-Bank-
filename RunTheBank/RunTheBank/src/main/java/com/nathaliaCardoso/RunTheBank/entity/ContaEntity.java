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
    //    private ClienteEntity cliente;
    @NotNull
    @Column(unique = true)
    private Integer agencia;
    private Long conta;
    private Status status;
    private Double saldo;


}
