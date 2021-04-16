package com.exampleteste.trabalhoteste.services.exceptions;

public class ClientNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ClientNotFoundException(Object id) {
		super("Cliente não encontrado. id " + id);
	}
}
