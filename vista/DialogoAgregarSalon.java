package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class DialogoAgregarSalon extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreSalon;
    private JTextField tfNombreSalon;
    private JLabel lbPersonas;
    private JTextField tfPersonas;
    private JLabel lbHoras;
    private JTextField tfHoras;

 

    private JButton btAgregarSalon;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarSalon()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreSalon = new JLabel("Nombre del salon: ");
        lbNombreSalon.setBounds(20,50,140,20);
        this.add(lbNombreSalon);

        tfNombreSalon = new JTextField();
        tfNombreSalon.setBounds(150,50,100, 25);
        this.add(tfNombreSalon);

        lbPersonas = new JLabel("Numero de personas: ");
        lbPersonas.setBounds(10, 90, 160, 20);
        this.add(lbPersonas);

        tfPersonas= new JTextField();
        tfPersonas.setBounds(150, 90, 100, 25);
        this.add(tfPersonas);

        lbHoras = new JLabel("Horas: ");
        lbHoras.setBounds(20, 130, 140, 20);
        this.add(lbHoras);

        tfHoras = new JTextField();
        tfHoras.setBounds(150, 130, 100, 25);
        this.add(tfHoras);

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
    public String getNombreSalon()
    {
        return tfNombreSalon.getText();
    }

    public String getPersonas()
    {
        return tfPersonas.getText();
    }

    public String getHoras()
    {
        return tfHoras.getText();
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
