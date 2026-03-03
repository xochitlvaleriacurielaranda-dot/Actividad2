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
    public String toString(){
        return "Lote{" +
                "numeroLote=" + noLote +
                ", numeroPiezas=" + noPiezas +
                ", fechaProduccion=" + fechaProduccion +
                '}';
    }
}
