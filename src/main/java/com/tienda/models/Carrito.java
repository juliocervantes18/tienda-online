/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.models;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<String> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    public int totalProductos() {
        return productos.size();
    }
}
