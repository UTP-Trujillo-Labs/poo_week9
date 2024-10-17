/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_week9.lib;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manuelguarniz
 */
public class Biblioteca {
    private List<Material> materiales;

    public Biblioteca() {
        this.materiales = new ArrayList<>();
    }
    
    public void agregarMaterial(Material material) {
        this.materiales.add(material);
    }
    
    public boolean eliminarMaterial(Material material) {
        return this.materiales.remove(material);
    }
    
    public void eliminarMaterial(int indexMaterial) {
        this.materiales.remove(indexMaterial);
    }
    
    public boolean eliminarMaterial(String nombre) {
//        this.materiales = this.materiales.stream()
//                .filter(e -> !e.getTitulo().equalsIgnoreCase(nombre))
//                .toList();
        
        Material elementoAEliminar = null;
        for (Material elemento : materiales) {
            if (elemento.getTitulo().equalsIgnoreCase(nombre)) {
                elementoAEliminar = elemento;
            }
        }
        return this.eliminarMaterial(elementoAEliminar);
    }
    
    public String mostrarMateriales() {
        StringBuilder print = new StringBuilder();
        
        this.materiales.forEach(e -> {
            print.append(e.getTituloYAutor());
            print.append("=".repeat(50)).append("\n");
            print.append(e.mostrarInformacion());
            print.append("=".repeat(50)).append("\n");
            print.append("\n");
        });
        return print.toString();
    }
}
