import java.util.Scanner;

public class ConvertidorMedidas extends Convertidor {

    private float valor;

    public ConvertidorMedidas(String valorActual, String valorAConvertir, Integer cantidad) {
        super(valorActual, valorAConvertir);
        this.valor = cantidad;
    }

    public ConvertidorMedidas() {

    }
    public void convertidorLongitud(ConvertidorMedidas convertidorMedidas, int opcionMenu) {
        float medidaConvertida = 0;

        switch (opcionMenu){
            case 1:
                medidaConvertida = valor / 30.48F;
                break;
            case 2:
                medidaConvertida = valor / 2.54F;
                break;
            case 3:
                medidaConvertida = valor * 30.48F;
                break;
            case 4:
                medidaConvertida = valor * 12;
                break;
            case 5:
                medidaConvertida = valor * 2.54F;
                break;
            case 6:
                medidaConvertida = valor / 12;


        }
        mostrarConversion(convertidorMedidas,medidaConvertida);
    }

    public void convertidorMasa(ConvertidorMedidas convertidorMedidas, int opcionMenu){
        float medidaConvertida = 0;

        switch (opcionMenu){
            case 1:
                medidaConvertida = valor * 2.205F;
                break;
            case 2:
                medidaConvertida = valor * 35.274F;
                break;
            case 3:
                medidaConvertida = valor / 2.205F;
                break;
            case 4:
                medidaConvertida = valor * 16;
                break;
            case 5:
                medidaConvertida = valor / 35.274F;
                break;
            case 6:
                medidaConvertida = valor / 16;


        }
        mostrarConversion(convertidorMedidas,medidaConvertida);
    };


    public void convertidorTiempo(ConvertidorMedidas convertidorMedidas, int opcionMenu){

        float medidaConvertida = 0;

        switch (opcionMenu){
            case 1:
                medidaConvertida = valor / 60;
                break;
            case 2:
                medidaConvertida = valor / 3600;
                break;
            case 3:
                medidaConvertida = valor * 60;
                break;
            case 4:
                medidaConvertida = valor / 60;
                break;
            case 5:
                medidaConvertida = valor * 3600;
                break;
            case 6:
                medidaConvertida = valor * 60;


        }
        mostrarConversion(convertidorMedidas,medidaConvertida);

    }


    private void mostrarConversion( ConvertidorMedidas convertidorMedidas, float medidaConvertida) {
        System.out.println( "=================================================================\n"+
                "\n"+
                "El cambio de "+ convertidorMedidas.getValorActual() + " a " + convertidorMedidas.getValorAConvertir() + " es: " + medidaConvertida + " "+ convertidorMedidas.getValorAConvertir()+
                "\n"+
                "=================================================================\n");
    }


    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


}
