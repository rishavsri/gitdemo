package collectionss;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ArrayList<String> ar = new  ArrayList<>();
		ar.add("Red");
		ar.add("green");
		ar.add("erer");
		ar.add("qwqwq");
		ar.add(0, "asdasd");
		ar.add(5,"dad");
		
		Collections.sort(ar);
		Collections.reverse(ar);
		System.out.println(ar);

		ArrayList<String> op = new  ArrayList<>();
		op.add("Red");
		op.add("asd");
		op.add("asda");
		op.add("qwqwq");
		op.add(0, "asdasd");
		op.add(5,"dasdasad");
		
		System.out.println(op);
		
		Collections.copy(ar, op);
		
		System.out.println(op);
		
		
	
	}
	
	
}