package Codigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CarrinhoTableModel extends AbstractTableModel{
    
    private List<Produto> dados = new ArrayList<>();
    private List<Integer> contagemAuxiliar = new ArrayList<>();
    private String[] colunas = {"Modelo", "Valor"};
    
    public List<Produto> getDados ()
    {
        return this.dados;
    }

    public List<Integer> getContagemAuxiliar() {
        return contagemAuxiliar;
    }
    

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                return dados.get(rowIndex).getModelo();
            case 1:
                return dados.get(rowIndex).getValor();
        }
        return null;
    }

//    @Override
//    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//        switch (columnIndex)
//        {
//            case 0:
//                dados.get(rowIndex).setModelo((String) aValue);
//                break;
//            case 1:
//                dados.get(rowIndex).setValor(Float.parseFloat((String) aValue));
//                break;
//        }
//        
//        this.fireTableRowsUpdated(rowIndex, rowIndex);
//    }
    
    public void addRow (Produto p, int i)
    {
        this.dados.add(p);
        this.contagemAuxiliar.add(i);
        this.fireTableDataChanged();
    }
    
    public void removeRow (int x)
    {
        int index = 0;
        for (int i = 0; i <= contagemAuxiliar.size(); i++)
        {
            if (contagemAuxiliar.get(i) == x)
            {
                index = i;
                break;
            }
        }
        this.dados.remove(index);
        this.contagemAuxiliar.remove(index);
        this.fireTableRowsDeleted(index, index);
    }
    
    public void removeSelectedRow (int rowIndex)
    {
        this.dados.remove(rowIndex);
        this.contagemAuxiliar.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    
    public void clearTable ()
    {
        this.dados.clear();
        this.contagemAuxiliar.clear();
        this.fireTableRowsDeleted(0, dados.size());
    }
}