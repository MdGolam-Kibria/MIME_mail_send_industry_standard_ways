package com.example.mailSender.service;

import com.example.mailSender.dto.ProductDto;
import com.example.mailSender.dto.Responce;

public interface ProductService {
    Responce save(ProductDto productDto);
    Responce update(Long id,ProductDto productDto);
    Responce get(Long id);
    Responce delete(Long id);
    Responce getAll();
}
