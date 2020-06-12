package com.example.mailSender.SprinController;


import com.example.mailSender.annotation.ApiController;
import com.example.mailSender.dto.ProductDto;
import com.example.mailSender.dto.Responce;
import com.example.mailSender.service.ProductService;
import com.example.mailSender.utill.ResponceBuilder;
import com.example.mailSender.utill.UrlConstraint;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@ApiController
@RequestMapping(UrlConstraint.ProductManagement.ROOT)
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(UrlConstraint.ProductManagement.CREATE)
    public Responce create(@Valid @RequestBody ProductDto productDto, BindingResult result) {
        if (result.hasErrors()) {
            return ResponceBuilder.getFailureResponce(result, "Bean Binding error");
        }
        return productService.save(productDto);
    }

    @PutMapping(UrlConstraint.ProductManagement.UPDATE)
    public Responce update(@PathVariable("id") Long id, @Valid @RequestBody ProductDto productDto, BindingResult result) {
        if (result.hasErrors()) {
            return ResponceBuilder.getFailureResponce(result, "Bean Binding error");
        }
        return productService.update(id, productDto);
    }

    @DeleteMapping(UrlConstraint.ProductManagement.DELETE)
    public Responce delete(@PathVariable("id") Long id) {
        return productService.delete(id);
    }

    @GetMapping(UrlConstraint.ProductManagement.GET)
    public Responce get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @GetMapping(UrlConstraint.ProductManagement.GET_ALL)
    public Responce getAll() {
        return productService.getAll();
    }
}
