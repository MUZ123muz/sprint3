package com.amber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amber.model.Item;

public interface ItemRepo extends JpaRepository<Item,Integer> {

}
