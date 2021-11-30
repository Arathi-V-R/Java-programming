public class Main {

    static class Task1 extends Thread{
        public void run(){
            System.out.println("\nTask1 started");
            for (int i =101;i <= 199;i++)
                System.out.print(i + " ");
            System.out.print("\nTask1 done");
        }
    }

    static class Task2 implements Runnable{

        @Override
        public void run() {
            System.out.println("\nTask2 started");
            for (int i =201;i <= 299;i++)
                System.out.print(i + " ");
            System.out.print("\nTask2 done");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.print("\nTask1 kicked off");
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();

        System.out.print("\nTask2 kicked off");
        Task2 task2 = new Task2();
        Thread task2tTread = new Thread(task2);
        task2tTread.setPriority(10);
        task2tTread.start();

        task1.join();
        task2tTread.join();
        
        System.out.print("\nTask3 kicked off");
        for (int i =301;i <= 399;i++)
            System.out.print(i + " ");
        System.out.print("\nTask3 done");

        System.out.print("\nMain done");
    }
}
