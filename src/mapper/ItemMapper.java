package mapper;

import java.util.List;

import domain.Item;

public interface ItemMapper {
	
	public void insertItem(Item item) throws Exception;
	
	public void deleteItemById(int id) throws Exception;
	
	public List<Item> getItems(Item item) throws Exception;
	

}
