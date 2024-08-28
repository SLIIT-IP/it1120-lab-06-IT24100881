import java.util.Scanner;

public class IT24100881Lab6Q2C{

public static void main(String[] args){

Scanner input=new Scanner(System.in);

int i=1;
int sum=0;
int number;

while(10>=i){

	System.out.println("Enter number"+i+":");
	 number=input.nextInt();

System.out.println("You entered "+number);

i++;

sum=sum+number;

}



System.out.println("Sum is: "+sum);

double average;

average=sum/10;

System.out.println("Avarage is: "+average);
	}
}