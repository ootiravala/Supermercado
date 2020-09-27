
public class Ticket {

	public static void main(String[] args) {

		// En un supermercado se hace un 20% de descuento a los clientes cuya compra
		// supere los 1000 en las áreas de frutas, verduras y abarrotes. ¿ Cual sera el
		// total que pagara una persona por su compra ?, se debe mostrar el nombre del
		// cliente , producto, precio , cantidad , descuento y total a pagar.

		CreadorTicket creadorTicket = new CreadorTicket();
		creadorTicket.compra();

		Descuento descuento = new Descuento();

		System.out.println(descuento.opcion);

		System.out.println(creadorTicket.mostrar_compra());
	}

}
