import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz_Potencia_Electrico extends JFrame implements ActionListener {
    // Creamos el menu de barra
    private JMenuBar menuBar;
    private JMenu menu2, menu3;
    private JMenuItem btn_Teoria_Coulomb, btn_Teoria_Campo_E, btn_Teoria_Gauss;
    private JMenuItem fun_Coulomb, fun_Campo, fun_Gauss;

    public Interfaz_Potencia_Electrico() {
        setTitle("Potencial Electrico");
        setSize(700, 340);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarcomponentes();
    }

    public void iniciarcomponentes() {
        menuBarra();
    }

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
        }
    }
}