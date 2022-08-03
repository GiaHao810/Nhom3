package baocaogiuaki.innerclass_type;

public class OuterOfStaticInner {
    public static String outerString = "Outer String!";
    public int a = 5;

    public static class InnerStatic {
        public String innerString = "Inner String";

        public void print() {
            System.out.println("\n==== Static Nest Class ====");
            System.out.println(outerString);
            System.out.println(innerString);
        }
    }
}
