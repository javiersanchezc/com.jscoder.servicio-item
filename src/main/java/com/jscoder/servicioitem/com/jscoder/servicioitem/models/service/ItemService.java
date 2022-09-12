package com.jscoder.servicioitem.com.jscoder.servicioitem.models.service;

import com.jscoder.servicioitem.com.jscoder.servicioitem.models.Item;

import java.util.List;

public interface ItemService {
public List<Item> findItems();
public Item findItemById(Long id,Integer cantidad);


}
