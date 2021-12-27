package com.codejam.inventoryservice.repository;

import com.codejam.inventoryservice.enitity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
