package baocaogiuaki.lambda.lopandanh;

public class Loai1 {
    public static void main(String[] args) {

        Thread t = new Thread() {
     ;
            @Override
            public void run() {
                System.out.println("Code Running............");
            }
        };
        t.start();
    }
}
