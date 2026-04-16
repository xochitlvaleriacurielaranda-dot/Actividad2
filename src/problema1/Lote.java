package problema1;
import java.time.LocalDate;
public class Lote {
    private int noLote;
    private int noPiezas;
    private LocalDate fechaProduccion;

    public Lote(int noLote, int noPiezas, LocalDate fechaProduccion){
        this.noLote=noLote;
        this.noPiezas=noPiezas;
        this.fechaProduccion=fechaProduccion;
    }

    public int getNoPiezas(){
        return noPiezas;
    }
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lote)) return false;
        Lote lote = (Lote) o;
        return noLote == lote.noLote;
    }
     @Override
    public int hashCode() {
        return Objects.hash(noLote);
    }
     @Override
    public int compareTo(Lote otro) {
        return Integer.compare(this.noPiezas, otro.noPiezas));
    }
    @Override
    public String toString(){
        return "Lote{" +
                "numeroLote=" + noLote +
                ", numeroPiezas=" + noPiezas +
                ", fechaProduccion=" + fechaProduccion +
                '}';
    }
}
