package controlador;

import modelo.PlanTelefonia;
import modelo.PlanesTele;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private PlanesTele planM;
    private PlanTelefonia salon;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, PlanesTele pPlanM)
    {
        this.venPrin = pVenPrin;
        this.planM = pPlanM;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nEmpresaAutomotriz\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar Salon
        if(comando.equals("agregarSalon"))
        {
            venPrin.crearDialogoAgregarPlan();
            this.venPrin.miDialogoAgregarSalon.agregarOyenteBoton(this);
        }

        ////Agregar salón
        //if(comando.equals("agregar"))
        //{ 
        //    String nombre = venPrin.miDialogoAgregarSalon.getNombreSalon();
        //    int personas = Integer.parseInt(venPrin.miDialogoAgregarSalon.getPersonas());
        //    int horas = Integer.parseInt(venPrin.miDialogoAgregarSalon.getHoras());
     //
//
        //    casa.agregarSalon(new PlanTelefonia(nombre, personas, horas));
    //
        //    venPrin.miPanelEntradaDatos.setSalon(nombre);
        //    
        //    venPrin.miPanelResultados.mostrarResultado("Se ha agreado un nuevo Salón. \nNombre: " + nombre+ " "+"\nNumero de personas: " + personas + "\nHoras: " + horas + "\n" );
        //    venPrin.miDialogoAgregarSalon.cerrarDialogoAgregarVendedor();
        //}
//
//
        ////Calcular meseros y el costo del salon
        //if(comando.equals("meseros"))
        //{
        //    int indexSalon = venPrin.miPanelEntradaDatos.getIndexSalon();
        //    PlanTelefonia sal = casa.getSalon(indexSalon);
        //    int meseros = sal.calcularMeseros();
        //    double costo = sal.calcularCostoSalon();
        //    venPrin.miPanelResultados.mostrarResultado("El número de meseros para el salón es: " + meseros + "\nEl costo del salón es: " + costo);
//
        //}
 //
        ////Calcular las ventas totales de todos los salones
        //if(comando.equals("ventas"))
        //{
        //    double ventas = casa.calcularCostoTotal();
        //    venPrin.miPanelResultados.mostrarResultado("Las ventas totales de todos los salones son: " + ventas);
        //}
        
       
        
        




        
        

                
    }
}