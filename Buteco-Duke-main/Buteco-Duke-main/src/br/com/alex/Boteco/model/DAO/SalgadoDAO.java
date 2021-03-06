/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alex.Boteco.model.DAO;

import br.com.alex.Boteco.model.SalgadoVO;
import br.com.alex.Boteco.repository.EntityFactory;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SalgadoDAO {

   
    public boolean saveSalgado(SalgadoVO salgadoVO) {        
        
        PreparedStatement stmt;
        
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            String query = "INSERT INTO salgado (categoria, sabor, valor, quantidade) "
                    + "values (?, ?, ?, ?)";
            stmt = (PreparedStatement) conn.prepareStatement(query);
            stmt.setString(1, salgadoVO.getCategoria());
            stmt.setString(2, salgadoVO.getSabor());
            stmt.setDouble(3, salgadoVO.getValor());
            stmt.setInt(4,salgadoVO.getQuantidade());
            stmt.executeUpdate();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }        
    }

    public List<SalgadoVO> findAll() {
        
        SalgadoVO salgadoVO = null;
        List<SalgadoVO> lista = new ArrayList<>();
        
        PreparedStatement stmt;
        ResultSet rs;
                
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            String query = "SELECT * FROM vw_produtos";                   
                    
/*                    "SELECT "
                    + "salgado.idsalgado as IDSALGADO,"
                    + "salgado.categoria as CATEGORIA, "
                    + "salgado.sabor as SABOR, "
                    + "salgado.valor as VALOR, "
                    + "sum(salgado.quantidade)as QUANTIDADE "
                    + "FROM salgado"
                    + "GROUP BY CATEGORIA, SABOR"
                    + "ORDER BY CATEGORIA";            
 */                  
            stmt = (PreparedStatement) conn.prepareStatement(query);
            rs=stmt.executeQuery();
            
            while (rs.next()){
                salgadoVO = new SalgadoVO();
                salgadoVO.setIdSalgado(rs.getInt("IDSALGADO"));
                salgadoVO.setCategoria(rs.getString("CATEGORIA"));
                salgadoVO.setSabor(rs.getString("SABOR"));
                salgadoVO.setValor(rs.getDouble("VALOR"));
                salgadoVO.setQuantidade(rs.getInt("QUANTIDADE"));
                lista.add(salgadoVO);                
            }            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lista;
    }

    public boolean deleteSalgado(SalgadoVO salgadoVO) {
        
        PreparedStatement stmt;
        
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            String query = "DELETE FROM salgado WHERE idsalgado = ?";
            stmt = (PreparedStatement) conn.prepareStatement(query);
            stmt.setInt(1, salgadoVO.getIdSalgado());
            stmt.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }   
    }

    public SalgadoVO findById(SalgadoVO salgadoVO) {
        SalgadoVO salgado = new SalgadoVO();
        PreparedStatement stmt;
        ResultSet rs;
        
        try {
            
            Connection conn = (Connection) EntityFactory.getConnection();
            String query = "SELECT * FROM SALGADO WHERE IDSALGADO = ?";
            stmt = (PreparedStatement) conn.prepareStatement(query);
            stmt.setInt(1, salgadoVO.getIdSalgado());
            rs = stmt.executeQuery();            
            
            while (rs.next()){
                salgado.setIdSalgado(rs.getInt("IDSALGADO"));
                salgado.setCategoria(rs.getString("CATEGORIA"));
                salgado.setSabor(rs.getString("SABOR"));
                salgado.setValor(rs.getDouble("VALOR"));
                salgado.setQuantidade(rs.getInt("QUANTIDADE"));
                
            }            
            
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return salgado;                
    }

    public List<SalgadoVO> findByCategoria(SalgadoVO salgadoVO) {
        
        SalgadoVO salgado = null;
        List<SalgadoVO> lista = new ArrayList<>();
        PreparedStatement stmt;
        ResultSet rs;
        
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            String query = "SELECT * FROM vw_produtos WHERE categoria = ?";
            stmt = (PreparedStatement) conn.prepareStatement(query);
            stmt.setString( 1, salgadoVO.getCategoria());
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                salgado = new SalgadoVO();
                salgado.setIdSalgado(rs.getInt("IDSALGADO"));
                salgado.setCategoria(rs.getString("CATEGORIA"));
                salgado.setSabor(rs.getString("SABOR"));
                salgado.setValor(rs.getDouble("VALOR"));
                salgado.setQuantidade(rs.getInt("QUANTIDADE"));
                lista.add(salgado);                               
            }           
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lista;
    }

    public List<SalgadoVO> findBySabor(SalgadoVO salgadoVO) {
        
        SalgadoVO salgado = null;
        List<SalgadoVO> lista = new ArrayList<>();
        PreparedStatement stmt;
        ResultSet rs;
        
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            String query = "SELECT * FROM vw_produtos WHERE sabor = ?";
            stmt = (PreparedStatement) conn.prepareStatement(query);
            stmt.setString( 1, salgadoVO.getSabor());
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                salgado = new SalgadoVO();
                salgado.setIdSalgado(rs.getInt("IDSALGADO"));
                salgado.setCategoria(rs.getString("CATEGORIA"));
                salgado.setSabor(rs.getString("SABOR"));
                salgado.setValor(rs.getDouble("VALOR"));
                salgado.setQuantidade(rs.getInt("QUANTIDADE"));
                lista.add(salgado);                               
            }           
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lista;

    }

    public List<SalgadoVO> findByCategoriaSabor(SalgadoVO salgadoVO) {
        
         SalgadoVO salgado = null;
         List<SalgadoVO> lista = new ArrayList<>();
         PreparedStatement stmt;
         ResultSet rs;
         
         try {             
             Connection conn = (Connection) EntityFactory.getConnection();
             String query = "SELECT * FROM vw_produtos WHERE categoria = ? AND sabor = ?";
             stmt = (PreparedStatement) conn.prepareStatement(query);
             stmt.setString(1, salgadoVO.getCategoria());
             stmt.setString(2, salgadoVO.getSabor());
             rs = stmt.executeQuery();
             
             while(rs.next()) {
                 salgado = new SalgadoVO();
                 salgado.setIdSalgado(rs.getInt("IDSALGADO"));
                 salgado.setCategoria(rs.getString("CATEGORIA"));
                 salgado.setSabor(rs.getString("SABOR"));
                 salgado.setValor(rs.getDouble("VALOR"));
                 salgado.setQuantidade(rs.getInt("QUANTIDADE"));
                 lista.add(salgado);                 
             }            
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
         return lista;
    }

    public SalgadoVO findByCategoriaSaborCliente(SalgadoVO salgadoVO) {
        
         SalgadoVO salgado = salgado = new SalgadoVO();         
         PreparedStatement stmt;
         ResultSet rs;
         
         try {             
             Connection conn = (Connection) EntityFactory.getConnection();
             String query = "SELECT * FROM vw_produtos WHERE categoria = ? AND sabor = ?";
             stmt = (PreparedStatement) conn.prepareStatement(query);
             stmt.setString(1, salgadoVO.getCategoria());
             stmt.setString(2, salgadoVO.getSabor());
             rs = stmt.executeQuery();
             
             while(rs.next()) {                 
                 salgado.setIdSalgado(rs.getInt("IDSALGADO"));
                 salgado.setCategoria(rs.getString("CATEGORIA"));
                 salgado.setSabor(rs.getString("SABOR"));
                 salgado.setValor(rs.getDouble("VALOR"));
                 salgado.setQuantidade(rs.getInt("QUANTIDADE"));
                 return salgado;                
             }            
            
        } catch (Exception e) {
            e.printStackTrace();            
            return null;
             
        }
         return salgado;       
        
    }
    
}
