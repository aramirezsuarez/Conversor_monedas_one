
package com.andres.modelos;

public class Menu {
    public void Mensaje(){
        System.out.println("""
                ********************************************//**********************************************************
                Sea Bienvenido(a) al conversor de monedas
                1) Conversor de Dolar ==> Peso Argentino.
                2) Conversor de Peso Argentino ==> Dolar.
                3) Conversor de Dolar ==> Real Brasileno.
                4) Conversor de Real Brasileno ==> Dolar.
                5) Conversor de Dolar ==> Peso Colombiano.
                6) Conversor de Peso Colombiano ==> Dolar.
                7) Salir
                 ********************************************//**********************************************************
                 ¿Que Opcion Desea Elegir?==>""");
    }
    public void mensaje2(){
        System.out.println("""
                ¿Cuanta Cantidad Desea que Realice la conversion?""");
    }


}