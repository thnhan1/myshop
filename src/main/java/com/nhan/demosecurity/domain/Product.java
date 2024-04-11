package com.nhan.demosecurity.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column
    private String sku;

    @Column(name = "\"description\"")
    private String description;

    @Column
    private Double price;

    @Column
    private Integer stock;

    @OneToMany(mappedBy = "product")
    private Set<OrderItem> orderItems;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<Cart> carts;

}