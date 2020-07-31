package br.com.study.carteirada.entities;

import br.com.study.carteirada.enums.CreditCardFlag;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "CARTAO_CREDITO")
public class CreditCard extends BaseEntity{

    @Column(name = "CC_NUMERO", nullable = false)
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(name = "CC_BANDEIRA", nullable = false)
    private CreditCardFlag flag;

    @Column(name = "CC_TOKEN")
    private String tokenNumber;

    @ManyToOne(cascade = { CascadeType.MERGE })
    @JoinColumn(name = "CC_CLIENTE_ID", nullable = false)
    private Customer customer;

}
