package dsdi;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class EMPLEADO extends javax.swing.JFrame {

    int bandera=0, ban2=0;
    
    public EMPLEADO() {
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
        
        año.addItem("AÑO");
        mes.addItem("MES");
        dia.addItem("DIA");
        
        
        for (int j=1960; j<=2070; j++){
            año.addItem(Integer.toString(j));
        }
        
        for (int j=1; j<=12; j++){
            String ext="0";
            if (j<=9){
                mes.addItem(ext + Integer.toString(j));
                
            }
            
            else{
                mes.addItem(Integer.toString(j));
            }
        }
        
        for (int j=1; j<=31; j++){
            String ext="0";
            if (j<=9){
                dia.addItem(ext + Integer.toString(j));
                
            }
            else{
                dia.addItem(Integer.toString(j));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        c4 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        año = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        tf10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tf8 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        tf11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tf9 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        tf12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        tf13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR_ Foraneo.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(720, 100, 40, 40);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR_ Foraneo.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(780, 100, 40, 40);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/LIMPIAR 2.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(1090, 600, 50, 50);
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
        jLabel3.setText("ID CALLE1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(520, 80, 230, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CLAVE DE EMPLEADO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 110, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("NOMBRE DE EMPLEADO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 180, 230, 30);
        jPanel1.add(tf7);
        tf7.setBounds(520, 110, 180, 30);
        jPanel1.add(tf2);
        tf2.setBounds(30, 210, 200, 30);
        jPanel1.add(tf1);
        tf1.setBounds(30, 140, 200, 30);

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
        jScrollPane1.setBounds(20, 330, 1110, 240);

        jPanel1.add(año);
        año.setBounds(430, 280, 70, 40);

        jPanel1.add(mes);
        mes.setBounds(340, 280, 70, 40);

        jPanel1.add(dia);
        dia.setBounds(250, 280, 70, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("FECHA NACIMIENTO");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 250, 180, 30);
        jPanel1.add(tf4);
        tf4.setBounds(260, 140, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 110, 230, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 250, 230, 30);
        jPanel1.add(tf3);
        tf3.setBounds(30, 280, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("#EXTERIOR");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(260, 180, 110, 30);
        jPanel1.add(tf5);
        tf5.setBounds(260, 210, 110, 30);
        jPanel1.add(tf6);
        tf6.setBounds(380, 210, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("C. POSTAL");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(380, 180, 110, 30);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR_ Foraneo.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(1100, 60, 40, 40);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR_ Foraneo.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(1040, 60, 40, 40);
        jPanel1.add(tf10);
        tf10.setBounds(840, 70, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ID CIUDAD1");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(840, 40, 230, 30);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR_ Foraneo.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(720, 170, 40, 40);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR_ Foraneo.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(780, 170, 40, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("ID COLONIA1");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(520, 150, 230, 30);
        jPanel1.add(tf8);
        tf8.setBounds(520, 180, 180, 30);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR_ Foraneo.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(1100, 130, 40, 40);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR_ Foraneo.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(1040, 130, 40, 40);
        jPanel1.add(tf11);
        tf11.setBounds(840, 140, 180, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("ID PUESTO1");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(840, 110, 230, 30);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR_ Foraneo.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(720, 240, 40, 40);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR_ Foraneo.png"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(780, 240, 40, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("ID ACALDIA1");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(520, 220, 230, 30);
        jPanel1.add(tf9);
        tf9.setBounds(520, 250, 180, 30);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR_ Foraneo.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(1100, 200, 40, 40);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR_ Foraneo.png"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(1040, 200, 40, 40);
        jPanel1.add(tf12);
        tf12.setBounds(840, 210, 180, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("ID HORARIO1");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(840, 180, 230, 30);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/AGREGAR_ Foraneo.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);
        jButton26.setBounds(1100, 270, 40, 40);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/CONSULTAR_ Foraneo.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);
        jButton27.setBounds(1040, 270, 40, 40);
        jPanel1.add(tf13);
        tf13.setBounds(840, 280, 180, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("ID FARMACIA4");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(840, 250, 230, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/EMPLEADOF.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1150, 730);

        jMenu2.setText("Consultas Complejas");

        jMenuItem9.setText("NOM FARM - DIR - CEDULA - CORREO - HORARIO");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("NOM EMP - DIR - PUESTO - HORARIO");
        jMenuItem10.setActionCommand("");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("NOM FARM - DIR - TIPOTELF - NUM TELF");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("NOM EMP - TIPOTELF - NUM TEL");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("NOM FARMACEUTICO - NOM FARM - DIR");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("NOM MEDICAMENTO - NOM MONODROGA");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem15.setText("NOM MEDICAMENTO - NOM LABOR - NOM ACCION TERAP");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setText("NOM MED - PRESENT - UNID MEDIDA - FARM - FOLO - PRECIO - STOCK ");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bandera=1;
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSEMPLEADO");
            
        tabla.addColumn("ID EMPLEADO");
        tabla.addColumn("APELLIDO PATERNO");
        tabla.addColumn("APELLIDO MATERNO");
        tabla.addColumn("NOMBRE EMPLEADO");
        tabla.addColumn("NUM EXTERIOR");
        tabla.addColumn("C. POSTAL");
        tabla.addColumn("FECHA NACIMIENTO");
        tabla.addColumn("ID CALLE 1");
        tabla.addColumn("ID COLONIA 1");
        tabla.addColumn("ID ALCALDIA 1");
        tabla.addColumn("ID CIUDAD 1");
        tabla.addColumn("ID PUESTO 1");
        tabla.addColumn("ID HORARIO 1");
        tabla.addColumn("ID FARMACIA 4");
        
            while (rs.next()){
                Object dato[]=new Object[14];
                for (int i=0;i<14;i++){
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
                (tf1.getText().isEmpty())||
                (tf2.getText().isEmpty())||
                (tf3.getText().isEmpty())||
                (tf4.getText().isEmpty())||
                (tf5.getText().isEmpty())||
                (tf6.getText().isEmpty())||
                (dia.getSelectedItem().equals("DIA"))||
                (mes.getSelectedItem().equals("MES"))||
                (año.getSelectedItem().equals("AÑO"))||
                    
                    
                (tf7.getText().isEmpty())||
                (tf8.getText().isEmpty())||
                (tf9.getText().isEmpty())||
                (tf10.getText().isEmpty())||
                (tf11.getText().isEmpty())||
                (tf12.getText().isEmpty())||
                (tf13.getText().isEmpty())
            ){
                JOptionPane.showMessageDialog (null,"DATOS VACIOS");
            }
            
            else {
                String clave, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, fecha, varDia, varMes, varAño;

                clave=tf1.getText();
                var2=tf2.getText();
                var3=tf3.getText();
                var4=tf4.getText();
                var5=tf5.getText();
                var6=tf6.getText();
                
                    varDia=dia.getSelectedItem().toString();
                    varMes=mes.getSelectedItem().toString();
                    varAño=año.getSelectedItem().toString();
                
                
                var7=tf7.getText();
                var8=tf8.getText();
                var9=tf9.getText();
                var10=tf10.getText();
                var11=tf11.getText();
                var12=tf12.getText();
                var13=tf13.getText();

                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
                tf12.setText("");
                tf13.setText("");
                
                Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(" SET DATEFORMAT DMY EXEC ACTEMPLEADO '"+ clave + "','"+ var3 + "','" +var4+"','"+var2+"',"+var5+","+var6+",'"+varDia+"-"+varMes+"-"+varAño+"','"+var7+"','"+var8+"','"+var9+"','"+var10+"','"+var11+"','"+var12+"','"+var13+"'"  );

            }
        }
        catch(Exception e) {  }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

    try{
            if (
                (tf1.getText().isEmpty())
            ){
                JOptionPane.showMessageDialog (null,"DATOS VACIOS");
            }
            
            else {

                String pass="exa",p="";
                String op; 
                op=tf1.getText();
                JPasswordField pf = new JPasswordField();
                int opc = JOptionPane.showConfirmDialog(null, pf, "INGRESA LA CONTRASEÑA", JOptionPane.OK_CANCEL_OPTION, 		JOptionPane.INFORMATION_MESSAGE);

                 if (opc== JOptionPane.OK_OPTION) {
                         String password = new String(pf.getPassword());
                         p=password;
                 }

                 if (pass.equals(p)){
                     
                     
                Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("EXEC ELIMEMPLEADO '"+op+"'");
                
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
                (tf1.getText().isEmpty())||
                (tf2.getText().isEmpty())||
                (tf3.getText().isEmpty())||
                (tf4.getText().isEmpty())||
                (tf5.getText().isEmpty())||
                (tf6.getText().isEmpty())||
                (dia.getSelectedItem().equals("DIA"))||
                (mes.getSelectedItem().equals("MES"))||
                (año.getSelectedItem().equals("AÑO"))||
                    
                    
                (tf7.getText().isEmpty())||
                (tf8.getText().isEmpty())||
                (tf9.getText().isEmpty())||
                (tf10.getText().isEmpty())||
                (tf11.getText().isEmpty())||
                (tf12.getText().isEmpty())||
                (tf13.getText().isEmpty())
            ){
                JOptionPane.showMessageDialog (null,"DATOS VACIOS");
            }
            
            else {
                String clave, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, fecha, varDia, varMes, varAño;

                clave=tf1.getText();
                var2=tf2.getText();
                var3=tf3.getText();
                var4=tf4.getText();
                var5=tf5.getText();
                var6=tf6.getText();
                
                    varDia=dia.getSelectedItem().toString();
                    varMes=mes.getSelectedItem().toString();
                    varAño=año.getSelectedItem().toString();
                
                
                var7=tf7.getText();
                var8=tf8.getText();
                var9=tf9.getText();
                var10=tf10.getText();
                var11=tf11.getText();
                var12=tf12.getText();
                var13=tf13.getText();

                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
                tf10.setText("");
                tf11.setText("");
                tf12.setText("");
                tf13.setText("");
                
                Connection con;
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(" SET DATEFORMAT DMY EXEC INGEMPLEADO '"+ clave + "','"+ var3 + "','" +var4+"','"+var2+"',"+var5+","+var6+",'"+varDia+"-"+varMes+"-"+varAño+"','"+var7+"','"+var8+"','"+var9+"','"+var10+"','"+var11+"','"+var12+"','"+var13+"'"  );

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
                con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("EXEC BSEMPLEADO '" +jTextField1.getText()+"'");

                
        tabla.addColumn("ID EMPLEADO");
        tabla.addColumn("APELLIDO PATERNO");
        tabla.addColumn("APELLIDO MATERNO");
        tabla.addColumn("NOMBRE EMPLEADO");
        tabla.addColumn("NUM EXTERIOR");
        tabla.addColumn("C. POSTAL");
        tabla.addColumn("FECHA NACIMIENTO");
        tabla.addColumn("ID CALLE 1");
        tabla.addColumn("ID COLONIA 1");
        tabla.addColumn("ID ALCALDIA 1");
        tabla.addColumn("ID CIUDAD 1");
        tabla.addColumn("ID PUESTO 1");
        tabla.addColumn("ID HORARIO 1");
        tabla.addColumn("ID FARMACIA 4");
        
            while (rs.next()){
                Object dato[]=new Object[14];
                for (int i=0;i<14;i++){
                    dato[i]=rs.getString(i+1);
                }
                tabla.addRow(dato);
            }
                this.jTable1.setModel(tabla);
        }   

        if (op.equals("CLAVE FARMACEÚTICO")){
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
    catch(Exception e) {  }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MENU frame = new MENU ();
        this.setVisible (false);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
                String clave, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, fecha;
                DefaultTableModel tabla= (DefaultTableModel) jTable1.getModel();
                clave=(String)tabla.getValueAt(fs, 0);
                var2=(String)tabla.getValueAt(fs, 3);
                var3=(String)tabla.getValueAt(fs, 1);
                var4=(String)tabla.getValueAt(fs, 2);
                var5=(String)tabla.getValueAt(fs, 4);
                var6=(String)tabla.getValueAt(fs, 5);
                
                var8=(String)tabla.getValueAt(fs, 7);
                var9=(String)tabla.getValueAt(fs, 8);
                var10=(String)tabla.getValueAt(fs, 9);
                var11=(String)tabla.getValueAt(fs, 10);
                var12=(String)tabla.getValueAt(fs, 11);
                var13=(String)tabla.getValueAt(fs, 12);
                var14=(String)tabla.getValueAt(fs, 13);
                
                fecha=(String)tabla.getValueAt(fs, 6);
                
                String  fDia, fAño, fMes, año1, año2;
                
                fDia= fecha.substring(8,10);
                fMes= fecha.substring(5,7);
                fAño= fecha.substring(0,4);

                if (bandera==1){
                    tf1.setText(clave);
                    tf2.setText(var2);
                    tf3.setText(var3);
                    tf4.setText(var4);
                    tf5.setText(var5);
                    tf6.setText(var6);
                        dia.setSelectedItem(fDia);
                        mes.setSelectedItem(fMes);
                        año.setSelectedItem(fAño);
                    tf7.setText(var8);
                    tf8.setText(var9);
                    tf9.setText(var10);
                    tf10.setText(var11);
                    tf11.setText(var12);
                    tf12.setText(var13);
                    tf13.setText(var14);
                    bandera=0;
                    
                    JOptionPane.showMessageDialog(null,
                            "ID EMPLEADO= "+clave+
                            "\nAPELLIDO PATERNO= "+var3+
                            "\nAPELLIDO MATERNO= "+var4+
                            "\nNOMBRE= "+var2+
                            "\nNUM. EXTERIOR= "+var5+
                            "\nCODIGO POSTAL= "+var6+
                            "\nFECHA NACIMIENTO= "+fDia+"-"+fMes+"-"+fAño+
                            "\nID CALLE1= "+var8+
                            "\nID COLONIA1= "+var9+
                            "\nID ALCALDIA1= "+var10+
                            "\nID CIUDAD1= "+var11+
                            "\nID PUESTO1= "+var12+
                            "\nID HORARIO1= "+var13+
                            "\nID FARMACIA4= "+var14);
                   
                }
                
                
            }
        }

        catch (Exception e){} 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        tf1.setEditable(true);
        tf1.setForeground(Color.black);
                    
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        tf7.setText("");
        tf8.setText("");
        tf9.setText("");
        tf10.setText("");
        tf11.setText("");
        tf12.setText("");
        tf13.setText("");
        
        dia.setSelectedItem("DIA");
        mes.setSelectedItem("MES");
        año.setSelectedItem("AÑO");
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        CALLE frame = new CALLE ();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSCALLE");
            
            tabla.addColumn("ID CALLE");
            tabla.addColumn("NOMBRE CALLE");
        
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
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        CIUDAD frame = new CIUDAD ();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSCIUDAD");
            
            tabla.addColumn("ID CIUDAD");
            tabla.addColumn("NOMBRE CIUDAD");
        
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
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
        
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        COLONIA frame = new COLONIA ();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        PUESTO frame = new PUESTO ();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSPUESTO");
            
            tabla.addColumn("ID PUESTO");
            tabla.addColumn("NOMBRE PUESTO");
        
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
        
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSALCALDIA");
            
            tabla.addColumn("ID ALCALDIA");
            tabla.addColumn("NOMBRE ALCALDIA");
        
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
        
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        ALCALDIA frame = new ALCALDIA ();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        HORARIO frame = new HORARIO ();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSHORARIO");
            
            tabla.addColumn("ID HORARIO");
            tabla.addColumn("TURNO");
        
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
        
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        FARMACIA frame = new FARMACIA ();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        
        
        
         try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("EXEC CONSFARMACIA");
            
        tabla.addColumn("CLAVE FARMACIA");
        tabla.addColumn("NOMBRE FARMACIA");
        tabla.addColumn("DIRECCION FARMACIA");
        tabla.addColumn("ID FARMACEUTICO 1");
        
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
        
        
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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

    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:

        try{
            DefaultTableModel tabla=new DefaultTableModel();
            Connection con;
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BASEJORGE; user=sa; password=sasa;");
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
    }//GEN-LAST:event_jMenuItem16ActionPerformed

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
            java.util.logging.Logger.getLogger(EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMPLEADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
}
