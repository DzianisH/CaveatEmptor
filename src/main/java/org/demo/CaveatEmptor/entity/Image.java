package org.demo.CaveatEmptor.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @NotNull
    private Item item;
    @NotEmpty
    @NotNull
    private String title;
    @NotEmpty
    @Column(unique = true, nullable = false)
    private String filename;
}
