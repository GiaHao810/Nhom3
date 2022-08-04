package LambdaEtc;

public class TestDrive__WithLambda {
    public static void main(String[] args) {
        
        Rolling roll = () -> {
            int a = 6;
            System.out.println("A = " + a + a);
        };

        

        roll.roll();
    }
}
