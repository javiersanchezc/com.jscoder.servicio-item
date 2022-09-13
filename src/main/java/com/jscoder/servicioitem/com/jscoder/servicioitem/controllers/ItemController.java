package com.jscoder.servicioitem.com.jscoder.servicioitem.controllers;


import com.jscoder.servicioitem.com.jscoder.servicioitem.models.Item;
import com.jscoder.servicioitem.com.jscoder.servicioitem.models.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("/listar")
    public List<Item> listar(){
        return itemService.findItems();


    }
    @GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findItemById(id, cantidad);
	}


}
