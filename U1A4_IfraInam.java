/*
 * Ifra Inam
 * ICS4UE
 * Mr. Diakoloukas
 * 2023-08-03
 * Purpose of Program: For user to input two numbers and output information related to those numbers
 */

/**
 *
 * @author Ifra Inam
 */
public class U1A4_IfraInam extends javax.swing.JFrame {

    /**
     * Creates new form U1A4_IfraInam
     */
    public U1A4_IfraInam() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        txtNumber1 = new javax.swing.JTextField();
        lblNumbers = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumber2 = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblHypotenuse = new javax.swing.JLabel();
        txtHypotenuse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtGreaterNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radbtnWasThisFun = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFactors = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber1ActionPerformed(evt);
            }
        });

        lblNumbers.setText("Enter 2 numbers:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Math Game!");

        txtNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber2ActionPerformed(evt);
            }
        });

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblHypotenuse.setText("Hypotenuse:");

        txtHypotenuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHypotenuseActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel4.setText("Larger Number:");

        radbtnWasThisFun.setText("Was This Fun?");
        radbtnWasThisFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbtnWasThisFunActionPerformed(evt);
            }
        });

        txtFactors.setColumns(20);
        txtFactors.setRows(5);
        jScrollPane2.setViewportView(txtFactors);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)
                        .addGap(2, 2, 2)
                        .addComponent(radbtnWasThisFun))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNumbers)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(83, 83, 83)))
                                    .addComponent(lblHypotenuse))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCalculate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel3)
                                        .addGap(29, 29, 29)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHypotenuse, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGreaterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumbers)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGreaterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHypotenuse)
                            .addComponent(txtHypotenuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit)
                            .addComponent(radbtnWasThisFun))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        
        // declaring variables 
        String num1str; 
        String num2str; 
    
        // retrieving user inputs 
        num1str = txtNumber1.getText(); 
        num2str = txtNumber2.getText(); 
        
        // converting string numbers into doubles
        double num1 = Double.parseDouble(num1str);
        double num2 = Double.parseDouble(num2str);
        
        // determines which is the greater number from user inputs
        double greater = Math.max(num1, num2);
        
        txtGreaterNumber.setText(Double.toString(greater));
        
        // calling hypotenuse method 
        hypotenuse(num1, num2);
        // calling factors method
        factors(num1); 
        factors(num2);
    }//GEN-LAST:event_btnCalculateActionPerformed

    // custom method to find hypotenuse of user inputs
    public void hypotenuse(double a, double b) {
        // step 1 of finding hypotenuse 
        double step1Hypotenuse = (a*a) + (b*b);
        // final step of finding hypotenuse --> use square root method 
        double hypotenuse = Math.sqrt(step1Hypotenuse);
        // round hypotenuse to make output more organized --> use round method 
        double hypotenuseRound = Math.round(hypotenuse);
        // output rounded hypotenuse 
        txtHypotenuse.setText(Double.toString(hypotenuseRound));
        // determines which is the greater number from user inputs 
    }
    
    // custom method to find all factors for user inputs
    public void factors(double a){
        //StringBuilder sb = new StringBuilder(); 
        for (double i = 1; i <= a; ++i) {
            if (a % i == 0) {
               // work on: output this on the GUI
               txtFactors.append(i + "\n");
               
            } 
        }
    }
    
    private void txtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber1ActionPerformed

    private void txtNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber2ActionPerformed

    private void txtHypotenuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHypotenuseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHypotenuseActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); // Exit the application.
    }//GEN-LAST:event_btnExitActionPerformed

    private void radbtnWasThisFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbtnWasThisFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radbtnWasThisFunActionPerformed

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
            java.util.logging.Logger.getLogger(U1A4_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U1A4_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U1A4_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U1A4_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U1A4_IfraInam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHypotenuse;
    private javax.swing.JLabel lblNumbers;
    private javax.swing.JRadioButton radbtnWasThisFun;
    private javax.swing.JTextArea txtFactors;
    private javax.swing.JTextField txtGreaterNumber;
    private javax.swing.JTextField txtHypotenuse;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    // End of variables declaration//GEN-END:variables
}