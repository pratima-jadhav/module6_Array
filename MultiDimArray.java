package module6;
import java.util.Scanner;
public class MultiDimArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 12 values");
		int[][] arr=new int[3][4];
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]= sc.nextInt();
			}
		}System.out.println("============");
		System.out.println("Display the array");
		System.out.println("rollno       c++           java            Mysql");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
			System.out.print(arr[i][j] + "\t\t");
			}
			System.out.println();
		}
	}

}
