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
    private JButton btCalcularAgregarPlan;
    private JButton btSalir;
   
    private JButton btEleminar;
;
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
        btCalcularAgregarPlan = new JButton("Calcular costo y guardar");
        btCalcularAgregarPlan.setBounds(90,20,210,20);
        btCalcularAgregarPlan.setActionCommand("costo");
        this.add(btCalcularAgregarPlan);

        //Crear y agregar boton Eleminar
        btEleminar = new JButton("Eliminar");
        btEleminar.setBounds(90,50,210,20);
        btEleminar.setActionCommand("eliminar");
        this.add(btEleminar);

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
        btCalcularAgregarPlan.addActionListener(pAL);
        btEleminar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
  
    }


}
