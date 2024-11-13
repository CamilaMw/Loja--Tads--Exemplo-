package Model;

import Cadastro.cadastro.dados.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do cliente
 *
 * @author Camila
 */
public class ClienteTableModel extends AbstractTableModel {

    private String colunas[] = {"Nome", "CPF"};
    private List<Cliente> dados;

 
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
        Cliente cliente = dados.get(l);
        switch (c) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getCpf();
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

    public void setDados(List<Cliente> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }

    public Cliente getRowValue(int l) {
        return dados.get(l);
    }
}
