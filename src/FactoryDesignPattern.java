/*
 * 	create object without exposing the creation logic to the client and refer to newly created object using a common interface
 *  *
 *				Shape(i)  <--------------------------shapeFactory()
 *				/		\										
 * 			   /	 	 \														
 * circle(implements)	rectangle(implements)					
 * 
 * 
 */
interface Vehicle
{
public void name();	
}

class car implements Vehicle
{
	public void name()
	{
		System.out.println("Its car");
	}
}

class bike implements Vehicle
{
	public void name()
	{
		System.out.println("Its bike");
	}
}

class mopad implements Vehicle
{
	public void name()
	{
		System.out.println("Its mopad");
	}
}

class VehicleFactory
{
	public Vehicle getVehicle(String str)
	{
		if(str.equalsIgnoreCase("CAR"))
		{
			return new car();
		}
		else if(str.equalsIgnoreCase("BIKE"))
		{
			return new bike();
		}
		else
		{
			return new mopad();
		}
	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
	Vehicle vobj = new VehicleFactory().getVehicle("car");
	vobj.name();
	}
}
