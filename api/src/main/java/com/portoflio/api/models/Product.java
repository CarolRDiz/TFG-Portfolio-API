package com.portoflio.api.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.portoflio.api.dto.ProductCreateDTO;
import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String date;
    private Float price;
    private List<String> image_ids;
    private String thumbnail_image_id;
    @Column(length = 2048)
    private String description;
    private List<String> tags;
    private Integer sellCount = 0;

    @JsonBackReference
    @ToString.Exclude
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<ProductCategory> productCategories = new HashSet<ProductCategory>();

    private Boolean visibility;
    public Product(ProductCreateDTO product) {
        this.name =         product.getName();
        this.price =        product.getPrice();
        this.description =  product.getDescription();
        this.tags =         product.getTags();
        this.visibility =   product.getVisibility();
    }

    public Product(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.thumbnail_image_id = product.getThumbnail_image_id();
        this.description = product.getDescription();
        this.tags = product.getTags();
        //TODO
        //this.productCategories = productCategories;
        this.visibility = product.getVisibility();
    }
}
