package polimorfismo;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.io.BufferedReader;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestVehiculos extends JFrame implements ActionListener{
    private Agencia miagencia;
    private JTextField caja1,caja2,caja3,caja4;
    private JLabel etiqueta0,etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5;
    private JButton boton1,boton2,jButton2;
    private JTextArea box1,jTextArea1;
    private JScrollPane jScrollPane1;
    
    public TestVehiculos(){
        super("Agencia");
        setSize(650,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        miagencia = new Agencia();
        
        // crear componentes
        jButton2 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton2.setText("Abrir");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton2ActionPerformed(evt);
            }
        });
        jTextArea1.setColumns(20);
        jTextArea1.setRows(20);
        jScrollPane1.setViewportView(jTextArea1);
        caja1 = new JTextField();
        caja1.setBounds(70, 30, 300, 30);
        caja2 = new JTextField();
        caja2.setBounds(70, 80, 300, 30);
        caja3 = new JTextField();
        caja3.setBounds(70, 130, 300, 30);
        caja4 = new JTextField();
        caja4.setBounds(70, 180, 300, 30);
        boton1 = new JButton();
        boton1.setText("Guardar");
        boton1.setBounds(120, 250, 120, 25);
        boton1.addActionListener(this);
        boton2 = new JButton();
        boton2.setText("Cancelar");
        boton2.setBounds(280, 250, 120, 25);
        boton2.addActionListener(this);
        etiqueta0 = new JLabel();
        etiqueta0.setText("Datos del cliente");
        etiqueta0.setBounds(75, 5, 150, 20);
        etiqueta1 = new JLabel();
        etiqueta1.setText("Nombre");
        etiqueta1.setBounds(15, 30, 150, 30);
        etiqueta2 = new JLabel();
        etiqueta2.setText("Dirección");
        etiqueta2.setBounds(15, 80, 150, 30);
        etiqueta3 = new JLabel();
        etiqueta3.setText("Telefono");
        etiqueta3.setBounds(15, 130, 150, 30);
        etiqueta4 = new JLabel();
        etiqueta4.setText("Celular");
        etiqueta4.setBounds(15, 180, 150, 30);
        etiqueta5 = new JLabel();
        etiqueta5.setBounds(600, 0, 600, 330);
        etiqueta5.setIcon(new ImageIcon("agencia.jpg"));
        box1 = new JTextArea();
        box1.setBounds(20, 330, 600, 250);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(664, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(95, 95, 95))
        );

        add(caja1);
        add(caja2);
        add(caja3);
        add(caja4);
        add(boton1);
        add(boton2);
        add(etiqueta0);
        add(etiqueta1);
        add(etiqueta2);
        add(etiqueta3);
        add(etiqueta4);
        add(etiqueta5);
        add(box1);
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent e){
        //Guardar
        if (e.getSource() == boton1){
            Cliente c = new Cliente();
            c.setNombre(caja1.getText());
            c.setDireccion(caja2.getText());
            int te, ce;
        try {
              te = Integer.parseInt(caja3.getText());
              c.setTel(te);
              ce = Integer.parseInt(caja4.getText());
              c.setCel(ce);
              miagencia.agregarContacto(c);
              box1.setText(miagencia.mostrar());
            } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"Numero de Telefono o Celular incorrecto\n" + "Vuelva a intentar");
            }
        } else if (e.getSource() == boton2) {
            // Cancelar
            caja1.setText(null);
            caja2.setText(null);
            caja3.setText(null);
            caja4.setText(null);
            box1.setText(miagencia.mostrar());
    }
}
    private void jButton2ActionPerformed(ActionEvent evt) {
    JFileChooser jfc=new JFileChooser();
    int opc=jfc.showOpenDialog(null);
    if(opc==JFileChooser.APPROVE_OPTION){
            File file = jfc.getSelectedFile();
            BufferedReader objReader=null;
            try {
                String lineaTexto;
                objReader = new BufferedReader(new FileReader(file)); 
                String strCadena = "";
                while((lineaTexto = objReader.readLine()) != null){
                    strCadena += lineaTexto;
                    strCadena += "\n";
                }
                jTextArea1.setText(strCadena);
                objReader.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TestVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex){
                Logger.getLogger(TestVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
    }
    public static void main(String[] args){
        Auto a1 = new Auto("719DA93", "CWD2001", "TOYOTA", 4, 5, 4, "GRANDE");
        Auto au1 = new Auto("123HTM4","RT5000H","HONDA",5,4,2,"MEDIANO");
        Deportivo d1 = new Deportivo("JDOQ31M", "2020CAS", "AVEO", "MEDIANO", 6, 250f);
        Deportivo dep = new Deportivo("357AZU6","VAR343J","BMW","MEDIANO", 6, 300f);
        Camioneta c1 = new Camioneta("NCEH293", "2018JWM", "CHEVROLET", 2f);
        Camioneta cam = new Camioneta("987THX4", "WAR15T4", "FORD", 2.3f);
        Turismo t1 = new Turismo("JDWJ392", "2009NSU", "HONDA", 48, 2);
        Turismo tur1 = new Turismo("000CXZ1", "FXQS246", "CHEVORLET", 15, 3);       
        
        //AGREGAR LOS OBJETOS DE TIPO VEHICULO A LA AGENCIA
        Agencia ag = new Agencia();
        ag.registrarVehiculo(a1);
        ag.registrarVehiculo(au1);
        ag.registrarVehiculo(d1);
        ag.registrarVehiculo(dep);
        ag.registrarVehiculo(c1);
        ag.registrarVehiculo(cam);
        ag.registrarVehiculo(t1);        
        ag.registrarVehiculo(tur1);
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex){
            Logger.getLogger(TestVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex){
            Logger.getLogger(TestVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex){
            Logger.getLogger(TestVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                new TestVehiculos().setVisible(true);
            }
        });
        //MOSTRAR INFORMACION
        int  descicion = JOptionPane.showConfirmDialog(null,"Deseas visualizar los vehiculos disponibles?");
        
        if(descicion == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Vehiculos disponibles: \n\n" + ag.mostrarInfo() + 
                                               "\n Cantidad de autos: " + ag.contarA() + 
                                               "\n Cantidad de Deportivos: " + ag.contarD() +
                                               "\n Cantidad de camionetas: " + ag.contarC() +
                                               "\n Cantidad de Turismo: " + ag.contarT());
        }
    }
}