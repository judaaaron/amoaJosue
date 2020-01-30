package personalmio;

import java.awt.Color;

public class Empleados {

    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private double altura, peso;
    private String titulo, cargo;

    public Empleados() {

    }

    public Empleados(String nombre, String apellido, int edad, char genero, double altura, double peso, String titulo, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.titulo = titulo;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {

        return " " + "nombre = " + nombre + "|| apellido = " + apellido + "|| edad = " + edad + " genero = " + genero + " altura = " + altura + " peso = " + peso + " titulo = " + titulo + " cargoo = " + cargo;
    }

}
