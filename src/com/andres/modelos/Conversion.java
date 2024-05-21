package com.andres.modelos;

import java.util.Scanner;

public class Conversion {
    Menu menu = new Menu();
    Scanner lectura = new Scanner(System.in);
    Consultas consulta = new Consultas();

    public int cantidad;
    public String tipoMoneda;
    public String tipoMoneda2;
    private double moneda;
    private float valorConvertido;

    public float ConvertirMoneda(int valor) {
        switch (valor) {
            case 1:
                return realizarConversion("USD", "ARS");
            case 2:
                return realizarConversion("ARS", "USD");
            case 3:
                return realizarConversion("USD", "BRL");
            case 4:
                return realizarConversion("BRL", "USD");
            case 5:
                return realizarConversion("USD", "COP");
            case 6:
                return realizarConversion("COP", "USD");
            case 7:
                System.out.println("FINALIZANDO EL PROGRAMA...");
                return 7;
            default:
                return 0;
        }
    }

    private float realizarConversion(String monedaOrigen, String monedaDestino) {
        menu.mensaje2();
        cantidad = lectura.nextInt();
        tipoMoneda = monedaOrigen;
        tipoMoneda2 = monedaDestino;
        moneda = consulta.buscaMonedas(tipoMoneda, tipoMoneda2);
        valorConvertido = (float) (moneda * cantidad);
        System.out.println("El valor " + cantidad + " [" + tipoMoneda + "]" + " Corresponde al valor final de ==>" + valorConvertido + " [" + tipoMoneda2 + "]");
        return valorConvertido;
    }
}
