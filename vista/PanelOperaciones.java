package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btAgregarSalon;
    private JButton btSalir;
    private JButton btCostoTotal;
    private JButton btMeseros;
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton Agregar plan
        btAgregarSalon = new JButton("Agregar plan");
        btAgregarSalon.setBounds(90,20,210,20);
        btAgregarSalon.setActionCommand("agregarSalon");
        this.add(btAgregarSalon);

        //Crear y agregar boton costo del plan
        btMeseros = new JButton("Calcular costo del plan");
        btMeseros.setBounds(90,50,210,20);
        btMeseros.setActionCommand("costoPlan");
        this.add(btMeseros);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(90,80,210,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);


        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarSalon.addActionListener(pAL);
        btCostoTotal.addActionListener(pAL);
        btSalir.addActionListener(pAL);
        btMeseros.addActionListener(pAL);
    }


}
