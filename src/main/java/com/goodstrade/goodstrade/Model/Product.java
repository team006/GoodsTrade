package com.goodstrade.goodstrade.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {

    @NotNull
    private String name;

    @NotNull
    private String detail;

    @NotNull
    private long quantity;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;

    @ManyToOne(cascade = CascadeType.MERGE)
    private User seller;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<Image> image;

    public Product() {
    }
}