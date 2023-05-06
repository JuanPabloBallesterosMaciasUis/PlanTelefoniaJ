package controlador;

import modelo.PlanTelefonia;
import vista.PanelEntradaDatos;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia miPlanTelefonia;
    private PanelEntradaDatos pPanelEntradaDatos;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin,PanelEntradaDatos pPanelEntradaDatos)
    {
        this.venPrin = pVenPrin;
        this.pPanelEntradaDatos = pPanelEntradaDatos;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Calcular costo plan
        if(comando.equals("costo"))
        {
            int numeroCelular = Integer.parseInt(venPrin.miPanelEntradaDatos.getTxtNumeroCelular());
            String operador = venPrin.miPanelEntradaDatos.getTxtOperadores();
            int cantidadMinuto = Integer.parseInt(venPrin.miPanelEntradaDatos.getTxtCantidadMinuto());
            double valorMinuto = Double.parseDouble(venPrin.miPanelEntradaDatos.getTxtValorMinuto());


            miPlanTelefonia = new PlanTelefonia(numeroCelular, operador, cantidadMinuto, valorMinuto);
            
            miPlanTelefonia.calcularCostoPlan();

            venPrin.miPanelEntradaDatos.setTxtCostoPlan(String.valueOf(miPlanTelefonia.getCostoPlan()));

        }

        //Eliminar datos
        if(comando.equals("eliminar"))
        {
            pPanelEntradaDatos.setTxtNumeroCelular("");
            pPanelEntradaDatos.setTxtOperadores("");
            pPanelEntradaDatos.setTxtCantidadMinuto("");
            pPanelEntradaDatos.setTxtValorMinuto("");
            pPanelEntradaDatos.setTxtCostoPlan("");
        }

        


    }
}