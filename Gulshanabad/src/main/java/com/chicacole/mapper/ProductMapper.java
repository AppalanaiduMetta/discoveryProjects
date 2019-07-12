package com.chicacole.mapper;

import org.mapstruct.Mapper;

import com.chicacole.dto.ProductDTO;
import com.chicacole.model.Product;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);

    List<ProductDTO> toProductDTOs(List<Product> products);

    Product toProduct(ProductDTO productDTO);
}
