package trip;
import auto.driver;
import auto.rules;
import auto.auto;
public class trip {
	public int distance = 400;
	public static void main(String[] args){
		StartTrip();
	}
	public static void StartTrip(){
		if(checkDriver() == true){
			Way();
		}
	}
	private static boolean checkDriver(){
		driver driver = new driver();
		rules rules = new rules();
		if(driver.alcohol == rules.alcohol){
			System.out.println("�������� "+driver.fio+" �� ������ "+driver.DrivingExperience+" ����� � ������");
			return true;
		}else{
			System.out.println("�������� "+driver.fio+" �� ������ "+driver.DrivingExperience+" �� ����� � ������, ������ ��� ��������");
			return false;
		}
	}
	public static void Way(){
		rules rules = new rules();
		auto auto = new auto();
		if(auto.CheckFuel() == true){
			System.out.println("����������� �������� �� ������ "+ rules.SpeedLimit + ". ����� ����������� � ���������. ������� �������.");
		}
	}
}
