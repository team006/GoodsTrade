package com.goodstrade.goodstrade.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Image extends BaseEntity {

    @NotNull
    private String path;

    public Image() {
    }
}
