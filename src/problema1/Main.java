package problema1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Prenda prenda1= new Prenda("Camisa","Algodón", 200, "Masculino", "Verano");
        Prenda prenda2= new Prenda("Camisa","Algodón", 200, "Masculino", "Verano");
        Prenda prenda3= new Prenda("Pantalón","Algodón", 500, "Femenino", "Otoño");
        Lote lote= new Lote(101, 50, LocalDate.now());

        Venta venta= new Venta(prenda, lote);
        System.out.println(prenda);
        System.out.println(lote);
        System.out.println("Precio por pieza: $" + venta.precioPorPrenda());
        System.out.println("Precio por lote: $" + venta.precioPorLote());
        System.out.println("Monto recuperación por prenda: $" + venta.montoRecuperacionPrenda());
        System.out.println("Monto recuperación por lote: $" + venta.montoRecuperacionLote());
        System.out.println(prenda1.equals(prenda2));
        System.out.println(prenda1.equals(prenda3));
        System.out.println(prenda1.hashCode() == prenda2.hashCode());
        }
    }
