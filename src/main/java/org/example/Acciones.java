package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class Acciones {

    public ArrayList<Persona> muestraContenido(String archivo) {
        String line = "";
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(archivo));
            while ((line = bf.readLine()) != null) {
                String[] values = line.split(":");
                if (values.length == 3) {
                    Optional <String> poblacion = values[1] == ""? Optional.empty():Optional.of(values[1]);
                    String poblacionDesconida = poblacion.orElse("Desconocido");
                    Persona p = new Persona(values[0], poblacionDesconida, Integer.parseInt(values[2]));
                    listaPersonas.add(p);
                }
            }
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        muestraPersona(listaPersonas);
        return listaPersonas;
    }


    public void muestraPersona(ArrayList<Persona> lista) {
        System.out.println("Personas menores de 25");
        lista.stream().filter(persona -> persona.getEdad()<25).forEach
                (p -> System.out.println("Nombre: " + p.getNombre() + " Población: " + p.getPoblacion() + " Edad: " + p.getEdad()));
    }
}
