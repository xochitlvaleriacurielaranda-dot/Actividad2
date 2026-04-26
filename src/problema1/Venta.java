package problema1;

import java.util.Objects;

public class Venta implements Comparable<Venta> {
    private Prenda prenda;
    private int cantidad;
    private double precioUnitario;

    public Venta(Prenda prenda, int cantidad, double precioUnitario) {
        if (prenda == null) {
            throw new NullPointerException("La prenda de la venta no puede ser nula");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        if (precioUnitario <= 0) {
            throw new IllegalArgumentException("El precio unitario debe ser mayor que cero");
        }

        this.prenda = prenda;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario <= 0) {
            throw new IllegalArgumentException("El precio unitario debe ser mayor que cero");
        }
        this.precioUnitario = precioUnitario;
    }

    public double calcularTotal() {
        if (cantidad <= 0) {
            throw new IllegalStateException("No se puede calcular el total con cantidad inválida");
        }
        return cantidad * precioUnitario;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venta)) return false;
        Venta venta = (Venta) obj;
        return cantidad == venta.cantidad &&
               Double.compare(venta.precioUnitario, precioUnitario) == 0 &&
               Objects.equals(prenda, venta.prenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenda, cantidad, precioUnitario);
    }

    @Override
    public int compareTo(Venta otra) {
        if (otra == null) {
            throw new NullPointerException("No se puede comparar con una venta nula");
        }
        // Comparación por el total de la venta
        return Double.compare(this.calcularTotal(), otra.calcularTotal());
    }
}
