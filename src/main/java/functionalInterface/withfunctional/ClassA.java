package functionalInterface.withfunctional;

public class ClassA {
    ClassB b = new ClassB();
    ClassC c = new ClassC();

    void methodA(String type) {
        if ("type1".equals(type)) {
            b.applyMethodC(c::method1, 1);
        }
        if ("type2".equals(type)) {
            b.applyMethodC(c::method2, 2);
        }
    }
}
