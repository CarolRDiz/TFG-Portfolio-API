package com.portoflio.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderItems")
public class OrderItem {
    //OrderDetail
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private String price; ------------ no

    private Order order;

    private Product product;
    /* Or
    @ManyToOne
    @JoinColumn(name = "product_variant_id")
    private ProductVariant productVariant;
     */
    @Column(name = "amount")
    private Integer amount;

    //private GroupVariant groupVariant;
}
