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
public class ItemVO {
    
    private int idItem;
    private int idSalgado;
    private int idVenda;
    private int quantidadeItem;

    public ItemVO() {
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdSalgado() {
        return idSalgado;
    }

    public void setIdSalgado(int idSalgado) {
        this.idSalgado = idSalgado;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
    
        
}
