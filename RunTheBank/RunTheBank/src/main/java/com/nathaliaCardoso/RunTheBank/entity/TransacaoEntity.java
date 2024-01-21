package com.nathaliaCardoso.RunTheBank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoEntity {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransacao;

    private Long contaOrigem;
    private Long contaDestino;

    private Double valor;
    private Boolean revertida;

    @DateTimeFormat
    private String data;

}
