package org.demo.CaveatEmptor.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class BankAccount extends BillingDetails {
    @NotEmpty
    @Column(nullable = false, unique = true)
    private String account;
    @NotEmpty
    @NotNull
    private String bankName;
    @NotEmpty
    @NotNull
    private String swift;
}
