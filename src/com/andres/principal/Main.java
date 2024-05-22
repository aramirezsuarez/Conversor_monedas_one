package com.andres.principal;

import com.andres.modelos.Conversion;
import com.andres.modelos.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conversion convertir = new Conversion();


        Menu menu = new Menu();
        while (true) {
            try {
                menu.mensaje();
                var valorFinal = convertir.convertirMoneda(Integer.parseInt(lectura.nextLine()));
                if (valorFinal == 7) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Al ingresar un valor real debes de utilizar el \".\"");
                System.out.println("Forma correcta: 3.142");
                System.out.println("Forma incorrecta: 3,142");
            }
            System.out.println("Presiona ENTER para continuar");
            lectura.nextLine();
        }
    }
}