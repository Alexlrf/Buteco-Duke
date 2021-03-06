
package br.com.alex.Boteco.controller;

import br.com.alex.Boteco.model.ClienteVO;
import br.com.alex.Boteco.model.DAO.ClienteDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteController {

    public boolean save(ClienteVO clienteVO) {        
        
        ClienteDAO clienteDAO = new ClienteDAO();
        boolean retorno = clienteDAO.save(clienteVO);
           
        return retorno;
    }

    public boolean confirmarLogin(ClienteVO clienteVO) {
        ClienteDAO clienteDAO = new ClienteDAO();
        boolean resultado = clienteDAO.confirmarLogin(clienteVO);
        return resultado;
    }

    public boolean confirmarEmail(ClienteVO clienteVO) {
        ClienteDAO clienteDAO = new ClienteDAO();
        boolean resultado = clienteDAO.confirmarEmail(clienteVO);
        return resultado;        
    }

    public ClienteVO findByCpf(ClienteVO clienteVO) {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteVO resultado = clienteDAO.findByCpf(clienteVO);
        
        return resultado;
    }

    public List<ClienteVO> findAll() {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<ClienteVO> clientes = clienteDAO.findAll();
        return clientes;
    }

    public boolean deleteCliente(ClienteVO clienteVO) {
        ClienteDAO clienteDAO = new ClienteDAO();
        boolean resultado = clienteDAO.deleteCliente(clienteVO);       
        return resultado;
    }

    public boolean updateCliente(ClienteVO clienteVO) {
        ClienteDAO clienteDAO = new ClienteDAO();
        boolean resultado = clienteDAO.updateCliente(clienteVO);       
        return resultado;        
    }
    
}
