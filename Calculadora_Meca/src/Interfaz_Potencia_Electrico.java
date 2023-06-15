import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz_Potencia_Electrico extends JFrame implements ActionListener {

    // Creamos un panel
    JPanel panel = new JPanel();
    // Creamos el menu de barra
    private JMenuBar menuBar;
    private JMenu menu2, menu3;
    private JMenuItem fun_Coulomb, fun_Campo, fun_Gauss;

    // Creamos las etiquetas
    JLabel eti1 = new JLabel();
    JLabel eti2 = new JLabel();
    JLabel eti3 = new JLabel();
    JLabel eti4 = new JLabel();
    JLabel eti5 = new JLabel();

    // Creamos las cajas de texto
    JTextField txt_carga_potencia = new JTextField();
    JTextField txt_distancia = new JTextField();
    JTextField txt_potencial_electrico = new JTextField();

    // Creamos los botones
    JButton btn_potencial_v1 = new JButton();
    JButton btn_potencial_v2 = new JButton();

    // Para usar la clase
    double carga_puntual_var = 0;
    double distancia = 0;
    double potencia_electrico = 0;
    calculo_potencial_electrico calculo_potencial_electrico = new calculo_potencial_electrico(carga_puntual_var,
            distancia, potencia_electrico);

    public Interfaz_Potencia_Electrico() {
        setTitle("Potencial Electrico");
        setSize(600, 240);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarcomponentes();
    }

    public void iniciarcomponentes() {
        panel();
        menuBarra();
        etiquetas();
        cajas_de_texto();
        botones();
    }

    public void panel() {
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }

    public void menuBarra() {
        // Creamos el JMenuBar y lo asociamos con el JFrame
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        /*
         * Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el
         * método add
         */
        /*menu2 = new JMenu("Manual");
        menuBar.add(menu2);*/
        
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

    public void etiquetas() {
        eti1.setText("Carga puntual :");
        eti1.setBounds(20, 0, 500, 30);
        eti1.setFont(new Font("Arial", 0, 15));
        panel.add(eti1);

        eti2.setText("Distancia :");
        eti2.setBounds(20, 35, 500, 30);
        eti2.setFont(new Font("Arial", 0, 15));
        panel.add(eti2);

        /*eti3.setText("Potencial electrico :");
        eti3.setBounds(20, 65, 500, 30);
        eti3.setFont(new Font("Arial", 0, 15));
        panel.add(eti3);*/

        eti4.setText("Resultado :");
        eti4.setBounds(380, 0, 500, 15);
        eti4.setFont(new Font("Arial", 0, 15));
        panel.add(eti4);

        eti5.setText("0.00");
        eti5.setBounds(460, 0, 500, 15);
        eti5.setFont(new Font("Arial", 0, 15));
        panel.add(eti5);
    }

    public void botones() {
        btn_potencial_v1.setText("Potencial de una q puntual");
        btn_potencial_v1.setBounds(20, 110, 190, 30);
        btn_potencial_v1.setBackground(Color.lightGray);
        btn_potencial_v1.addActionListener(this);
        panel.add(btn_potencial_v1);

        btn_potencial_v2.setText("Potencia de varias cargas");
        btn_potencial_v2.setBounds(230, 110, 190, 30);
        btn_potencial_v2.setBackground(Color.lightGray);
        btn_potencial_v2.addActionListener(this);
        panel.add(btn_potencial_v2);
    }

    public void cajas_de_texto() {
        txt_carga_potencia.setBounds(170, 3, 200, 20);
        panel.add(txt_carga_potencia);

        txt_distancia.setBounds(170, 40, 200, 20);
        panel.add(txt_distancia);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fun_Coulomb) {
            Interfaz_Ley_Coulomb abrir = new Interfaz_Ley_Coulomb();
            abrir.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == fun_Campo) {
            Interfaz_Campo_Electrico abrir = new Interfaz_Campo_Electrico();
            abrir.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == fun_Gauss) {
            Interfaz_Potencia_Electrico abrir = new Interfaz_Potencia_Electrico();
            abrir.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == btn_potencial_v1) {
            try{
            carga_puntual_var = Double.parseDouble(txt_carga_potencia.getText());
            distancia = Double.parseDouble(txt_distancia.getText());
            eti5.setText(String.valueOf(calculo_potencial_electrico.Calculo_V_qpuntual(carga_puntual_var, distancia)));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "¡Se produjo un error!", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        }else if(e.getSource() == btn_potencial_v2){
            Interfaz_varias_cargas abrir = new Interfaz_varias_cargas();
            abrir.setVisible(true);
            this.setVisible(false);
        }
    }
}