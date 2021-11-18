package com.fiap.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.global.model.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long>{

}
