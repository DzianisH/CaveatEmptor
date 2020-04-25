package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Embeddable
public class Address {
    @NotEmpty
    @NotNull
    private String street;
    @NotEmpty
    @NotNull
    private String zipcode;
    @NotEmpty
    @NotNull
    private String city;
}
