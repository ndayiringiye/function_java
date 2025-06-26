import java.util.Scanner;
public class Greeting{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("how many of students we have:");
     int numberStudents = input.nextInt();
     input.nextLine();

     for(int i = 1; i <= numberStudents; ++i){
      System.out.printf("%n --- student %d --- %n", i);

        System.out.print("Enter you age here:");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("enter student name:");
        String name = input.nextLine();

        System.out.print("enter student score:");
        int score = input.nextInt();

        System.out.printf("number of student is %d %n", numberStudents);
        System.out.printf("hi, I'm %d old", age);
        System.out.printf("hello, my name is %s graduated at uopeople", name);
        System.out.printf("I have got %d score", score);
     }
     input.close();
    }
}