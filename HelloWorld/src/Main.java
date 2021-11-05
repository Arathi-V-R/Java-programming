import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        //Coding challenge 1,2
        //Exercise 1
        /* System.out.println("SHOPPING LIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Free-range");
        System.out.println("\t-Bread");
//2
        System.out.println("SHOPPING LIST\n\t- Milk\n\t\t> Semi-skimmed\n\t\t> Medium\n\t- Eggs\n\t\t> Free-range\n\t-Bread\n");
//3

        System.out.println("\nThe");
        System.out.println("\tCake ");
        System.out.print("Is");
        System.out.println("\t\t A");
        System.out.print("\tLie.");
//4
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name : ");
        String firstName = scanner.next();

        System.out.print("Age : ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: ");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.\nYour name is " + firstName.length() + " characters long.");
        System.out.println("You've lived " + age + " years.In another " + age + " years you'll be " + 2*age + " year's old.");
//5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();
        System.out.println("Enter the number of people: ");
        int numPeople = scanner.nextInt();

        System.out.println("Amount of cash each person payed: " + billAmount/numPeople);
//6
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number : ");
        int x = scanner.nextInt();

        System.out.println("enter second number : ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(x +" is bigger than " + y);
        }
        else if (x < y){
            System.out.println(x + " is smaller than " + y);
        }
        else{
            System.out.println(x + " and " + y + " are equal.");
        }
        int d = x - y;
        System.out.println("The difference between x and y is: " + d);
//7
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int guessNumber = scanner.nextInt();
        if (randomNumber == guessNumber){
            System.out.println("correct!aren't you lucky." + randomNumber);
        }
        else {
            System.out.println("wrong.have another go .");
            System.out.println("guess another number: ");
            guessNumber = scanner.nextInt();
            if (randomNumber == guessNumber){
                System.out.println("Correct About time." + randomNumber + " is the number.");
            }
            else {
                System.out.println("Wrong again!May be next time," + randomNumber + " is the number.");
            }
        }
        //8
        int count = 1;
        for (int i = 1;i <= 40;i++){
            System.out.println(i);
           if (count == 3){
               System.out.println("Quack");
               count = 0;
           }
           count++;
        }
//8
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter password: ");
            input =  scanner.next();
        }while (!input.equals("shark50"));

        System.out.println("ACCESS APPROVED");
//9
        for (int i = 0;i <=10;i++){
            System.out.print(i + ",");
        }
        System.out.println("\b.");
        //10
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        Scanner scanner = new Scanner(System.in);
        int guessNumber;
        int count = 0;
        do {
            System.out.println("Guess a number: ");
            guessNumber = scanner.nextInt();
            count++;
            if (guessNumber < randomNumber){
                System.out.println("HIGHER, " + randomNumber);
            }
            else if (guessNumber > randomNumber){
                System.out.println("LOWER ," + randomNumber);
            }
            else {
                System.out.println("Correct.The number is: " + randomNumber);
                System.out.println("Number of guess: " + count);
            }
        }while (guessNumber != randomNumber);
        //11
        int[] array = {10,25,13,85,46,456,74,26,95,42};
        for (int i=0;i < 10;i++){
            System.out.println(array[i]);
        }
        //12
        double[] array = new double[5];
        array[0] = 12.1;
        array[1] = 15.6;
        array[2] = 85.6423;
        array[3] = 54.01;
        array[4] = 26.84;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double mean = sum / array.length;
        System.out.println("sum=" + sum);
        System.out.println("mean=" + mean);
    }
        String[] foodItems = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter food items");
        for (int i = 0; i < foodItems.length; i++) {
            System.out.println("food " + (i + 1));
            foodItems[i] = scanner.nextLine();

        }
        System.out.println("No more memory available.");
        System.out.println("Your favourite foods are:");
        for (int i = 0;i < foodItems.length;i++){
            System.out.println(foodItems[i]);
        }
        //Tic-Tac-Toe
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'x';
        int currentTurn = 1;
        while (true) {
            do {
                System.out.println("Enter a position: ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'x' || pos[input - 1] == 'o');

            pos[input - 1] = turn;

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8]);
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5]);
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2]);

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[6] == turn && pos[3] == turn && pos[0] == turn
                    || pos[7] == turn && pos[4] == turn && pos[5] == turn
                    || pos[8] == turn && pos[5] == turn && pos[2] == turn
                    || pos[6] == turn && pos[4] == turn && pos[2] == turn
                    || pos[8] == turn && pos[4] == turn && pos[0] == turn) {
                System.out.println(turn + " is the winner");
                break;
            }
                if (turn == 'x') {
                    turn = 'o';
                } else if (turn == 'o') {
                    turn = 'x';
                }
                currentTurn++;
                if (currentTurn > 9){
                    System.out.println("Draw");
                    break;
                }
        }*/
        //prime
        int num = 7;
        boolean isPrime = true;
        for (int div = 2;div < num;div++){
            if (num % div == 0){

                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(" is prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}







