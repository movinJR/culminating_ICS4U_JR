//Task #1: Hello World!
/*public class Tasks{
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
*/

//Task #2: FizzBuzz (n=50)
/*public class Tasks{
    public static void main(String[] args) {
        for (int i = 1; i<=50; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0){
                System.out.println("Fizz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
*/



//Task #3: Creating a Database
/*
import java.util.Scanner;

public class Tasks{
    public static void main(String[] args) {

        String[] items = {"apple", "banana", "orange", "milk"};
        int[] quantities = {25, 15, 0, 10};

        Scanner input = new Scanner(System.in); //analyses string to see if item is in stock

        System.out.print("Enter item name: ");
        String item = input.nextLine().toLowerCase(); //must be in lowercase to match the string

        boolean found = false;

        for (int i = 0; i < items.length; i++) {

            if (item.equals(items[i])) {
                found = true;

                if (quantities[i] > 0) {
                    System.out.println(item + " is available in inventory");
                    System.out.println("Quantity: " + quantities[i]);
                } else {
                    System.out.println(item + " is out of stock");
                }

                break; //instantly terminates the loop
            }
        }

        if (!found) {
            System.out.println(item + " is not in the inventory");
        }

        input.close();
    }
}
*/




//Task #4: String Manipulation
/*
//A) String Slicing
public class Tasks{
    public static void main(String[] args){
        String text = "JoshuaRajalingam";

        String pt1 = text.substring(0,6); //Prints Joshua
        String pt2 = text.substring(6); //Prints Rajalingam

        System.out.println(pt1);
        System.out.println(pt2);

    }
}
*/

/*
//B) String Concatenation
public class Tasks{
    public static void main(String[] args){
        String firstName = "Zayden "; //notice the space for proper gramatical flow
        String lastName = "Rodricks";
            System.out.println(firstName.concat(lastName));
    }
}
*/

/*
//C) String Palendroming
public class Tasks {
    public static void main(String[] args) {
        String word = "racecar"; //Enter any word here...

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i); //adds the current character from the end of the string to build the reversed version step by step
        }

        if(word.equals(reversed)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
*/





//Task #5: List/Array Manipulation

/*
//A) Create an Array
public class Tasks{
    public static void main(String[] args){
        String[] sports = {"Soccer", "Basketball", "Baseball", "Football", "Hockey", "Boxing"};

        System.out.println(sports[0]);
        System.out.println(sports[5]);
    }
}
*/

/*
//B) Adding to an Array
public class Tasks{
    public static void main(String[] args){
        String[] sports = {"Soccer", "Basketball", "Baseball", "Football", "Hockey", "Boxing"};

        String newSport = "Golf";

        //creating a new array with one extra space
        String[] updatedSports = new String[sports.length + 1];

        //this copies old elements into new array
        for (int i = 0; i < sports.length; i++){
            updatedSports[i] = sports[i];
        }

        //adds new element at the end
        updatedSports[updatedSports.length - 1] = newSport;

        //prints a new array
        for (int i = 0; i < updatedSports.length; i++){
            System.out.println(updatedSports[i]);
        }
    }
}
*/

/*
//C) Remove an Element
public class Tasks{
    public static void main(String[] args){
        String[] sports = {"Soccer", "Basketball", "Baseball", "Football", "Hockey", "Boxing"};

        //creates a new array with one less space
        String[] updatedSports = new String[sports.length - 1];

        //copy everything except football in index 3
        for (int i = 0; i < 3; i++){
            updatedSports[i] = sports[i];
        }
        //this removes football from the array
        for (int i = 4; i < sports.length; i++){
            updatedSports[i - 1] = sports[i];
        }

        //prints out the new array
        for (int i = 0; i < updatedSports.length; i++){
            System.out.println(updatedSports[i]);
        }
    }
}
*/

// Task 6: Functions
import java.util.Scanner;

public class Tasks{
    public static double cToF(double c){
        return (c * 9 / 5) + 32;
    }

    public static double cToK(double c){
        return c + 273.15;
    }

    public static double fToC(double f){
        return (f - 32) * 5 / 9;
    }

    public static double fToK(double f){
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static double kToC(double k){
        return k - 273.15;
    }

    public static double kToF(double k){
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args){

        try (Scanner input = new Scanner(System.in)){

            System.out.print("Convert from (C, F, K): ");
            String from = input.nextLine().toUpperCase();

            System.out.print("Convert to (C, F, K): ");
            String to = input.nextLine().toUpperCase();

            System.out.print("Enter temperature: ");
            double temp = input.nextDouble();

            double result = temp;

            if(from.equals("C") && to.equals("F")){
                result = cToF(temp);
            }
            else if(from.equals("C") && to.equals("K")){
                result = cToK(temp);
            }
            else if(from.equals("F") && to.equals("C")){
                result = fToC(temp);
            }
            else if(from.equals("F") && to.equals("K")){
                result = fToK(temp);
            }
            else if(from.equals("K") && to.equals("C")){
                result = kToC(temp);
            }
            else if(from.equals("K") && to.equals("F")){
                result = kToF(temp);
            }

            System.out.println("Converted temperature: " + result + " " + to);
        }
    }
}


