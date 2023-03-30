package _2023_03_28;

import java.util.ArrayList;
import java.util.List;

/**
 * - сделать класс Animal-->(bird, mlek)
 * - Bird --> (tropic, non tropic)
 * - Mlek -->(Home, Wild) ----->>>
 * - InterImpl.java должна быть парам и иметь ограничения
 */
public class ParamEx1 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
    }
}

class A {
    /**
     * Class<? extends K>
     *     --> любой тип который наследуется от К, в том числе и К
     * Class<? super K>
     *     --> класс К и любой его супер класс
     */

}

class B extends A {}
class C extends A {}
