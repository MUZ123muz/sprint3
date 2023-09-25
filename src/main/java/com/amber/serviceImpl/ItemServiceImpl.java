package com.amber.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amber.model.Item;
import com.amber.repository.ItemRepo;
import com.amber.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired private ItemRepo repo;


	public Item createItem(Item item) {
		
		return repo.save(item);
	}



	public Item showItem(int id) {

		return repo.findById(id).orElse(null);
	}


	public List<Item> itemsList() {
		
		return repo.findAll();
	}



	
	public void deleteItem(int id) {
		
		repo.deleteById(id);
		
	}



	
	public Item updateItem(Item item) {
		
		return repo.save(item);
	}


	






	
	
	


}
