public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();


        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.setName("thread 1");
        thread2.setName("thread 2");

        thread1.start();
        thread2.start();
    }
}
