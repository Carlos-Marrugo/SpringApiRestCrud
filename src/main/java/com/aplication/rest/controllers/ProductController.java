package com.aplication.rest.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aplication.rest.controllers.dto.ProductDTO;
import com.aplication.rest.entities.Product;
import com.aplication.rest.service.IProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/find/{id}")

    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Product> productOptional = productService.findById(id);

        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            ProductDTO productDTO = ProductDTO.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .precio(product.getPrecio())
                    .maker(product.getMaker())
                    .build();
            return ResponseEntity.ok(productDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        List<ProductDTO> productList = productService.findAll()
                .stream()
                .map(product -> ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .precio(product.getPrecio())
                .maker(product.getMaker())
                .build()
                )
                .toList();

        return ResponseEntity.ok(productList);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ProductDTO productDTO) throws URISyntaxException {

        if (productDTO.getName().isBlank() || productDTO.getPrecio() == null || productDTO.getMaker() == null) {
            return ResponseEntity.badRequest().build();
        }

        Product product = Product.builder()
                .name(productDTO.getName())
                .precio(productDTO.getPrecio())
                .maker(productDTO.getMaker())
                .build();

        productService.saveProduct(product);


        return ResponseEntity.created(new URI("/api/product/save")).build();
    }

    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody ProductDTO productDTO) {

        Optional<Product> productOptional = productService.findById(id);

        if(productOptional.isPresent()) {
            Product product = productOptional.get();

            product.setName(productDTO.getName());
            product.setPrecio(productDTO.getPrecio());
            product.setMaker(productDTO.getMaker());
            productService.saveProduct(product);


        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> daleteById(@PathVariable Long id) {
        if(id != null) {
            productService.deleteByid(id);
            return ResponseEntity.ok("great Mother*****");
        }

        return ResponseEntity.badRequest().build();
    }
}