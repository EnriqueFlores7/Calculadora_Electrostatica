import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interfaz_Campo_Electrico extends JFrame implements ActionListener {
    //Declaramos un panel para agregar los elementos
    JPanel panel = new JPanel();

    //Declaramos los elementos del Menu de barra
    private JMenuBar menuBar;
    private JMenu menu3;
    private JMenuItem fun_Coulomb, fun_Campo, fun_Gauss;

    //Declaramos las etiquetas
    JLabel eti1 = new JLabel();
    JLabel eti2 = new JLabel();
    JLabel eti3 = new JLabel();
    JLabel eti4 = new JLabel();
    JLabel eti5 = new JLabel();
    JLabel eti8 = new JLabel();
    JLabel eti9 = new JLabel();

    //Declaramos las cajas de texto
    JTextField txt_magnitud_e = new JTextField();
    JTextField txt_fuerza_e = new JTextField();
    JTextField txt_carga_p = new JTextField();
    JTextField txt_distancia = new JTextField();

    //Declaramos los botones
    JButton btn_la_magnitud_e = new JButton();
    JButton btn_la_fuerza_e = new JButton();
    JButton btn_la_carga_p = new JButton();
    JButton btn_CE_aislada = new JButton();

    //Declaramos las variables que usaremso con la clase
    double fuerza_electrica = 0;
    double carga_prueba = 0;
    double campo_electrico = 0;
    double distancia = 0;

    //Llamamos a la clase
    calculo_campo_electrico calculo_campo_electrico = new calculo_campo_electrico(fuerza_electrica, carga_prueba, campo_electrico, distancia);

    //Declaramos las propiedades de la interfaz
    public Interfaz_Campo_Electrico(){
        setTitle("Campo Electrico");
        setSize(720, 340);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarcomponentes();
    }
    //Para inicar los elementos que se agreguen a la interfaz
    public void iniciarcomponentes(){
        panel_int();
        menuBarra();
        etiquetas();
        cajas_de_texto();
        botones_funciones();
    }
    //Declarar las propiedades de el panel
    public void panel_int(){
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }
    //Declaramos las etiquetas
    public void etiquetas(){
        eti1.setText("¿Que datos tienes?");
        eti1.setBounds(20, 0, 500, 30);
        eti1.setFont(new Font("arial", 0, 15));
        panel.add(eti1);

        eti2.setText("La magnitud del campo electrico :");
        eti2.setBounds(20, 35, 500, 30);
        eti2.setFont(new Font("arial", 0, 15));
        panel.add(eti2);

        eti3.setText("Fuerza electrica :");
        eti3.setBounds(20, 65, 500, 30);
        eti3.setFont(new Font("arial", 0, 15));
        panel.add(eti3);

        eti4.setText("Carga de prueba :");
        eti4.setBounds(20, 99, 500, 30);
        eti4.setFont(new Font("arial", 0, 15));
        panel.add(eti4);

        eti5.setText("Distancia :");
        eti5.setBounds(20, 139, 500, 15);
        eti5.setFont(new Font("Arial",0, 15));
        panel.add(eti5);

        eti8.setText("Resultado :");
        eti8.setBounds(370, 0, 500, 30);
        eti8.setFont(new Font("arial", 500,15));
        panel.add(eti8);

        eti9.setText("0.00");
        eti9.setBounds(450, 0, 500, 30);
        eti9.setFont(new Font("arial",0,15));
        panel.add(eti9);
    }
    //Declaramos el menu de barra
    public void menuBarra(){
        //Creamos el JMenuBar y lo asociamos con el JFrame
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        /* Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el método add */
        /*menu2 = new JMenu("Manual");
        menuBar.add(menu2); */
        
        menu3 = new JMenu("Funciones");
        menuBar.add(menu3);
        //Las opciones del menu
        //Para abrir las funciones de la calculadora
        fun_Coulomb = new JMenuItem("Fuerza electrica");
        fun_Coulomb.addActionListener(this);
        menu3.add(fun_Coulomb);

        fun_Campo = new JMenuItem("Campo electrico");
        fun_Campo.addActionListener(this);
        menu3.add(fun_Campo);

        fun_Gauss = new JMenuItem("Potencial Electrico");
        fun_Gauss.addActionListener(this);
        menu3.add(fun_Gauss);
    }
    //Declaramos las caja de texto
    public void cajas_de_texto(){
        txt_magnitud_e.setBounds(245, 40, 200, 20);
        panel.add(txt_magnitud_e);

        txt_fuerza_e.setBounds(245, 69, 200, 20);
        panel.add(txt_fuerza_e);

        txt_carga_p.setBounds(245, 105, 200, 20);
        panel.add(txt_carga_p);

        txt_distancia.setBounds(245,  140, 200, 20);
        panel.add(txt_distancia);
    }
    //Declaramos los botones
    public void botones_funciones() {
        btn_la_magnitud_e.setText("Campo electrico");
        btn_la_magnitud_e.setBounds(20, 210, 150, 30);
        btn_la_magnitud_e.setBackground(Color.lightGray);
        btn_la_magnitud_e.addActionListener(this);
        panel.add(btn_la_magnitud_e);

        btn_la_fuerza_e.setText("Fuerza electrica");
        btn_la_fuerza_e.setBounds(190, 210, 150, 30);
        btn_la_fuerza_e.setBackground(Color.lightGray);
        btn_la_fuerza_e.addActionListener(this);
        panel.add(btn_la_fuerza_e);

        btn_la_carga_p.setText("Carga de prueba");
        btn_la_carga_p.setBounds(360, 210, 150, 30);
        btn_la_carga_p.setBackground(Color.lightGray);
        btn_la_carga_p.addActionListener(this);
        panel.add(btn_la_carga_p);

        btn_CE_aislada.setText("C.E carga aislada");
        btn_CE_aislada.setBounds(530, 210, 150, 30);
        btn_CE_aislada.setBackground(Color.lightGray);
        btn_CE_aislada.addActionListener(this);
        panel.add(btn_CE_aislada);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fun_Coulomb){
                Interfaz_Ley_Coulomb abrir = new Interfaz_Ley_Coulomb();
                abrir.setVisible(true);
                this.setVisible(false);
        }else if(e.getSource()==fun_Campo){
            Interfaz_Campo_Electrico abrir = new Interfaz_Campo_Electrico();
            abrir.setVisible(true);
            this.setVisible(false);
        }else if (e.getSource()==fun_Gauss) {
            Interfaz_Potencia_Electrico abrir = new Interfaz_Potencia_Electrico();
            abrir.setVisible(true);
            this.setVisible(false);
        }else if  (e.getSource() == btn_la_magnitud_e){
            try{
            fuerza_electrica = Double.parseDouble(txt_fuerza_e.getText());
            carga_prueba = Double.parseDouble(txt_carga_p.getText());
            eti9.setText(String.valueOf(calculo_campo_electrico.campo_electrico_sink(fuerza_electrica, carga_prueba)));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "¡Se produjo un error!", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        }else if (e.getSource() == btn_la_fuerza_e){
            try{
            campo_electrico = Double.parseDouble(txt_magnitud_e.getText());
            carga_prueba = Double.parseDouble(txt_carga_p.getText());
            eti9.setText(String.valueOf(calculo_campo_electrico.fuerza_electrica_calculo(campo_electrico, carga_prueba)));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "¡Se produjo un error!", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        }else if(e.getSource() == btn_la_carga_p){
            try{
            campo_electrico = Double.parseDouble(txt_magnitud_e.getText());
            fuerza_electrica = Double.parseDouble(txt_fuerza_e.getText());
            eti9.setText(String.valueOf(calculo_campo_electrico.carga_prueba_calculo(fuerza_electrica, campo_electrico)));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "¡Se produjo un error!", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        }else if (e.getSource()==btn_CE_aislada){
            try{
            carga_prueba = Double.parseDouble(txt_carga_p.getText());
            distancia = Double.parseDouble(txt_distancia.getText());
            eti9.setText(String.valueOf(calculo_campo_electrico.campo_electrico_carga_aisalada(carga_prueba,distancia)));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "¡Se produjo un error!", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }
}

