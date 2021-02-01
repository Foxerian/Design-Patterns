/*
 * 
 *Author Mudit
 *Decorator Design Pattern used to add new functionalities/features to existing classes
 *This pattern creates a decorator class which wraps the original class and provides 
 *additional functionality keeping class methods signature intact.
 *
 *				Shape(i)  <--------------------------shapeDecorator(abstract class) implements shape
 *				/		\											|
 * 			   /	 	 \											|			
 * circle(implements)	rectangle(implements)					Border(extends)
 */

interface Shape
{
public void draw();	
}

class circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
}

class square implements Shape
{
	public void draw()
	{
		System.out.println("Drawing square");
	}
}

abstract class ShapeDecorator implements Shape
{
	Shape obj;
	public ShapeDecorator(Shape obj)
	{
		this.obj=obj;
	}
	public void draw() {
		obj.draw();
	}
}
class border extends ShapeDecorator
{
	public border(Shape obj)
	{
		super(obj);
	}
	public void draw()
	{
		super.draw();
		drawBorder();
	}
	public void drawBorder()
	{
		System.out.println("Add border as well");
	}
}

public class DecoratorDesignPattern {
	public static void main(String args[]) {
	Shape circle = new border(new circle());
	circle.draw();
}
}
