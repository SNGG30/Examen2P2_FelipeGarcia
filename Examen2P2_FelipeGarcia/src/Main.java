
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author felip
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        adminEmpleados ae = new adminEmpleados("./Empleados.adm");
        ae.cargarArchivo();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ae.getListaEmpleados().toArray());
        
        CB_Empleados.setModel(modelo);
        
        adminCarros ac = new adminCarros("./Carros.adm");
        ac.cargarArchivo();
        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel(ac.getListaCarros().toArray());
        
        CB_Cars.setModel(modelo2);
        
        DefaultTableModel model = (DefaultTableModel) ListaCarros.getModel();
        model.setRowCount(0);
        
        ArrayList<Carros> tempcar = ac.getListaCarros();
        for(int i = 0; i < tempcar.size(); i++){
            Object[] newrow = {tempcar.get(i).getId(), tempcar.get(i).getMarca(), tempcar.get(i).getModelo(), tempcar.get(i).getCostoRep()};
            model.addRow(newrow);
        }
        ListaCarros.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Empleados = new javax.swing.JPanel();
        TXT_CrearE = new javax.swing.JLabel();
        TXT_NameE = new javax.swing.JLabel();
        TF_NameE = new javax.swing.JTextField();
        TXT_AgeE = new javax.swing.JLabel();
        FF_AgeE = new javax.swing.JFormattedTextField();
        CreatE = new javax.swing.JToggleButton();
        TXT_CrearE1 = new javax.swing.JLabel();
        CB_Empleados = new javax.swing.JComboBox<>();
        DeleteE = new javax.swing.JButton();
        Carros = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaCarros = new javax.swing.JTable();
        TXT_CrearC = new javax.swing.JLabel();
        TXT_Marca = new javax.swing.JLabel();
        TXT_Modelo = new javax.swing.JLabel();
        TXT_Date = new javax.swing.JLabel();
        TXT_Cost = new javax.swing.JLabel();
        TF_Marca = new javax.swing.JTextField();
        TF_Modelo = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        TXT_CrearE3 = new javax.swing.JLabel();
        TXT_Marca1 = new javax.swing.JLabel();
        TXT_Modelo1 = new javax.swing.JLabel();
        TXT_Date1 = new javax.swing.JLabel();
        TXT_Cost1 = new javax.swing.JLabel();
        TF_MarcaMod = new javax.swing.JTextField();
        TF_ModeloMod = new javax.swing.JTextField();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CB_Cars = new javax.swing.JComboBox<>();
        FF_CostoRe = new javax.swing.JFormattedTextField();
        FF_CostoReMod = new javax.swing.JFormattedTextField();
        Simulacion = new javax.swing.JPanel();
        Tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Bitacora = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taller");

        TXT_CrearE.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TXT_CrearE.setText("CREAR EMPLEADO");

        TXT_NameE.setText("Nombre del empleado:");

        TXT_AgeE.setText("Edad:");

        FF_AgeE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        FF_AgeE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FF_AgeEActionPerformed(evt);
            }
        });

        CreatE.setText("Crear");
        CreatE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreatEMouseClicked(evt);
            }
        });

        TXT_CrearE1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TXT_CrearE1.setText("ELIMINAR EMPLEADO");

        DeleteE.setText("Eliminar");
        DeleteE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EmpleadosLayout = new javax.swing.GroupLayout(Empleados);
        Empleados.setLayout(EmpleadosLayout);
        EmpleadosLayout.setHorizontalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadosLayout.createSequentialGroup()
                .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TXT_CrearE))
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(TXT_NameE, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_NameE, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(TXT_AgeE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FF_AgeE, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TXT_CrearE1))
                    .addGroup(EmpleadosLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(CreatE, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpleadosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CB_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmpleadosLayout.createSequentialGroup()
                .addGap(0, 577, Short.MAX_VALUE)
                .addComponent(DeleteE, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(526, 526, 526))
        );
        EmpleadosLayout.setVerticalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TXT_CrearE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NameE)
                    .addComponent(TF_NameE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_AgeE)
                    .addComponent(FF_AgeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(CreatE)
                .addGap(92, 92, 92)
                .addComponent(TXT_CrearE1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CB_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(DeleteE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleados", Empleados);

        ListaCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Costo de Reparacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ListaCarros);

        TXT_CrearC.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TXT_CrearC.setText("CREAR CARRO");

        TXT_Marca.setText("Marca:");

        TXT_Modelo.setText("Modelo:");

        TXT_Date.setText("Año de fabricacion:");

        TXT_Cost.setText("Costo de reparacion:");

        TF_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_MarcaActionPerformed(evt);
            }
        });

        TF_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_ModeloActionPerformed(evt);
            }
        });

        TXT_CrearE3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TXT_CrearE3.setText("MODIFICAR CARRO");

        TXT_Marca1.setText("Marca:");

        TXT_Modelo1.setText("Modelo:");

        TXT_Date1.setText("Año de fabricacion:");

        TXT_Cost1.setText("Costo de reparacion:");

        TF_MarcaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_MarcaModActionPerformed(evt);
            }
        });

        TF_ModeloMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_ModeloModActionPerformed(evt);
            }
        });

        jButton1.setText("Crear Carro");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Carro");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        CB_Cars.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_CarsItemStateChanged(evt);
            }
        });

        FF_CostoRe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        FF_CostoReMod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout CarrosLayout = new javax.swing.GroupLayout(Carros);
        Carros.setLayout(CarrosLayout);
        CarrosLayout.setHorizontalGroup(
            CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarrosLayout.createSequentialGroup()
                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TXT_CrearC))
                    .addGroup(CarrosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CarrosLayout.createSequentialGroup()
                                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CarrosLayout.createSequentialGroup()
                                        .addComponent(TXT_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TF_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(TXT_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(154, 154, 154)
                                        .addComponent(TXT_Cost))
                                    .addGroup(CarrosLayout.createSequentialGroup()
                                        .addGap(294, 294, 294)
                                        .addComponent(TF_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FF_CostoRe, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CarrosLayout.createSequentialGroup()
                                .addComponent(TXT_Date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CarrosLayout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(CB_Cars, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CarrosLayout.createSequentialGroup()
                        .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CarrosLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(CarrosLayout.createSequentialGroup()
                                            .addComponent(TXT_Date1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton2))
                                        .addGroup(CarrosLayout.createSequentialGroup()
                                            .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(CarrosLayout.createSequentialGroup()
                                                    .addComponent(TXT_Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(TF_MarcaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(50, 50, 50)
                                                    .addComponent(TXT_Modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(154, 154, 154)
                                                    .addComponent(TXT_Cost1))
                                                .addGroup(CarrosLayout.createSequentialGroup()
                                                    .addGap(294, 294, 294)
                                                    .addComponent(TF_ModeloMod, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(FF_CostoReMod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(TXT_CrearE3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CarrosLayout.setVerticalGroup(
            CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarrosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TXT_CrearC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Marca)
                    .addComponent(TF_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_Modelo)
                    .addComponent(TF_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_Cost)
                    .addComponent(FF_CostoRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarrosLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarrosLayout.createSequentialGroup()
                        .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CarrosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(CarrosLayout.createSequentialGroup()
                                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_Date)
                                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CarrosLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jButton1)))
                                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CarrosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                        .addComponent(TXT_CrearE3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(CarrosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(CB_Cars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_Marca1)
                                    .addComponent(TF_MarcaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_Modelo1)
                                    .addComponent(TF_ModeloMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_Cost1)
                                    .addComponent(FF_CostoReMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(CarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_Date1)
                                    .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(219, 219, 219))))
        );

        jTabbedPane1.addTab("Carros", Carros);

        javax.swing.GroupLayout SimulacionLayout = new javax.swing.GroupLayout(Simulacion);
        Simulacion.setLayout(SimulacionLayout);
        SimulacionLayout.setHorizontalGroup(
            SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1214, Short.MAX_VALUE)
        );
        SimulacionLayout.setVerticalGroup(
            SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Simulacion", Simulacion);

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout TablaLayout = new javax.swing.GroupLayout(Tabla);
        Tabla.setLayout(TablaLayout);
        TablaLayout.setHorizontalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(546, Short.MAX_VALUE))
        );
        TablaLayout.setVerticalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabla", Tabla);

        javax.swing.GroupLayout BitacoraLayout = new javax.swing.GroupLayout(Bitacora);
        Bitacora.setLayout(BitacoraLayout);
        BitacoraLayout.setHorizontalGroup(
            BitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1214, Short.MAX_VALUE)
        );
        BitacoraLayout.setVerticalGroup(
            BitacoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bitacora", Bitacora);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FF_AgeEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FF_AgeEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FF_AgeEActionPerformed

    private void CreatEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreatEMouseClicked
        // TODO add your handling code here:
        Random r = new Random();
        
        Empleados e = new Empleados();
        
        String Nombre = TF_NameE.getText();
        String Age = FF_AgeE.getText();

        int Edad = Integer.parseInt(Age);
        if (Edad < 0){
            Edad = 1;
        }
        
        long id = 1+r.nextInt(1000);
        adminEmpleados ae = new adminEmpleados("./Empleados.adm");
        ae.cargarArchivo();
        ArrayList <Empleados> temp = ae.getListaEmpleados();
        for (int i = 0; i < temp.size(); i++) {
            if(id == temp.get(i).getId()){
                id = 1+r.nextInt(1000);
                i = 0;
            }
        }
        
        int exito = 0;
        
        e = new Empleados(Nombre, Edad, id, exito);
        
        
        ae.setEmpleado(e);
        ae.escribirArchivo();
        
        CB_Empleados.removeAll();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ae.getListaEmpleados().toArray());
        
        CB_Empleados.setModel(modelo);
        TF_NameE.setText("");
        FF_AgeE.setText("");
    }//GEN-LAST:event_CreatEMouseClicked

    private void DeleteEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteEMouseClicked
        // TODO add your handling code here:
        int deleteE = CB_Empleados.getSelectedIndex();
        
        adminEmpleados ae = new adminEmpleados("./Empleados.adm");
        ae.cargarArchivo();
        ArrayList <Empleados> temp = ae.getListaEmpleados();
        temp.remove(deleteE);
        ae.setListaEmpleados(temp);
        ae.escribirArchivo();
        
        CB_Empleados.removeAll();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ae.getListaEmpleados().toArray());
        
        CB_Empleados.setModel(modelo);
    }//GEN-LAST:event_DeleteEMouseClicked

    private void TF_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_MarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_MarcaActionPerformed

    private void TF_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_ModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_ModeloActionPerformed

    private void TF_MarcaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_MarcaModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_MarcaModActionPerformed

    private void TF_ModeloModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_ModeloModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_ModeloModActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Random r = new Random();
        
        Carros c = new Carros();
        
        String Marca = TF_Marca.getText();
        String Modelo = TF_Modelo.getText();
        String CostoRe = FF_CostoRe.getText();
        int CostoRep = Integer.parseInt(CostoRe);       
        Date fabricacion = jCalendar1.getDate();
        String Estado = "en espera de entrar a reparación";
        
        long id = 1+r.nextInt(1000);
        adminCarros ac = new adminCarros("./Carros.adm");
        ac.cargarArchivo();
        ArrayList <Carros> temp = ac.getListaCarros();
        for (int i = 0; i < temp.size(); i++) {
            if(id == temp.get(i).getId()){
                id = 1+r.nextInt(1000);
                i = 0;
            }
        }
        
        c = new Carros(Marca, Modelo, id, fabricacion, Estado, CostoRep);
        ac.setCarro(c);
        ac.escribirArchivo();
        CB_Cars.removeAll();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ac.getListaCarros().toArray());
        
        CB_Cars.setModel(modelo);
        
        DefaultTableModel model = (DefaultTableModel) ListaCarros.getModel();
        model.setRowCount(0);
        
        ArrayList<Carros> tempcar = ac.getListaCarros();
        for(int i = 0; i < tempcar.size(); i++){
            Object[] newrow = {tempcar.get(i).getId(), tempcar.get(i).getMarca(), tempcar.get(i).getModelo(), tempcar.get(i).getCostoRep()};
            model.addRow(newrow);
        }
        ListaCarros.setModel(model);
        
        TF_Marca.setText("");
        TF_Modelo.setText("");
        FF_CostoRe.setText("");
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void CB_CarsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_CarsItemStateChanged
        // TODO add your handling code here:
        Carros temp = (Carros) CB_Cars.getSelectedItem();
        if(temp != null){
            TF_MarcaMod.setText(temp.getMarca());
            TF_ModeloMod.setText(temp.getModelo());
            int price = temp.getCostoRep();
            FF_CostoReMod.setText(Integer.toString(price));
            jCalendar2.setDate(temp.getFabricacion());
        }
    }//GEN-LAST:event_CB_CarsItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        int select = CB_Cars.getSelectedIndex();
        
        String Marca = TF_MarcaMod.getText();
        String Modelo = TF_ModeloMod.getText();
        String CostoRe = FF_CostoReMod.getText();
        int CostoRep = Integer.parseInt(CostoRe);       
        Date fabricacion = jCalendar2.getDate();
        
        adminCarros ac = new adminCarros("./Carros.adm");
        ac.cargarArchivo();
        
        
        ArrayList <Carros> temp = ac.getListaCarros();
        temp.get(select).setMarca(Marca);
        temp.get(select).setModelo(Modelo);
        temp.get(select).setCostoRep(CostoRep);
        temp.get(select).setFabricacion(fabricacion);
        ac.setListaCarros(temp);
        ac.escribirArchivo();
        
        CB_Cars.removeAll();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(ac.getListaCarros().toArray());
        
        CB_Cars.setModel(modelo);
        
        DefaultTableModel model = (DefaultTableModel) ListaCarros.getModel();
        model.setRowCount(0);
        
        ArrayList<Carros> tempcar = ac.getListaCarros();
        for(int i = 0; i < tempcar.size(); i++){
            Object[] newrow = {tempcar.get(i).getId(), tempcar.get(i).getMarca(), tempcar.get(i).getModelo(), tempcar.get(i).getCostoRep()};
            model.addRow(newrow);
        }
        ListaCarros.setModel(model);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    ArrayList <Empleados> emp = new ArrayList();
    ArrayList <Carros> cars = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bitacora;
    private javax.swing.JComboBox<String> CB_Cars;
    private javax.swing.JComboBox<String> CB_Empleados;
    private javax.swing.JPanel Carros;
    private javax.swing.JToggleButton CreatE;
    private javax.swing.JButton DeleteE;
    private javax.swing.JPanel Empleados;
    private javax.swing.JFormattedTextField FF_AgeE;
    private javax.swing.JFormattedTextField FF_CostoRe;
    private javax.swing.JFormattedTextField FF_CostoReMod;
    private javax.swing.JTable ListaCarros;
    private javax.swing.JPanel Simulacion;
    private javax.swing.JTextField TF_Marca;
    private javax.swing.JTextField TF_MarcaMod;
    private javax.swing.JTextField TF_Modelo;
    private javax.swing.JTextField TF_ModeloMod;
    private javax.swing.JTextField TF_NameE;
    private javax.swing.JLabel TXT_AgeE;
    private javax.swing.JLabel TXT_Cost;
    private javax.swing.JLabel TXT_Cost1;
    private javax.swing.JLabel TXT_CrearC;
    private javax.swing.JLabel TXT_CrearE;
    private javax.swing.JLabel TXT_CrearE1;
    private javax.swing.JLabel TXT_CrearE3;
    private javax.swing.JLabel TXT_Date;
    private javax.swing.JLabel TXT_Date1;
    private javax.swing.JLabel TXT_Marca;
    private javax.swing.JLabel TXT_Marca1;
    private javax.swing.JLabel TXT_Modelo;
    private javax.swing.JLabel TXT_Modelo1;
    private javax.swing.JLabel TXT_NameE;
    private javax.swing.JPanel Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
