package com.andres.modelos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consultas {
    public double buscaMonedas(String tipoMoneda, String tipoMoneda2) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/64ede90a6a3e66a76a0deda5/latest/" + tipoMoneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            return conversionRates.get(tipoMoneda).getAsDouble() * conversionRates.get(tipoMoneda2).getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("No se ha encontrado ningun ninguna respuesta");
        }
    }
}