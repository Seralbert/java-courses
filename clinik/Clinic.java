/*
*Класс клинника
*/

public class Clinic {

	private final Clinic[] clients;
	public Clinic(final int size) {
		this.clients = new Clients[size];
	}

	/*Добавить клиента*/

	public void addClient(final int position, final Client client) {
	this.clients[position] = client;
	}

	public Client[] findClientsByPetName(final String name) {
	
	return new Client[] {};
	}
}