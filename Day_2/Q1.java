import java.util.*;

class Q1{

public static void main(String [] arrgs){

Scanner scn = new Scanner (System.in);

System.out.println("Enter numerical grade: ");
int numerical_grade = scn.nextInt();

if (numerical_grade >=90){
System.out.println("A");
}

else if (numerical_grade >=80){
System.out.println("B");
} 

else if (numerical_grade >=70){
System.out.println("C");
} 

else if (numerical_grade >=60){
System.out.println("D");
} 

else {
System.out.println("F");
}

}

}