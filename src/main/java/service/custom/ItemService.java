package service.custom;

import dto.Item;
import service.SuperService;

import java.util.List;

public interface ItemService extends SuperService {
    boolean addItem(Item item);
    boolean updateItem(Item item);
    boolean deleteItem(String code);
    Item searchItem(String code);
    List<Item> getAll();
}
