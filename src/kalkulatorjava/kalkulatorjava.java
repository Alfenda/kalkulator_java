/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * kalkulatorjava.java
 *
 * Created on Apr 30, 2019, 11:27:28 AM
 */
package kalkulatorjava;

/**
 *
 * @author User
 */
public class kalkulatorjava extends javax.swing.JFrame {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
   

    /** Creates new form kalkulatorjava */
    public kalkulatorjava() {
        initComponents();
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JTextField();
        cmd7 = new javax.swing.JButton();
        cmd8 = new javax.swing.JButton();
        cmd9 = new javax.swing.JButton();
        cmd4 = new javax.swing.JButton();
        cmd5 = new javax.swing.JButton();
        cmd6 = new javax.swing.JButton();
        cmd3 = new javax.swing.JButton();
        cmd2 = new javax.swing.JButton();
        cmd1 = new javax.swing.JButton();
        cmdtambah = new javax.swing.JButton();
        cmdkurang = new javax.swing.JButton();
        cmdkali = new javax.swing.JButton();
        cmdclear = new javax.swing.JButton();
        cmd0 = new javax.swing.JButton();
        cmdsmdengan = new javax.swing.JButton();
        cmdbagi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmd7.setText("7");
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });

        cmd8.setText("8");
        cmd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd8ActionPerformed(evt);
            }
        });

        cmd9.setText("9");
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd9ActionPerformed(evt);
            }
        });

        cmd4.setText("4");
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });

        cmd5.setText("5");
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd5ActionPerformed(evt);
            }
        });

        cmd6.setText("6");
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd6ActionPerformed(evt);
            }
        });

        cmd3.setText("3");
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd3ActionPerformed(evt);
            }
        });

        cmd2.setText("2");
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd2ActionPerformed(evt);
            }
        });

        cmd1.setText("1");
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });

        cmdtambah.setText("+");
        cmdtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdtambahActionPerformed(evt);
            }
        });

        cmdkurang.setText("-");
        cmdkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdkurangActionPerformed(evt);
            }
        });

        cmdkali.setText("*");
        cmdkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdkaliActionPerformed(evt);
            }
        });

        cmdclear.setText("C");
        cmdclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdclearActionPerformed(evt);
            }
        });

        cmd0.setText("0");
        cmd0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd0ActionPerformed(evt);
            }
        });

        cmdsmdengan.setText("=");
        cmdsmdengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsmdenganActionPerformed(evt);
            }
        });

        cmdbagi.setText("/");
        cmdbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbagiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdclear)
                        .addGap(18, 18, 18)
                        .addComponent(cmd0)
                        .addGap(18, 18, 18)
                        .addComponent(cmdsmdengan)
                        .addGap(18, 18, 18)
                        .addComponent(cmdbagi)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmd4)
                                    .addComponent(cmd7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmd8)
                                    .addComponent(cmd5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmd6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdkurang))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmd9)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdkali)))))
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmd1)
                        .addGap(18, 18, 18)
                        .addComponent(cmd2)
                        .addGap(18, 18, 18)
                        .addComponent(cmd3)
                        .addGap(18, 18, 18)
                        .addComponent(cmdtambah)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd1)
                    .addComponent(cmd2)
                    .addComponent(cmd3)
                    .addComponent(cmdtambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd4)
                    .addComponent(cmd5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd6)
                    .addComponent(cmdkurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd7)
                    .addComponent(cmd8)
                    .addComponent(cmd9)
                    .addComponent(cmdkali))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdclear)
                    .addComponent(cmd0)
                    .addComponent(cmdsmdengan)
                    .addComponent(cmdbagi))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
// TODO add your handling code here:
    String cmd1Text = text1.getText() + cmd1.getText();
    text1.setText( cmd1Text );
}//GEN-LAST:event_cmd1ActionPerformed

private void cmd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd2ActionPerformed
// TODO add your handling code here:
    String cmd2Text = text1.getText() + cmd2.getText();
    text1.setText( cmd2Text );
}//GEN-LAST:event_cmd2ActionPerformed

private void cmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd3ActionPerformed
// TODO add your handling code here:
    String cmd3Text = text1.getText() + cmd3.getText();
    text1.setText( cmd3Text );
}//GEN-LAST:event_cmd3ActionPerformed

private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
// TODO add your handling code here:
    String cmd4Text = text1.getText() + cmd4.getText();
    text1.setText( cmd4Text );
}//GEN-LAST:event_cmd4ActionPerformed

private void cmd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd5ActionPerformed
// TODO add your handling code here:
    String cmd5Text = text1.getText() + cmd5.getText();
    text1.setText( cmd5Text );
}//GEN-LAST:event_cmd5ActionPerformed

private void cmd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd6ActionPerformed
// TODO add your handling code here:
    String cmd6Text = text1.getText() + cmd6.getText();
    text1.setText(cmd6Text);
}//GEN-LAST:event_cmd6ActionPerformed

private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
// TODO add your handling code here:
    String cmd7Text = text1.getText() + cmd7.getText();
    text1.setText( cmd7Text );
}//GEN-LAST:event_cmd7ActionPerformed

private void cmd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd8ActionPerformed
// TODO add your handling code here:
    String cmd8Text = text1.getText() + cmd8.getText();
    text1.setText( cmd8Text );
}//GEN-LAST:event_cmd8ActionPerformed

private void cmd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd9ActionPerformed
// TODO add your handling code here:
    String cmd9Text = text1.getText() + cmd9.getText();
    text1.setText( cmd9Text );
}//GEN-LAST:event_cmd9ActionPerformed

private void cmd0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd0ActionPerformed
// TODO add your handling code here:
    String cmd0Text = text1.getText() + cmd0.getText();
    text1.setText( cmd0Text );
}//GEN-LAST:event_cmd0ActionPerformed

private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdclearActionPerformed
// TODO add your handling code here:
    total2 = 0;
    text1.setText("");
}//GEN-LAST:event_cmdclearActionPerformed

private void cmdsmdenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsmdenganActionPerformed
// TODO add your handling code here:
    switch (math_operator){
        case'+':
           total2=total1 + Double.parseDouble(text1.getText());
            break;
         case'-':
             total2=total1 - Double.parseDouble(text1.getText());
             break;
         case'*':
             total2=total1 * Double.parseDouble(text1.getText());
             break;
         case'/':
             total2=total1 / Double.parseDouble(text1.getText());
             break;
    }
    text1.setText(Double.toString(total2));
    total1=0;
}//GEN-LAST:event_cmdsmdenganActionPerformed
private void getOperator(String btnText){
        math_operator=btnText.charAt(0);
        total1=total1+Double.parseDouble(text1.getText());
        text1.setText("");
        
    }
private void cmdtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdtambahActionPerformed
// TODO add your handling code here:
    String button_text = cmdtambah.getText();
    getOperator(button_text);
}//GEN-LAST:event_cmdtambahActionPerformed

private void cmdkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkurangActionPerformed
// TODO add your handling code here:
    String button_text = cmdkurang.getText();
    getOperator(button_text);
}//GEN-LAST:event_cmdkurangActionPerformed

private void cmdkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkaliActionPerformed
// TODO add your handling code here:
    String button_text = cmdkali.getText();
    getOperator(button_text);
}//GEN-LAST:event_cmdkaliActionPerformed

private void cmdbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbagiActionPerformed
// TODO add your handling code here:
    String button_text = cmdbagi.getText();
    getOperator(button_text);
}//GEN-LAST:event_cmdbagiActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulatorjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulatorjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulatorjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulatorjava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new kalkulatorjava().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd0;
    private javax.swing.JButton cmd1;
    private javax.swing.JButton cmd2;
    private javax.swing.JButton cmd3;
    private javax.swing.JButton cmd4;
    private javax.swing.JButton cmd5;
    private javax.swing.JButton cmd6;
    private javax.swing.JButton cmd7;
    private javax.swing.JButton cmd8;
    private javax.swing.JButton cmd9;
    private javax.swing.JButton cmdbagi;
    private javax.swing.JButton cmdclear;
    private javax.swing.JButton cmdkali;
    private javax.swing.JButton cmdkurang;
    private javax.swing.JButton cmdsmdengan;
    private javax.swing.JButton cmdtambah;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}

