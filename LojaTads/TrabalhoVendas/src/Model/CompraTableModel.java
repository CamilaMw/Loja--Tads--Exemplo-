package Model;

import Cadastro.cadastro.dados.Compra;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados da compra
 *
 * @author Camila
 */
public class CompraTableModel extends AbstractTableModel {

    private final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private final NumberFormat NFC = NumberFormat.getCurrencyInstance();
    private String colunas[] = {"Fornecedor", "Data", "Valor", "Situação"};
    private List<Compra> dados;

    
    public int getRowCount() {
        if(dados == null){
            return 0;
        }
        return dados.size();
    }

   
    public int getColumnCount() {
        return colunas.length;
    }
 
    public Object getValueAt(int l, int c) {
        Compra compra = dados.get(l);
        switch (c) {
            case 0:
                return compra.getFornecedor().getNome();
            case 1:
                return SDF.format(compra.getDataCompra());
            case 2:
                return NFC.format(compra.getValorTotal());
            case 3:
                return compra.getSituacao();
            default:
                throw new IndexOutOfBoundsException("Coluna inexistente!");
        }
    }

  
    public String getColumnName(int c) {
        return colunas[c];
    }
 
    public boolean isCellEditable(int l, int c) {
        return false;
    }

    public void setDados(List<Compra> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Compra getRowValue(int l) {
        return dados.get(l);
    }
}
