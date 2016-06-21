package auto;
import java.util.Scanner; //библиотека для ввода значения с клавиатуры
import trip.trip;
public class auto {
	trip trip = new trip();
	public String model = "Mitsubishi l200";
	public int FuelСonsumption = 11;
	public int FuelTankCapacity = 65;
	public boolean CheckFuel(){
		 Scanner in = new Scanner(System.in);
		 boolean result = true;
		 System.out.println("Сколько бензина в баке?");
		 int fuel = in.nextInt(); //Ввод значения с клавиатуры
		 if(OpportunityToGet(fuel) == true){
			 System.out.println("Авто готово к поездке");
			 result = true;
		 }else{
			 result = false;
		 }
		 return result;
		 
	}
	public boolean OpportunityToGet(int fuel){
		int c = FuelTankCapacity - fuel;
		boolean result = true;
		System.out.println("Вы можете залить еще "+c+ " литров топлива");
		float a = (fuel/FuelСonsumption)*100;
		if(a >= trip.distance){
			System.out.println("Вы можете проехать "+ a +" киллометров");
			result = true;
		}else if(a < trip.distance){
			System.out.println("Вы можете проехать "+ a +" киллометров. Заправьтесь!!");
			result =  false;
		}
		return result;
	}
}
