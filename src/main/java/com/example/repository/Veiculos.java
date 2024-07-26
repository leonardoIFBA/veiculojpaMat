package com.example.repository;
//Essa classe contém as operações CRUD para o objeto Veiculo

import javax.swing.text.html.parser.Entity;

import com.example.JpaUtil;
import com.example.model.Veiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Veiculos {
    private EntityManager manager;

    public Veiculos(){
        this.manager = JpaUtil.getEntityManager();
    }

    public void adicionar(Veiculo veiculo){
        EntityTransaction et = manager.getTransaction();
        et.begin();
        manager.persist(veiculo);
        et.commit();
    }

    public void atualizar(Veiculo veiculo){
        EntityTransaction et = manager.getTransaction();
        et.begin();
        manager.merge(veiculo);
        et.commit();
    }

    public void excluir(Veiculo veiculo){
        EntityTransaction et = manager.getTransaction();
        et.begin();
        manager.remove(veiculo);
        et.commit();
    }
}
