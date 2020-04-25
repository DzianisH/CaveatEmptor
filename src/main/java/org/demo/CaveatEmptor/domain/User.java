package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotEmpty
    @Column(nullable = false, unique = true)
    private String username;
    @NotNull
    @NotEmpty
    private String firstName;
    @NotNull
    @NotEmpty
    private String lastName;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "owner")
    private BillingDetails billingDetails;
    @Embedded
    private Address home;
    @Embedded
    private Address billing;
    @Embedded
    private Address shipping;

    @OneToMany(mappedBy = "bidder")
    private List<Bid> bidList;

    @OneToMany(mappedBy = "seller")
    private List<Item> itemList;

    public String getFullName() {
        var firstName = Optional.ofNullable(getFirstName())
                .orElse("");
        var lastName = Optional.ofNullable(getLastName())
                .orElse("");

        return String.format("%s %s", firstName, lastName)
                .trim();
    }
}
