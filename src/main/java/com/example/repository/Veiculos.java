package com.example.repository;
//Essa classe contém as operações CRUD para o objeto Veiculo

import com.example.JpaUtil;
import com.example.model.Veiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Veiculos {
    private EntityManager manager;

    // Construtor da classe inicializa o EntityManager para manipular o objeto Veículo
    public Veiculos(){
        this.manager = JpaUtil.getEntityManager();
    }

    // Adiciona um veiculo no banco de dados
    public void adicionar(Veiculo veiculo){
        // Cria uma transação 
        EntityTransaction et = manager.getTransaction();
        et.begin();  // Inicializa a transação
        manager.persist(veiculo);
        et.commit();  // Confirma a transação, ou seja, grava no banco de dados
    }

    // Altera um veiculo no banco de dados
    public void atualizar(Veiculo veiculo){
        EntityTransaction et = manager.getTransaction();
        et.begin();
        manager.merge(veiculo);
        et.commit();
    }

    // Exclui um veiculo no banco de dados
    public void excluir(Veiculo veiculo){
        EntityTransaction et = manager.getTransaction();
        et.begin();
        manager.remove(veiculo);
        et.commit();
    }
}
