package org.demo.CaveatEmptor.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private Date createdOn;
    @ManyToOne
    @NotNull
    private User bidder;
    @ManyToOne
    @NotNull
    private Item item;
}
