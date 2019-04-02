package com.tfi.OC_JavaObj;

import com.tfi.OC_JavaObj.shop.*;

public class Main {

    public static void main(String[] args) {
	Product cafe = new Product("Nespresso Delonghi", "Machine à capsule Nespresso", 79.99);
	Product tv = new Television("Samsung 55'' QLED","Une télévision avec un contrast très élevé et des détails saisissants !", 1299.99,55,"QLED");
	Product fridge = new Fridge("Haier FreezMax 18", "Réfrégirateur américain de grande contenance avec distributeur d'eau et de glaçon", 599.99, 800, true);

	Customer customer = new Customer("David LABROCHETTE", "123 Rue de la Rue 66000 Perpignan");
	Delivery delivery = new ExpressDelivery("Perpignan");

	Bill bill = new Bill(customer,delivery);
	try {
		bill.generate(new FileWriter("facture_leblanc"));
	} catch (NoProductInBillException e) {
		System.err.println("Pas de produit dans la facture.");
	}
	bill.addProduct(cafe, 1);
	bill.addProduct(tv, 1);
	bill.addProduct(fridge, 1);

    bill.generate(new FileWriter("facture_labrochette"));
    }
}
