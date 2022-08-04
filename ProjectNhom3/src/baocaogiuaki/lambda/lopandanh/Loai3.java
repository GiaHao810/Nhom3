package baocaogiuaki.lambda.lopandanh;

public class Loai3 {
    
    public static void main(String[] args) {
      
        Thread t = new Thread(new Runnable() {
                 
            @Override
            public void run() {
                System.out.println("Code Running...........");
            }
        });
        t.start();
    }
}
