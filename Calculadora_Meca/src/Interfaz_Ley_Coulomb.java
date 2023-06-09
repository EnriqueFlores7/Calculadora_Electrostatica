import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

public class Interfaz_Ley_Coulomb extends JFrame implements ActionListener {
    // Creamos el menu de barra
    private JMenuBar menuBar;
    private JMenu menu2, menu3;
    private JMenuItem btn_Teoria_Coulomb, btn_Teoria_Campo_E, btn_Teoria_Gauss;
    private JMenuItem fun_Coulomb, fun_Campo, fun_Gauss;
    // Declaramos los elementos de la ley de coulomb
    JPanel panel = new JPanel();
    // Etiquetas de la ventana
    JLabel eti1 = new JLabel();
    JLabel eti2 = new JLabel();
    JLabel eti3 = new JLabel();
    JLabel eti4 = new JLabel();
    JLabel eti5 = new JLabel();
    JLabel eti6 = new JLabel();
    JLabel eti7 = new JLabel();
    JLabel eti8 = new JLabel();
    // Declaramos las cajas de texto
    JTextField txt_fuerza_electrica = new JTextField();
    JTextField txt_carga_electricaq1 = new JTextField();
    JTextField txt_carga_electricaq2 = new JTextField();
    JTextField txt_distancia = new JTextField();
    // Declaramos los botones para dar la funciónes
    JButton btn_fuerza_electrica = new JButton();
    JButton btn_carga_electricaq1 = new JButton();
    JButton btn_carga_electricaq2 = new JButton();
    JButton btn_distancia = new JButton();
    // Creamos variables para la funciónes
    double fuerza_electrica = 0;
    double carga_electricaq1 = 0;
    double carga_electricaq2 = 0;
    double distancia;
    double var1 = 0;
    // Llamamos a la clase
    ley_de_coulomb ley_de_coulomb = new ley_de_coulomb(fuerza_electrica, carga_electricaq1, carga_electricaq2,distancia);
    // Declaramos las propiedades de la interfas
    public Interfaz_Ley_Coulomb() {
        setTitle("Ley de Coulomb");
        setSize(720, 340);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarcomponentes();
    }
    // Para iniciar mostrar los componentes en la ventana
    private void iniciarcomponentes() {
        panel_int();
        menuBarra();
        etiquetas();
        cajas_de_texto();
        botones_funciones();
    }
    //Declaracion de las propiedades del menu de barra
    public void panel_int() {
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }
    //Declaracion de las propiedades del menu de barra
    public void menuBarra() {
        // Creamos el JMenuBar y lo asociamos con el JFrame
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        /*
         * Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el
         * método add
         */
        menu2 = new JMenu("Teoria");
        menuBar.add(menu2);
        menu3 = new JMenu("Funciones");
        menuBar.add(menu3);
        // Las opciones del menu
        // Para abrir las funciones de la calculadora
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
    //Declaracion de las propiedades de las etiquetas
    public void etiquetas() {
        eti1.setText("¿Que datos tienes?");
        eti1.setBounds(20, 0, 500, 30);
        eti1.setFont(new Font("arial", 0, 15));
        panel.add(eti1);

        eti2.setText("Fuerza electrica :");
        eti2.setBounds(20, 35, 500, 30);
        eti2.setFont(new Font("arial", 0, 15));
        panel.add(eti2);

        eti3.setText("Carga electrica :");
        eti3.setBounds(20, 65, 500, 30);
        eti3.setFont(new Font("arial", 0, 15));
        panel.add(eti3);

        eti4.setText("Carga electrica :");
        eti4.setBounds(20, 99, 500, 30);
        eti4.setFont(new Font("arial", 0, 15));
        panel.add(eti4);

        eti5.setText("Distancia :");
        eti5.setBounds(20, 130, 500, 30);
        eti5.setFont(new Font("arial", 0, 15));
        panel.add(eti5);

        eti6.setText("¿Que queremos calcular?");
        eti6.setBounds(20, 165, 500, 30);
        eti6.setFont(new Font("arial", 0, 15));
        panel.add(eti6);

        eti7.setText("Resultado :");
        eti7.setBounds(370, 0, 500, 30);
        eti7.setFont(new Font("arial", 0, 15));
        panel.add(eti7);

        eti8.setText("0.00");
        eti8.setBounds(450, 0, 500, 30);
        eti8.setFont(new Font("arial", 0, 15));
        panel.add(eti8);
    }
    //Declaracion de las propiedades de las cajas de texto
    public void cajas_de_texto() {
        txt_fuerza_electrica.setBounds(170, 40, 200, 20);
        panel.add(txt_fuerza_electrica);

        txt_carga_electricaq1.setBounds(170, 69, 200, 20);
        panel.add(txt_carga_electricaq1);

        txt_carga_electricaq2.setBounds(170, 105, 200, 20);
        panel.add(txt_carga_electricaq2);

        txt_distancia.setBounds(170, 135, 200, 20);
        panel.add(txt_distancia);
    }
    // Declaracion de las propiedades de los botones
    public void botones_funciones() {
        btn_fuerza_electrica.setText("Fuerza Electrica");
        btn_fuerza_electrica.setBounds(20, 210, 150, 30);
        btn_fuerza_electrica.setBackground(Color.lightGray);
        btn_fuerza_electrica.addActionListener(this);
        panel.add(btn_fuerza_electrica);

        btn_carga_electricaq1.setText("Carga Electrica");
        btn_carga_electricaq1.setBounds(190, 210, 150, 30);
        btn_carga_electricaq1.setBackground(Color.lightGray);
        btn_carga_electricaq1.addActionListener(this);
        panel.add(btn_carga_electricaq1);

        btn_carga_electricaq2.setText("Carga Electrica");
        btn_carga_electricaq2.setBounds(360, 210, 150, 30);
        btn_carga_electricaq2.setBackground(Color.lightGray);
        btn_carga_electricaq2.addActionListener(this);
        panel.add(btn_carga_electricaq2);

        btn_distancia.setText("Distancia");
        btn_distancia.setBounds(530, 210, 150, 30);
        btn_distancia.setBackground(Color.lightGray);
        btn_distancia.addActionListener(this);
        panel.add(btn_distancia);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fun_Coulomb) {
            Interfaz_Ley_Coulomb abrir = new Interfaz_Ley_Coulomb();
            abrir.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == fun_Campo) {
            Interfaz_CE abrir = new Interfaz_CE();
            abrir.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == fun_Gauss) {
            Interfaz_Potencia_Electrico abrir = new Interfaz_Potencia_Electrico();
            abrir.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == btn_fuerza_electrica) {
            carga_electricaq1 = Double.parseDouble(txt_carga_electricaq1.getText());
            carga_electricaq2 = Double.parseDouble(txt_carga_electricaq2.getText());
            distancia = Double.parseDouble(txt_distancia.getText());
            eti8.setText(String.valueOf(
                    ley_de_coulomb.Fuerza_Electrica_calculo(carga_electricaq1, carga_electricaq2, distancia)));
        } else if (e.getSource() == btn_carga_electricaq1) {
            // Para cuando las cargas son iguales a cero
            if (txt_carga_electricaq1.getText().equals("") && txt_carga_electricaq2.getText().equals("")) {
                // System.out.println("Cargas son iguales");
                fuerza_electrica = Double.parseDouble(txt_fuerza_electrica.getText());
                distancia = Double.parseDouble(txt_distancia.getText());
                eti8.setText(String.valueOf(ley_de_coulomb.Carga_electrica_q1_calculo(fuerza_electrica, distancia)));
            } else {
                // System.out.println("Cargas no iguales");
                fuerza_electrica = Double.parseDouble(txt_fuerza_electrica.getText());
                distancia = Double.parseDouble(txt_distancia.getText());
                carga_electricaq2 = Double.parseDouble(txt_carga_electricaq2.getText());
                eti8.setText(String.valueOf(ley_de_coulomb.CargaCalculo(fuerza_electrica, carga_electricaq2, distancia)));
            }
        } else if (e.getSource() == btn_carga_electricaq2) {
            if (txt_carga_electricaq1.getText().equals("") && txt_carga_electricaq2.getText().equals("")) {
                // System.out.println("Cargas son iguales");
                fuerza_electrica = Double.parseDouble(txt_fuerza_electrica.getText());
                distancia = Double.parseDouble(txt_distancia.getText());
                eti8.setText(String.valueOf(ley_de_coulomb.Carga_electrica_q1_calculo(fuerza_electrica, distancia)));
            } else {
                fuerza_electrica = Double.parseDouble(txt_fuerza_electrica.getText());
                distancia = Double.parseDouble(txt_distancia.getText());
                carga_electricaq1 = Double.parseDouble(txt_carga_electricaq1.getText());
                eti8.setText(
                        String.valueOf(ley_de_coulomb.CargaCalculo(fuerza_electrica, carga_electricaq1, distancia)));
            }
        } else if (e.getSource() == btn_distancia) {
            fuerza_electrica = Double.parseDouble(txt_fuerza_electrica.getText());
            carga_electricaq1 = Double.parseDouble(txt_carga_electricaq1.getText());
            carga_electricaq2 = Double.parseDouble(txt_carga_electricaq2.getText());
            eti8.setText(
                    String.valueOf(ley_de_coulomb.Distancia(fuerza_electrica, carga_electricaq1, carga_electricaq2)));
        }
    }
}
