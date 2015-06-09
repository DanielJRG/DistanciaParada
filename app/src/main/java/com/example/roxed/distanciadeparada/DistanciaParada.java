package com.example.roxed.distanciadeparada;

/**
 * Created by Edy on 1/05/15.
 */

public class DistanciaParada {

    //------------CONSTANTES--------------
    private static final double GRAVEDAD = 9.8; //Expresada en metros sobre segundos cuadrado

    //------------VARIABLES---------------
    public double distanciaParada;
    public double distanciaPercepcionReaccion;
    public double distanciaFrenado;
    public double tiempoPIEV;  //Se expresa en segundos
    public double velocidadInicial; //Expresada en metros por segundo vehículo
    public double coeficienteFriccionLongitudinal;
    public double pendiente; //Puede ser negativa o positiva


    //-----------CONSTRUCTOR----------------
    public DistanciaParada() //Con valores definidos con fines de proyecto
    {
        tiempoPIEV = 2.5;
        pendiente = 0;
    }

    public DistanciaParada(double tiempoPIEV, double pendiente)
    {
        this.tiempoPIEV = tiempoPIEV;
        this.pendiente = pendiente;
    }

    public void calculoDistanciaPercepcionReaccion()
    {
        distanciaPercepcionReaccion = tiempoPIEV * velocidadInicial; //Revisar las unidades
    }

    public void calculoDistanciaFrenado()
    {
        distanciaFrenado = Math.pow(velocidadInicial, 2)/(254 * (coeficienteFriccionLongitudinal + pendiente));
    }


    public void DistanciaParada()
    {
        distanciaParada = distanciaPercepcionReaccion + distanciaFrenado;
    }


    //-----------TO DO---------------
    //Formatear la velocidad inicial y llevarla a metros pro segundo o verificar en que unidades fue ingresada

}
