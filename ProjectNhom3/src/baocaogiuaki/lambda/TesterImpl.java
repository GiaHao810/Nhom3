package baocaogiuaki.lambda;

public class TesterImpl implements Tester {

    @Override
    public void hello(String name, int age) {
        System.out.printf("Name: %s ; Age: %S ", name , age);
    }
    
}
