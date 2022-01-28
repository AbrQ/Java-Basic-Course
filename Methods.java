// Program03

class Methods{
	public static void main(String args[]){
		int numberOne = 10;
		int numberTwo = 20;

		//Call method sum
		System.out.println("Result of sum: "+sum(numberOne,numberTwo));

		//Call method substraction
		System.out.println("Result of substraction: "+substraction(numberOne,numberTwo));

		//Call method mult
		System.out.println("Result of multiplication: "+mult(numberOne,numberTwo));

		//Call method division
		System.out.println("Result of division: "+division(numberOne,numberTwo));

		//Call method module
		System.out.println("Result of module: "+module(numberOne,numberTwo));
	}

	//Method Sum
	static int sum(int paramOne, int paramTwo){
		int result = paramOne + paramTwo;
		return result;
	}

	//Method Substaction
	static int substraction(int paramOne,int paramTwo){
		int result = paramTwo - paramOne;
		return result;
		}

	//Method Multiplication
	static int mult(int paramOne, int paramTwo){
		int result = paramOne * paramTwo;
		return result;
	}

	//Method Division
	static int division(int paramOne, int paramTwo){
		int result = paramTwo / paramOne;
		return result;
	}

	//Method module
	static int module(int paramOne, int paramTwo){
		int result = paramTwo % paramOne;
		return result;
	}
}