package com.andres.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;


public class GeneradorDeArchivos {
    public void guardarJson(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(moneda.base_code()+ ".Json");
        escritura.write(gson.toJson(moneda));
        escritura.close();

    }
}