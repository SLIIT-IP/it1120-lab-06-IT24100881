import java.util.Scanner;

public class IT24100881Lab6Q3{

	public static void main(String[] args){

	Scanner input=new Scanner(System.in);

	double sumOfSquares=0;
        int count=0;
        double rms;

while (true){

	System.out.println("Enter a positive integer: " );
	int number=input.nextInt();


if(number==-99){
break;
}

else if(number<0){
	System.out.println("Invalid input! Negative numbers are not alllowed.Try again.");
continue;
}

sumOfSquares+=number*number;

count++;
	}

if(count>0){
rms=Math.sqrt(sumOfSquares/count);
	System.out.println("Root Mean Square=" +rms);
}
else{

System.out.println("No valid numbers entered.");
	}
  }
}


