import java.util.Scanner;

public class Main {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();

        do {
            displayGuests();
            displayMenu();
            int option = getOption();



            if (option == 1) {
                addGuest();
            }

                else if (option == 2) {
                         removeGuest();
                    }
                else if (option == 3) {
                        System.out.println("exiting...");
                        break;
                    }
                }while (true);

            }

        static void displayGuests() {
            System.out.println("________________________\n- Guests -\n");
            boolean isEmpty = true;

            for (int i = 0; i < guests.length; i++) {
                   /* if (guests[i] == null){
                        System.out.println("--");
                    }
                    else {
                        System.out.println(guests[i]);
                    }*/
                if (guests[i] != null){
                    System.out.println((i + 1) + ". " +  guests[i]);
                    isEmpty = false;
                }
            }
            if (isEmpty){
                System.out.println("Guest list is empty");
            }
        }
        static void displayMenu(){
            System.out.println("________________________\n- Menu -\n");

            System.out.println("1- Add guest");
            System.out.println("2-Remove guest");
            System.out.println("3- Exit");
        }
        static int getOption(){
            System.out.println("Option: ");
            int option = scanner.nextInt();
            System.out.println();
            return option;
        }
        static void addGuest(){
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] == null) {
                    System.out.println("Name: ");
                    String name = scanner.next();
                    guests[i] = name;
                    break;

                }
            }
        }
        static void removeGuest(){
            System.out.println("Number: ");
            int num = scanner.nextInt();
            guests[num - 1] = null;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null && guests[i].equals(num)) {
                    guests[i] = null;
                    break;
                }
            }
        }
        static void insertTestNames(){
        guests[0] = "Arathi";
        guests[1] = "Asha";
        guests[2] = "Raju";
        guests[3] = "Athira";
        guests[4] = "Ammu";
        }
    }


