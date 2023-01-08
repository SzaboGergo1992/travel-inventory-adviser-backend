package com.petproject.travelinventoryadviserbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "item_name", nullable = false)
    private String itemName;
    @Column(name = "item_type")
    private String itemType;
    @Column(name = "item_category")
    private String itemCategory;
}
