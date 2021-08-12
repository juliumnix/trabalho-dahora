package Codigo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EstoqueTableModel extends AbstractTableModel{
    
    private List<Produto> produtosCadastrados = new ArrayList<>();
    private String[] colunas = {"Modelo", "Valor"};
    private int contagem;
    
    public int getContagem ()
    {
        return this.contagem;
    }
    
    public List<Produto> getProdutosCadastrados ()
    {
        return this.produtosCadastrados;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return produtosCadastrados.size();
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
                return produtosCadastrados.get(rowIndex).getModelo();
            case 1:
                return produtosCadastrados.get(rowIndex).getValor();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                produtosCadastrados.get(rowIndex).setModelo((String) aValue);
                break;
            case 1:
                produtosCadastrados.get(rowIndex).setValor(Float.parseFloat((String) aValue));
                break;
        }
        
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public void addRow (Produto p)
    {
        this.produtosCadastrados.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow (int rowIndex)
    {
        this.produtosCadastrados.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public void clearTable ()
    {
        this.produtosCadastrados.clear();
        this.fireTableRowsDeleted(0, produtosCadastrados.size());
    }  
}