package problema1;

public class Main {
    public static void main(String[] args) {
        try {
            // Declaramos las prendas
            Prenda camisa = new Prenda("Camisa", "Algodón", 150, "Unisex", "Verano");
            Prenda pantalon = new Prenda("Pantalón", "Mezclilla", 300, "Masculino", "Invierno");

            // generamosun lote a cada prenda
            Lote lote = new Lote();
            lote.agregarPrenda(camisa);
            lote.agregarPrenda(pantalon);

            System.out.println("Número de prendas en el lote: " + lote.contarPrendas());
            System.out.println("Costo total del lote: " + lote.calcularCostoTotal());

            
            Venta venta = new Venta(camisa, 2, 250.0);
            System.out.println("Total de la venta: " + venta.calcularTotal());

         
            Venta otraVenta = new Venta(pantalon, 1, 400.0);
            int comparacion = venta.compareTo(otraVenta);
            if (comparacion < 0) {
                System.out.println("La primera venta es menor que la segunda.");
            } else if (comparacion > 0) {
                System.out.println("La primera venta es mayor que la segunda.");
            } else {
                System.out.println("Ambas ventas son iguales en total.");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Error de argumento: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Error de referencia nula: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error de índice: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("Error de estado: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}
