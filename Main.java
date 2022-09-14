import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    // triangle Perimeter calculator
    // you can input decimla numbers too.
    
      Scanner scanner = new Scanner (System.in);

      System.out.println("What do you want the first triangle side length to be?");
      double triLength1 = (double) scanner.nextDouble();
    System.out.println("\nThe length is of the first side is " + triLength1);
    System.out.println("\n What do you want to make the second side length to be?");
    double  triLength2 = (double) scanner.nextDouble();
    System.out.println("The second side length of the triangle is " + triLength2);

    System.out.println("\n what do you want to make your third side length to be?");
    double triLength3 = (double) scanner.nextDouble();
    System.out.println("your third side length is " + triLength3);
  
    double perimeterTriangle;

    perimeterTriangle = triLength1 + triLength2 + triLength3;

    System.out.println("\nThe perimeter of your triangle is " + (double)perimeterTriangle);

    //Perimeter Rectangle

    System.out.println("\nWhat is the length of your Rectangle?");
    double recLength = (double) scanner.nextDouble();

    System.out.println("\nYour length of the Rectangle is " + recLength);

    System.out.println("\n What is the width of your Rectangle?");
      double recWidth = (double) scanner.nextDouble();

    System.out.println("Your width is " + recWidth);

    double perimeterRec;

    perimeterRec = recLength * recWidth;
    System.out.println("The perimeter of your rectangle is " + (double)perimeterRec+ "!"); 

    //Circumference of Circle
    
    final float PI = 3.14F;
    double circumferenceCircle;
    System.out.println("What is the radius of the circle? ");
    double radius = (double)scanner.nextDouble();

    System.out.println("The radius of your circle is " + radius);

    circumferenceCircle = 2 * PI * radius;

    System.out.println("The circumference of your circle is " + (double)circumferenceCircle);

    //note: instead of having just int inputs and outputs. I have made the inputs double as well as the output or the answers for each to be also double. Please maybe try to type decimal numbers to see how it works out!!!!!
     
    
  }
}