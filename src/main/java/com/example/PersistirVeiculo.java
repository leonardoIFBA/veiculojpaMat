package com.example;

import com.example.model.Veiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersistirVeiculo {
    public static void main(String[] args){
        Veiculo v = new Veiculo();
        v.setCodigo(4L);
        v.setFabricante("BMW");
        v.setModelo("x2");
        v.setAnoFabricacao(2024);
        v.setAnoModelo(2025);
        v.setValor(250000D);
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("IFBA-PU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction et = manager.getTransaction();
        et.begin();
        manager.persist(v);
        et.commit();

        manager.close();
        entityManagerFactory.close();
        
        
            
    }
     
}
