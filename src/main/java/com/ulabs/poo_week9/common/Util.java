/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulabs.poo_week9.common;

import java.util.UUID;

/**
 *
 * @author manuelguarniz
 */
public class Util {
    public static String getID() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
