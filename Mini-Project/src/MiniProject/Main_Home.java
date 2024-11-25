/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MiniProject;
import Classes.*;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OKBA
 */
public class Main_Home extends javax.swing.JFrame {
 
    
    // Variables
    
// Variables
    public static Institution Esi = null;     // variable of Type Institution to store the hard coded Institution
    public static ArrayList<TP_Salle> salles = new ArrayList<>();  // List of salles to store the hard coded TP salles
    static int Current_Salle_TP_Index = -1;  // an integer variable to store selected TP salle index from ui 
    static int Current_Department_Index;
// Methods

    public static void Institution_init() {
        String logo = "https://www.esi-sba.dz/fr/wp-content/uploads/2020/10/Logo-Complet-ESI-SBA-200mm-x-200mm_couleur-500x500.png";
        // create the Esi-sba institution
        Institution Esi = new Institution(0, "High School", "8 Mai 1945-Sidi-bel-abbes", "+21348749452 ", logo);
        // create new department called second cycle
        Department second_cycle = new Department(0, "second cycle", "1589", "Amrane abdelkader", "contact_sc@esi-sba.dz");
        Department preparatory_class = new Department(1, "preparatory class", "1590", "Aced Mohamed Reda", "contact_pre@esi-sba.dz");
        Department departements[] = {preparatory_class, second_cycle};
        // add the two departments to Esi institution
        Esi.setDepartments(departements);
        // creation of one block that will holds the salles or even Amphis
        Block block_A1 = new Block("A1", "left", "white"); //block for sup
        Block block_B1 = new Block("B1", "right", "green"); //block for prepa 
        Block[] blocksSup = { block_A1 };
        Block[] blocksPrepa = { block_B1 };
        // creation of one amphi called AmphiA
        Amphitheater AmphiA = new Amphitheater(0, "Amphi D", 100.0, 1000, true);
        //set the blocks for the two departments
        second_cycle.setBlocks(blocksSup);
        preparatory_class.setBlocks(blocksPrepa);
        
        Main_Home.Esi = Esi;
    }  
    
    
    public static void print_department_infos() {
        if (Current_Department_Index == -1) {
            return;
        }
        Department department = Esi.Departments[Current_Department_Index];
        Dep_name_label.setText(department.DepartmentName);
        Dep_code_label.setText(department.Code);
        Dep_head_label.setText(department.HeadName);
        Dep_email_label.setText(department.Email_Address);
        Dep_services_label.setText("3");
    }

    public static void Tp_salles_init() {
        //create two prepa salles
        TP_Salle Salle_TP1Prepa = new TP_Salle("20 Tables", 0, "Salle TP 01 Prepa", 20.0, 20);
        TP_Salle Salle_TP2Prepa = new TP_Salle("40 Tables", 0, "Salle TP 02 Prepa", 25.0, 40);
        TP_Salle Salle_TP1Sup = new TP_Salle("40 Tables", 0, "Salle TP 01 Sup", 25.0, 40);
        // creating of set of computers and one datashow
        Materials PC1 = new PC("i7", "16G", "AC255-GGH-20", "03-01-2022", "Toshiba");
        Materials PC2 = new PC("i5", "32G", "AC2F5-ALH-15", "03-01-2022", "Dell");
        Materials PC3 = new PC("i3", "4G", "ACHK5-HGH-19", "03-01-2022", "Assus");
        Materials PC4 = new PC("i9", "16G", "DFRTG-DGE-17", "03-01-2022", "Assus");
        Materials datashow = new Datashow("Epson", "1122352512", "03-01-2022", "Cannon");
        Materials printer = new Printer("Canon", "1122352512", "03-01-2022", "Toshiba");
        // add the matiriels to our Tp salle 01 prepa
        Salle_TP1Prepa.add_material_to_TPSalle(PC1);
        Salle_TP1Prepa.add_material_to_TPSalle(PC2);
        Salle_TP1Prepa.add_material_to_TPSalle(PC3);
        Salle_TP1Prepa.add_material_to_TPSalle(PC4);
        Salle_TP1Prepa.add_material_to_TPSalle(datashow);
        Salle_TP1Prepa.add_material_to_TPSalle(printer);
        // add the matiriels to our Tp salle 02 prepa
        Salle_TP2Prepa.add_material_to_TPSalle(PC4);
        Salle_TP2Prepa.add_material_to_TPSalle(datashow);
        // add matiriel to out Tp salle 01 Sup
        Salle_TP1Sup.add_material_to_TPSalle(PC1);
        Salle_TP1Sup.add_material_to_TPSalle(PC2);
        //add the three salles
        salles.add(Salle_TP1Prepa);
        salles.add(Salle_TP2Prepa);
        Esi.Departments[0].Blocks[0].add_TPSalle_to_Block(Salle_TP1Prepa);
        Esi.Departments[0].Blocks[0].add_TPSalle_to_Block(Salle_TP2Prepa);
        salles.add(Salle_TP1Sup);
        Esi.Departments[1].Blocks[0].add_TPSalle_to_Block(Salle_TP1Sup);
    }
    
    public static void showDepartmentInfo(boolean toShow) {
        if (toShow) {
            label2.setText("Department Info:");
        } else {
            label2.setText("No Department Selected");
        }
        label9.setVisible(toShow);
        label4.setVisible(toShow);
        label5.setVisible(toShow);
        label6.setVisible(toShow);
        label7.setVisible(toShow);
        Dep_name_label.setVisible(toShow);
        Dep_code_label.setVisible(toShow);
        Dep_head_label.setVisible(toShow);
        Dep_email_label.setVisible(toShow);
        Dep_services_label.setVisible(toShow);
    }
    
    public void load_Departements() {
        showDepartmentInfo(false);
        for (int i = 0; i < Esi.Departments.length; i++) {
              DepartementCompobox.addItem(Esi.Departments[i].DepartmentName);
        }
    }
    
    public static void load_Salles(ArrayList<TP_Salle> toIterateSalles) {
        DefaultListModel MyLstModel = new DefaultListModel();
        for (TP_Salle salle : toIterateSalles) {
            MyLstModel.addElement(salle.buildingName);
        }
        TP_Salles_Jlist.setModel(MyLstModel);
    }

    public static void print_salle_materials(ArrayList<Materials> tp_materials) {
        DefaultTableModel model = (DefaultTableModel) Material_Table_Affiche.getModel();

        if (tp_materials.isEmpty()) {
            model.setRowCount(0);
        } else {
            model.setRowCount(tp_materials.size());
            for (Materials tp_material : tp_materials) {
                model.removeRow(0);
                Object[] rowData = {tp_material.registration_number, tp_material.date_installation, tp_material.productName, tp_material.Type};
                model.addRow(rowData);
                tp_material.print_materials_info();
            }
        }
    }

    // constructor

    public Main_Home() {
        initComponents(); // Auto generate by NetBeans IDE
        this.setLocationRelativeTo(null); // to show the frame on the middle of the screen
        Institution_init(); // To initialize a hard-coded institution and department
        load_Departements(); // To display the departement names  
        Tp_salles_init(); // To initialize a dummy Tp salle 01 with its materials
        load_Salles(salles); // To Display the existing (dummy salles) to their JList
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
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        Dep_name_label = new java.awt.Label();
        Dep_head_label = new java.awt.Label();
        Dep_email_label = new java.awt.Label();
        Dep_services_label = new java.awt.Label();
        label9 = new java.awt.Label();
        Dep_code_label = new java.awt.Label();
        DepartementCompobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TP_Salles_Jlist = new javax.swing.JList<>();
        deleteSelectedMaterial = new javax.swing.JButton();
        addNewMaterial = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Material_Table_Affiche = new javax.swing.JTable();
        createSalleTP = new javax.swing.JButton();
        deleteSalleTP = new javax.swing.JButton();
        label8 = new java.awt.Label();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel1.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1500, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Department Info:");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Head of department:");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Code:");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        label6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Email Adress:");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Number of services:");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        Dep_name_label.setForeground(new java.awt.Color(255, 255, 255));
        Dep_name_label.setText("Name:");
        jPanel1.add(Dep_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        Dep_head_label.setForeground(new java.awt.Color(255, 255, 255));
        Dep_head_label.setText("Head of department");
        jPanel1.add(Dep_head_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        Dep_email_label.setForeground(new java.awt.Color(255, 255, 255));
        Dep_email_label.setText("Email Adress");
        jPanel1.add(Dep_email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        Dep_services_label.setForeground(new java.awt.Color(255, 255, 255));
        Dep_services_label.setText("Number of services");
        jPanel1.add(Dep_services_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        label9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Name:");
        jPanel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Dep_code_label.setForeground(new java.awt.Color(255, 255, 255));
        Dep_code_label.setText("Code:");
        jPanel1.add(Dep_code_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 580, 380));

        DepartementCompobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        DepartementCompobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DepartementCompoboxItemStateChanged(evt);
            }
        });
        getContentPane().add(DepartementCompobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 580, 40));

        TP_Salles_Jlist.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TP_Salles_Jlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TP_Salles_Jlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TP_Salles_JlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TP_Salles_Jlist);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 250, 420));

        deleteSelectedMaterial.setText("Delete Selected Material");
        deleteSelectedMaterial.setBorder(null);
        deleteSelectedMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(deleteSelectedMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 510, 290, 40));

        addNewMaterial.setText("Add new material");
        addNewMaterial.setBorder(null);
        addNewMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(addNewMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 300, 40));

        Material_Table_Affiche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Regestration Number", "Installation Date", "Name/CPU/Ram", "Type"
            }
        ));
        Material_Table_Affiche.setShowGrid(true);
        jScrollPane3.setViewportView(Material_Table_Affiche);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 77, 600, 420));

        createSalleTP.setText("+ Create TP Salle");
        createSalleTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSalleTPActionPerformed(evt);
            }
        });
        getContentPane().add(createSalleTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, 40));

        deleteSalleTP.setText("- Delete TP Salle");
        deleteSalleTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSalleTPActionPerformed(evt);
            }
        });
        getContentPane().add(deleteSalleTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 120, 40));

        label8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label8.setText("All Materials");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteSelectedMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedMaterialActionPerformed
        // TODO add your handling code here:
        int selectedMaterial = Material_Table_Affiche.getSelectedRow();
        ArrayList<Materials> tp_materials = salles.get(Current_Salle_TP_Index).getTpMaterials(); //we catch the specified salle's material
        if (Current_Department_Index != -1) {
            tp_materials = (Esi.Departments[Current_Department_Index].Blocks[0].getTPSalles().get(Current_Salle_TP_Index).getTpMaterials()); //we catch the specified salle's material
        }
        if (selectedMaterial != -1) {
            tp_materials.remove(selectedMaterial);
        }
        print_salle_materials(tp_materials); //we refrech the table with the list of materials
    }//GEN-LAST:event_deleteSelectedMaterialActionPerformed

    private void addNewMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewMaterialActionPerformed
        AddMaterial_tp AddMaterialTP = new AddMaterial_tp();
        AddMaterialTP.setVisible(true);
        AddMaterial_tp.errorlabel.setVisible(false);
    }//GEN-LAST:event_addNewMaterialActionPerformed

    private void createSalleTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSalleTPActionPerformed
        AddSalle_tp AddSalleTP= new AddSalle_tp();
        AddSalle_tp.salleerrorlabel.setVisible(false);
        AddSalleTP.setVisible(true);
    }//GEN-LAST:event_createSalleTPActionPerformed

    private void deleteSalleTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSalleTPActionPerformed
        // if salle tp clicked and selected
        if (this.Current_Salle_TP_Index != -1) {
            //remove the salle tp from the array list
            if (Current_Department_Index == -1) {
                Main_Home.salles.remove(Current_Salle_TP_Index);
                //refresh the salles array list show
                Main_Home.load_Salles(salles);
            } else {
                Esi.Departments[Current_Department_Index].Blocks[0].getTPSalles().remove(Current_Salle_TP_Index);
                Main_Home.load_Salles(Esi.Departments[Current_Department_Index].Blocks[0].getTPSalles());
            }
            print_salle_materials(new ArrayList<Materials>());
        }
    }//GEN-LAST:event_deleteSalleTPActionPerformed

    private void TP_Salles_JlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TP_Salles_JlistMouseClicked
        int selectedSalleTP = -1; //initialise the index -1 which means no salle selected
        selectedSalleTP = TP_Salles_Jlist.getSelectedIndex(); //we get the index of the salle tp
        this.Current_Salle_TP_Index = selectedSalleTP; //index stored on global variable
        if (selectedSalleTP != -1) { //if there's a salle selected
            ArrayList<Materials> tp_materials = salles.get(Current_Salle_TP_Index).getTpMaterials(); //we catch the specified salle's material
            if (Current_Department_Index != -1) {
                tp_materials = (Esi.Departments[Current_Department_Index].Blocks[0].getTPSalles().get(Current_Salle_TP_Index).getTpMaterials());//we catch the specified salle's material
            }
            print_salle_materials(tp_materials); //we refrech the table with the list of materials
        }
    }//GEN-LAST:event_TP_Salles_JlistMouseClicked

    private void DepartementCompoboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DepartementCompoboxItemStateChanged
        //since we have the selecte department the two department will take index 1 and 2, the array starts from 0 so we have to -1 from the index founded
        this.Current_Department_Index = DepartementCompobox.getSelectedIndex()-1;
        if (this.Current_Department_Index == -1) {
            Main_Home.load_Salles(salles);
            showDepartmentInfo(false);
            return;
        }
        showDepartmentInfo(true);
        DepartementCompobox.getModel();
        Main_Home.load_Salles(Esi.Departments[Current_Department_Index].Blocks[0].Tp_Salles);
        this.print_department_infos();
    }//GEN-LAST:event_DepartementCompoboxItemStateChanged

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
            java.util.logging.Logger.getLogger(AddSalle_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSalle_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSalle_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSalle_tp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Home().setVisible(true);
            }
        });
    }
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Label Dep_code_label;
    public static java.awt.Label Dep_email_label;
    public static java.awt.Label Dep_head_label;
    public static java.awt.Label Dep_name_label;
    public static java.awt.Label Dep_services_label;
    public static javax.swing.JComboBox<String> DepartementCompobox;
    private static javax.swing.JTable Material_Table_Affiche;
    public static javax.swing.JList<String> TP_Salles_Jlist;
    private javax.swing.JButton addNewMaterial;
    private javax.swing.JButton createSalleTP;
    private javax.swing.JButton deleteSalleTP;
    private javax.swing.JButton deleteSelectedMaterial;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static java.awt.Label label2;
    public static java.awt.Label label4;
    public static java.awt.Label label5;
    public static java.awt.Label label6;
    public static java.awt.Label label7;
    private java.awt.Label label8;
    public static java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
