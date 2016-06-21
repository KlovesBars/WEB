
public class main {

	public static void main(String[] args) {
		int i=5, j=10;
		int k = i+j;
		
		String str="Kotatki"; 
		System.out.println(str);
		System.out.println("Nikolas" +str);	
		System.out.println("i+j="+k);
		System.out.println("i+j="+(i+j));
		while(i<j){
			System.out.println(str);
			i++;
		}
		
		while(i<j){
			if(i==j){
			System.out.println("i="+i+",j="+j+"и они равны");
			}
			else {
				System.out.println("i="+i+",j="+j+"и они не равны");
			}
		}
		
		System.out.println(args[0]);
	}

}
