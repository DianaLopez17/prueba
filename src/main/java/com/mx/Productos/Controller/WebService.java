package com.mx.Productos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Productos.Dominio.Productos;
import com.mx.Productos.Service.Implementacion;

@RestController //indica que sera una web service de tipo rest
@RequestMapping(path ="Api") //classpatch recibe las peticiones http mapea a nivel de clase
@CrossOrigin ("*") //para seguridad
public class WebService {
	
	@Autowired 
	Implementacion imp;
	
	//http://localhost:9006/Api/listar
	@GetMapping(value="listar")
	public List<Productos> listar(){
		return imp.listar();
	}

	@PostMapping(value = "guardar")
    public void guardar (@RequestBody Productos producto) {
		imp.guardar(producto);
	}
	
	@PostMapping(value = "editar")
    public void editar (@RequestBody Productos producto) {
		imp.editar(producto);
	}
	
	@PostMapping(value = "eliminar")
    public void eliminar (@RequestBody Productos producto) {
		imp.eliminar(producto);
	}
	
	@PostMapping(value = "buscar")
    public Productos buscar (@RequestBody Productos producto) {
		return imp.buscar(producto);
	}
}
