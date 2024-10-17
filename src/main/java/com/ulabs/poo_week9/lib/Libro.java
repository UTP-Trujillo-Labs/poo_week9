/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_week9.lib;

/**
 *
 * @author manuelguarniz
 */
public class Libro implements Material {
    private String titulo;
    private String autor;
    private String codigo;
    private int numeroPaginas;

    public Libro() {}
    public Libro(String titulo, String autor, String codigo, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    

    @Override
    public String getTituloYAutor() {
        return String.format("%S (autor: %s)\n", this.getTitulo(), this.getAutor());
    }

    @Override
    public String mostrarInformacion() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("[LIBRO] titulo: %s\n"
                + "autor: %s\n"
                + "codigo: %s\n"
                + "numero de paginas: %s\n", titulo, autor, codigo, numeroPaginas);
    }
    
    
}
