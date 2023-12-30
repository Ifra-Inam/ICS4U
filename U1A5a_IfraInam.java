
import java.util.Arrays;

/*
 * Ifra Inam
 * ICS4UE
 * Mr. Diakoloukas
 * 2023-08-03
 * Purpose of Program: 
 */

/**
 *
 * @author Ifra Inam
 */
public class U1A5a_IfraInam extends javax.swing.JFrame {

    /**
     * Creates new form U1A5_IfraInam
     */
    public U1A5a_IfraInam() {
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
        lblInteger = new javax.swing.JLabel();
        txtInteger = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnSumAll = new javax.swing.JButton();
        btnSumEven = new javax.swing.JButton();
        btnSumOdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtOutput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Integer Sums");

        lblInteger.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        lblInteger.setText("Enter an Integer:");

        txtInteger.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnList.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnSumAll.setText("Sum All");
        btnSumAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumAllActionPerformed(evt);
            }
        });

        btnSumEven.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnSumEven.setText("Sum Even");
        btnSumEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumEvenActionPerformed(evt);
            }
        });

        btnSumOdd.setText("Sum Odd");
        btnSumOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumOddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        txtList.setColumns(20);
        txtList.setRows(5);
        jScrollPane1.setViewportView(txtList);

        jMenuBar1.setFocusTraversalPolicyProvider(true);
        jMenuBar1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInteger)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInteger, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSumOdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSumEven)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnSumAll, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRemove))))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInteger)
                    .addComponent(txtInteger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSumAll)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSumEven)
                            .addComponent(btnExit))
                        .addGap(18, 18, 18)
                        .addComponent(btnSumOdd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // creating a list where the user's input will be added 
    int [] array = new int[20];
    int count = -1;

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:   
        
        try {
            // get user input and convert it to an integer
            String numstr = txtInteger.getText(); 
            int num = Integer.parseInt(numstr); 
            
            // checks if the input is a positive integer 
            if (num <= 0) {
                txtOutput.setText("Positive integers only! Try again."); 
                txtInteger.setText("");      
                }
            // tells the user than their integer has been added to the list 
            else {
                try {
                    count++;
                    array[count] = num;
                    txtOutput.setText("Added to list. Continue.");
                    txtInteger.setText("");
                }
                // tells the user if their out of bounds (list is full)
                catch(Exception e){
                    count--;
                    txtOutput.setText("Sorry, No more numbers can be added!");
                }
            }
        }
        // checks if user input is not an integer
        catch (NumberFormatException e) {
            txtOutput.setText("This is not an integer! Try Again.");
        } 
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        
        // outputs the list of integers the user inputted 
        txtList.setText("");
        for(int i=0; i <= count; i++) {
            txtList.append(array[i] + "\n");
        }  
    }//GEN-LAST:event_btnListActionPerformed

    private void btnSumAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumAllActionPerformed
        // TODO add your handling code here:
        
        // outputs the list of all the integers the user inputted and the sum
        txtList.setText("");
        int total = 0;
        for (int i = 0; i <= count; i++) {
            total += array[i]; // each element is added to create the sum
            txtList.append(array[i] + "\n");
        }
        txtOutput.setText(("The total of the entries is: " ) + Integer.toString(total));
    }//GEN-LAST:event_btnSumAllActionPerformed

    private void btnSumEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumEvenActionPerformed
        // TODO add your handling code here:
        
        // outputs the list of the even integers the user inputted and the sum
        txtList.setText("");
        int total = 0;
        for (int i = 0; i < array.length; i ++){
            if (array[i] % 2 == 0 && array[i]!=0) { // checks if the integer is even
               total += array[i]; // adds the even integers together 
               txtList.append(array[i] + "\n"); 
            }
        
        } 
        txtOutput.setText(("The total of the even entries is: " ) + Integer.toString(total));
    }//GEN-LAST:event_btnSumEvenActionPerformed

    private void btnSumOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumOddActionPerformed
        // TODO add your handling code here:
        // outputs the list of the odd integers the user inputted and the sum
        txtList.setText("");
        int total = 0; 
        for (int i = 0; i < array.length; i ++){
            if (array[i] % 2 != 0) { // checks if the integer is odd
               total += array[i];// adds the odd integers together
               txtList.append(array[i] + "\n");
            }
        } 
        txtOutput.setText(("The total of the odd entries is: " ) + Integer.toString(total));
    }//GEN-LAST:event_btnSumOddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); // Exit the application.
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
            
        try {
            // gets user input 
            String numstr = txtInteger.getText(); 
            int num = Integer.parseInt(numstr); 
            // checks if user input is a positive integer 
            if (num <= 0) {
                    txtOutput.setText("Positive integers only! Try again."); 
                    txtInteger.setText(""); 
                    
                }   
            else {
            count--;
        // take return value from the removeElement and set it to newArray 
        int[] newArray;
        // since newArray size shrinks, we need to reset it back to size 20, thus fullAffray is used 
        int[] Fullarray = new int[array.length];
        newArray = removeElement(array, num);
        for(int i=0; i<newArray.length; i++){
            Fullarray[i] = newArray[i];
        }
        array = Fullarray;
            }
        txtOutput.setText("Removed from list. Continue.");
        }
        catch(Exception e){
            txtOutput.setText(e.toString());
        }
  
    }//GEN-LAST:event_btnRemoveActionPerformed

// custom method to remove elements from an array
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
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
            java.util.logging.Logger.getLogger(U1A5a_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U1A5a_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U1A5a_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U1A5a_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U1A5a_IfraInam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSumAll;
    private javax.swing.JButton btnSumEven;
    private javax.swing.JButton btnSumOdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInteger;
    private javax.swing.JTextField txtInteger;
    private javax.swing.JTextArea txtList;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
