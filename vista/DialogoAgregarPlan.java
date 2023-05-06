package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class DialogoAgregarPlan extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNumeroCelular;
    private JTextField tfNumeroCelular;
    private JLabel lbOperador;
    private JTextField tfOperador;
    private JLabel lbCantidadMinuto;
    private JTextField tfCantidadMinuto;
    private JLabel lbvalorMinuto;
    private JTextField tfvalorMinuto;

 

    private JButton btAgregarSalon;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarPlan()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNumeroCelular = new JLabel("Numero de celular: ");
        lbNumeroCelular.setBounds(20,50,140,20);
        this.add(lbNumeroCelular);

        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBounds(150,50,100, 25);
        this.add(tfNumeroCelular);

        lbOperador = new JLabel("Operador ");
        lbOperador.setBounds(10, 90, 160, 20);
        this.add(lbOperador);

        tfOperador= new JTextField();
        tfOperador.setBounds(150, 90, 100, 25);
        this.add(tfOperador);

        lbCantidadMinuto = new JLabel("Cantidad de minutos: ");
        lbCantidadMinuto.setBounds(20, 130, 140, 20);
        this.add(lbCantidadMinuto);

        tfCantidadMinuto = new JTextField();
        tfCantidadMinuto.setBounds(150, 130, 100, 25);
        this.add(tfCantidadMinuto);

        lbvalorMinuto = new JLabel("Valor del minuto: ");
        lbvalorMinuto.setBounds(20, 130, 140, 20);
        this.add(lbvalorMinuto);

        tfvalorMinuto = new JTextField();
        tfvalorMinuto.setBounds(150, 130, 100, 25);
        this.add(tfvalorMinuto);

        btAgregarSalon = new JButton("Agregar");
        btAgregarSalon.setBounds(20,200,260,25);
        btAgregarSalon.setActionCommand("agregar");
        this.add(btAgregarSalon);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Salon");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNumeroCelular()
    {
        return tfNumeroCelular.getText();
    }

    public String getOperador()
    {
        return tfOperador.getText();
    }

    public String getCantidadMinuto()
    {
        return tfCantidadMinuto.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarSalon.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarVendedor()
    {
        this.dispose();
    }
}
