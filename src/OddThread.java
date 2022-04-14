public class OddThread implements Runnable{
    private Thread myThread;


    @Override
    public void run() {
        System.out.println("In cac so le 1-10");
        try {
            for (int i = 0; i <= 10; i++) {
                if (i%2 != 0){
                    System.out.println(i);
                    Thread.sleep(500);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
