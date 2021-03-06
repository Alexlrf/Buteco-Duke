
package br.com.alex.Boteco.repository;

import br.com.alex.Boteco.constants.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EntityFactory {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        
        Connection conn = null;        
        Class.forName(Constants.DRIVER_NAME);                
        
        try {
            conn = DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASS);
            
            if (conn != null) { 
                System.out.println("conectado");
                }else{
                JOptionPane.showMessageDialog(null, "Não conectado ao Banco de Dados!");
                }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao Banco de Dados!");
            e.printStackTrace();
        }        
        return conn;
    }
    
    public static void main (String[] args)throws ClassNotFoundException, SQLException{
        //getConnection(); 
        closeConn();
    }
   
     public static boolean closeConn(){
        try {
            EntityFactory.getConnection().close();
            JOptionPane.showMessageDialog(null, "Conexão fechada!");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão!");
            return false;
        }
    }
}