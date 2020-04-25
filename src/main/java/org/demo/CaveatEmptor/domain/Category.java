package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category parent;
    @OneToMany(mappedBy = "parent")
    private List<Category> childrenList;
    @NotEmpty
    @NotNull
    private String name;
    @ManyToMany
    private List<Item> itemList;
}
