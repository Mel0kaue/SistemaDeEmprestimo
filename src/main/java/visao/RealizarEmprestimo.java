package visao;

import dao.AmigoDAO;
import dao.EmprestimoDAO;
import dao.FerramentaDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;

/**
 *
 * @author kauem
 */
public class RealizarEmprestimo extends javax.swing.JFrame {

    private List<Integer> listaIds = new ArrayList<>();

    public RealizarEmprestimo() {

        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTableEmprestimos.getModel();
        jTableEmprestimos.setRowSorter(new TableRowSorter(modelo));

        //Permitir seleção de múltiplas linhas
        jTableEmprestimos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        //Centralizar valores
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);

        //Cetralizando colunas desejadas 
        jTableEmprestimos.getColumnModel().getColumn(2).setCellRenderer(centerRenderer); // Coluna data
        jTableEmprestimos.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); // Coluna status

        carregarAmigos();
        carregarFerramenta();
        readJtable();
    }

    private void carregarFerramenta() {
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        List<Ferramenta> ferramentas = ferramentaDAO.read();

        for (Ferramenta ferramenta : ferramentas) {
            jComboBoxFerramenta.addItem(ferramenta.getNome());
        }
    }

    private void carregarAmigos() {
        AmigoDAO amigosDAO = new AmigoDAO();
        List<Amigo> amigos = amigosDAO.read();

        for (Amigo amigo : amigos) {
            jComboBoxAmigos.addItem(amigo.getNome());
        }
    }

    public void readJtable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableEmprestimos.getModel();
        modelo.setNumRows(0);
        listaIds.clear();

        EmprestimoDAO edao = new EmprestimoDAO();

        for (Emprestimo e : edao.read()) {

            listaIds.add(e.getID());

            modelo.addRow(new Object[]{
                e.getAmigoEsc(),
                e.getFerramentaEsc(),
                e.getData(),
                e.getStatus()
            });

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFerramenta = new javax.swing.JLabel();
        lblAmigo = new javax.swing.JLabel();
        btnRealizarEmp = new javax.swing.JButton();
        jComboBoxAmigos = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEmprestimos = new javax.swing.JTable();
        jComboBoxFerramenta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar empréstimo");

        lblFerramenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFerramenta.setText("Ferramenta:");

        lblAmigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAmigo.setText("Amigo:");

        btnRealizarEmp.setBackground(new java.awt.Color(255, 255, 255));
        btnRealizarEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRealizarEmp.setForeground(new java.awt.Color(0, 153, 0));
        btnRealizarEmp.setText("Realizar Empréstimo");
        btnRealizarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarEmpActionPerformed(evt);
            }
        });

        jComboBoxAmigos.setToolTipText("");
        jComboBoxAmigos.setName(""); // NOI18N
        jComboBoxAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAmigosActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jTableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Ferramenta", "Data", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTableEmprestimos);

        jComboBoxFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFerramentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealizarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmigo)
                            .addComponent(jComboBoxAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRealizarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnRealizarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarEmpActionPerformed
        Emprestimo e = new Emprestimo();
        EmprestimoDAO dao = new EmprestimoDAO();

        String nomeFerramenta = (String) jComboBoxFerramenta.getSelectedItem();
        FerramentaDAO ferramentaDAO = new FerramentaDAO();
        Ferramenta ferramenta = ferramentaDAO.getPorNome(nomeFerramenta);

        if (ferramenta != null) {
            int novaQuantidade = ferramenta.getQuantidade() - 1;
            if (novaQuantidade >= 0) {
                ferramenta.setQuantidade(novaQuantidade);

                ferramentaDAO.update(ferramenta);
                e.setFerramentaEsc(nomeFerramenta);
                e.setAmigoEsc((String) jComboBoxAmigos.getSelectedItem());

                try {
                    dao.create(e);
                } catch (ParseException ex) {
                    Logger.getLogger(RealizarEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
                }

                readJtable();
            } else {
                JOptionPane.showMessageDialog(null, "Não há ferramentas suficientes disponíveis para empréstimo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma ferramenta para pegar emprestada");

        }
    }//GEN-LAST:event_btnRealizarEmpActionPerformed

    private void jComboBoxAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAmigosActionPerformed
    }//GEN-LAST:event_jComboBoxAmigosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int[] selectedRows = jTableEmprestimos.getSelectedRows();
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Selecione ao menos uma linha para excluir.");
            return;
        }

        EmprestimoDAO dao = new EmprestimoDAO();

        for (int i = 0; i < selectedRows.length; i++) {
            int modelRow = jTableEmprestimos.convertRowIndexToModel(selectedRows[i]);

            if (modelRow >= 0 && modelRow < listaIds.size()) {
                int id = listaIds.get(modelRow);

                Emprestimo e = new Emprestimo();
                e.setID(id);
                dao.delete(e);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir. Índice inválido.");
                return;
            }
        }
        readJtable();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jComboBoxFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFerramentaActionPerformed

    }//GEN-LAST:event_jComboBoxFerramentaActionPerformed

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
            java.util.logging.Logger.getLogger(RealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRealizarEmp;
    private javax.swing.JComboBox<String> jComboBoxAmigos;
    private javax.swing.JComboBox<String> jComboBoxFerramenta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEmprestimos;
    private javax.swing.JLabel lblAmigo;
    private javax.swing.JLabel lblFerramenta;
    // End of variables declaration//GEN-END:variables
}
