package com.mx.Productos.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Productos.Dominio.*;
@Repository //indica que la interfaz tendra acceso a la base de datos
public interface MetodosDao extends CrudRepository<Productos, Integer>{

	
}
