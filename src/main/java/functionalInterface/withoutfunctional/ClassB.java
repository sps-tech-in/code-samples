package functionalInterface;

public class ClassB {
    ClassC c = new ClassC();
    String method1(Integer i){
        return c.method1(i);
    }
    String method2(Integer i){
        return c.method2(i);
    }
}
