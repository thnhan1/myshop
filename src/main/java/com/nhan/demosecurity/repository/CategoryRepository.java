package com.nhan.demosecurity.repository;

import com.nhan.demosecurity.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
