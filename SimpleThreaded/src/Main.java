
class Task {

    public void doTask() {
        for(int i=1; i <= 1000; i++) {
            System.out.print("T");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Call the task to print T's
        Task t1 = new Task();
        t1.doTask();

        // Print M's
        for(int i=1; i <= 1000; i++) {
            System.out.print("M");
        }
    }

}