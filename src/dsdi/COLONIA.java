package dsdi;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class COLONIA extends javax.swing.JFrame {

    int bandera=0;
    
    public COLONIA() {
        initComponents();
        setSize (1154, 780);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
     
        c4.addItem("- - - - - - - - - - - - - - - ");      
        c4.addItem("1.------------------------------------------------------------");
        c4.addItem("CLAVE FARMACEÚTICO");
        c4.addItem("NOMBRE FAR");
        c4.addItem("HORARIO FAR");
        c4.addItem("2.------------------------------------------------------------");
        c4.addItem("CLAVE EMPLEADO");
        c4.addItem("NOMBRE EMP");
        c4.addItem("PUESTO EMP");
        c4.addItem("HORARIO EMP");  
        c4.addItem("3.------------------------------------------------------------");
        c4.addItem("NOMBRE FARMACIA");
        c4.addItem("TIPO DE TELÉFONO FAR");
        c4.addItem("4.------------------------------------------------------------");
        c4.addItem("NOMBRE EMPLEADO");
        c4.addItem("TIPO DE TELÉFONO EMP");
        c4.addItem("5.------------------------------------------------------------");
        c4.addItem("NOMBRE FARMACEÚTICO");
        c4.addItem("NOMBRE DE FARMACIA");
        c4.addItem("6.------------------------------------------------------------");
        c4.addItem("NOMBRE MEDICAMENTO -");
        c4.addItem("NOMBRE DE MONODROGA");
        c4.addItem("7.------------------------------------------------------------");
        c4.addItem("NOMBRE MEDICAMENTO +");
        c4.addItem("NOMBRE DE LABORATORIO");
        c4.addItem("ACCION TERAPEUTICA");
        c4.addItem("8.------------------------------------------------------------");
        c4.addItem("NOMBRE MEDICAMENTO ¿");
        c4.addItem("TIPO DE PRESENTACION");
        c4.addItem("NOMBRE DE FARMACIA");
        c4.addItem("FOLIO");
        c4.addItem("PRECIO Y NOMBRE DE MEDICAMENTO");
        c4.addItem("STOCK Y NOMBRE DE MEDICAMENTO");

        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        c4 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/LIMPIAR 2.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(1080, 160, 50, 50);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(340, 590, 160, 50);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 590, 160, 50);

        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        jPanel1.add(c4);
        c4.setBounds(160, 660, 340, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NOMBRE DE COLONIA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 130, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CLAVE DE COLONIA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 130, 180, 30);
        jPanel1.add(t2);
        t2.setBounds(500, 160, 530, 50);
        jPanel1.add(t1);
        t1.setBounds(80, 160, 310, 50);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/REGRESAR copia.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(1110, 690, 40, 39);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CERRAR.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1110, 0, 40, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/BUSCAR.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 590, 87, 114);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(590, 590, 87, 114);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/ELIMINAR.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(720, 590, 87, 114);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/ACTUALIZAR.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(980, 590, 87, 114);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(850, 590, 87, 114);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 1110, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/COLONIAF.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1150, 730);

        jMenu1.setText("Consultas Complejas");

        jMenuItem1.setText("NOM FARM - DIR - CEDULA - CORREO - HORARIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("NOM EMP - DIR - PUESTO - HORARIO");
        jMenuItem2.setActionCommand("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("NOM FARM - DIR - TIPOTELF - NUM TELF");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setText("NOM EMP - TIPOTELF - NUM TEL");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("NOM FARMACEUTICO - NOM FARM - DIR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("NOM MEDICAMENTO - NOM MONODROGA");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("NOM MEDICAMENTO - NOM LABOR - NOM ACCION TERAP");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("NOM MED - PRESENT - UNID MEDIDA - FARM - FOLO - PRECIO - STOCK ");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSCOLONIA");
            
            tabla.addColumn("ID COLONIA");
            tabla.addColumn("NOMBRE COLONIA");
        
            while (rs.next()){
                Object dato[]=new Object[2];
                for (int i=0;i<2;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    try{
            if (
                (t1.getText().isEmpty())||
                (t2.getText().isEmpty())
            ){
                JOptionPane.showMessageDialog (null,"DATOS VACIOS");
            }
            
            else {
                String var1, var2, var3;

                var1=t1.getText();
                var2=t2.getText();

                t1.setText("");
                t2.setText("");
                Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("EXEC ACTCOLONIA '"+ var1+"','"+ var2 + "'");

            }
        }
        catch(Exception e) {  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    try{
            if (
                (t1.getText().isEmpty())||
                (t2.getText().isEmpty())
            ){
                JOptionPane.showMessageDialog (null,"DATOS VACIOS");
            }
            
            else {

                String pass="exa",p="";
                String op; 
                op=t1.getText();
                JPasswordField pf = new JPasswordField();
                int opc = JOptionPane.showConfirmDialog(null, pf, "INGRESA LA CONTRASEÑA", JOptionPane.OK_CANCEL_OPTION, 		JOptionPane.INFORMATION_MESSAGE);

                 if (opc== JOptionPane.OK_OPTION) {
                         String password = new String(pf.getPassword());
                         p=password;
                 }

                 if (pass.equals(p)){
                     
                     
                Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("EXEC ELIMCOLONIA '"+op+"'");
                
                    JOptionPane.showMessageDialog(null,"REGISTRO ELIMINADO CORRECTAMENTE");
                 }

                 else{
                         JOptionPane.showMessageDialog(null, "SIN AUTORIZACIÓN PARA ELIMINAR");
                 }

            }
        }
        catch(Exception e) {  }


        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        

    try{
            if (
                (t1.getText().isEmpty())||
                (t2.getText().isEmpty())
            ){
                JOptionPane.showMessageDialog (null,"DATOS VACIOS");
            }
            
            else {
                String var1, var2, var3;

                var1=t1.getText();
                var2=t2.getText();

                t1.setText("");
                t2.setText("");
                Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("EXEC INGCOLONIA 'X"+ "','"+ var2 + "'");

            }
        }
        catch(Exception e) {  }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    try{
        String op;
        op=c4.getSelectedItem().toString();

        if (op.equals("- - - - - - - - - - - - - - - ")){
                DefaultTableModel tabla=new DefaultTableModel();
                Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("EXEC BSCOLONIA '" +jTextField1.getText()+"'");

                tabla.addColumn("ID COLONIA");
                tabla.addColumn("NOMBRE COLONIA");

                while (rs.next()){
                    Object dato[]=new Object[2];
                    for (int i=0;i<2;i++){
                        dato[i]=rs.getString(i+1);
                    }
                    tabla.addRow(dato);
                }
                this.jTable1.setModel(tabla);
        }  

        if (op.equals("CLAVE FARMACEÚTICO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS11 '" +jTextField1.getText()+"'");
            
            
            tabla.addColumn("APAT_FAR");
            tabla.addColumn("AMAT_FAR");
            tabla.addColumn("NOM_FAR");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("N. EXT");
            tabla.addColumn("CEDULA");
            tabla.addColumn("CORREO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[11];
                for (int i=0;i<11;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }     
        
        if (op.equals("NOMBRE FAR")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS12 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_FAR");
            tabla.addColumn("AMAT_FAR");
            tabla.addColumn("NOM_FAR");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("N. EXT");
            tabla.addColumn("CEDULA");
            tabla.addColumn("CORREO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[11];
                for (int i=0;i<11;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }  
        if (op.equals("HORARIO FAR")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS13 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_FAR");
            tabla.addColumn("AMAT_FAR");
            tabla.addColumn("NOM_FAR");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("N. EXT");
            tabla.addColumn("CEDULA");
            tabla.addColumn("CORREO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[11];
                for (int i=0;i<11;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
            
        if (op.equals("CLAVE EMPLEADO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS21 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_EMP");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_EMP");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("PUESTO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[9];
                for (int i=0;i<9;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        
        
        if (op.equals("NOMBRE EMP")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS22 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_EMP");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_EMP");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("PUESTO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[9];
                for (int i=0;i<9;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("PUESTO EMP")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS23 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_EMP");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_EMP");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("PUESTO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[9];
                for (int i=0;i<9;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("HORARIO EMP")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS24 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_EMP");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_EMP");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("PUESTO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[9];
                for (int i=0;i<9;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE FARMACIA")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS31 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("NOM_FARMACIA");
            tabla.addColumn("DIREC_FARMACIA");
            tabla.addColumn("NOM TIPOTELF");
            tabla.addColumn("TELEFONO 2");
        
            while (rs.next()){
                Object dato[]=new Object[4];
                for (int i=0;i<4;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("TIPO DE TELÉFONO FAR")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS32 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("NOM_FARMACIA");
            tabla.addColumn("DIREC_FARMACIA");
            tabla.addColumn("NOM TIPOTELF");
            tabla.addColumn("TELEFONO 2");
        
            while (rs.next()){
                Object dato[]=new Object[4];
                for (int i=0;i<4;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE EMPLEADO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS41 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_EMP");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_EMP");
            tabla.addColumn("NOM_TIPOTELF");
            tabla.addColumn("TELEFONO 1");
        
            while (rs.next()){
                Object dato[]=new Object[5];
                for (int i=0;i<5;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("TIPO DE TELÉFONO EMP")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS42 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_EMP");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_EMP");
            tabla.addColumn("NOM_TIPOTELF");
            tabla.addColumn("TELEFONO 1");
        
            while (rs.next()){
                Object dato[]=new Object[5];
                for (int i=0;i<5;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE FARMACEÚTICO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS51 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_FAR");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_FARMACEUTICO");
            tabla.addColumn("NOM_FARMACIA");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");

            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("N. EXTERIOR");
            tabla.addColumn("CEDULA_FAR");
            tabla.addColumn("CORREO_FAR");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[12];
                for (int i=0;i<12;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE DE FARMACIA")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS52 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("APAT_FAR");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_FARMACEUTICO");
            tabla.addColumn("NOM_FARMACIA");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");

            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("N. EXTERIOR");
            tabla.addColumn("CEDULA_FAR");
            tabla.addColumn("CORREO_FAR");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[12];
                for (int i=0;i<12;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE MEDICAMENTO -")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS61 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("NOM_MEDICAMENTO");
            tabla.addColumn("NOM_MONODROGA");
        
            while (rs.next()){
                Object dato[]=new Object[2];
                for (int i=0;i<2;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE DE MONODROGA")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS62 '" +jTextField1.getText()+"'");
            
            tabla.addColumn("NOM_MEDICAMENTO");
            tabla.addColumn("NOM_MONODROGA");
        
            while (rs.next()){
                Object dato[]=new Object[2];
                for (int i=0;i<2;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE MEDICAMENTO +")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS71 '" +jTextField1.getText()+"'");
            
        tabla.addColumn("NOM_MEDICAMENTO");
        tabla.addColumn("NOM_LABORATORIO");
        tabla.addColumn("NOM_ACCION TERAPEUTICA");
        
            while (rs.next()){
                Object dato[]=new Object[3];
                for (int i=0;i<3;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE DE LABORATORIO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS72 '" +jTextField1.getText()+"'");
            
        tabla.addColumn("NOM_MEDICAMENTO");
        tabla.addColumn("NOM_LABORATORIO");
        tabla.addColumn("NOM_ACCION TERAPEUTICA");
        
            while (rs.next()){
                Object dato[]=new Object[3];
                for (int i=0;i<3;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("ACCION TERAPEUTICA")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS73 '" +jTextField1.getText()+"'");
            
        tabla.addColumn("NOM_MEDICAMENTO");
        tabla.addColumn("NOM_LABORATORIO");
        tabla.addColumn("NOM_ACCION TERAPEUTICA");
        
            while (rs.next()){
                Object dato[]=new Object[3];
                for (int i=0;i<3;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE MEDICAMENTO ¿")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS81 '" +jTextField1.getText()+"'");
            
        tabla.addColumn("NOM_MED");
        tabla.addColumn("PRESENTACION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("FARMACIA");
        tabla.addColumn("FOLIO");
        tabla.addColumn("PRECIO");
        tabla.addColumn("STOCK");
        
            while (rs.next()){
                Object dato[]=new Object[7];
                for (int i=0;i<7;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("TIPO DE PRESENTACION")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS82 '" +jTextField1.getText()+"'");
            
        tabla.addColumn("NOM_MED");
        tabla.addColumn("PRESENTACION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("FARMACIA");
        tabla.addColumn("FOLIO");
        tabla.addColumn("PRECIO");
        tabla.addColumn("STOCK");
        
            while (rs.next()){
                Object dato[]=new Object[7];
                for (int i=0;i<7;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("NOMBRE DE FARMACIA")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS83 '" +jTextField1.getText()+"'");
            
        tabla.addColumn("NOM_MED");
        tabla.addColumn("PRESENTACION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("FARMACIA");
        tabla.addColumn("FOLIO");
        tabla.addColumn("PRECIO");
        tabla.addColumn("STOCK");
        
            while (rs.next()){
                Object dato[]=new Object[7];
                for (int i=0;i<7;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("FOLIO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS84 '" +jTextField1.getText()+"'");
            
        tabla.addColumn("NOM_MED");
        tabla.addColumn("PRESENTACION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("FARMACIA");
        tabla.addColumn("FOLIO");
        tabla.addColumn("PRECIO");
        tabla.addColumn("STOCK");
        
            while (rs.next()){
                Object dato[]=new Object[7];
                for (int i=0;i<7;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
        if (op.equals("PRECIO Y NOMBRE DE MEDICAMENTO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS85 '" +jTextField1.getText()+"','"+jTextField2.getText()+"'");
            
        tabla.addColumn("NOM_MED");
        tabla.addColumn("PRESENTACION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("FARMACIA");
        tabla.addColumn("FOLIO");
        tabla.addColumn("PRECIO");
        tabla.addColumn("STOCK");
        
            while (rs.next()){
                Object dato[]=new Object[7];
                for (int i=0;i<7;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        if (op.equals("STOCK Y NOMBRE DE MEDICAMENTO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC BUS86 '" +jTextField1.getText()+"','"+jTextField2.getText()+"'");
            
        tabla.addColumn("NOM_MED");
        tabla.addColumn("PRESENTACION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("FARMACIA");
        tabla.addColumn("FOLIO");
        tabla.addColumn("PRECIO");
        tabla.addColumn("STOCK");
        
            while (rs.next()){
                Object dato[]=new Object[7];
                for (int i=0;i<7;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        
            
    }
    catch(Exception e) {System.out.println(e);  }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MENU frame = new MENU ();
        this.setVisible (false);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONFD");
            
            tabla.addColumn("APAT_FAR");
            tabla.addColumn("AMAT_FAR");
            tabla.addColumn("NOM_FAR");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");
            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("N. EXT");
            tabla.addColumn("CEDULA");
            tabla.addColumn("CORREO");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[11];
                for (int i=0;i<11;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONC2");
            
        tabla.addColumn("APAT_EMP");
        tabla.addColumn("AMAT_EMP");
        tabla.addColumn("NOM_EMP");
        tabla.addColumn("CALLE");
        tabla.addColumn("COLONIA");
        tabla.addColumn("ALCALDIA");
        tabla.addColumn("CIUDAD");
        tabla.addColumn("PUESTO");
        tabla.addColumn("TURNO");
        
        
            while (rs.next()){
                Object dato[]=new Object[9];
                for (int i=0;i<9;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONC3");
            
        tabla.addColumn("NOM_FARMACIA");
        tabla.addColumn("DIREC_FARMACIA");
        tabla.addColumn("NOM TIPOTELF");
        tabla.addColumn("TELEFONO 2");
        
            while (rs.next()){
                Object dato[]=new Object[4];
                for (int i=0;i<4;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  } 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONC4");
            
            tabla.addColumn("APAT_EMP");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_EMP");
            tabla.addColumn("NOM_TIPOTELF");
            tabla.addColumn("TELEFONO 1");
        
            while (rs.next()){
                Object dato[]=new Object[5];
                for (int i=0;i<5;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  } 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONC5");
            
            tabla.addColumn("APAT_FAR");
            tabla.addColumn("AMAT_EMP");
            tabla.addColumn("NOM_FARMACEUTICO");
            tabla.addColumn("NOM_FARMACIA");
            tabla.addColumn("CALLE");
            tabla.addColumn("COLONIA");

            tabla.addColumn("ALCALDIA");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("N. EXTERIOR");
            tabla.addColumn("CEDULA_FAR");
            tabla.addColumn("CORREO_FAR");
            tabla.addColumn("TURNO");
        
            while (rs.next()){
                Object dato[]=new Object[12];
                for (int i=0;i<12;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  } 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONC6");
            
            tabla.addColumn("NOM_MEDICAMENTO");
            tabla.addColumn("NOM_MONODROGA");
        
            while (rs.next()){
                Object dato[]=new Object[2];
                for (int i=0;i<2;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  } 
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.setVisible (false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int fs;
        bandera=1;

        try {
            fs= jTable1.getSelectedRow();
            if (fs==.1){
                JOptionPane.showMessageDialog (null,"NO SE HA SELECCIONADO NINGUNA TABLA");
            }

            else {
                DefaultTableModel tabla= (DefaultTableModel) jTable1.getModel();
                String clave, var2, var3;
                clave=(String)tabla.getValueAt(fs, 0);
                var2=(String)tabla.getValueAt(fs, 1);

                if (bandera==1){
                    
                    t1.setText(clave);
                    t2.setText(var2);
                    bandera=0;
                    
                 JOptionPane.showMessageDialog(null,
                         "ID COLONIA: "+clave+
                         "\nNOMBRE DE COLONIA: "+var2);
                }
                
            }
        }

        catch (Exception e){} 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        t1.setEditable(true);
        t1.setForeground(Color.black);
                    
        t1.setText("");
        t2.setText("");
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONC7");
            
        tabla.addColumn("NOM_MEDICAMENTO");
        tabla.addColumn("NOM_LABORATORIO");
        tabla.addColumn("NOM_ACCION TERAPEUTICA");
        
            while (rs.next()){
                Object dato[]=new Object[3];
                for (int i=0;i<3;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  } 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEBRIAN; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONC8");
            
        tabla.addColumn("NOM_MED");
        tabla.addColumn("PRESENTACION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("FARMACIA");
        tabla.addColumn("FOLIO");
        tabla.addColumn("PRECIO");
        tabla.addColumn("STOCK");
        
            while (rs.next()){
                Object dato[]=new Object[7];
                for (int i=0;i<7;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);
        }
        catch(Exception e) {  } 
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(COLONIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COLONIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COLONIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COLONIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COLONIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
