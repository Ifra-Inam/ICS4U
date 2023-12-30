import java.util.ArrayList;

/*
* Ifra Inam
 * ICS4UE
 * Mr. Diakoloukas
 * 2023-08-09
 * Purpose of Program: To allow users to add and remove employee data to/from the employee records 
 */

/**
 *
 * @author Ifra Inam
 */
public class U2A2_IfraInam extends javax.swing.JFrame {

    /**
     * Creates new form U2A2_IfraInam
     */
    public U2A2_IfraInam() {
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

        lblEmployeeRecords = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblAnnualSalary = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAnnualSalary = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JTextArea();
        txtOutput = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Records");

        lblEmployeeRecords.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEmployeeRecords.setForeground(new java.awt.Color(0, 0, 153));
        lblEmployeeRecords.setText("Employee Records");

        lblID.setText("ID #:");

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblAnnualSalary.setText("Annual Salary:");

        lblStartDate.setText("Start Date:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter an ID# and Remove to ");

        jLabel2.setText("delete an Employee's Records.");

        txtList.setColumns(20);
        txtList.setRows(5);
        jScrollPane1.setViewportView(txtList);

        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtID.setDoubleBuffered(true);
        txtID.setName(""); // NOI18N

        jLabel3.setText("(dd/mm/yyyy)");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblID)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtID))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblFirstName)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAnnualSalary)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAnnualSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStartDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStartDate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLastName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLastName)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnRemove))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEmployeeRecords)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblEmployeeRecords)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnnualSalary)
                            .addComponent(txtAnnualSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStartDate)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// class that contains all the required attributes for each employee 
final class Employee {

    // declaration of employee attribute variables  
    private int employeeIDNumber; 
    private double annualSalary; 
    private String firstName, lastName, startDate; 
    
    // constructor that creates instances for the Employee class 
    Employee(int employeeIDNumber, double annualSalary, String firstName, String lastName, String startdate) {    
        this.setEmployeeIDNumber(employeeIDNumber); 
        this.setAnnualSalary(annualSalary); 
        this.setFirstName(firstName); 
        this.setLastName(lastName); 
        this.setStartDate(startdate);      
    }
    
    // getter for employeeIDNumber 
    public int getEmployeeIDNumber() {
        return employeeIDNumber; 
    }
    
    // setter for employeeIDNumber
    public void setEmployeeIDNumber(int employeeIDNumber) {
        this.employeeIDNumber = employeeIDNumber; 
    }
    
    // getter for annualSalary
    public double getAnnualSalary() {
        return annualSalary; 
    }
    
    // setter for annualSalary
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary; 
    }
    
    // getter for firstName
    public String getFirstName() {
        return firstName;
    }
    
    // setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }
    
    // getter for lastName
    public String getLastName() {
        return lastName;
    }
    
    // setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }
    
    // getter for startDate
    public String getStartDate() {
        return startDate; 
    }
    
    // setter for startDate
    public void setStartDate(String startDate) {
        this.startDate = startDate; 
    }
    
    // method that is used to display an employee's data 
    @Override 
    public String toString() {
        return "Employee ID Number: " + getEmployeeIDNumber() + "\nFirst Name: "+ getFirstName() + "\nLast Name: " + getLastName() + "\nAnnual Salary: " + getAnnualSalary() + "\nStart Date: " + getStartDate() + "\n"; 
    }
    
}    

ArrayList<Employee> EmployeeRecords = new ArrayList<>(); // arraylist that is used to store all employee records 
    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        
        txtOutput.setText(""); // used to clear the text field every time the remove button is pressed 
    
    try {
        // if the user presses remove when there is nothing to remove, a message is outputted to notify them 
        if (EmployeeRecords.isEmpty()) {
            txtOutput.setText("Employee Records is currently empty.");
            return;
        }
                        
        String employeeIDNumber_str = txtID.getText(); // retrieves user input for employee ID
        int employeeIDNumber = Integer.parseInt(employeeIDNumber_str); // converts the string ID into an integer 
                
        // iterates through each index of the employee records array list and checks if the ID stored in an employee object matches with the ID the user inputted 
        for (int i = 0; i < EmployeeRecords.size(); i++) {
            if (EmployeeRecords.get(i).getEmployeeIDNumber() == employeeIDNumber) {
                EmployeeRecords.remove(i); // removes the employee's data
                break;
            }
            // if the ID the user inputted is not present in the array list, a message is outputted to notify them
            else if (i == EmployeeRecords.size()-1) { 
                txtOutput.setText("ID does not exist.");
            }
        }
    } 
    catch (NumberFormatException e ) { // checks if the user did not input an integer for the ID  
        txtOutput.setText("Invalivd ID.");
    }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here: 
        
    txtOutput.setText(""); // used to clear the text field every time the add button is pressed  
     
    try { 
        // retrieves user inputs
        String employeeIDNumber_str = txtID.getText();
        String annualSalary_str = txtAnnualSalary.getText();
        String firstName = txtFirstName.getText(); 
        String lastName = txtLastName.getText(); 
        String startDate = txtStartDate.getText(); 
        
        // checks if the user has not inputed all the required information and outputs an appropriate message to notify them
        if (employeeIDNumber_str.equals("") || annualSalary_str.equals("") || firstName.equals("") || lastName.equals("") || startDate.equals("")) {
            txtOutput.setText("You left a piece of information empty.");
            return; 
        }
        
        // converts the ID and annual salary into integers and doubles 
        int employeeIDNumber = Integer.parseInt(employeeIDNumber_str); 
        double annualSalary = Double.parseDouble(annualSalary_str);
       
        // checks if any ID inside the arraylist matches the user's input and notifies them that the ID already exists 
        for (int i = 0; i < EmployeeRecords.size(); i++) {
            if (EmployeeRecords.get(i).getEmployeeIDNumber() == employeeIDNumber) {
                txtOutput.setText("ID already exists.");
                return; 
            } 
        } 
        
        // initializes instance variables for an employee 
        Employee employee = new Employee(employeeIDNumber, annualSalary, firstName, lastName, startDate);
        // object gets added to the arraylist 
        EmployeeRecords.add(employee);
    } 
    catch (NumberFormatException e) { // checks if the user did not input a number for the ID or annual salary 
        txtOutput.setText("Invalid ID or Annual Salary.");
            } 
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
         
        txtList.setText(""); // used to clear the text field every time the list button is pressed  
        
        // displays the arraylist onto the GUI
        for (int i = 0; i < EmployeeRecords.size(); i++) {
            txtList.append(EmployeeRecords.get(i) + "\n"); 
        }
        
    }//GEN-LAST:event_btnListActionPerformed

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
            java.util.logging.Logger.getLogger(U2A2_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U2A2_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U2A2_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U2A2_IfraInam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U2A2_IfraInam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnnualSalary;
    private javax.swing.JLabel lblEmployeeRecords;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JTextField txtAnnualSalary;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextArea txtList;
    private javax.swing.JTextField txtOutput;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
