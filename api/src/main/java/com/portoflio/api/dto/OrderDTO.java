package com.portoflio.api.dto;

import com.portoflio.api.models.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;
    private List<OrderItem> items;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String secondAddress;
    private String city;
    private String postalCode;
    private String phone;
    private Integer totalPrice;
    private Date date;
    private Integer shipped;
}
