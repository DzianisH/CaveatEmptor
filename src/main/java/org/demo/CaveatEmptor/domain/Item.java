package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    private String name;
    @NotNull
    private BigDecimal initialPrice;
    @NotNull
    private Date auctionEnd;
    @OneToMany
    @NotNull
    private List<Image> imageList;
    @OneToOne
    private User seller;
    @OneToMany
    @NotEmpty
    private List<Category> categoryList;

}
