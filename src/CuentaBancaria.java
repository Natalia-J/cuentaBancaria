public class CuentaBancaria {

    private static double tasaInteresAnual = 0.08;
    static int contadorCuentas = 0;
    private final int numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.numeroCuenta=++contadorCuentas;
    }

    public static double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public static void setTasaInteresAnual(double tasaInteresAnual) {
        CuentaBancaria.tasaInteresAnual = tasaInteresAnual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) {
        this.saldo -=cantidad;
    }

    public double calcularInteres() {
        double interes = saldo * tasaInteresAnual;
        return  saldo + interes;
    }

    public static int getTotalCuentas(){
        return contadorCuentas;
    }
}
