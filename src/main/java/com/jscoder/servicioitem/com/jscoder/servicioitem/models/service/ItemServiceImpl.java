package com.jscoder.servicioitem.com.jscoder.servicioitem.models.service;

import com.jscoder.servicioitem.com.jscoder.servicioitem.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
private RestTemplate clienteRest;

    @Override
    public List<Item> findItems() {
        return null;
    }

    @Override
    public Item findItemById(Long id, Integer cantidad) {
        return null;
    }
}
