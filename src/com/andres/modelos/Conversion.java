package com.andres.modelos;

import java.util.Scanner;

public class Conversion {
    private final Menu menu = new Menu();
    private final Scanner lectura = new Scanner(System.in);
    private final Consultas consulta = new Consultas();

    public double convertirMoneda(int opcion) {
        switch (opcion) {
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
                System.out.println("Haz ingresado un valor no valido de la lista...");
                return 0;
        }
    }

    private double realizarConversion(String monedaOrigen, String monedaDestino) {
        menu.mensaje2();
        double cantidad = Double.parseDouble(lectura.nextLine());
        double moneda = consulta.buscaMonedas(monedaOrigen, monedaDestino);
        double valorConvertido = (moneda * cantidad);
        System.out.println("El valor " + cantidad + " [" + monedaOrigen + "]" + " corresponde al valor final de ==> " + valorConvertido + " [" + monedaDestino + "]");
        return valorConvertido;
    }
}
