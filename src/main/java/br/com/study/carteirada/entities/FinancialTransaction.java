package br.com.study.carteirada.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "TRANSACOES_FINANCEIRAS")
public class FinancialTransaction {

    @Column(name = "TR_CODIGO", nullable = false)
    private String code;

    @ManyToOne(cascade = { CascadeType.MERGE })
    @JoinColumn(name = "TR_USUARIO_ORIGEM", nullable = false)
    private Customer sourceCustomer;

    @ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_USUARIO_DESTINO", nullable = false)
    private Customer destinationCustomer;

    @Column(name = "TR_DATA_HORA", nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "TR_VALOR", nullable = false)
    private Double value;

}
