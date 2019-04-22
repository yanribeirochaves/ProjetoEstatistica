package javaapplication1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tabela extends javax.swing.JFrame 
{
    static DefaultTableModel model;
    public Tabela() 
    {
        initComponents();
        model = new DefaultTableModel();
        model.addColumn("i");
        model.addColumn("xi");
        model.addColumn("fi");
        model.addColumn("Fi");
        model.addColumn("fri");
        model.addColumn("Fri");
        
        lblTitulo.setText(Inicio.dist.getTitulo());
        lblFonte.setText("Fonte: "+Inicio.dist.getFonte());
        insereTabelaDiscreta();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFrequencia = new javax.swing.JTable();
        btnHelp = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblFonte = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(getMaximumSize());

        tabelaFrequencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "i", "xi", "fi", "Fi", "fri", "Fri"
            }
        ));
        tabelaFrequencia.setEnabled(false);
        tabelaFrequencia.setName(""); // NOI18N
        tabelaFrequencia.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tabelaFrequencia);

        btnHelp.setText("?");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTitulo.setText("------------------------------------------------------------------------------------------");

        lblFonte.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFonte.setText("------------------------------------------------------------------------------------------");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 487, Short.MAX_VALUE)
                .addComponent(btnHelp))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnVoltar)
                        .addComponent(lblFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "Legenda:"
                + "\n-i: número de linhas"
                + "\n-xi: variável"
                + "\n-fi: frequência simples"
                + "\n-Fi: frequência acumulada"
                + "\n-fri: frequencia relativa simples"
                + "\n-Fri: Frequencia relativa acumulada");
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFonte;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabelaFrequencia;
    // End of variables declaration//GEN-END:variables
    public void insereTabelaDiscreta()
    {
        float n = 0;//total de fi
        int i = 1;//linhas
        ArrayList<Integer> iPosicao = new ArrayList<Integer>();//posicao respectiuva de i
        int fi = 0;
        ArrayList<Integer> fiPosicao = new ArrayList<Integer>();
        int Fi = 0;//frequencia acumulada
        ArrayList<Integer> FiPosicao = new ArrayList<Integer>();
        
        //repetição para definir o numero de linhas e suas respectivas variaveis
        for(int k = 0; k < Inicio.dist.getRol().size(); k++)
        {
            for(int j = k+1; j < Inicio.dist.getRol().size(); j++)
            {
                if(!Inicio.dist.getRol().get(k).equals(Inicio.dist.getRol().get(j)))
                {
                    i++;
                    iPosicao.add(k);
                    k = j-1;
                    break;
                }
            }
        }
        iPosicao.add(Inicio.dist.getRol().size() - 1);

        //reptição para descobrir o fi e o Fi de cada valor
        for (int m = 1; m <= i; m++) 
        {
            for (int k = 0; k < Inicio.dist.getRol().size(); k++) 
            {
                if(Inicio.dist.getRol().get(iPosicao.get(m-1)).equals(Inicio.dist.getRol().get(k)))
                {
                    fi++;
                }
            }
            Fi = Fi+fi;
            fiPosicao.add(fi);
            FiPosicao.add(Fi);
            fi = 0;
        }
       n = (float)Fi;
       
       //Variavel para arredondamento
       DecimalFormat decimalFormat = new DecimalFormat();
       decimalFormat.setMinimumFractionDigits(4);// 4 casas apos a virgula
       
       for(int m = 1; m <= i; m++)
       {
           model.addRow(new Object[]
           {
               m,
               Inicio.dist.getRol().get(iPosicao.get(m-1)),
               fiPosicao.get(m-1),
               FiPosicao.get(m-1),
               decimalFormat.format((float)fiPosicao.get(m-1)/n),
               decimalFormat.format((float)FiPosicao.get(m-1)/n)
           });
       }
        model.addRow(new Object[]
           {
               null,
               null,
               "Efi="+n,
               null,
               "EFi="+n/n,
               null
           });
       tabelaFrequencia.setModel(model);
    }
}
