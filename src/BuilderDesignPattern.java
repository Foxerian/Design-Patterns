/*
 * 
 *Author Mudit
 *Builder Design Pattern used to remove order dependency in parameterized constructors
 *
 */


class Juice
{
private String fruit;
private int sugar;
private int water;
private int icecubes;

public void setFruit(String fruit) {
	this.fruit = fruit;
}
public void setSugar(int sugar) {
	this.sugar = sugar;
}

public void setWater(int water) {
	this.water = water;
}

public void setIcecubes(int icecubes) {
	this.icecubes = icecubes;
}
public String toString()
{
	return "Fruit "+fruit+" icecubes "+icecubes+" water "+water+" suger "+sugar;
	}
}
//Builder
class JuiceMaker
{
	Juice jobj=null;
	public JuiceMaker()
	{
		this.jobj=new Juice();
	}
	public JuiceMaker setFruit(String fruit) {
		this.jobj.setFruit(fruit);
		return this;
	}
	public JuiceMaker setSugar(int sugar) {
		this.jobj.setSugar(sugar);
		return this;
	}
	public JuiceMaker setWater(int water) {
		this.jobj.setWater(water);
		return this;
	}
	public JuiceMaker setIcecubes(int icecubes) {
		this.jobj.setIcecubes(icecubes);
		return this;
	}

	public Juice build()
	{
		return this.jobj;
	}
	
}

public class BuilderDesignPattern {
 public static void main(String args[])
 {
	 Juice orange = new JuiceMaker().setFruit("orange").setIcecubes(2).setSugar(2).setWater(5).build();
	 System.out.println(orange);
 }
}
