package com.bee.sample.ch1.entity;

import lombok.Data;

@Data
public class RestaurantEntity {
    private Long restaurantId;
    private String name;
    private String imageUrl;
    private Double price;
}
