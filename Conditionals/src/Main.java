import java.util.Scanner; // import Scanner class to allow user input
//Day 1 of java Programming

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object to read user input

        // Problem 1: check if a number is even or odd
        System.out.println("Enter a number to Check whether its even or not");
        int numForEven = sc.nextInt(); // read user input for number to check

        if (numForEven % 2 == 0){ // check if number is even
            System.out.println("Even");
        }
        else { // if number is not even, it must be odd
            System.out.println("odd");
        }
        System.out.println(""); // print empty line for formatting


        // Problem 2: find the absolute value of a number
        System.out.println("Enter a no. for its absolute value");
        int numsAbsolute = sc.nextInt(); // read user input for number to find absolute value of
        if (numsAbsolute>0){ // if number is already positive, absolute value is already the same
            System.out.println("Absolute = " + numsAbsolute);
        }
        else { // if number is negative, multiply by -1 to find absolute value
            System.out.println("Absolute = " + (numsAbsolute*-1));
        }


        // Problem 3: calculate profit or loss when given cost and selling prices
        System.out.println("Enter Cp and Sp to Check If There is any Profit");
        System.out.print("Enter Cost Price :");
        int cp = sc.nextInt(); // read user input for cost price
        System.out.print("Enter Selling Price :");
        int sp = sc.nextInt(); // read user input for selling price
        if (cp>sp){ // if cost price is greater than selling price, there is a loss
            System.out.println("It's loss \n Loss = " + (cp-sp));
        }
        else if (sp>cp) { // if selling price is greater than cost price, there is a profit
            System.out.println("It's Profit \n Profit = " + (sp-cp));
        }
        else { // if cost price is equal to selling price, there is neither profit nor loss
            System.out.println("Neither profit nor loss");
        }


        // Problem 4: check if the area or perimeter of a rectangle is greater and if it is a square
        System.out.println("Enter the length and breadth to check what is Greater Area or Perimeter also Check If its square or not");
        System.out.print("Enter Length");
        int len = sc.nextInt(); // read user input for length of rectangle
        System.out.print("Enter Breadth");
        int breadth = sc.nextInt(); // read user input for breadth of rectangle
        if ((len*breadth)>2*(len+breadth)){ // if area is greater than perimeter, area is greater
            System.out.println("Area is greater");
        }
        else System.out.println("Perimeter is greater"); // if area is not greater, perimeter must be greater

        if (len==breadth){ // if length and breadth are equal, it is a square
            System.out.println("And its a square");
        }
        else { // if length and breadth are not equal, it is not a square
            System.out.println("And its not a square");
        }




        // Problem 5: check if a number is a three-digit number
        System.out.println("Enter a Num to Check If its a three digit no. or not : ");
        int numForDigit = sc.nextInt(); // read user input for number to check
        if (numForDigit>99 && numForDigit<1000){ // if number is between 100 and 999 inclusive, it is a three-digit number
            System.out.println("Its a three digit number");
        }
        else { // if number is not between 100 and 999 inclusive, it is not a three-digit number
            System.out.println("Not a three digit no.");
        }


        // Problem 6: check if a number is divisible by 5 but not by 3
        System.out.println("Enter the to Check if given no. is divisible by 5 but not 3");
        int div5not3 = sc.nextInt(); // read user input for number to check
        if (div5not3%5==0 && div5not3%3!=0){ // if number is divisible by 5 and not divisible by 3, it meets the requirements
            System.out.println("Yes It is");
        } else if (div5not3%5==0 && div5not3%3==0) { // if number is divisible by 5 and 3, it is not valid
            System.out.println("Divisible by 5 but also by 3");
        } else { // if number is not divisible by 5, it is not valid
            System.out.println("Its not");
        }


        // Problem 7: check if three sets of coordinates are in a straight line
        System.out.println("Check if The 3D co-ordinates are in a straight line or not");
        System.out.println("Enter coordinates x1 and y1");
        double x1 = sc.nextDouble(); // read user input for x1 coordinate
        double y1 = sc.nextDouble(); // read user input for y1 coordinate
        System.out.println("Enter coordinates x2 and y2");
        double x2 = sc.nextDouble(); // read user input for x2 coordinate
        double y2 = sc.nextDouble(); // read user input for y2 coordinate
        System.out.println("Enter coordinates x3 and y3");
        double x3 = sc.nextDouble(); // read user input for x3 coordinate
        double y3 = sc.nextDouble(); // read user input for y3 coordinate
        if ((y2-y1)/(x2-x1)==(y3-y2)/(x3-x2)){ // if the slope between the first two points is equal to the slope between the second two points, the three points are in a straight line
            System.out.println("Yes its a straight line");
        }
        else { // if the slope between the first two points is not equal to the slope between the second two points, the three points are not in a straight line
            System.out.println("Not a straight line");
        }
    }
}