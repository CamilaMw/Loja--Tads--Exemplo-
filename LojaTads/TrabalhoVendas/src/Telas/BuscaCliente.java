package Telas;

import DAO.ClienteDAO;
import Model.ClienteTableModel;
import Cadastro.cadastro.dados.Cliente;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 * Janela de consulta a dados do cliente
 *
 * @author Camila
 */
public class BuscaCliente extends javax.swing.JDialog {

    JInternalFrame parent;

    public BuscaCliente(JInternalFrame parent) {
        super();
        this.parent = parent;
        initComponents();
        carregarGrade();
    }

    private void carregarGrade() {
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            ClienteTableModel ctm = (ClienteTableModel) tbGrade.getModel();
            ctm.setDados(clienteDAO.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnFiltro = new javax.swing.JPanel();
        lbFiltro = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        spGrade = new javax.swing.JScrollPane();
        tbGrade = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Downloads\\patinhas.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Downloads\\patinhas.jpg")); // NOI18N
        jLabel3.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca cliente");

        pnFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbFiltro.setText("Filtro:");
        pnFiltro.add(lbFiltro);

        tfFiltro.setColumns(30);
        tfFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFiltroKeyReleased(evt);
            }
        });
        pnFiltro.add(tfFiltro);

        getContentPane().add(pnFiltro, java.awt.BorderLayout.PAGE_START);

        tbGrade.setAutoCreateRowSorter(true);
        tbGrade.setModel(new ClienteTableModel());
        tbGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGradeMouseClicked(evt);
            }
        });
        spGrade.setViewportView(tbGrade);

        getContentPane().add(spGrade, java.awt.BorderLayout.CENTER);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Downloads\\patinhas.jpg")); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(441, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGradeMouseClicked
        if (evt.getClickCount() == 2) {
            ClienteTableModel ctm = (ClienteTableModel) tbGrade.getModel();
            int linhaSelecionada = tbGrade.getRowSorter().convertRowIndexToModel(tbGrade.getSelectedRow());
            Cliente cliente = ctm.getRowValue(linhaSelecionada);

            if (parent instanceof LancamentoVenda) {
                LancamentoVenda lv = (LancamentoVenda) parent;
                lv.setCliente(cliente);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Campo de destino inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_tbGradeMouseClicked

    private void tfFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFiltroKeyReleased
        TableRowSorter rs = (TableRowSorter) tbGrade.getRowSorter();
        rs.setRowFilter(RowFilter.regexFilter("(?i)" + tfFiltro.getText(), 0, 1));
    }//GEN-LAST:event_tfFiltroKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JPanel pnFiltro;
    private javax.swing.JScrollPane spGrade;
    private javax.swing.JTable tbGrade;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
