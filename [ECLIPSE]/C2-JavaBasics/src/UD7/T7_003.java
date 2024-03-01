package UD7;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class T7_003 {

    public static class Producto {
        private double precio;
        private int stock;

        public Producto(double precio, int stock) {
            this.precio = precio;
            this.stock = stock;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        @Override
        public String toString() {
            return "Precio: " + precio + "€, Stock: " + stock;
        }
    }

    public static void main(String[] args) {

    	 HashMap<String, Producto> inventario = new HashMap<>();
         // Agregar productos al inventario con precio y stock
         inventario.put("Leche", new Producto(3, 94));
         inventario.put("Huevos", new Producto(4, 20));
         inventario.put("Pan", new Producto(2, 30));
         inventario.put("Agua", new Producto(2, 100));
         inventario.put("Libro", new Producto(2, 10));
         inventario.put("Camiseta", new Producto(2, 20));
         inventario.put("Vino", new Producto(2, 33));
         inventario.put("Aceite", new Producto(2, 23));
         inventario.put("Cacaolat", new Producto(2, 43));
         inventario.put("Heura", new Producto(2, 14));
         
         
         // Solicitar al usuario el nombre del producto
         String nombreProducto = JOptionPane.showInputDialog("Introduce el nombre del producto:");
         
         // Obtener información del producto solicitado
         Producto producto = inventario.get(nombreProducto);

         // Verificar si el producto existe en el inventario
         if (producto != null) {
             // Mostrar información del producto
             JOptionPane.showMessageDialog(null, "Información de " + nombreProducto + ": " + producto);
         } else {
             JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }

        System.out.println(inventario);
    }
}
