package br.com.study.carteirada.enums;

import lombok.Getter;

@Getter
public enum CreditCardFlag {

    VISA("Visa"), MASTERCARD("Master Card"), ELO("Elo");

    private String description;

    CreditCardFlag(String description) {
        this.description = description;
    }

}
