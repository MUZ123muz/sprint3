package com.amber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amber.model.Item;
import com.amber.service.ItemService;

@RestController
//@ResponseBody
//@Controller
public class ItemController {

	@Autowired
	private ItemService service;

	@PostMapping("save")
	public Item createNewStudent(@RequestBody Item item) {

		return service.createItem(item);

	}

	@GetMapping("show/{id}")
	public Item showNewStudent(@PathVariable int id) {

		return service.showItem(id);

	}

	@GetMapping("lis")
	public List<Item> listOfItems() {

		return service.itemsList();

	}

	@DeleteMapping("del/{roll_no}")
	public void deleteNewStudent(@PathVariable int id) {

		service.deleteItem(id);

	}

	@PutMapping("upd/{id}")
	public Item updateNewStudent(@RequestBody Item item, @PathVariable int id) {

		Item it = service.showItem(id);
		if (it != null) {

			item.setId(id);
			return service.updateItem(item);
		}
		return service.createItem(item);

	}

}
