/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alex.Boteco.model;

/**
 *
 * @author Alex
 */
public class SalgadoVO {
    
    private int idSalgado;	
    private String categoria; 
    private String sabor;
    private double valor;
    private int quantidade;

    public SalgadoVO() {
        
    }

    public int getIdSalgado() {
        return idSalgado;
    }

    public void setIdSalgado(int idSalgado) {
        this.idSalgado = idSalgado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
    
}
