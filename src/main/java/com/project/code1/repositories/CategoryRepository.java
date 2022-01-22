package com.project.code1.repositories;

import com.project.code1.entities.Category;
import com.project.code1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
