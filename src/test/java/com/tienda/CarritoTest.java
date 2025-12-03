/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import com.tienda.models.Carrito; //
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    @Test
    void testAgregarProducto() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto("Producto1");
        assertEquals(1, carrito.totalProductos());
    }
}
