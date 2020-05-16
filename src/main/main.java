package main;
import com.google.gson.*; 

import inventory.MensShoes;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MensShoes m = new MensShoes(1, 1, 1, "a", "b", 1, "c", "sneakers");
		Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
		gson.toJson(myObject);
	}

}
