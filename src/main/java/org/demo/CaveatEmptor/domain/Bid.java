package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Bid {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private Date createdOn;
    @OneToOne
    private User bidder;
    @OneToOne
    private Item item;
}
