import java.util.Scanner;

public class Multithreading extends Thread{
	Scanner sc = new Scanner(System.in);

	public Multithreading () {
		super();
	}
	
	public void run() {
	System.out.print("Donner un nombre : ");
	int n =sc.nextInt();
	int a1=n/4;
	int a2=a1*2;
	int a3=a1*3;
	for(int i = 1 ; i < a1 ; i++) {
		System.out.println(i);
	}
	for(int i = a1 ; i < a2 ; i++) {
		System.out.println(i);
	}
	for(int i = a2 ; i < a3 ; i++) {
		System.out.println(i);
	}
	for(int i = a3 ; i < n ; i++) {
		System.out.println(i);
	}
	}
	
}
