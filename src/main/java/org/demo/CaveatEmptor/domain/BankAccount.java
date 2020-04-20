package org.demo.CaveatEmptor.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class BankAccount extends BillingDetails {
    @NotEmpty
    private String account;
    @NotEmpty
    private String bankName;
    @NotEmpty
    private String swift;
}
