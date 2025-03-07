package com.mx.Productos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mx.Productos.Dao.MetodosDao;
import com.mx.Productos.Dominio.Productos;
@Service //indica que esta clase representa la logica 
public class Implementacion implements Metodos{
	
	@Autowired
	MetodosDao dao;

	@Override
	public void guardar(Productos producto) {
		// TODO Auto-generated method stub
		dao.save(producto);
	    System.out.println("se guardo el producto");
		
	}
	

	@Override
	public void editar(Productos producto) {
		// TODO Auto-generated method stub
		dao.save(producto);
	    System.out.println("se actualizo el producto");
		
	}

	@Override
	public void eliminar(Productos producto) {
		// TODO Auto-generated method stub
		dao.delete(producto);
	    System.out.println("se elimino el producto");
	}

	@Override
	public Productos buscar(Productos producto) {
		// TODO Auto-generated method stub
		return dao.findById(producto.getId()).orElse(null);
	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return (List<Productos>) dao.findAll();
	}

}
