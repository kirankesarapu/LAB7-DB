/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import util.DatabaseConnector;

/**
 *
 * @author kiran
 */
public class View extends javax.swing.JPanel {
    public ArrayList<User>users;
    /**
     * Creates new form Edit
     */
    public View() {
        initComponents();
        populateTable();
    }
    public void populateTable(){
        try {
            this.users = DatabaseConnector.getAllusers();
            DefaultTableModel model = (DefaultTableModel) detailsTable.getModel();
            model.setRowCount(0); 
            for (User u: users){
                Object[] row = new Object[3]; 
                row[0] = u.getId();
                row[1] = u.getName();
                row[2] = u.getAge(); 
                model.addRow(row);
            } 
            clearFields();
        }catch (Exception e){
            
        }
    }
    public void clearFields(){
        nameTextField.setText("");
        ageTextField.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        exportButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 400));

        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(detailsTable);
        if (detailsTable.getColumnModel().getColumnCount() > 0) {
            detailsTable.getColumnModel().getColumn(0).setResizable(false);
            detailsTable.getColumnModel().getColumn(1).setResizable(false);
            detailsTable.getColumnModel().getColumn(2).setResizable(false);
        }

        exportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exportButton.setText("EXPORT");

        editButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLabel.setText("Name :");

        ageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLabel.setText("Age :");

        submitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton)
                            .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportButton)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editButton)
                                    .addComponent(deleteButton))
                                .addGap(67, 67, 67)
                                .addComponent(nameLabel))
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(submitButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
         int selectedIndex = detailsTable.getSelectedRow(); 
        if(selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Please select a user to edit", "Cannot edit user", JOptionPane.ERROR_MESSAGE);
        }else {
            User selectedUser = users.get(selectedIndex);
            String name = nameTextField.getText();            
            String age = ageTextField.getText();
            int ageInt; 

            if(name.length() == 0){
                JOptionPane.showMessageDialog(this, "Name cannot be empty", "Cannot edit user", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(age.length() == 0){
                JOptionPane.showMessageDialog(this, "Age cannot be empty", "Cannot edit user", JOptionPane.ERROR_MESSAGE);
                return;

            }
            try {
               ageInt = Integer.parseInt(age);
               User newUser = new User(); 
               newUser.setAge(ageInt);
               newUser.setName(name);
               DatabaseConnector.editUser(selectedUser, newUser);
               clearFields();
               populateTable(); 
               JOptionPane.showMessageDialog(this, "Edited Successfully", "Edited Successfully", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Enter Correct Age", "User Cannot be Edited", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = detailsTable.getSelectedRow();
        if(selectedIndex == -1){
            JOptionPane.showMessageDialog(this,"Select a User to Delete","User cannot be deleted", JOptionPane.ERROR_MESSAGE);
        }else{
            User selectedUser = users.get(selectedIndex);
            DatabaseConnector.deleteUser(selectedUser);
            JOptionPane.showMessageDialog(this,"User is deleted ", "Deleted Successfully",JOptionPane.INFORMATION_MESSAGE);
            populateTable();
            clearFields();
        }
   
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = detailsTable.getSelectedRow(); 
        if(selectedIndex == -1){
            JOptionPane.showMessageDialog(this, "Please select a user to edit", "Cannot edit user", JOptionPane.ERROR_MESSAGE);
        }
        else {
            User selectedUser = users.get(selectedIndex);
            nameTextField.setText(selectedUser.getName());            
            ageTextField.setText(Integer.toString(selectedUser.getAge()));
        }
    
        
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable detailsTable;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
