import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz_varias_cargas extends JFrame implements ActionListener {
    //Declaramos el panel
    JPanel panel = new JPanel();

    //Declaramos las etiquetas
    JLabel eti1 = new JLabel();
    JLabel eti2 = new JLabel();
    JLabel eti3 = new JLabel();
    JLabel eti4 = new JLabel();
    JLabel eti5 = new JLabel();
    static JLabel eti6 = new JLabel();

    //Declaramos las cajas de texto
    JTextField num_cargas = new JTextField();
    JTextField carga_puntual = new JTextField();
    JTextField distancia = new JTextField();

    //Declaramos los botnes
    JButton btn_cancelar = new JButton();
    JButton btn_sumar = new JButton();

    //Declarar la clase 
    double carga_p;
    double distancia_p;
    double num_cargas_var;
    calculo_varias_cargas calculo_varias_cargas = new calculo_varias_cargas(distancia_p, carga_p);

    public Interfaz_varias_cargas(){
        setTitle("Potencial Electrico");
        setSize(520, 340);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarcomponentes();
    }
    //Para poder agregar los elementos al panel
    public void iniciarcomponentes(){
        panel_propidades();
        etiquetas_propidades();
        cajas_propiedades();
        botones_propiedades();
    }
    //Declaramos las propiedades del panel
    public void panel_propidades(){
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }
    //Propiedades del las etiquetas
    public void etiquetas_propidades(){
        eti1.setText("Sumatoria de Potencial Electrico");
        eti1.setBounds(20, 0, 500, 30);
        eti1.setFont(new Font("arial",0,15));
        panel.add(eti1);

        eti2.setText("Datos:");
        eti2.setBounds(20, 35, 500, 30);
        eti2.setFont(new Font("arial", 0, 15));
        panel.add(eti2);

        eti3.setText("Carga Puntual :");
        eti3.setBounds(20, 65, 500, 30);
        eti3.setFont(new Font("Arial", 0,15));
        panel.add(eti3);

        eti4.setText("Distancia :");
        eti4.setBounds(20, 99, 500, 30);
        eti4.setFont(new Font("arial", 0, 15));
        panel.add(eti4);

        eti5.setText("Resultado :");
        eti5.setBounds(20, 135, 500, 30);
        eti5.setFont(new Font("arial", 0, 15));
        panel.add(eti5);

        eti6.setText("0.00");
        eti6.setBounds(95, 135, 500, 30);
        eti6.setFont(new Font("arial",0,15));
        panel.add(eti6);
    }
    
    //Propiedades de las cajas de texto
    public void cajas_propiedades(){
        /*num_cargas.setBounds(250, 5, 200, 20);
        panel.add(num_cargas);*/

        carga_puntual.setBounds(130, 70, 200,20);
        panel.add(carga_puntual);

        distancia.setBounds(130, 105, 200, 20);
        panel.add(distancia);
    }

    //Declaracion de botones
    public void botones_propiedades(){
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBounds(300, 260, 90, 30);
        btn_cancelar.setBackground(Color.lightGray);
        btn_cancelar.addActionListener(this);
        panel.add(btn_cancelar);

        btn_sumar.setText("Sumar");
        btn_sumar.setBounds(400,260, 90,30);
        btn_sumar.setBackground(Color.lightGray);
        btn_sumar.addActionListener(this);
        panel.add(btn_sumar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_cancelar){
            Interfaz_Potencia_Electrico abrir = new Interfaz_Potencia_Electrico();
            abrir.setVisible(true);
            this.setVisible(false);
        }else if(e.getSource()==btn_sumar){
             try{
            carga_p = Double.parseDouble(carga_puntual.getText());
            distancia_p = Double.parseDouble(distancia.getText());
            eti6.setText(String.valueOf(calculo_varias_cargas.Calculo_V_qpuntual(carga_p, distancia_p)));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "¡Se produjo un error!", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }
}
