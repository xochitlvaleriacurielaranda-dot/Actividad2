package problema1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Prenda prenda= new Prenda("Camisa","Algodón", 200, "Masculino", "Verano");
        Lote lote= new Lote(101, 50, LocalDate.now());

        Venta venta= new Venta(prenda, lote);
        System.out.println(prenda);
        System.out.println(lote);
        System.out.println("Precio por pieza: $" + venta.precioPorPrenda());
        System.out.println("Precio por lote: $" + venta.precioPorLote());
        System.out.println("Monto recuperación por prenda: $" + venta.montoRecuperacionPrenda());
        System.out.println("Monto recuperación por lote: $" + venta.montoRecuperacionLote());
        }
    }