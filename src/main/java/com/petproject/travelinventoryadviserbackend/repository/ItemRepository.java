package com.petproject.travelinventoryadviserbackend.repository;

import com.petproject.travelinventoryadviserbackend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
