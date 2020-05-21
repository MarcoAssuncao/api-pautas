package com.pautas.apipautas.infraestrutura;

public interface IAdapter<V,E, O> {

	E convertToEntity(V v);
	
    O convertToValueObject(E e);  
	
}
