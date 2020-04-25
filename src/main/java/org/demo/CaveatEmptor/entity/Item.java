package org.demo.CaveatEmptor.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotEmpty
    @Column(nullable = false, unique = true)
    private String name;
    @NotNull
    private BigDecimal initialPrice;
    @NotNull
    private Date auctionEnd;
    @OneToMany(mappedBy = "item")
    @NotNull
    private List<Image> imageList;
    @ManyToOne
    @NotNull
    private User seller;
    @ManyToMany(mappedBy = "itemList")
    @NotEmpty
    @NotNull
    private List<Category> categoryList;

}
