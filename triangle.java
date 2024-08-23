import java.util.Scanner;
public class triangle{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Base value(in mts): ");
		double base=sin.nextDouble();
		System.out.println("Enter Height value(in mts):");
		double height=sin.nextDouble();
		double areaoftriangle=0.5*base*height;
		System.out.println("The Area of Triangle is : "+areaoftriangle);
	}
}