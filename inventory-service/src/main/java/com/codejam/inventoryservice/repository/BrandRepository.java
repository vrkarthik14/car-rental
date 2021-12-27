package com.codejam.inventoryservice.repository;

import com.codejam.inventoryservice.enitity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    Brand findByBrandName(String brandName);
}
