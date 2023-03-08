import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Ingrese su número de cuenta: ");
        int numeroCuenta = m.nextInt();
        System.out.print("Ingrese su saldo inicial: ");
        double saldoInicial = m.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(saldoInicial, numeroCuenta);
        while (true) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Hacer un depósito");
            System.out.println("3. Hacer un retiro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = m.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: " + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = m.nextDouble();
                    cuenta.depositar(cantidadDeposito);
                    System.out.println("Depósito realizado correctamente");
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = m.nextDouble();
                    if (cantidadRetiro > cuenta.getSaldo()) {
                        System.out.println("No tiene suficiente saldo para hacer este retiro");
                    } else {
                        cuenta.retirar(cantidadRetiro);
                        System.out.println("Retiro realizado correctamente");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
