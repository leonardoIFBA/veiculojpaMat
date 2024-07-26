package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*EntityManagerFactory entityManagerFactory = Persistence.
             createEntityManagerFactory("IFBA-PU");
        entityManagerFactory.close();*/

        EntityManager manager = JpaUtil.getEntityManager();
        manager.persist();
    }
}