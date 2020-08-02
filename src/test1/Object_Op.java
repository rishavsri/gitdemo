package test1;

public class Object_Op {

	public static void main(String[] args) {

		Calc as = new Calc(23, 23);

		System.out.println(as.num1);
		System.out.println(as.num2);

		// int i = 9;
		// int j =8;

		// j = i >6?1:6;//ternary operators

	}

}

class Calc {
	int num1;
	int num2;

	public Calc(int num1, int num2) {
		this.num1 = num1; // it is used to refer instance variable
		this.num2 = num2;
	}
}