package threadpool;


public class ForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Task());
            thread.run();
        }
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println("执行了任务");
        }
    }
}
