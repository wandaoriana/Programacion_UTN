public class SalarioVendedor {
    public static void main(String[] args) {
        final double SALARIO_BASE = 1000;
        final double COMISION_POR_VENTA = 150;
        final double PORCENTAJE_DEL_VALOR_DE_VENTA = 0.05;

        // Supongamos que el vendedor vendió 10 autos en un mes y el valor total de las ventas fue de $20000
        int carrosVendidos = 10;
        double valorTotalVentas = 20000;

        double salarioMensual = SALARIO_BASE + (carrosVendidos * COMISION_POR_VENTA) + (PORCENTAJE_DEL_VALOR_DE_VENTA * valorTotalVentas);

        System.out.println("El salario mensual del vendedor es: $" + salarioMensual);
    }
}
