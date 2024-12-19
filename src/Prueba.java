public class Prueba {

    public static void main(String[] args) {

        CuentaBancaria cunt1 = new CuentaBancaria("Maria");
        CuentaBancaria cunt2 = new CuentaBancaria("Juan");
        CuentaBancaria cunt3 = new CuentaBancaria("Pedro");
        CuentaBancaria cunt4 = new CuentaBancaria("Fernando");



        System.out.println("Cuenta 1, titular: "+ cunt2.getTitular() + " saldo: "+cunt2.getSaldo() + " Numero de cuenta: "+cunt2.getNumeroCuenta());
        System.out.println("Cuenta 1, titular: "+ cunt2.getTitular() + " saldo: "+cunt2.getSaldo() + " Numero de cuenta: "+cunt2.getNumeroCuenta());
        System.out.println("Cuenta 1, titular: "+ cunt2.getTitular() + " saldo: "+cunt2.getSaldo() + " Numero de cuenta: "+cunt2.getNumeroCuenta());
        System.out.println("Cuenta 4, titular: "+ cunt4.getTitular() + " saldo: "+cunt4.getSaldo() + " Numero de cuenta: "+cunt4.getNumeroCuenta());

        cunt1.depositar(234);
        cunt2.depositar(34454);
        cunt3.depositar(1881);
        cunt4.depositar(9000000);

        System.out.println("cuenta 1 - saldo:" + cunt1.getSaldo());
        System.out.println("cuenta 2 - saldo:" + cunt2.getSaldo());
        System.out.println("cuenta 3 - saldo:" + cunt3.getSaldo());
        System.out.println("cuenta 4 - saldo:" + cunt4.getSaldo());

        cunt1.retirar(23);
        cunt2.retirar(156);
        cunt3.retirar(345);
        cunt4.retirar(123);

        System.out.println("cuenta 1 - saldo:" + cunt1.getSaldo());
        System.out.println("cuenta 2 - saldo:" + cunt2.getSaldo());
        System.out.println("cuenta 3 - saldo:" + cunt3.getSaldo());
        System.out.println("cuenta 4 - saldo:" + cunt4.getSaldo());

        System.out.println("/////////////////////////////////////////////");

//        cunt1.calcularInteres();
        System.out.println(cunt1.calcularInteres());
//        cunt2.calcularInteres();
//        cunt3.calcularInteres();
//        cunt4.calcularInteres();

        System.out.println("////////////////////////////////////////////");

        System.out.println("cuenta 1 - saldo:" + cunt1.getSaldo());
        System.out.println("cuenta 2 - saldo:" + cunt2.getSaldo());
        System.out.println("cuenta 3 - saldo:" + cunt3.getSaldo());

        System.out.println("Total de cuentas: "+ CuentaBancaria.getTotalCuentas());



    }
}
