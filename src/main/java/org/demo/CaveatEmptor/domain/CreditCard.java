package org.demo.CaveatEmptor.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class CreditCard extends BillingDetails {
    @NotEmpty
    private String cardNumber;
    @NotEmpty
    private String expMonth;
    @NotEmpty
    private String expYear;
}
