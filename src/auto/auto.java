package auto;
import java.util.Scanner; //���������� ��� ����� �������� � ����������
import trip.trip;
public class auto {
	trip trip = new trip();
	public String model = "Mitsubishi l200";
	public int Fuel�onsumption = 11;
	public int FuelTankCapacity = 65;
	public boolean CheckFuel(){
		 Scanner in = new Scanner(System.in);
		 boolean result = true;
		 System.out.println("������� ������� � ����?");
		 int fuel = in.nextInt(); //���� �������� � ����������
		 if(OpportunityToGet(fuel) == true){
			 System.out.println("���� ������ � �������");
			 result = true;
		 }else{
			 result = false;
		 }
		 return result;
		 
	}
	public boolean OpportunityToGet(int fuel){
		int c = FuelTankCapacity - fuel;
		boolean result = true;
		System.out.println("�� ������ ������ ��� "+c+ " ������ �������");
		float a = (fuel/Fuel�onsumption)*100;
		if(a >= trip.distance){
			System.out.println("�� ������ �������� "+ a +" �����������");
			result = true;
		}else if(a < trip.distance){
			System.out.println("�� ������ �������� "+ a +" �����������. �����������!!");
			result =  false;
		}
		return result;
	}
}
