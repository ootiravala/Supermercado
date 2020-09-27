import java.util.Scanner;

public class Descuento {
	String opcion;

	public void seccion() {

		Scanner scanner = new Scanner(System.in);
		CreadorTicket creadorTickect = new CreadorTicket();

		opcion = "";

		System.out.println("Ingrese el nombre de la seleccion de productos");
		opcion = scanner.next();

		switch (opcion) {
		case "vedura":
			creadorTickect.compra();
			break;
		case "frutas":
			creadorTickect.compra();
			break;
		case "abarrotes":
			creadorTickect.compra();
			break;

		}

		CreadorTicket creadorTicket = new CreadorTicket();
		creadorTickect.compra();
	}

	public String mostrar_opcion() {
		return "La opcion es : " + opcion;
	}
}
