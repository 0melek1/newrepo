public class ders17 {
    public static void main(String[] args){

        Thread hello = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

        Thread world = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("world");
            }
        });

        hello.start();

            try {
                hello.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            world.start();




        }
    }

