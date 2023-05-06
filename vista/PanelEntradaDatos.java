package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbSalones;
    private JComboBox<String> cbSalones;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta salones
        lbSalones = new JLabel("Salones : ", JLabel.RIGHT);
        lbSalones.setBounds(0,75,100,20);
        this.add(lbSalones);

        //Crear y agregar combo lista Salones
        cbSalones = new JComboBox<String>();
        cbSalones.setBounds(100,75,260,20);
        this.add(cbSalones);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
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
