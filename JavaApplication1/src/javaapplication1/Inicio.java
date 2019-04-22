
package javaapplication1;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame 
{
    public static Distribuicao dist = new Distribuicao();
    boolean discreta = true;
    boolean continua = false;
    
    public Inicio() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaRol = new javax.swing.JTextArea();
        btnGerarTabela = new javax.swing.JButton();
        txtRol = new javax.swing.JTextField();
        btnInsereRol = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFonte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAjuda = new javax.swing.JButton();
        btnLimparTudo = new javax.swing.JButton();
        btnLimparUltimo = new javax.swing.JButton();
        rdContinua = new javax.swing.JRadioButton();
        rdDiscreta = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        setResizable(false);

        txaRol.setEditable(false);
        txaRol.setColumns(20);
        txaRol.setRows(5);
        jScrollPane1.setViewportView(txaRol);

        btnGerarTabela.setText("Gerar Tabela");
        btnGerarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarTabelaActionPerformed(evt);
            }
        });

        txtRol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRolKeyPressed(evt);
            }
        });

        btnInsereRol.setText("Inserir valor no rol");
        btnInsereRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsereRolActionPerformed(evt);
            }
        });
        btnInsereRol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInsereRolKeyPressed(evt);
            }
        });

        jLabel1.setText("Digite o título da tabela");

        jLabel2.setText("Digite a fonte da tabela");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Tabela de Distribuição de Frequência");

        jLabel4.setText("Digite um valor do rol");

        jLabel5.setText("Rol de dados");

        btnAjuda.setText("?");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });

        btnLimparTudo.setText("Limpar Tudo");
        btnLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTudoActionPerformed(evt);
            }
        });

        btnLimparUltimo.setText("Limpar ultimo dado");
        btnLimparUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparUltimoActionPerformed(evt);
            }
        });

        rdContinua.setText("Distribuição de frequência para variável contínua");
        rdContinua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdContinuaMouseClicked(evt);
            }
        });

        rdDiscreta.setSelected(true);
        rdDiscreta.setText("Distribuição de frequência para variável discreta");
        rdDiscreta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdDiscretaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(txtFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnInsereRol))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnLimparTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLimparUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdDiscreta)
                    .addComponent(rdContinua)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addComponent(btnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAjuda)
                    .addComponent(btnInsereRol))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimparTudo)
                    .addComponent(btnLimparUltimo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdDiscreta)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdContinua)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsereRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsereRolActionPerformed
        try
        {
            if(!txtRol.getText().equals(""))
            {
                dist.setRol(Float.parseFloat(txtRol.getText()));
                String concatenaRol = "";
                for(int i = 0; i < dist.getRol().size(); i++)
                {
                    if(i!=0 && i%8==0)
                    {
                        concatenaRol = concatenaRol + "\n" +  dist.getRol().get(i).toString();
                    }
                    else if(i != 0)
                    {
                        concatenaRol = concatenaRol + " - " +  dist.getRol().get(i).toString();
                    }
                    else
                    {
                        concatenaRol = concatenaRol +  dist.getRol().get(i).toString();
                    }
                }
                txaRol.setText(concatenaRol);
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"Digite apenas numeros!");
        }
    }//GEN-LAST:event_btnInsereRolActionPerformed

    private void btnInsereRolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInsereRolKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnInsereRol.doClick();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DELETE) {
            btnLimparUltimo.doClick();
        }
    }//GEN-LAST:event_btnInsereRolKeyPressed

    private void txtRolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRolKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnInsereRol.doClick();
        }
        if(evt.getKeyCode() == KeyEvent.VK_DELETE) {
            btnLimparUltimo.doClick();
        }
    }//GEN-LAST:event_txtRolKeyPressed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        JOptionPane.showMessageDialog(null, "Digite os valores do rol um por um.\nUse apenas números e não dê espaço entre números"
                + "\nAtalhos de teclado:"
                + "\n-Enter: Insere o valor no rol"
                + "\n-Delete: Apaga um valor do rol");
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnGerarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarTabelaActionPerformed
        if(txaRol.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "O Rol está vazio");
        } 
        else if(txtTitulo.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null, "O titulo está em branco");
        }
         else if(txtFonte.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null, "A fonte está em branco");
        }
         else if(discreta == true)
        {
            dist.setTitulo(txtTitulo.getText());
            dist.setFonte(txtFonte.getText());
            Tabela tabela = new Tabela();
            tabela.setVisible(true);
        }
        else if(continua == true)
        {
            dist.setTitulo(txtTitulo.getText());
            dist.setFonte(txtFonte.getText());
            Tabela2 tabela = new Tabela2();
            tabela.setVisible(true);
        }
    }//GEN-LAST:event_btnGerarTabelaActionPerformed

    private void btnLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTudoActionPerformed
        dist.limpaTudo();
        txaRol.setText("");
    }//GEN-LAST:event_btnLimparTudoActionPerformed

    private void btnLimparUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUltimoActionPerformed
        dist.limpaUltimo();
        String concatenaRol = "";
        for (int i = 0; i < dist.getRol().size(); i++) {
            if (i != 0 && i % 15 == 0) {
                concatenaRol = concatenaRol + "\n" + dist.getRol().get(i).toString();
            } else if (i != 0) {
                concatenaRol = concatenaRol + " - " + dist.getRol().get(i).toString();
            } else {
                concatenaRol = concatenaRol + dist.getRol().get(i).toString();
            }
        }
        txaRol.setText(concatenaRol);
    }//GEN-LAST:event_btnLimparUltimoActionPerformed

    private void rdDiscretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdDiscretaMouseClicked
        discreta = true;
        continua = false;
        rdContinua.setSelected(false);
        rdDiscreta.setSelected(true);
    }//GEN-LAST:event_rdDiscretaMouseClicked

    private void rdContinuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdContinuaMouseClicked
        discreta = false;
        continua = true;
        rdContinua.setSelected(true);
        rdDiscreta.setSelected(false);
    }//GEN-LAST:event_rdContinuaMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnGerarTabela;
    private javax.swing.JButton btnInsereRol;
    private javax.swing.JButton btnLimparTudo;
    private javax.swing.JButton btnLimparUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdContinua;
    private javax.swing.JRadioButton rdDiscreta;
    private javax.swing.JTextArea txaRol;
    private javax.swing.JTextField txtFonte;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
