import java.util.Scanner;

public class CreadorTicket {
	String cliente;
	String producto;
	double precio, total;
	double totald;
	int cantidad;

	public double compra() {
		Scanner scanner = new Scanner(System.in);
		Descuento descuento = new Descuento();

		cliente = "";
		producto = "";
		totald = 0;

		System.out.println("Indique su nombre: ");
		cliente = scanner.next();
		System.out.println("Introduzca el nombre del producto: ");
		producto = scanner.next();
		System.out.println("Introduzca el precio del producto: ");
		precio = scanner.nextDouble();
		System.out.println("Introduzca cuántos productos lleva: ");
		cantidad = scanner.nextInt();

		total = precio * cantidad;

		System.out.println(" El total a pagar es:" + total);
		if (total >= 1000) {
			totald = total - (total * 0.20);
			System.out.println("Al contar con un descuento del 20%, el total a pagar es: " + totald);
		} else {
			System.out.println("El total a pagar es: + total.No tiene descuento");
		}
		return totald;
	}

	public String mostrar_compra() {
		return " Su nombre es " + cliente + "\n producto: " + producto + "\n precio: " + precio + "\n total: " + totald;
	}
}