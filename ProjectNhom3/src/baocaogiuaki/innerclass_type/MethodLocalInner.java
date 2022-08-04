package baocaogiuaki.innerclass_type;

public class MethodLocalInner {
    public String outerClasString = "Outer Class!";

    public void creatMethodLocalClass() {
        class LocalInnerClass {
            public String localInnerClassVariable = "Local InnerClass!";

            public void print() {
                System.out.println("\n==== Method Local Inner Class ====");
                System.out.println(outerClasString);
                System.out.println(localInnerClassVariable);
            }
        }

        LocalInnerClass innerClass = new LocalInnerClass();
        innerClass.print();
    }

    
}
