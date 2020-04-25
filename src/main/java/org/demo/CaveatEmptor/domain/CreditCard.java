package org.demo.CaveatEmptor.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class CreditCard extends BillingDetails {
    @NotEmpty
    @Column(nullable = false, unique = true)
    private String cardNumber;
    @NotEmpty
    @NotNull
    private String expMonth;
    @NotEmpty
    @NotNull
    private String expYear;
}
