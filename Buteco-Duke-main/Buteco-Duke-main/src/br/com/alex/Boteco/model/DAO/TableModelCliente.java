
package br.com.alex.Boteco.model.DAO;

import br.com.alex.Boteco.model.ClienteVO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class TableModelCliente extends AbstractTableModel{
    
    private List<ClienteVO> listaClientes = new ArrayList<>();
    private String[] colunas = {"ID","Nome", "Cpf", "Sexo", "Nascimento", "Celular", "Telefone", "Email"};
            
    @Override
    public int getRowCount() {
        
        return this.listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        
        return this.colunas.length;        
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return listaClientes.get(rowIndex).getIdCliente();
            case 1:
                return listaClientes.get(rowIndex).getNome();                
            case 2:
                return listaClientes.get(rowIndex).getCpf();
            case 3:
                return listaClientes.get(rowIndex).getSexo();
            case 4:
                return listaClientes.get(rowIndex).getNascimento();
            case 5:
                return listaClientes.get(rowIndex).getCelular();
            case 6:
                return listaClientes.get(rowIndex).getTelefone();
            case 7:
                return listaClientes.get(rowIndex).getEmail();
        }
        
        return null;
    }
    
    public void addRow(ClienteVO clienteVO){
        this.listaClientes.add(clienteVO);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex){
        this.listaClientes.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    
}
