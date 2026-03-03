package problema1;
import java.time.LocalDate;
public class Prenda {
    private String modelo;
    private String tela;
    private int costoProduccion;
    private String genero;
    private String temporada;

    public Prenda(String modelo, String tela, int costoProduccion, String genero, String temporada){
        this.modelo=modelo;
        this.tela=tela;
        this.costoProduccion=costoProduccion;
        this.genero=genero;
        this.temporada=temporada;
    }

    public int getCostoProduccion(){
        return costoProduccion;
    }

    public void setCostoProduccion(int costoProduccion){
        this.costoProduccion=costoProduccion;
    }
    @Override
    public String toString(){
        return "Prenda{"+
                " modelo= '"+modelo+'\''+
                ", tela= '"+tela+'\''+
                ", costoProduccion= "+costoProduccion+
                ", genero= '"+genero+'\''+
                ", temporada= '"+temporada+'\''+
                '}';
    }
}
