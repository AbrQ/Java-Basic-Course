class Clases{
	public static void main(String args[]){

		Transport myTransport = new Transport();
		
		myTransport.doors = 4;
		myTransport.color = "Blue";
		myTransport.brand = "Nissan";

		System.out.println("My object has: "+myTransport.doors+" doors, has a: "+myTransport.color+" color and its a: "+myTransport.brand+" Model");
	}
}

class Transport{
	int doors;
	String color;
	String brand;
}