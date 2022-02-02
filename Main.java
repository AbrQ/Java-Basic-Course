class Main{

	public static void main(String args[]){

		Instrument myInstrument = new Instrument();

		myInstrument.numberOfStrings = 6;
		myInstrument.color = "Blue";
		myInstrument.brand = "Fender American Deluxe";

		myInstrument.printingMessage(myInstrument.numberOfStrings, myInstrument.color, myInstrument.brand);
	}
}