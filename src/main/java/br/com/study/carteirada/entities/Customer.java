package br.com.study.carteirada.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "CLIENTES")
public class Customer extends BaseEntity {

    @Column(name = "CLI_LOGIN", nullable = false)
    private String login;

    @Column(name = "CLI_SENHA", nullable = false)
    private String password;

    @Column(name = "CLI_EMAIL", nullable = false)
    private String email;

    @Column(name = "CLI_NOME_COMPLETO", nullable = false)
    private String fullName;

    @Column(name = "CLI_CPF", nullable = false)
    private String cpf;

    @Column(name = "CLI_DATA_NASCIMENTO", nullable = false)
    private LocalDate birthDate;

    @Column(name = "CLI_NUMERO_TELEFONE", nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<CreditCard> creditCardList;

    @Column(name = "CLI_SALDO", nullable = false)
    private Double balance;

    @Column(name = "CLI_ATIVO", nullable = false)
    private Boolean active;

}
