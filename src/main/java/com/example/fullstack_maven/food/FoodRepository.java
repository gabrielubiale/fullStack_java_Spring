package com.example.fullstack_maven.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository <Food, Long>{
}
