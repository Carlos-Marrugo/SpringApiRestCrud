package com.aplication.rest.controllers.dto;

import java.math.BigDecimal;

import com.aplication.rest.entities.Maker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductDTO {

    private Long id;
    private String name;
    private BigDecimal precio;
    private Maker maker;
}
