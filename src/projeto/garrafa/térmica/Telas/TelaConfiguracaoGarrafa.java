package projeto.garrafa.térmica.Telas;

import java.awt.event.ActionEvent;
import projeto.garrafa.térmica.GarrafaTermica;
import java.text.DecimalFormat;   
import javax.swing.JOptionPane;

public class TelaConfiguracaoGarrafa extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaInicial
     */
    
        DecimalFormat df = new DecimalFormat("0.#");
        
    public TelaConfiguracaoGarrafa() {
        
        initComponents();
        setTitle("Garrafa Termica");
        setSize(550, 360);
        setLocationRelativeTo(null); 
        setResizable(false); 
        setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Medições Padrões!", "Aviso",JOptionPane.INFORMATION_MESSAGE);
        
        campo_AlturaMaior.setText("30") ;
        campo_AlturaMenor.setText("14") ;
        campo_DiametroMaior.setText("5") ;
        campo_DiametroMenor.setText("4.8") ;
        
        RaiorMaior.setText(String.valueOf(Double.parseDouble(campo_DiametroMaior.getText())/2)) ;
        RaiorMenor.setText(String.valueOf(Double.parseDouble(campo_DiametroMenor.getText())/2));
        vma.setText(String.valueOf(df.format(3.14/1000*Double.parseDouble(campo_AlturaMaior.getText())*Math.pow(Double.parseDouble(RaiorMenor.getText()),2)))) ;
        vme.setText(String.valueOf(df.format(3.14/1000*Double.parseDouble(campo_AlturaMenor.getText())*Math.pow(Double.parseDouble(RaiorMenor.getText()),2)))) ;

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
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo_AlturaMenor = new javax.swing.JTextField();
        campo_DiametroMenor = new javax.swing.JTextField();
        campo_AlturaMaior = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RaiorMaior = new javax.swing.JLabel();
        RaiorMenor = new javax.swing.JLabel();
        Volum = new javax.swing.JLabel();
        VolumeMenor = new javax.swing.JLabel();
        campo_DiametroMaior = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        vma = new javax.swing.JLabel();
        vme = new javax.swing.JLabel();
        botao_redefinir = new javax.swing.JButton();
        botao_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Configurações Vaso Dawar");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/garrafa/térmica/Telas/Garrafa_conf.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 324, -1));

        jLabel3.setText("Altura (h):");
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel4.setText("Diamento (D):");
        jInternalFrame1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel5.setText("Diamento (d):");
        jInternalFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel6.setText("Altura (H):");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        campo_AlturaMenor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_AlturaMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_AlturaMenorActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campo_AlturaMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 80, -1));

        campo_DiametroMenor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_DiametroMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_DiametroMenorActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campo_DiametroMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 80, -1));

        campo_AlturaMaior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_AlturaMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_AlturaMaiorActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campo_AlturaMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 80, -1));

        jLabel7.setText("Volume menor: ");
        jInternalFrame1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jLabel8.setText("Raio menor: ");
        jInternalFrame1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel9.setText("Raior maior:");
        jInternalFrame1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel10.setText("Volume maior: ");
        jInternalFrame1.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));
        jInternalFrame1.getContentPane().add(RaiorMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));
        jInternalFrame1.getContentPane().add(RaiorMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));
        jInternalFrame1.getContentPane().add(Volum, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));
        jInternalFrame1.getContentPane().add(VolumeMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        campo_DiametroMaior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_DiametroMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_DiametroMaiorActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(campo_DiametroMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 80, -1));

        jLabel11.setText(" cm");
        jInternalFrame1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 20, -1));

        jLabel12.setText("cm");
        jInternalFrame1.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 60, 20, -1));

        jLabel13.setText("cm");
        jInternalFrame1.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 90, 20, -1));

        jLabel14.setText("l");
        jInternalFrame1.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 20, -1));

        jLabel15.setText(" cm");
        jInternalFrame1.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 20, -1));

        jLabel16.setText(" cm");
        jInternalFrame1.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 20, -1));

        jLabel17.setText(" cm");
        jInternalFrame1.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 20, -1));

        jLabel18.setText("l");
        jInternalFrame1.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 20, -1));
        jInternalFrame1.getContentPane().add(vma, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 50, -1));
        jInternalFrame1.getContentPane().add(vme, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 50, -1));

        botao_redefinir.setText("Redefinir");
        botao_redefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_redefinirActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(botao_redefinir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 80, -1));

        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(botao_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_AlturaMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_AlturaMenorActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_campo_AlturaMenorActionPerformed

    private void campo_DiametroMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_DiametroMenorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_DiametroMenorActionPerformed

    private void campo_AlturaMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_AlturaMaiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_AlturaMaiorActionPerformed

    private void campo_DiametroMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_DiametroMaiorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campo_DiametroMaiorActionPerformed

    private void botao_redefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_redefinirActionPerformed
        // TODO add your handling code here:
        
       if(campo_DiametroMaior.getText().equals("") || campo_DiametroMenor.getText().equals("")|| campo_AlturaMaior.getText().equals("")|| campo_AlturaMenor.getText().equals("")){
        
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Aviso",JOptionPane.INFORMATION_MESSAGE);
         
        } else  {
            RaiorMaior.setText(String.valueOf(Double.parseDouble(campo_DiametroMaior.getText())/2)) ;
            RaiorMenor.setText(String.valueOf(Double.parseDouble(campo_DiametroMenor.getText())/2));
            vma.setText(String.valueOf(df.format(3.14/1000*Double.parseDouble(campo_AlturaMaior.getText())*Math.pow(Double.parseDouble(RaiorMenor.getText()),2)))) ;
            vme.setText(String.valueOf(df.format(3.14/1000*Double.parseDouble(campo_AlturaMenor.getText())*Math.pow(Double.parseDouble(RaiorMenor.getText()),2)))) ;

            JOptionPane.showMessageDialog(null, "Modificado com sucesso!", "Aviso",JOptionPane.INFORMATION_MESSAGE);

            botao_voltarActionPerformed(evt); 
            
        }
        
    }//GEN-LAST:event_botao_redefinirActionPerformed

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        // TODO add your handling code here:
        TelaInicial tela = new TelaInicial(campo_AlturaMaior.getText(),campo_AlturaMenor.getText(), campo_DiametroMaior.getText(), campo_DiametroMenor.getText());
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_botao_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConfiguracaoGarrafa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoGarrafa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoGarrafa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracaoGarrafa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfiguracaoGarrafa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RaiorMaior;
    private javax.swing.JLabel RaiorMenor;
    private javax.swing.JLabel Volum;
    private javax.swing.JLabel VolumeMenor;
    private javax.swing.JButton botao_redefinir;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JTextField campo_AlturaMaior;
    private javax.swing.JTextField campo_AlturaMenor;
    private javax.swing.JTextField campo_DiametroMaior;
    private javax.swing.JTextField campo_DiametroMenor;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel vma;
    private javax.swing.JLabel vme;
    // End of variables declaration//GEN-END:variables

    
}
