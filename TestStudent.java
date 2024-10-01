package module6;
import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollNo,name,score");
		int rollNo=sc.nextInt();
		String name=sc.next();
		double score=sc.nextInt();
		
		Student student= new Student();    //call default constr
		student.setName(name);
		student.setRollNo(rollNo);
		student.setScore(score);
		//student.display();
		System.out.println("rollNo is"+ student.getRollNo());
		System.out.println("name is"+ student.getName());
		System.out.println("score is"+ student.getScore());
		
		student.markattendence();
		
		System.out.println("===========");
		System.out.println("creating an object with parameters");
		Student student2= new Student(2,"psj",90);
		//student2.display();
		
		System.out.println("displaying the details");
		System.out.println("rollNo is"+ student2.getRollNo());
		System.out.println("name is"+ student2.getName());
		System.out.println("score is"+ student2.getScore());
		
		student.markattendence();
		
		System.out.println("============================");
		System.out.println("changing the name");
		System.out.println("enter new name");
		String name1=sc.next();
		student2.setName(name1);
		System.out.println("new name is "+student2.getName());
		
	}

}
	


