package com.amber.service;


import java.util.List;

import org.springframework.stereotype.Service;
import com.amber.model.Item;


public interface ItemService {

	Item createItem(Item item);

	Item showItem(int id);

	List<Item> itemsList();

	void deleteItem(int id);

	Item updateItem(Item item);
	


	

}
