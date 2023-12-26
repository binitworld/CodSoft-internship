import java.util.Scanner;

public class SGC {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int numberOfSubjects =5; 
        int[] marks = new int[numberOfSubjects];
        int totalMarks =  0;
        double average ;
        char grade ;
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter The Marks Of the Subject   "  + (i+1) + " : ");
            marks [i] = in.nextInt();
            totalMarks += marks [i];

        } 

        average = (double )totalMarks / numberOfSubjects;

        if (average>=90){ 
            grade ='A';
        }else if (average >=80) {
            grade = 'B';
            }else if(average>=70){
                grade ='C';

            }else if(average>=60){
                grade='D';
            }else{
                grade = 'F';
            }

            System.out.println();
            System.out.println("|----------------------------Your Results------------------------|");
            System.out.println();
            System.out.println("Total Marks  : " +totalMarks);
            System.out.println("Average Percentage :"+average+"%");
            System.out.println("Grade : "+grade);
            System.out.println();
            
            if (grade=='F') 
            {
                System.out.println("|| I'M Felt sorry while saying You  Can't  make it , Better Luck Next Time!!  ||");
            }else{
                System.out.println(" || Congrats of getting Such wonderful Marks Keep it up!! ||");
            }
    }
}
