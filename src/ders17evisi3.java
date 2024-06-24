public class ders17evisi3 {
            public static void main(String[] args) {
                Thread sleepThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 1; i <= 5; i++) {
                            System.out.println(i);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });

                sleepThread.start();
            }
        }



