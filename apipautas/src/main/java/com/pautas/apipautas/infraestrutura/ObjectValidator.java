package com.pautas.apipautas.infraestrutura;

public interface ObjectValidator <R,T> {

	R isValid(T t);
}
