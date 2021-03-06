
package br.com.alex.Boteco.controller;

import br.com.alex.Boteco.constants.Constants;
import br.com.alex.Boteco.view.Home;
import java.text.DecimalFormat;


public class Pedido {
    private static double pedido;
    
    static DecimalFormat df = new DecimalFormat("0.00");
        
    public static double getPedido() {
        return pedido;
    }

    public  static void setPedido(double pedido) {
        Pedido.pedido = pedido;
    }
            
    public static double gerarPedido() {
        
        int quantCerveja = (int) Home.spinCerveja.getValue();
        int quantAlcool = (int) Home.spinAlcool.getValue();
        int quantGelada = (int) Home.spinGelada.getValue();
        
        Pedido.setPedido((Constants.CERVEJA * quantCerveja)
                +(Constants.ALCOOL * quantAlcool)
                +(Constants.GELADA * quantGelada));
        return Pedido.getPedido();
        //return df.format(Pedido.getPedido());
    }
    
    
    public static double imprimirValor() {        
        Home.lblValor.setText(String.valueOf(Pedido.gerarPedido()));
        return Pedido.pedido;
    }
    
               
    public static void atribuirValor() {
        Home.lblPrecoCeva.setText(String.valueOf(df.format(Constants.CERVEJA)));
        Home.lblPrecoAlcool.setText(String.valueOf(df.format(Constants.ALCOOL)));
        Home.lblPrecoGelada.setText(String.valueOf(df.format(Constants.GELADA)));        
    }
    
}
