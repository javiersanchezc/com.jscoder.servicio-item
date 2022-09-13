package com.jscoder.servicioitem.com.jscoder.servicioitem.models.service;

import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.stream.Collectors;

import com.jscoder.servicioitem.com.jscoder.servicioitem.clientes.ProductoCleinteRest;
import com.jscoder.servicioitem.com.jscoder.servicioitem.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ItemServiceFeint implements ItemService {
		@Autowired
		private ProductoCleinteRest clientefeing;

	@Override
	public List<Item> findItems() {
		// TODO Auto-generated method stub
		return clientefeing.listar().stream().map(p-> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findItemById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return new Item(clientefeing.detalle(id), cantidad);
	}

}
