package Codigo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoCarrinhoTableModel extends AbstractTableModel{
    
    private List<ProdutoCarrinho> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "Valor", "Quantidade"};
    private int contagem;
    
    public int getContagem ()
    {
        return this.contagem;
    }
    
    public List<ProdutoCarrinho> getDados ()
    {
        return this.dados;
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
                return dados.get(rowIndex).getNome();
            case 1:
                return dados.get(rowIndex).getValor();
            case 2:
                return dados.get(rowIndex).getQuantidade();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex)
        {
            case 0:
                dados.get(rowIndex).setNome((String) aValue);
                break;
            case 1:
                dados.get(rowIndex).setValor(Float.parseFloat((String) aValue));
                break;
            case 2:
                dados.get(rowIndex).setQuantidade(Integer.parseInt((String) aValue));
                break;
        }
        
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
    public boolean verificaDados (String nome)
    {
        contagem = -1;
        for (ProdutoCarrinho p: dados)
        {
            contagem++;
            if (p.getNome() == nome)
            {
                return true;
            }
            
        }
        return false;
    }
    
    public void removeTudo ()
    {
        for (int i = 0; i<dados.size(); i++)
        {
            removeRow(i);
        }
    }
    
    public void adicionaQuantidade ()
    {
        int quantidadeAtual = dados.get(contagem).getQuantidade();
        quantidadeAtual++;
        String quantidadeFinal = Integer.toString(quantidadeAtual);
        setValueAt(quantidadeFinal, contagem, 2);
    }
    
    public void addRow (ProdutoCarrinho p)
    {
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow (int rowIndex)
    {
        this.dados.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
}
