package org.demo.CaveatEmptor.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String filename;
}
