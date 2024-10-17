/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_week9;

import com.ulabs.poo_week9.lib.Biblioteca;
import com.ulabs.poo_week9.lib.Libro;
import com.ulabs.poo_week9.lib.Material;
import com.ulabs.poo_week9.lib.Revista;

/**
 *
 * @author manuelguarniz
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Material libro = new Libro("Cien años de soledad", "Gabriel GM", "XXX1", 500);
        Material revista = new Revista("Cosas", "XXX", "XXX2", "12-2024");
        Material revista2 = new Revista("Cosas2", "XXX", "XXX2", "12-2024");
        
        biblioteca.agregarMaterial(libro);
        biblioteca.agregarMaterial(revista);
        biblioteca.agregarMaterial(revista2);
        
        System.out.println(biblioteca.mostrarMateriales());
        
        System.out.println("======= borrando... =====");
        biblioteca.eliminarMaterial(revista2);
        biblioteca.eliminarMaterial(0);
        boolean estaBorrado = biblioteca.eliminarMaterial("Cosas");
        
        if (estaBorrado) {
            System.out.println("== borro con exito");
        } else {
            System.out.println("== no encontro el libro");
        }
        
        System.out.println(biblioteca.mostrarMateriales());
    }
}
