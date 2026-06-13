import java.util.Scanner;

public class Agenda{

    public static void main(String[] args){
        //creates scanner for user input
        Scanner input = new Scanner(System.in);

        String[] entries = new String[20];
        int count = 0;
        int choice = 0;
        //keeps showing the menu until the user chooses exit
        while (choice != 3){
            System.out.println("\n📕AGENDA MENU📕");
            System.out.println("1. Add Entry➕");
            System.out.println("2. View Entries📖");
            System.out.println("3. Exit🚪");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1){
                if (count < entries.length){
                    System.out.print("Enter your agenda item: ");
                    entries[count] = input.nextLine();
                    count++;
                    System.out.println("Entry added successfully!");
                }else{
                    System.out.println("Agenda is full.");
                }
            }else if(choice == 2){
                if (count == 0){
                    System.out.println("No entries found.");

                }else{

                    System.out.println("\nYour Agenda");
                    //loops through all saved entries and print them
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + entries[i]);
                    }
                }
            }else if (choice == 3){
                System.out.println("Goodbye!");
             }else{
                System.out.println("Invalid option. Try again.");
            }
        }
        input.close(); //closes scanner before ending the program
    }
}
