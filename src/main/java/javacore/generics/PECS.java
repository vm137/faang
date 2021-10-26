package javacore.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Producer Extends, Consumer Super
 */
public class PECS {
  public static void main(String[] args) {
    List<Object> objectList = new ArrayList<>();
    List<Number> numberList = new ArrayList<>();
    List<Integer> integerList = new ArrayList<>();

    Object object = 1;
    Number number = 1;
    Integer integer = 1;

    List<Number> genericNumberList = new ArrayList<>();
    List<? extends Number> genericExtendsNumberList = new ArrayList<>();
    List<? super Number> genericSuperNumberList = new ArrayList<>();

//    genericNumberList.add(object);
    genericNumberList.add(number);
    genericNumberList.add(integer);

//    genericNumberList = objectList;
    genericNumberList = numberList;
//    genericNumberList = integerList;

//    genericExtendsNumberList.add(object);
//    genericExtendsNumberList.add(number);
//    genericExtendsNumberList.add(integer);
    genericExtendsNumberList.add(null);

//    genericExtendsNumberList = objectList;
    genericExtendsNumberList = numberList;
    genericExtendsNumberList = integerList;

//    genericSuperNumberList.add(object);
    genericSuperNumberList.add(number);
    genericSuperNumberList.add(integer);
    genericSuperNumberList.add(null);

    genericSuperNumberList = objectList;
    genericSuperNumberList = numberList;
//    genericSuperNumberList = integerList;
  }
}
