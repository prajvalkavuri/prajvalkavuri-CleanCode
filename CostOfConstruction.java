package HouseConstruction;

public class CostOfConstruction {
	
float calculateCostOfConstruction(String material,float SquareFeet)
	{
		
		if(material.equals("standard"))
		{
			return 1200*SquareFeet;
		}
		else if(material.equals("above standard"))
		{
			return 1500*SquareFeet;
		}
		else if(material.equals("high standard"))
		{
			return 1800*SquareFeet;
		}
		else if(material.equals("hidh standard and fully automated home"))
		{
			return 2500*no_of_SquareFeet;
		}
		else {
			return 0;
		}
	}

}
