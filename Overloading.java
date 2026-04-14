//Method overloading 
class Area
{
public double area(double r)
{
return 3.14*r*r;
}
public double area(double length, double breadth  )
{
return length*breadth;
}
}
public class Main {
	public static void main(String[] args) {
		Area obj = new Area();
		double circle = obj.area(4.44);
		double rectangle = obj.area(4.5,4.5);
		System.out.println(circle+" "+rectangle);
	}
                                }
