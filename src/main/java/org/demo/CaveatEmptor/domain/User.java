package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    private String username;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @OneToOne(fetch = FetchType.LAZY)
    private BillingDetails billingDetails;
    @NotNull
    private Address home;
    @NotNull
    private Address billing;
    @NotNull
    private Address shipping;

    public String getFullName() {
        var firstName = Optional.ofNullable(getFirstName())
                .orElse("");
        var lastName = Optional.ofNullable(getLastName())
                .orElse("");

        return String.format("%s %s", firstName, lastName)
                .trim();
    }
}
