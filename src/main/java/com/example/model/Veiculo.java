package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // cria uma tabela no banco de dados
@Table(name = "veiculo")  //renomeia a tabela criada no banco de dados
public class Veiculo {
    @Id   //cria a chave primaria na tabela
    private Long codigo;
    private String fabricante;
    private String modelo;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private Double valor;

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public Integer getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    
    
    
}
