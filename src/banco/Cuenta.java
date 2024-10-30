package banco;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Operación exitosa, usted retiró el monto de $" + monto);
            System.out.println("Dinero actual en su cuenta: $" + saldo);
        } else {
            System.out.println("Operación rechazada, fondos insuficientes.");
        }
    }

    public void ingresar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Operación realizada con éxito. Saldo actual en su cuenta: $" + saldo);
        } else {
            System.out.println("Operación rechazada, el monto a ingresar debe ser superior a $0.");
        }
    }

    public void transferir(double monto, String alias) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Transferencia exitosa de $" + monto + ", a la cuenta " + alias + ".");
        } else {
            System.out.println("Saldo insuficiente. Su saldo actual es de: $" + saldo);
        }
    }
}
