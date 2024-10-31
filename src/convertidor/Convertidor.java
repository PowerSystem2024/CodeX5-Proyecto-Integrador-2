public class Convertidor {
    private String valorActual;
    private String valorAConvertir;

    public Convertidor(String valorActual, String valorAConvertir) {
        this.valorActual = valorActual;
        this.valorAConvertir = valorAConvertir;
    }

    public Convertidor() {

    }

    public String getValorActual() {
        return this.valorActual;
    }

    public void setValorActual(String valorActual) {
        this.valorActual = valorActual;
    }

    public String getValorAConvertir() {
        return this.valorAConvertir;
    }

    public void setValorAConvertir(String valorAConvertir) {
        this.valorAConvertir = valorAConvertir;
    }
}


