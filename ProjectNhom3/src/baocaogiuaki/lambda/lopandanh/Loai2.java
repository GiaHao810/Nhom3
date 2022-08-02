package baocaogiuaki.lambda.lopandanh;

public class Loai2 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Code Running................");
            }
        };
        Thread t = new Thread(r);
        t.start();
    } 
}
