package com.goodstrade.goodstrade.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
public class Order extends BaseEntity {

    private String detail;

    @NotNull
    private long quantity;

    @NotNull
    private String track;

    @NotNull
    private Date date;

    @ManyToOne(cascade = CascadeType.MERGE)
    private User buyer;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Product item;

    public Order() {
    }
}
