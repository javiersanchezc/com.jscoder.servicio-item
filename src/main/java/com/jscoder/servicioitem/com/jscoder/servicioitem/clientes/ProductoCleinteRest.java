package com.jscoder.servicioitem.com.jscoder.servicioitem.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jscoder.servicioitem.com.jscoder.servicioitem.models.Item;
import com.jscoder.servicioitem.com.jscoder.servicioitem.models.Producto;

@FeignClient(name="servicio-productos",url="localhost:8001")
public interface ProductoCleinteRest {

	@GetMapping("/listar")
	List<Producto> listar();
	@GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id);
}
