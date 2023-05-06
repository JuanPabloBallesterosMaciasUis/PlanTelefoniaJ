package modelo;

import java.util.ArrayList;

public class PlanTelefonia
{
    //----------------------
    // Constantes
    //----------------------

    //----------------------
    // Atributos
    //----------------------
    private int numeroCelular;
    private String operador;
    private int cantidadMinuto;
    private double valorMinuto;
    private double costoPlan;


    //----------------------
    // Metodos
    //----------------------
    public PlanTelefonia(int pNumeroCelular, String pOperador, int pCantidadMinuto, double pValorMinuto)
    {
        numeroCelular = pNumeroCelular;
        operador = pOperador;
        cantidadMinuto = pCantidadMinuto;
        valorMinuto = pValorMinuto;
    }
    
    public int getNumeroCelular()
    {
        return numeroCelular;
    }

    public String getOperador()
    {
        return operador;
    }

    public int getCantidadMinuto()
    {
        return cantidadMinuto;
    }

    public double getValorMinuto()
    {
        return valorMinuto;
    }

    public double getCostoPlan()
    {
        return costoPlan;
    }

    public void setNumeroCelular(int pNumeroCelular)
    {
        numeroCelular = pNumeroCelular;
    }

    public void setOperador(String pOperador)
    {
        operador = pOperador;
    }

    public void setCantidadMinuto(int pCantidadMinuto)
    {
        cantidadMinuto = pCantidadMinuto;
    }

    public void setValorMinuto(double pValorMinuto)
    {
        valorMinuto = pValorMinuto;
    }

    public void setCostoPlan(double pCostoPlan)
    {
        costoPlan = pCostoPlan;
    }



    ////Calcular el número de meseros
    //public int calcularMeseros()
    //{
    //    if(personas < 50)
    //    {
    //        return 1;
    //    }
    //    else if(personas >= 50 && personas <= 100)
    //    {
    //        return 2;
    //    }
    //    else
    //    {
    //        return 3;
    //    }
    //}

    ////Calcular el costo del salon 
    //public double calcularCostoSalon()
    //{
    //    if(personas <= 50)
    //    {
    //        costoSalon = 1000000 + (1000000 * 0.2);
    //    }
    //    else
    //    {
    //        costoSalon = 1000000 + (1000000 * 0.4);
    //    }
    //    return costoSalon;
    //}

    

}