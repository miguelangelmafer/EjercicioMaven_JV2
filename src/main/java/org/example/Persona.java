package org.example;

//creamos la clase persona con sus atributos
public class Persona {
    private String nombre;
    private String poblacion;
    private int edad;

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //creamos el constructor de  persona y le pasamos unos parámetros
    public Persona(String nombre, String poblacion, int edad) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }

//creamos los getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getEdad() {
        return edad;
    }

}