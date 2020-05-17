package main;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import inventory.InventoryManager;
import inventory.MensShoes;
import inventory.Product;

public class main {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		InventoryManager IMS = new InventoryManager();
		MensShoes m = new MensShoes(1, 2, 3, "aa", "bb", 1,"red", "sneakers");
		ArrayList<Product> pList = IMS.getProdList();
		pList.add(m);
		try {
			// how to access a the shoe class methods from the prod list element
			System.out.println(
					pList.get(0).getClass().getDeclaredMethod("getStyle").invoke(pList.get(0)));
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
