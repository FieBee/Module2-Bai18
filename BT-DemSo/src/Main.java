public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        count.getMyThread();
        try{
            while (count.getMyThread().isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread run is over" );
    }




}
