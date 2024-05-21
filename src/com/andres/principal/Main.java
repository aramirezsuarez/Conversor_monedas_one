package com.andres.principal;

import com.andres.modelos.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Consultas consulta = new Consultas();
        Conversion convertir = new Conversion();

        try {
            Menu menu = new Menu();
            while (true){
                menu.Mensaje();
                var valorFinal = convertir.ConvertirMoneda(lectura.nextInt());
                Thread.sleep(2000);
                if (valorFinal == 7){
                    break;
                }


            }
        }catch (RuntimeException e){
            System.out.println("Se Detecto un error...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}