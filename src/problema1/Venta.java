package problema1;
import java.util.Objects;
public class Venta implements Comparable<Venta>{
    private int idVenta;
    private Prenda prenda;
    private Lote lote;

    public Venta(Prenda prenda, Lote lote, int idVenta){
        this.idVenta=idVenta;
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
    @Override
    public int compareTo(Venta otra) {
        return Double.compare(this.precioPorLote(), otra.precioPorLote());
    }
    @Override
    public String toString() {
        return "Venta{" +
               "idVenta=" + idVenta +
               ", prenda=" + prenda +
               ", lote=" + lote +
               '}';
    }
}
