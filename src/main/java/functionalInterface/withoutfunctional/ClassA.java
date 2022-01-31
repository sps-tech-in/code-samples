package functionalInterface;

public class ClassA {
    ClassB b = new ClassB();
    void methodA(String type){
        if("type1".equals(type)){
            b.method1(1);
        }if("type2".equals(type)){
            b.method2(2);
        }
    }
}
