package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbSalones;
    private JComboBox<String> cbOperadores;

    private JLabel lbNumeroCelular;
    private JTextField tfNumeroCelular;
    private JLabel lbCantidadMinuto;
    private JTextField tfCantidadMinuto;
    private JLabel lbvalorMinuto;
    private JTextField tfvalorMinuto;
    private JLabel lbCostoPlan;
    private JTextField tfCostoPlan;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta Operadores
        lbSalones = new JLabel("Operadores : ", JLabel.RIGHT);
        lbSalones.setBounds(0,55,100,20);
        this.add(lbSalones);

        //Crear y agregar combo lista operadores (claro, movistar, tigo, Wim)
        cbOperadores = new JComboBox<String>();
        cbOperadores.setBounds(150,55,100,20);
        cbOperadores.addItem("Claro");
        cbOperadores.addItem("Movistar");
        cbOperadores.addItem("Tigo");
        cbOperadores.addItem("Wim");
        this.add(cbOperadores);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        //Crear y agregar elementos
        lbNumeroCelular = new JLabel("Numero de celular: ");
        lbNumeroCelular.setBounds(20,20,140,20);
        this.add(lbNumeroCelular);

        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBounds(150,20,100, 25);
        this.add(tfNumeroCelular);

        lbCantidadMinuto = new JLabel("Cantidad de minutos: ");
        lbCantidadMinuto.setBounds(20, 85, 140, 20);
        this.add(lbCantidadMinuto);

        tfCantidadMinuto = new JTextField();
        tfCantidadMinuto.setBounds(150, 85, 100, 25);
        this.add(tfCantidadMinuto);

        lbvalorMinuto = new JLabel("Valor del minuto: ");
        lbvalorMinuto.setBounds(20, 120, 140, 20);
        this.add(lbvalorMinuto);

        tfvalorMinuto = new JTextField();
        tfvalorMinuto.setBounds(150, 120, 100, 25);
        this.add(tfvalorMinuto);

        lbCostoPlan = new JLabel("Costo del plan: ");
        lbCostoPlan.setBounds(20, 155, 140, 20);
        this.add(lbCostoPlan);

        tfCostoPlan = new JTextField();
        tfCostoPlan.setBounds(150, 155, 100, 25);
        this.add(tfCostoPlan);


        


        
    }

    //Metodos de acceso
    public String getSalon()
    {
        return (String) cbSalones.getSelectedItem();
    }

    public int getIndexSalon()
    {
        return cbSalones.getSelectedIndex();
    }

    public void setSalon(String sal)
    {
        cbSalones.addItem(sal);
    }

    //get personas
    public int getPersonas()
    {
        return Integer.parseInt(cbSalones.getSelectedItem().toString());
    }

}
