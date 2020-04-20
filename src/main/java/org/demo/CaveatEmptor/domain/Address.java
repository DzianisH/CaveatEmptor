package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;

@Data
@Embeddable
public class Address {
    @NotEmpty
    private String street;
    @NotEmpty
    private String zipcode;
    @NotEmpty
    private String city;
}
