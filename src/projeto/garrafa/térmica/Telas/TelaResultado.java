/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.garrafa.térmica.Telas;

import projeto.garrafa.térmica.GarrafaTermica;
import java.text.DecimalFormat; 

/**
 *
 * @author Casa
 */
public class TelaResultado extends javax.swing.JFrame {
    
   
    /**
     * Creates new form TelaResultado
     */
    public TelaResultado() {
        initComponents();
    }
    
    GarrafaTermica G1 = new GarrafaTermica();
    private String aM,am,dM,dm;
    double tempo ;
    DecimalFormat df = new DecimalFormat("0.##########");

    TelaResultado(String aM, String am, String dM, String dm, String liquido, double temp) {
        initComponents();
        setTitle("Garrafa Termica");
        setSize(550, 360);
        setLocationRelativeTo(null); 
        setResizable(false); 
        setVisible(true);
        
        GarrafaTermica G1 = new GarrafaTermica(aM,am,dM,dm,liquido,temp);
        tempo = temp;    
        campo_conducao.setText(String.valueOf(df.format(G1.calcularConducao())));
        campo_conveccao.setText(String.valueOf(df.format(G1.calcularConveccao())));
        campo_radiacao.setText(String.valueOf(G1.calcularRadiacao()));
        campo_Rtotal.setText(String.valueOf(df.format(G1.calcularConducao()+G1.calcularConveccao()+G1.calcularRadiacao())));
        campo_calor.setText(String.valueOf(df.format(G1.perdacalor(G1.calcularConducao()+G1.calcularConveccao()+G1.calcularRadiacao()))));

    }

    TelaResultado(String liquido, double temp) {
        initComponents();
        setTitle("Garrafa Termica");
        setSize(550, 360);
        setLocationRelativeTo(null); 
        setResizable(false); 
        setVisible(true);
        
        GarrafaTermica G2 = new GarrafaTermica(liquido,temp);
        tempo = temp;  
        
        campo_conducao.setText(String.valueOf(df.format(G2.calcularConducao())));
        campo_conveccao.setText(String.valueOf(df.format(G2.calcularConveccao())));
        campo_radiacao.setText(df.format(G2.calcularRadiacao()));
        campo_Rtotal.setText(String.valueOf(df.format(G2.calcularConducao()+G2.calcularConveccao()+G2.calcularRadiacao())));
        campo_calor.setText(String.valueOf(df.format(G2.perdacalor(G2.calcularConducao()+G2.calcularConveccao()+G2.calcularRadiacao()))));
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_conducao = new javax.swing.JTextField();
        campo_conveccao = new javax.swing.JTextField();
        campo_radiacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campo_Rtotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        campo_calor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        botao_temperatura = new javax.swing.JButton();
        botao_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Resultados");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Perda Total De Calor (temp. ambiente):");
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Convecção:");
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total: ");
        jInternalFrame1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        campo_conducao.setEditable(false);
        campo_conducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_conducaoActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campo_conducao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 130, -1));

        campo_conveccao.setEditable(false);
        jInternalFrame1.getContentPane().add(campo_conveccao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, -1));

        campo_radiacao.setEditable(false);
        jInternalFrame1.getContentPane().add(campo_radiacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 130, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/garrafa/térmica/Telas/Garrafa_calc.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel6.setText("k/w");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel7.setText("k/w");
        jInternalFrame1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel8.setText("w");
        jInternalFrame1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Calor:");
        jInternalFrame1.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Radiação: ");
        jInternalFrame1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        campo_Rtotal.setEditable(false);
        campo_Rtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_RtotalActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campo_Rtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 130, -1));

        jLabel9.setText("k/w");
        jInternalFrame1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Resistencias:");
        jInternalFrame1.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Condução:");
        jInternalFrame1.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        campo_calor.setEditable(false);
        jInternalFrame1.getContentPane().add(campo_calor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 130, -1));

        jLabel14.setText("k/w");
        jInternalFrame1.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        botao_temperatura.setText("Analise Temperatura");
        botao_temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_temperaturaActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(botao_temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(botao_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_conducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_conducaoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campo_conducaoActionPerformed

    private void campo_RtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_RtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_RtotalActionPerformed

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        // TODO add your handling code here:
        if(aM == null){
                TelaInicial tela = new TelaInicial(aM,am,dM,dm);
                tela.setVisible(true);
                
            }else{
                TelaInicial tela = new TelaInicial();
                tela.setVisible(true);
            }
        
        dispose();
    }//GEN-LAST:event_botao_voltarActionPerformed

    private void botao_temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_temperaturaActionPerformed
        // TODO add your handling code here:
        TelaAnaliseTemp tela = new TelaAnaliseTemp(tempo);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_botao_temperaturaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResultado().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_temperatura;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JTextField campo_Rtotal;
    private javax.swing.JTextField campo_calor;
    private javax.swing.JTextField campo_conducao;
    private javax.swing.JTextField campo_conveccao;
    private javax.swing.JTextField campo_radiacao;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
