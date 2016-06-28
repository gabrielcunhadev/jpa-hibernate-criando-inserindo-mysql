package com.jpahibernate.model;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TesteInserirVeiculo {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();		
		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("Fiat");
		veiculo.setModelo("Uno");
		veiculo.setAnoFabricacao(2015);
		veiculo.setAnoModelo(2015);
		veiculo.setValor(BigDecimal.valueOf(22000.90));
		
		manager.persist(veiculo);
		
		transaction.commit();
		
	}
	
}
