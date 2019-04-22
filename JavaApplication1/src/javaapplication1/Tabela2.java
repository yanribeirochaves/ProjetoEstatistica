package javaapplication1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tabela2 extends javax.swing.JFrame {
    
    static DefaultTableModel modelo;
    public Tabela2() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("i");
        modelo.addColumn("xi");
        modelo.addColumn("fi");
        modelo.addColumn("Fi");
        modelo.addColumn("fri");
        modelo.addColumn("Fri");
        
        lblTitulo.setText(Inicio.dist.getTitulo());
        lblFonte.setText("Fonte: "+Inicio.dist.getFonte());
        insereTabelaContinua();
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
                .addGap(0, 0, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela2().setVisible(true);
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
    public void insereTabelaContinua()
    {
       int i = (int)Math.ceil(1 + 3.3 * Math.log10(Inicio.dist.getRol().size())); // numero de linhas
       float xiMenor = 0;
       float xiMaior=0;
       float at = (float)Inicio.dist.getRol().get(Inicio.dist.getRol().size()-1) - (float)Inicio.dist.getRol().get(0);
       int h = (int)Math.ceil(at / i);
       ArrayList<String> xi = new ArrayList<String>();
       String menorXi = Inicio.dist.getRol().get(0).toString();
       xiMenor = Float.parseFloat(menorXi);
       int fi = 0;
       ArrayList<Integer> fiPosicao = new ArrayList<Integer>();
       int Fi = 0;//frequencia acumulada
       ArrayList<Integer> FiPosicao = new ArrayList<Integer>();
       
       for(int m = 1; m < i; m++)
       {
           xiMaior = xiMenor + h;
           xi.add(xiMenor + " |- " + xiMaior);
           xiMenor = xiMaior;
       }
       xiMaior = xiMenor + h;
       xi.add(xiMenor + " |-| " + xiMaior);
       xiMenor = Float.parseFloat(menorXi);
       int j = 0;
       for(int m = 1; m <= i; m++)
       {
           xiMaior = xiMenor + h;
           for(int k = j; k < Inicio.dist.getRol().size(); k++)
           {
               if((float)(Inicio.dist.getRol().get(k)) >= xiMenor && (float)(Inicio.dist.getRol().get(k)) < xiMaior)
               {
                   fi++;
               }
               else{
                   j = k;
                   break;
               }
           }
           fiPosicao.add(fi);
           Fi += fi;
           FiPosicao.add(Fi);
           fi = 0;
           xiMenor = xiMaior;
       }
       
       //Variavel para arredondamento
       DecimalFormat decimalFormat = new DecimalFormat();
       decimalFormat.setMinimumFractionDigits(4);// 4 casas apos a virgula
       
       for(int m = 1; m <= i; m++)
       {
           modelo.addRow(new Object[]
           {
               m,
               xi.get(m-1),
               fiPosicao.get(m-1),
               FiPosicao.get(m-1),
               decimalFormat.format((float)fiPosicao.get(m-1)/Fi),
               decimalFormat.format((float)FiPosicao.get(m-1)/Fi)
           });
       }
       modelo.addRow(new Object[]
           {
               null,
               null,
               "Efi="+Fi,
               null,
               "EFi="+Fi/Fi,
               null
           });
       tabelaFrequencia.setModel(modelo);
    }
}
