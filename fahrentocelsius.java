//explicit type casting or narrowing or downcasting
//convert higher to lower
public class fahrentocelsius{
	public static void main(String[] args){
		double fahrenheit=77.0;                                                             
		int celsius=(int)((fahrenheit-32)*5/9);
		System.out.println("Temperature in Celsius: "+fahrenheit);
		System.out.println("Temperature in Celsius: "+celsius);
	}
}
