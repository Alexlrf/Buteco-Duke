
package br.com.alex.Boteco.model.DAO;

import br.com.alex.Boteco.model.ClienteVO;
import br.com.alex.Boteco.repository.EntityFactory;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public boolean save(ClienteVO clienteVO)  {
        
        boolean retorno;
       
        try {
            PreparedStatement stmt;
            Connection conn = (Connection) EntityFactory.getConnection();
            String queryInsert = "INSERT INTO CLIENTE "
                    + "(NOME, CPF, SENHA, SEXO, DT_NASCIMENTO, CELULAR, TELEFONE, EMAIL) "
                    + "VALUES(?,?,?,?,?,?,?,?)";
            stmt = (PreparedStatement) conn.prepareStatement(queryInsert);
            stmt.setString(1, clienteVO.getNome());
            stmt.setString(2, clienteVO.getCpf());
            stmt.setString(3, clienteVO.getSenha());
            stmt.setString(4, clienteVO.getSexo());
            stmt.setDate(5,(Date) clienteVO.getNascimento());
            stmt.setString(6, clienteVO.getCelular());
            stmt.setString(7, clienteVO.getTelefone());
            stmt.setString(8, clienteVO.getEmail());            
            stmt.executeUpdate();
            
            retorno = true;
            
        } catch (Exception e) {
            e.printStackTrace();
            retorno = false;
        }        
        return retorno;
    }

    public boolean confirmarLogin(ClienteVO clienteVO) {
        
        boolean resultado = false;
        ClienteVO cliente;
        
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;             
                    
            String queryLogin = "SELECT senha FROM cliente WHERE email = ?";
            stmt = (PreparedStatement) conn.prepareStatement(queryLogin);
            stmt.setString(1, clienteVO.getEmail());
            rs = stmt.executeQuery();
            
            while(rs.next()){
                cliente = new ClienteVO();
                cliente.setSenha(rs.getString("SENHA"));
                if (cliente.getSenha().equals(clienteVO.getSenha())) {
                   resultado = true; 
                }else {
                   resultado = false; 
                }
            }           
            
        } catch (Exception e) {
            e.printStackTrace();
            resultado = false;
        }        
        return resultado;
    }  

    public boolean confirmarEmail(ClienteVO clienteVO) {
        
        ClienteVO cliente = new ClienteVO();
        boolean resultado = false;
        
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            String queryEmail = "SELECT email FROM cliente WHERE email = ?";
            stmt = (PreparedStatement) conn.prepareStatement(queryEmail);
            stmt.setString(1, clienteVO.getEmail());
            rs = stmt.executeQuery();
            
            while(rs.next()) {
             cliente.setEmail(rs.getString("EMAIL"));
                if (cliente.getEmail().equals(clienteVO.getEmail())) {
                   resultado = true;                    
                } else {
                   resultado = false; 
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            resultado = false;
        }
        
        return resultado;
    }

    public ClienteVO findByCpf(ClienteVO clienteVO) {
        
        ClienteVO cliente = new ClienteVO();
               
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            
            String consultaCpf = "SELECT * from CLIENTE where CPF = ?";            
            stmt = (PreparedStatement) conn.prepareStatement(consultaCpf);
            stmt.setString(1, clienteVO.getCpf());
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                cliente.setIdCliente(rs.getInt("IDCLIENTE"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setCelular(rs.getString("CELULAR"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setNascimento(rs.getDate("DT_NASCIMENTO"));
                cliente.setSexo(rs.getString("SEXO"));
                
            }            
            
        } catch (Exception e) {
            e.printStackTrace();            
        }   
        
        return cliente;
    }

    public List<ClienteVO> findAll() {
        
        List<ClienteVO> listaClientes = new ArrayList<>();
        
        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            String query = "SELECT * FROM CLIENTE";
            stmt = (PreparedStatement) conn.prepareStatement(query);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                ClienteVO cliente = new ClienteVO();
               
                cliente.setIdCliente(rs.getInt("IDCLIENTE"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setCelular(rs.getString("CELULAR"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setNascimento(rs.getDate("DT_NASCIMENTO"));
                cliente.setSexo(rs.getString("SEXO"));
                
                listaClientes.add(cliente);
               
            }         
            
        } catch (Exception e) {
            e.printStackTrace();
        }    
        
        return listaClientes;
     }

    public boolean deleteCliente(ClienteVO clienteVO) {
        
        try {
             Connection conn = (Connection) EntityFactory.getConnection();
             PreparedStatement stmt;
             String queryExclusao = "DELETE FROM cliente WHERE cpf = ?";
             stmt = (PreparedStatement) conn.prepareStatement(queryExclusao);
             stmt.setString(1, clienteVO.getCpf());                       
             stmt.executeUpdate();             
             return true;             
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }        
    }

    public boolean updateCliente(ClienteVO clienteVO) {

        try {
            Connection conn = (Connection) EntityFactory.getConnection();
            PreparedStatement stmt;
            String queryUpdate = "UPDATE cliente SET nome = ?, cpf = ?, sexo = ?, "
                    + "celular = ?, telefone = ?, email = ? WHERE cpf = ?";
            stmt = (PreparedStatement) conn.prepareStatement(queryUpdate);
            
            stmt.setString(1, clienteVO.getNome());
            stmt.setString(2, clienteVO.getCpf());
            //stmt.setString(3, clienteVO.getSenha());
            stmt.setString(3, clienteVO.getSexo());
            //stmt.setDate(5, (Date) clienteVO.getNascimento());
            stmt.setString(4, clienteVO.getCelular());
            stmt.setString(5, clienteVO.getTelefone());
            stmt.setString(6, clienteVO.getEmail());
            stmt.setString(7, clienteVO.getCpf());
            
            stmt.executeUpdate();
                               
            return true;           
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }       
     }
    
}
