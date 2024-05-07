package com.portoflio.api.dao;

import com.portoflio.api.models.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    Optional<ProductCategory> findByProductIdAndCategoryId(Long product_id, Long category_id);
}
