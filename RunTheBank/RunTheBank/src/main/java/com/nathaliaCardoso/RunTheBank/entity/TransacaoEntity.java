package com.nathaliaCardoso.RunTheBank.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TransacaoEntity {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransacao;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private Long contaOrigem;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private Long contaDestino;

    @NotNull(message = "Campo Obrigatorio!")
    @Column(nullable = false)
    private Double valor;

    private Boolean revertida;

    @DateTimeFormat
    private LocalDateTime data;

    public TransacaoEntity(Long contaOrigem, Long contaDestino, Double valor, Boolean revertida, LocalDateTime data) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.revertida = revertida;
        this.data = data;
    }

}
