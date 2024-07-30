package com.example;

import com.example.model.Veiculo;
import com.example.repository.Veiculos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*EntityManagerFactory entityManagerFactory = Persistence.
             createEntityManagerFactory("IFBA-PU");
        entityManagerFactory.close();*/
        Veiculo v = new Veiculo();
        v.setCodigo(4L);
        v.setFabricante("BMW");
        v.setModelo("x2");
        v.setAnoFabricacao(2024);
        v.setAnoModelo(2025);
        v.setValor(250000D);

        //EntityManager manager = JpaUtil.getEntityManager();
        Veiculos veiculos = new Veiculos();
        veiculos.adicionar(v);
    }
}