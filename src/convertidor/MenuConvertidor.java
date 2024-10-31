import java.util.Scanner;

public class MenuConvertidor {
    //-------------------MENU GENERAL DE CONVERTIDOR-------------------
    public static void menuConvertidor() {

        System.out.println("+=============================+");
        System.out.println("|         CONVERTIDOR         |");
        System.out.println("+=============================+");
        System.out.println("| 1. Convertir Monedas        |");
        System.out.println("|                             |");
        System.out.println("| 2. Convertir Medidas        |");
        System.out.println("|                             |");
        System.out.println("| 3. Salir del Convertidor    |");
        System.out.println("|                             |");
        System.out.println("+=============================+");
        int opcionMenu = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcionMenu<=0 || opcionMenu>3) {
            opcionMenu = scanner.nextInt();
        }
        switch (opcionMenu){
            case 1:
                menuConvertidorMonedas();
                break;
            case 2:
                menuConvertidorMedidas();
                break;
            case 3:
                MainMenu.main(new String[0]); // Regresa al menú principal
                break;
        }

    }
    //-------------------MENU DE CONVERTIDOR DE MONEDAS-------------------
    private static void menuConvertidorMonedas() {

        System.out.println(
                "=================================================================\n"+
                "      ******** BIENVENIDO AL CONVERTIDOR DE MONEDAS******** \n"+
                "                 Seleccione la opcion del menu :\n" +
                "\n" +
                "  1-  Convertir de Peso A Dolar\n" +
                "  2-  Convertir de Peso A Euro\n" +
                "  3-  Convertir de Peso a Peso Chileno \n" +
                "  4-  Convertir de Dolar A Peso \n" +
                "  5-  Convertir de Euro A Peso\n" +
                "  6-  Convertir de Peso Chileno A Peso\n" +
                "  7-  Menu anterior\n"+
                "=================================================================");

        int opcionMenu = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcionMenu<=0 || opcionMenu>7) {
            opcionMenu = scanner.nextInt();
        }
        if (opcionMenu > 0 && opcionMenu < 7) {
            int importe = 0;
            ConvertidorMonedas convertidorMonedas = new ConvertidorMonedas();

            convertidorMonedas.setValorActual(obtenerValorActualMoneda(opcionMenu));
            convertidorMonedas.setValorAConvertir(obtenerValorAConvertirMoneda(opcionMenu));

            System.out.println("Ingrese los " + convertidorMonedas.getValorActual() + " a convertir");
            importe = scanner.nextInt();
            convertidorMonedas.setImporte(importe);
            convertidorMonedas.convertidorDeMonedas(convertidorMonedas, opcionMenu);
            menuConvertidorMonedas();
        }else  {
            menuConvertidor();
        }
        
    }

    //-------------------MENU DE CONVERTIDOR DE MEDIDAS-------------------
    private static void menuConvertidorMedidas() {

        System.out.println(
        "=================================================================\n"+
        "     ******** BIENVENIDO AL CONVERTIDOR DE MEDIDAS ********\n"+
        "  1. Para cambiar convertir medidas de longitud\n"+
        "  2. Para cambiar convertir medidas de masa\n"+
        "  3. Para cambiar convertir medidas de tiempo\n"+
        "  4. Para ir al menu anterior\n"+
        "================================================================="
       );
        int opcionMenu = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcionMenu<=0 || opcionMenu>4) {
            opcionMenu = scanner.nextInt();
        }
        switch (opcionMenu){
            case 1:
                menuConvertidorLongitud();
                break;
            case 2:
                menuConvertidorMasa();
                break;
            case 3:
                menuConvertidorTiempo();
                break;
            case 4:
                MenuConvertidor.menuConvertidor();
                break;

        }

    }
    private static void menuConvertidorLongitud() {
        System.out.println("=================================================================\n" +
                "     ******** BIENVENIDO AL CONVERTIDOR DE LONGITUD ********\n"+
                "  1. Para cambiar de centimetros a pies\n" +
                "  2. Para cambiar de centimetros a pulgadas\n" +
                "  3. Para cambiar de pies a centimetros\n" +
                "  4. Para cambiar de pies a pulgadas\n" +
                "  5. Para cambiar de pulgadas a centimetros\n" +
                "  6. Para cambiar de pulgadas a pies\n" +
                "  7. Para ir al menu anterior\n" +
                "================================================================="
        );
        int opcionMenu = 0;
        Scanner scanner1 = new Scanner(System.in);
        while (opcionMenu<=0 || opcionMenu>7) {
            opcionMenu = scanner1.nextInt();
        }
        if (opcionMenu > 0 && opcionMenu < 7) {
            float valor = 0;
            ConvertidorMedidas convertidorMedidas = new ConvertidorMedidas();
            convertidorMedidas.setValorActual(obtenerValorActualLong(opcionMenu));
            convertidorMedidas.setValorAConvertir(obtenerValorAConvertirLong(opcionMenu));
            System.out.println("Ingrese la cantidad de "+ convertidorMedidas.getValorActual()+" a convertir");
            valor = scanner1.nextFloat();
            convertidorMedidas.setValor(valor);
            convertidorMedidas.convertidorLongitud(convertidorMedidas, opcionMenu);
            menuConvertidorLongitud();
        }else {
            menuConvertidorMedidas();
        }
    }



    private static void menuConvertidorMasa() {
        System.out.println( "=================================================================\n"+
                        "     ******** BIENVENIDO AL CONVERTIDOR DE MASA ********\n"+
        "  1. Para cambiar de kilos a libras\n"+
        "  2. Para cambiar de kilos a onzas\n"+
        "  3. Para cambiar de libras a kilos\n"+
        "  4. Para cambiar de libras a onzas\n"+
        "  5. Para cambiar de onzas a kilos\n"+
        "  6. Para cambiar de onzas a libras\n"+
        "  7. Para ir al menu anterior\n" +
                "================================================================="
        );
        int opcionMenu = 0;
        Scanner scanner1 = new Scanner(System.in);
        while (opcionMenu<=0 || opcionMenu>7) {
            opcionMenu = scanner1.nextInt();
        }
        if (opcionMenu > 0 && opcionMenu < 7) {
            float valor = 0;
            ConvertidorMedidas convertidorMedidas = new ConvertidorMedidas();
            convertidorMedidas.setValorActual(obtenerValorActualMasa(opcionMenu));
            convertidorMedidas.setValorAConvertir(obtenerValorAConvertirMasa(opcionMenu));
            System.out.println("Ingrese la cantidad de "+ convertidorMedidas.getValorActual()+" a convertir");
            valor = scanner1.nextFloat();
            convertidorMedidas.setValor(valor);
            convertidorMedidas.convertidorMasa(convertidorMedidas, opcionMenu);
            menuConvertidorMasa();
        } else {
            menuConvertidorMedidas();
        }

    }

    private static void menuConvertidorTiempo() {
        System.out.println( "=================================================================\n"+
                "     ******** BIENVENIDO AL CONVERTIDOR DE TIEMPO ********\n"+
                "  1. Para cambiar de segundos a minutos\n"+
                "  2. Para cambiar de segundos a horas\n"+
                "  3. Para cambiar de minutos a segundos\n"+
                "  4. Para cambiar de minutos a horas\n"+
                "  5. Para cambiar de horas a segundos\n"+
                "  6. Para cambiar de horas a minutos\n"+
                "  7. Para ir al menu anterior\n" +
                "================================================================="
        );
        int opcionMenu = 0;
        Scanner scanner1 = new Scanner(System.in);
        while (opcionMenu<=0 || opcionMenu>7) {
            opcionMenu = scanner1.nextInt();
        }
        if (opcionMenu > 0 && opcionMenu < 7) {
            float valor = 0;
            ConvertidorMedidas convertidorMedidas = new ConvertidorMedidas();
            convertidorMedidas.setValorActual(obtenerValorActualTiempo(opcionMenu));
            convertidorMedidas.setValorAConvertir(obtenerValorAConvertirTiempo(opcionMenu));
            System.out.println("Ingrese la cantidad de "+ convertidorMedidas.getValorActual()+" a convertir");
            valor = scanner1.nextFloat();
            convertidorMedidas.setValor(valor);
            convertidorMedidas.convertidorTiempo(convertidorMedidas, opcionMenu);
            menuConvertidorTiempo();
        } else {
            menuConvertidorMedidas();
        }
    }
    //-------- SETEO DE MEDIDAS SEGUN OPCION DE CADA MENU DE MONEDAS ----------------
    private static String obtenerValorAConvertirMoneda(int opcionMenu) {
        String moneda="";
        switch (opcionMenu){
            case 1:
                moneda="Dolares";
                break;
            case 2:
                moneda="Euros";
                break;
            case 3:
                moneda = "Pesos Chilenos";
                break;
            case 4,5,6:
                moneda="Pesos";
                break;
        }
        return moneda;
    }

    private static String obtenerValorActualMoneda(int opcionMenu) {
        String moneda="";
        switch (opcionMenu){
            case 1,2,3:
                moneda="Pesos";
                break;
            case 4:
                moneda="Dolares";
                break;
            case 5:
                moneda="Euros";
                break;
            case 6:
                moneda = "Pesos Chilenos";
                break;
        }
        return moneda;
    }

    //------------------- SETEO DE MEDIDAS SEGUN OPCION DE CADA MENU DE MEDIDAS -------------------
    private static String obtenerValorActualLong(int opcionMenu) {
        String medida="";
        switch (opcionMenu){
            case 1,2:
                medida="Centimetros";
                break;
            case 3,4 :
                medida="Pies";
                break;
            case 5,6 :
                medida = "Pulgadas";
                break;
        }
        return medida;
    }
    private static String obtenerValorAConvertirLong(int opcionMenu) {
        String medida="";
        switch (opcionMenu){
            case 1,6:
                medida="Pies";
                break;
            case 2,4 :
                medida="Pulgadas";
                break;
            case 3,5 :
                medida = "Centimetros";
                break;
        }
        return medida;
    }

    private static String obtenerValorActualMasa(int opcionMenu) {
        String medida="";
        switch (opcionMenu){
            case 1,2:
                medida="Kilos";
                break;
            case 3,4 :
                medida="Libras";
                break;
            case 5,6 :
                medida = "Onzas";
                break;
        }
        return medida;
    }
    private static String obtenerValorAConvertirMasa(int opcionMenu) {
        String medida="";
        switch (opcionMenu){
            case 1,6:
                medida="Libras";
                break;
            case 2,4 :
                medida="Onzas";
                break;
            case 3,5 :
                medida = "Kilos";
                break;
        }
        return medida;
    }


    private static String obtenerValorActualTiempo(int opcionMenu) {
        String medida="";
        switch (opcionMenu){
            case 1,2:
                medida="Segundos";
                break;
            case 3,4 :
                medida="Minutos";
                break;
            case 5,6 :
                medida = "Horas";
                break;
        }
        return medida;
    }
    private static String obtenerValorAConvertirTiempo(int opcionMenu) {
        String medida="";
        switch (opcionMenu){
            case 1,6:
                medida="Minutos";
                break;
            case 2,4 :
                medida="Horas";
                break;
            case 3,5 :
                medida = "Segundos";
                break;
        }
        return medida;
    }


}
