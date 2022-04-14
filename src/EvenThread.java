public class EvenThread implements Runnable {
    private Thread t;

    @Override
    public void run() {
        System.out.println("In ra cac so chan");
        try {
            for (int i = 0; i <= 10; i++) {
                if (i%2==0){
                    System.out.println(i);
                    Thread.sleep(700);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
