package com.aplication.rest.controllers.dto;

import java.util.ArrayList;
import java.util.List;

import com.aplication.rest.entities.Product;

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

    private List<Product> productList = new ArrayList<>();
}
