/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Calculator extends javax.swing.JFrame {
    double numriPare;
    double numriDyte;
    String operatori="";
    /**
     * Creates new form Calculator
     */
    public Calculator() {   
        initComponents();
        pamjaRezultatit.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        presja = new javax.swing.JButton();
        pjestim = new javax.swing.JButton();
        shumezim = new javax.swing.JButton();
        mbledhje = new javax.swing.JButton();
        zbritje = new javax.swing.JButton();
        barazim = new javax.swing.JButton();
        pamjaRezultatit = new javax.swing.JTextField();
        fshijEkranin = new javax.swing.JButton();
        backspace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        presja.setText(".");
        presja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presjaActionPerformed(evt);
            }
        });

        pjestim.setText("/");
        pjestim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjestimActionPerformed(evt);
            }
        });

        shumezim.setText("*");
        shumezim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shumezimActionPerformed(evt);
            }
        });

        mbledhje.setText("+");
        mbledhje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbledhjeActionPerformed(evt);
            }
        });

        zbritje.setText("-");
        zbritje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zbritjeActionPerformed(evt);
            }
        });

        barazim.setText("=");
        barazim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barazimActionPerformed(evt);
            }
        });

        pamjaRezultatit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        pamjaRezultatit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pamjaRezultatit.setToolTipText("");
        pamjaRezultatit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pamjaRezultatitActionPerformed(evt);
            }
        });

        fshijEkranin.setText("C");
        fshijEkranin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fshijEkraninActionPerformed(evt);
            }
        });

        backspace.setText("⌫");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(presja, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(barazim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(zbritje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(mbledhje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pamjaRezultatit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(fshijEkranin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(shumezim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pjestim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pamjaRezultatit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fshijEkranin, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(pjestim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shumezim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mbledhje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zbritje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(presja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barazim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
       pamjaRezultatit.setText(pamjaRezultatit.getText()+"6");    
    }//GEN-LAST:event_num6ActionPerformed

    private void mbledhjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbledhjeActionPerformed
     if(operatori.isEmpty()){ 
    numriPare=Double.parseDouble(pamjaRezultatit.getText());
    operatori="+";
    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
    }else if(pamjaRezultatit.getText().endsWith(operatori)){
     operatori="+";
     String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
     pamjaRezultatit.setText(nderrimi+operatori);
    }
    }//GEN-LAST:event_mbledhjeActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
    pamjaRezultatit.setText(pamjaRezultatit.getText()+"7");    
    }//GEN-LAST:event_num7ActionPerformed

    private void pamjaRezultatitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pamjaRezultatitActionPerformed
       
      
    }//GEN-LAST:event_pamjaRezultatitActionPerformed

    private void fshijEkraninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fshijEkraninActionPerformed
     pamjaRezultatit.setText(""); 
     operatori="";
    }//GEN-LAST:event_fshijEkraninActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
       pamjaRezultatit.setText(pamjaRezultatit.getText()+"8");    
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
       pamjaRezultatit.setText(pamjaRezultatit.getText()+"9");    
    }//GEN-LAST:event_num9ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
    pamjaRezultatit.setText(pamjaRezultatit.getText()+"4");    
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
      pamjaRezultatit.setText(pamjaRezultatit.getText()+"5");    
    }//GEN-LAST:event_num5ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
      pamjaRezultatit.setText(pamjaRezultatit.getText()+"1");    
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
      pamjaRezultatit.setText(pamjaRezultatit.getText()+"2");    
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
       pamjaRezultatit.setText(pamjaRezultatit.getText()+"3");    
    }//GEN-LAST:event_num3ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
       pamjaRezultatit.setText(pamjaRezultatit.getText()+"0");    
    }//GEN-LAST:event_num0ActionPerformed

    private void presjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presjaActionPerformed
        if(pamjaRezultatit.getText().contains(".")){
           if(pamjaRezultatit.getText().indexOf(operatori)>pamjaRezultatit.getText().lastIndexOf("."))
           {
             pamjaRezultatit.setText(pamjaRezultatit.getText()+".");  
           }
        }else{
            pamjaRezultatit.setText(pamjaRezultatit.getText()+".");  
        }
    }//GEN-LAST:event_presjaActionPerformed

    private void zbritjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zbritjeActionPerformed
     if(operatori.isEmpty()){ 
    numriPare=Double.parseDouble(pamjaRezultatit.getText());
    operatori="-";
    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
    }else if(pamjaRezultatit.getText().endsWith(operatori)){
     operatori="-";
     String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
     pamjaRezultatit.setText(nderrimi+operatori);
    }
    }//GEN-LAST:event_zbritjeActionPerformed

    private void shumezimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shumezimActionPerformed
     if(operatori.isEmpty()){ 
    numriPare=Double.parseDouble(pamjaRezultatit.getText());
    operatori="*";
    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
    }else if(pamjaRezultatit.getText().endsWith(operatori)){
     operatori="*";
     String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
     pamjaRezultatit.setText(nderrimi+operatori);
    }
    }//GEN-LAST:event_shumezimActionPerformed

    private void pjestimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pjestimActionPerformed
    if(operatori.isEmpty()){ 
    numriPare=Double.parseDouble(pamjaRezultatit.getText());
    operatori="/";
    pamjaRezultatit.setText(pamjaRezultatit.getText()+operatori);
    }else if(pamjaRezultatit.getText().endsWith(operatori)){
     operatori="/";
     String nderrimi=pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1);
     pamjaRezultatit.setText(nderrimi+operatori);
    }
    }//GEN-LAST:event_pjestimActionPerformed

    private void barazimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barazimActionPerformed
    if(operatori.isEmpty()){
    pamjaRezultatit.setText(pamjaRezultatit.getText());
    }else {
        int indeksi=pamjaRezultatit.getText().indexOf(operatori)+1;
        String numriDyteString=pamjaRezultatit.getText().substring(indeksi,pamjaRezultatit.getText().length());
        numriDyte=Double.parseDouble(numriDyteString);
        if(operatori.equals("+")){
            pamjaRezultatit.setText(Double.toString(numriPare+numriDyte));
        }else if(operatori.equals("-")){
            pamjaRezultatit.setText(Double.toString(numriPare-numriDyte));
        } else if (operatori.equals("/")){
            pamjaRezultatit.setText(Double.toString(numriPare/numriDyte));
        }else {
            pamjaRezultatit.setText(Double.toString(numriPare*numriDyte));
        }
    }
    operatori="";
    
    }//GEN-LAST:event_barazimActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
    if(pamjaRezultatit.getText().isEmpty()){
    }else if(pamjaRezultatit.getText().endsWith(operatori)){
        pamjaRezultatit.setText(pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1));
        operatori="";
    }else{
      pamjaRezultatit.setText(pamjaRezultatit.getText().substring(0,pamjaRezultatit.getText().length()-1));   
    }
    }//GEN-LAST:event_backspaceActionPerformed
   
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspace;
    private javax.swing.JButton barazim;
    private javax.swing.JButton fshijEkranin;
    private javax.swing.JButton mbledhje;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextField pamjaRezultatit;
    private javax.swing.JButton pjestim;
    private javax.swing.JButton presja;
    private javax.swing.JButton shumezim;
    private javax.swing.JButton zbritje;
    // End of variables declaration//GEN-END:variables
}
