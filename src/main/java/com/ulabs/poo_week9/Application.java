/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_week9;

import com.ulabs.poo_week9.ui.UIBiblioteca;

/**
 *
 * @author manuelguarniz
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UIBiblioteca().setVisible(true);
        });
    }

}
