package problema1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lote implements Comparable<Lote> {
    private List<Prenda> prendas;

    public Lote() {
        prendas = new ArrayList<>();
    }

    public void agregarPrenda(Prenda prenda) {
        if (prenda == null) {
            throw new NullPointerException("No se puede agregar una prenda nula al lote");
        }
        if (prendas.contains(prenda)) {
            throw new IllegalArgumentException("La prenda ya existe en el lote");
        }
        prendas.add(prenda);
    }

    public Prenda obtenerPrenda(int indice) {
        if (indice < 0 || indice >= prendas.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango al intentar obtener prenda");
        }
        return prendas.get(indice);
    }

    public void eliminarPrenda(int indice) {
        if (prendas.isEmpty()) {
            throw new IllegalStateException("No se puede eliminar, el lote está vacío");
        }
        if (indice < 0 || indice >= prendas.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango al intentar eliminar prenda");
        }
        prendas.remove(indice);
    }

    public int contarPrendas() {
        return prendas.size();
    }

    public int calcularCostoTotal() {
        if (prendas.isEmpty()) {
            throw new IllegalStateException("No se puede calcular costo, el lote está vacío");
        }
        int total = 0;
        for (Prenda p : prendas) {
            if (p == null) {
                throw new NullPointerException("El lote contiene una prenda nula");
            }
            total += p.getCostoProduccion();
        }
        return total;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Lote)) return false;
        Lote lote = (Lote) obj;
        return Objects.equals(prendas, lote.prendas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prendas);
    }

    @Override
    public int compareTo(Lote otro) {
        if (otro == null) {
            throw new NullPointerException("No se puede comparar con un lote nulo");
        }
        return Integer.compare(this.contarPrendas(), otro.contarPrendas());
    }
}

