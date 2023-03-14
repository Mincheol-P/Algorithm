package algorithm1;

public class algorithm2 {
	public static void main(String[] args) {
		int A=100;
		int B=99;
		int V=1000000000;
		int R1 = 0;
		
		//for (R1 = 0; R1 < 1; R1++) {
		while(true){
			V = V - A;
		if(V <= 0) {
			System.out.println(R1+1);
			break;
		}
		V = V + B;
		R1+=1;
		}
	}
}