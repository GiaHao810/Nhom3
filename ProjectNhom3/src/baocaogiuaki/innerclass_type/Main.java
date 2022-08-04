package baocaogiuaki.innerclass_type;

public class Main {
    public static void main(String[] args) {
        // // Innter Class
        // OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        // innerClass.xuatThongBao();

        // // Static Nested Class
        // OuterOfStaticInner.InnerStatic innerStatic = new OuterOfStaticInner.InnerStatic();
        // innerStatic.print();

        // Local Method Innerclass
        MethodLocalInner methodLocalInner = new MethodLocalInner();
        methodLocalInner.creatMethodLocalClass();
    }
}
