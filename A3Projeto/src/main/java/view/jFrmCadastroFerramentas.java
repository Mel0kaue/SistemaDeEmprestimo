/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author kauem
 */
public class jFrmCadastroFerramentas extends javax.swing.JFrame {

    /**
     * Creates new form jFrmCadastroFerramentas
     */
    public jFrmCadastroFerramentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblFerramenta = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jTextInserirFerramenta = new javax.swing.JTextField();
        jTextInserirMarca = new javax.swing.JTextField();
        jTextInserirUnidade = new javax.swing.JTextField();
        btnAdicionarFerramenta = new javax.swing.JButton();
        btnExcluirFerramenta = new javax.swing.JButton();
        btnAlterarFerramenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastro = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar ferramentas");

        lblFerramenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFerramenta.setText("Ferramenta:");

        lblUnidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUnidade.setText("Unidade:");

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarca.setText("Marca:");

        jTextInserirFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInserirFerramentaActionPerformed(evt);
            }
        });

        jTextInserirUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInserirUnidadeActionPerformed(evt);
            }
        });

        btnAdicionarFerramenta.setText("Adicionar");
        btnAdicionarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarFerramentaActionPerformed(evt);
            }
        });

        btnExcluirFerramenta.setText("Excluir");
        btnExcluirFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFerramentaActionPerformed(evt);
            }
        });

        btnAlterarFerramenta.setText("Alterar");
        btnAlterarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFerramentaActionPerformed(evt);
            }
        });

        jTableCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Ferramenta", "Marca", "Valor", "Qtd"
            }
        ));
        jScrollPane1.setViewportView(jTableCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jTextInserirFerramenta))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextInserirMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextInserirUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnAdicionarFerramenta)
                        .addGap(73, 73, 73)
                        .addComponent(btnExcluirFerramenta)
                        .addGap(80, 80, 80)
                        .addComponent(btnAlterarFerramenta)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextInserirFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextInserirMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextInserirUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarFerramenta)
                    .addComponent(btnAlterarFerramenta)
                    .addComponent(btnExcluirFerramenta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextInserirFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInserirFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInserirFerramentaActionPerformed

    private void btnAdicionarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarFerramentaActionPerformed

    private void btnAlterarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarFerramentaActionPerformed

    private void jTextInserirUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInserirUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInserirUnidadeActionPerformed

    private void btnExcluirFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirFerramentaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(jFrmCadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmCadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmCadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmCadastroFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmCadastroFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarFerramenta;
    private javax.swing.JButton btnAlterarFerramenta;
    private javax.swing.JButton btnExcluirFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadastro;
    private javax.swing.JTextField jTextInserirFerramenta;
    private javax.swing.JTextField jTextInserirMarca;
    private javax.swing.JTextField jTextInserirUnidade;
    private javax.swing.JLabel lblFerramenta;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblUnidade;
    // End of variables declaration//GEN-END:variables
}