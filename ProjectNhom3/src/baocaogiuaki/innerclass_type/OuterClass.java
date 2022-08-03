package baocaogiuaki.innerclass_type;

public class OuterClass {
    private String outerString = "Outer string";

    public class InnerClass {
        private String innerString = "Inner string";

        public void xuatThongBao() {
            System.out.println("\n==== Inner Class ====");
            System.out.println(outerString);
            System.out.println(innerString);
        }
    }
}
