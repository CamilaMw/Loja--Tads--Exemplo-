package view;
//@author Camila

import javax.swing.JOptionPane;
import java.io.IOException;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pDesktop = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        mCadastrar = new javax.swing.JMenu();
        imNotebook = new javax.swing.JMenuItem();
        imSair = new javax.swing.JMenuItem();
        mRelatorio = new javax.swing.JMenu();
        mUtil = new javax.swing.JMenu();
        imCalculadora = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        immWindows = new javax.swing.JMenu();
        iimmBlocoDeNotas = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja de Notebboks");

        javax.swing.GroupLayout pDesktopLayout = new javax.swing.GroupLayout(pDesktop);
        pDesktop.setLayout(pDesktopLayout);
        pDesktopLayout.setHorizontalGroup(
            pDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pDesktopLayout.setVerticalGroup(
            pDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        mCadastrar.setText("Cadastrar");

        imNotebook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK));
        imNotebook.setText("Notebook");
        imNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imNotebookActionPerformed(evt);
            }
        });
        mCadastrar.add(imNotebook);

        imSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        imSair.setText("Sair");
        imSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSairActionPerformed(evt);
            }
        });
        mCadastrar.add(imSair);

        barraMenu.add(mCadastrar);

        mRelatorio.setText("Relatório");
        barraMenu.add(mRelatorio);

        mUtil.setText("Utilidades");

        imCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        imCalculadora.setText("Calculadora");
        imCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCalculadoraActionPerformed(evt);
            }
        });
        mUtil.add(imCalculadora);
        mUtil.add(jSeparator1);

        immWindows.setText("Windows");

        iimmBlocoDeNotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        iimmBlocoDeNotas.setText("Bloco de Notas");
        iimmBlocoDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iimmBlocoDeNotasActionPerformed(evt);
            }
        });
        immWindows.add(iimmBlocoDeNotas);

        mUtil.add(immWindows);

        barraMenu.add(mUtil);

        mSair.setText("Sair");
        mSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSairMouseClicked(evt);
            }
        });
        barraMenu.add(mSair);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_imSairActionPerformed

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_mSairMouseClicked

    private void imNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imNotebookActionPerformed
        FrmCadNotebook cadnote = new FrmCadNotebook();
            pDesktop.add(cadnote);
            cadnote.setVisible(true);
    }//GEN-LAST:event_imNotebookActionPerformed

    private void iimmBlocoDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iimmBlocoDeNotasActionPerformed
        try{
                Runtime.getRuntime().exec("cmd /c start /max notepad.exe");
                
        } catch (IOException erro){
            JOptionPane.showMessageDialog(this,"Erro ao abrir o bloco de notas" + erro);
        }
    }//GEN-LAST:event_iimmBlocoDeNotasActionPerformed

    private void imCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCalculadoraActionPerformed
        MinhaCalc calc = new MinhaCalc();
        pDesktop.add(calc);
        calc.setVisible(true);
    }//GEN-LAST:event_imCalculadoraActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem iimmBlocoDeNotas;
    private javax.swing.JMenuItem imCalculadora;
    private javax.swing.JMenuItem imNotebook;
    private javax.swing.JMenuItem imSair;
    private javax.swing.JMenu immWindows;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mCadastrar;
    private javax.swing.JMenu mRelatorio;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenu mUtil;
    private javax.swing.JDesktopPane pDesktop;
    // End of variables declaration//GEN-END:variables
}
