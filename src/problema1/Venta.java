package problema1;

public class Venta {
    private Prenda prenda;
    private Lote lote;

    public Venta(Prenda prenda, Lote lote){
        this.prenda=prenda;
        this.lote= lote;
    }

    public double precioPorPrenda(){
        return prenda.getCostoProduccion()*1.15;
    }

    public double precioPorLote(){
        return (prenda.getCostoProduccion()*1.05)* lote.getNoPiezas();
    }

    public double montoRecuperacionPrenda(){
        return prenda.getCostoProduccion()*0.15;
    }

    public double montoRecuperacionLote(){
        return (prenda.getCostoProduccion()*0.05)*lote.getNoPiezas();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venta)) return false;
        Venta venta = (Venta) o;
        return idVenta == venta.idVenta;
    }
    @Override
    public int hashCode() {
        return Objects.hash(idVenta);
    }
    public class Venta implements Comparable<Venta> {
    private double monto;

    @Override
    public int compareTo(Venta otra) {
        return Double.compare(this.monto, otra.monto);
    }
}
