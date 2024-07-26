package com.example;

import com.example.model.Veiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ExcluirVeiculo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("IFBA-PU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction et = manager.getTransaction();
        et.begin();
        //Este método busca o veiculo de codigo 2 no banco de dados e carrega no
        //objeto veiculo (v)
        Veiculo v = manager.find(Veiculo.class, 2);
        manager.remove(v);  //Remove o veiculo indicado no banco de dados
        et.commit();

        manager.close();
        entityManagerFactory.close();
    }
}
