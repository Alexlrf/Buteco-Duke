/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alex.Boteco.model.DAO;

import br.com.alex.Boteco.model.SalgadoVO;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class TableModelSalgado extends AbstractTableModel{
    
    DecimalFormat df = new DecimalFormat("0.00");
    List<SalgadoVO> linhas = new ArrayList<>();
    String[] colunas = {"ID", "CATEGORIA", "SABOR", "VALOR", "QUANTIDADE"};


    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return linhas.get(rowIndex).getIdSalgado();
            case 1:
                return linhas.get(rowIndex).getCategoria();
            case 2:
                return linhas.get(rowIndex).getSabor();
            case 3:
                return df.format(linhas.get(rowIndex).getValor());
            case 4:
                return linhas.get(rowIndex).getQuantidade();
        }
        return null;
    }

    public void addRow(SalgadoVO salgadoVO) {
        this.linhas.add(salgadoVO);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int rowIndex) {
        this.linhas.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    
}




