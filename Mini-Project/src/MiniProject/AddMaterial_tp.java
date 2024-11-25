package MiniProject;
import Classes.*;
import static MiniProject.AddSalle_tp.salleerrorlabel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author OKBA
 */
public class AddMaterial_tp extends javax.swing.JFrame {
    
    public AddMaterial_tp() {
        initComponents();
        setDefaultCloseOperation(AddMaterial_tp.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearMaterial = new javax.swing.JButton();
        saveMaterial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        R_number_input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        I_date_input = new javax.swing.JTextField();
        product_name_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        materialTypeComboBox = new javax.swing.JComboBox<>();
        cpu_input = new javax.swing.JTextField();
        ram_label = new javax.swing.JLabel();
        ram_input = new javax.swing.JTextField();
        cpu_label = new javax.swing.JLabel();
        errorlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clearMaterial.setText("Clear");
        clearMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(clearMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 110, 50));

        saveMaterial.setText("Save");
        saveMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(saveMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 110, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Type");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Regestration Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        R_number_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_number_inputActionPerformed(evt);
            }
        });
        getContentPane().add(R_number_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 120, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Installation Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        I_date_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_date_inputActionPerformed(evt);
            }
        });
        getContentPane().add(I_date_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, 40));

        product_name_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_inputActionPerformed(evt);
            }
        });
        getContentPane().add(product_name_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 120, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        materialTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PC", "Datashow", "Printer", "Accessoires" }));
        materialTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTypeComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(materialTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 120, 40));
        getContentPane().add(cpu_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 120, 40));

        ram_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ram_label.setText("Ram");
        getContentPane().add(ram_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));
        getContentPane().add(ram_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 120, 40));

        cpu_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpu_label.setText("CPU");
        getContentPane().add(cpu_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        errorlabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        errorlabel.setForeground(new java.awt.Color(255, 0, 51));
        errorlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorlabel.setText("Please Fill all the fields");
        getContentPane().add(errorlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMaterialActionPerformed
        //index of the selected material (datashow, pc ....)
        int index = materialTypeComboBox.getSelectedIndex();
        System.out.println(index);
        //info collection
        String cpu = cpu_input.getText();
        String ram = ram_input.getText();
        String registrationNumber = R_number_input.getText();
        String installationDate =I_date_input.getText();
        String productName = product_name_input.getText();
        if (index == 0) {
          if (cpu.isEmpty() || ram.isEmpty() || registrationNumber.isEmpty() || installationDate.isEmpty() || productName.isEmpty()) {
            errorlabel.setVisible(true);
            return;
          }  
        } else {
            if (registrationNumber.isEmpty() || installationDate.isEmpty() || productName.isEmpty()) {
                errorlabel.setVisible(true);
                return;
            }
        }
        
        if (Main_Home.Current_Salle_TP_Index == -1) {
            errorlabel.setVisible(true);
            errorlabel.setText("No Salle TP Selected");
            return;
        }
        if (!R_number_input.getText().matches("[0-9]+")) {
            errorlabel.setVisible(true);
            errorlabel.setText("registrationNumber are type Number");
            return; 
        }
        Materials materials = null;
        for (Materials st: Main_Home.salles.get(Main_Home.Current_Salle_TP_Index).getTpMaterials()) {
            if (st.registration_number.equals(registrationNumber)) {
                errorlabel.setVisible(true);
                errorlabel.setText("Already Used Registration Number Name");
                return;
            }
        }
        //see the content of the combobox to add (pc/datashow ...)
        switch (index) {
            case 0://if its a pc
                PC pc = new PC(cpu, ram, registrationNumber, installationDate, productName);
                Main_Home.salles.get(Main_Home.Current_Salle_TP_Index).add_material_to_TPSalle(pc);
                break;
                
                
            case 1://a datashow
                Datashow datashow = new Datashow(productName, registrationNumber, installationDate, productName);
                Main_Home.salles.get(Main_Home.Current_Salle_TP_Index).add_material_to_TPSalle(datashow);
                break;
                
            case 2://a printer
                Printer printer = new Printer(productName, registrationNumber, installationDate, productName);
                Main_Home.salles.get(Main_Home.Current_Salle_TP_Index).add_material_to_TPSalle(printer);
                break;
                
            case 3://a accessoires
               Accessoire accessoires = new Accessoire(registrationNumber, installationDate, productName);
               Main_Home.salles.get(Main_Home.Current_Salle_TP_Index).add_material_to_TPSalle(accessoires);
               break;
        }
        //refresh and show the materials of the salle tp on the table with details
        Main_Home.print_salle_materials(Main_Home.salles.get(Main_Home.Current_Salle_TP_Index).getTpMaterials());
        this.setVisible(false);
    }//GEN-LAST:event_saveMaterialActionPerformed

    private void I_date_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_date_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I_date_inputActionPerformed

    private void clearMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMaterialActionPerformed
        //re initialize the old values which is empty strings
        cpu_input.setText("");
        ram_input.setText("");
        R_number_input.setText("");
        I_date_input.setText("");
        product_name_input.setText("");
    }//GEN-LAST:event_clearMaterialActionPerformed

    private void materialTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTypeComboBoxActionPerformed
        // TODO add your handling code here:
        int index = materialTypeComboBox.getSelectedIndex();
        
        switch (index) {
            case 0://if its a pc
                cpu_input.setVisible(true);
                ram_input.setVisible(true); 
                cpu_label.setVisible(true);
                ram_label.setVisible(true);
                break;
                
            case 1://a datashow
                cpu_input.setVisible(false);
                ram_input.setVisible(false);
                cpu_label.setVisible(false);
                ram_label.setVisible(false);
                break;
                
            case 2://a printer
                cpu_input.setVisible(false);
                ram_input.setVisible(false);
                cpu_label.setVisible(false);
                ram_label.setVisible(false);
                break;
                
            case 3://a accessoires
                cpu_input.setVisible(false);
                ram_input.setVisible(false);
                cpu_label.setVisible(false);
                ram_label.setVisible(false);
               break;
        }
    }//GEN-LAST:event_materialTypeComboBoxActionPerformed

    private void product_name_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name_inputActionPerformed

    private void R_number_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_number_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_number_inputActionPerformed

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
            java.util.logging.Logger.getLogger(AddMaterial_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMaterial_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMaterial_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMaterial_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMaterial_tp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField I_date_input;
    private javax.swing.JTextField R_number_input;
    private javax.swing.JButton clearMaterial;
    private javax.swing.JTextField cpu_input;
    private javax.swing.JLabel cpu_label;
    public static javax.swing.JLabel errorlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> materialTypeComboBox;
    private javax.swing.JTextField product_name_input;
    private javax.swing.JTextField ram_input;
    private javax.swing.JLabel ram_label;
    private javax.swing.JButton saveMaterial;
    // End of variables declaration//GEN-END:variables
}
