package ConstructionOfHouse;
import java.util.*;

public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.format("%s","There are various types of material standards for building a house, They are standard,above standard,high standar,high standard and fully automated");
		System.out.format("%s", "Enter the standard of your Material:" );
		String material = sc.nextLine();
		System.out.format("%s", "Enter the Number of Square Feet" );
		float squareFeet =sc.nextFloat();
		CostOfConstruction obj = new CostOfConstruction();
		float Cost = obj.calculateCostOfConstruction(material,squareFeet);
		System.out.format("%s","Total Cost Of Construction is ");
		System.out.format("%f",Cost);
		
	}

}