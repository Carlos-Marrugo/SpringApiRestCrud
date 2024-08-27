package com.aplication.rest.controllers.dto;

import java.util.ArrayList;
import java.util.List;

import com.aplication.rest.entities.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MakerDTO {

    private Long id;
    private String name;

    // To avoid infinite recursion in JSON serialization, we use @JsonIgnore annotation.
    @JsonIgnore
    private List<Product> productList = new ArrayList<>();
}
