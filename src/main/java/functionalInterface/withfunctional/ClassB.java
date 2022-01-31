package functionalInterface.withfunctional;

import java.util.function.Function;

public class ClassB {
    String applyMethodC(Function<Integer, String> funct, Integer i){
        return funct.apply(i);
    }
}
