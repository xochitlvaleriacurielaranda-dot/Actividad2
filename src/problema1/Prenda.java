package problema1;
import java.time.LocalDate;
public class Prenda {
    private String modelo;
    private String tela;
    private int costoProduccion;
    private String genero;
    private String temporada;

    public Prenda(String modelo, String tela, int costoProduccion, String genero, String temporada){
         if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede ser nulo o vacío");
        }
        if (tela == null || tela.isEmpty()) {
            throw new IllegalArgumentException("La tela no puede ser nula o vacía");
        }
        if (costoProduccion < 0) {
            throw new IllegalArgumentException("El costo de producción no puede ser negativo");
        }
        if (genero == null || genero.isEmpty()) {
            throw new IllegalArgumentException("El género no puede ser nulo o vacío");
        }
        if (temporada == null || temporada.isEmpty()) {
            throw new IllegalArgumentException("La temporada no puede ser nula o vacía");
        }
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
         if (costoProduccion < 0) {
            throw new IllegalArgumentException("El costo de producción no puede ser negativo");
        }
        this.costoProduccion=costoProduccion;
    }
   @Override
   public boolean equals(Object obj) {
    if (this == obj) return true;
     if (!(obj instanceof Prenda)) return false;
    Prenda prenda = (Prenda) obj;
       if (modelo == null || tela == null || genero == null || temporada == null) {
            throw new NullPointerException("Los atributos de la prenda no pueden ser nulos al comparar");
        }
    return modelo.equals(prenda.modelo) &&
           tela.equals(prenda.tela) &&
           genero.equals(prenda.genero) &&
           temporada.equals(prenda.temporada) &&
           costoProduccion == prenda.costoProduccion;
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(modelo,tela,genero,temporada,costoProduccion);
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
