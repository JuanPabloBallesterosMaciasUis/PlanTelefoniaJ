package modelo;

import java.util.ArrayList;

public class PlanesTele
{

    //----------------------
    // Atributos
    //----------------------
    
    private ArrayList planes;


    //----------------------
    // Metodos
    //----------------------
    public PlanesTele()
    {
        
        planes = new ArrayList();
    }



    public void agregarSalon(PlanTelefonia plan)
    {
        planes.add(plan);
    }

    public  PlanTelefonia getPlan(int i)
    {
        return (PlanTelefonia) planes.get(i);
    }

    //// Calcular el costo total del todos los salones 
    //public double calcularCostoTotal()
    //{
    //    double costoTotal = 0;
    //    for(int i = 0; i < planes.size(); i++)
    //    {
    //        PlanTelefonia plan = (PlanTelefonia) planes.get(i);
    //        costoTotal += plan.getCostoSalon();
    //    }
    //    return costoTotal;
    //}
    
    
    

    





   
}