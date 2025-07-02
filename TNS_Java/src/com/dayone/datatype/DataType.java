package com.dayone.datatype;
import java.util.List;
import java.util.ArrayList;

public class DataType {
	public static void main(String[] args)
	{
		List <String> password = new ArrayList<>();
		password.add("Rushikesh");
		password.add("Siddhant");
		
		if (password.get(1) == "Siddhant") {
			System.out.println("User logged in successfully..!");
		}
		else {
			System.out.println("Wrong credentials..!");
		}
		}

}
