public class ConvertidorMonedas extends Convertidor {
    private float importe;

    public ConvertidorMonedas(String valorActual, String valorAConvertir, float importe) {
        super(valorActual, valorAConvertir);
        this.importe = importe;
    }

    public ConvertidorMonedas() {
        super();
    }
    public void convertidorDeMonedas(ConvertidorMonedas convertidorMonedas, int opcionMenu) {
        float monedaConvertida = 0;
        switch (opcionMenu){

            case 1:
                monedaConvertida = importe/1200;
                break;
            case 2:
                monedaConvertida = importe/965;
                break;
            case 3:
                monedaConvertida = importe/0.99F;
                break;
            case 4:
                monedaConvertida = importe*1200;
                break;
            case 5:
                monedaConvertida = importe*965;
                break;
            case 6:
                monedaConvertida = importe*0.99F;
                break;
        }
        System.out.println("=================================================================\n"+
                "\n"+
                "El cambio de "+ convertidorMonedas.getValorActual()+" a "+ convertidorMonedas.getValorAConvertir() + " es: $" + monedaConvertida+ " " + convertidorMonedas.getValorAConvertir()+
                "\n"+
                "=================================================================");
    }

    public float getImporte() {
        return this.importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }


}
