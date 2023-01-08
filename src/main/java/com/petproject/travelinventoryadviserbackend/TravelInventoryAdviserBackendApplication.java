package com.petproject.travelinventoryadviserbackend;

import com.petproject.travelinventoryadviserbackend.entity.Item;
import com.petproject.travelinventoryadviserbackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelInventoryAdviserBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TravelInventoryAdviserBackendApplication.class, args);
	}

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void run(String... args) throws Exception {
		Item item1 = Item.builder()
				.itemName("Hiking Staff")
				.itemType("Hiking")
				.itemCategory("Handy")
				.build();

		Item item2 = Item.builder()
				.itemName("Sleeping bad")
				.itemType("General")
				.itemCategory("Special")
				.build();

		Item item3 = Item.builder()
				.itemName("Warm hat")
				.itemType("Winter")
				.itemCategory("Recommended")
				.build();

		itemRepository.save(item1);
		itemRepository.save(item2);
		itemRepository.save(item3);
	}
}
