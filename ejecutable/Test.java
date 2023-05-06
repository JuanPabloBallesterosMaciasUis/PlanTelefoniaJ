package ejecutable;

import controlador.Controlador;
import modelo.PlanTelefonia;
import modelo.PlanesTele;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanesTele misPlanes = new PlanesTele();
        Controlador miControlador = new Controlador(miVentana, misPlanes);
    }    
}
