package com.portoflio.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.Binary;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    //private String date;
    private Double price;
    private Binary image;
    private String description;
}
