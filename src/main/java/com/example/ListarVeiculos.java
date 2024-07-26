package com.example;


import java.util.List;

import com.example.model.Veiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ListarVeiculos {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("IFBA-PU");
        EntityManager manager = entityManagerFactory.createEntityManager();
        Query query = manager.createQuery("from Veiculo");
        List<Veiculo> veiculos = query.getResultList();
        System.out.println("-------------------------------------");
        for (Veiculo v: veiculos){
            System.out.println(v.getCodigo() + " - "
                + v.getFabricante() + "  "
                + v.getModelo() + ", ano "
                + v.getAnoFabricacao() + "/"
                + v.getAnoModelo() + " por R$ "
                + v.getValor());
        }
        System.out.println("-------------------------------------");
        manager.close();
        entityManagerFactory.close();



    }
}
