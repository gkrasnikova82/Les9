package com.task1;

//Заставить программу ”Hello, World!” упасть…
     //   ● Смоделировав ошибку «NullPointerException»
    //    ● Смоделировав ошибку «ArrayIndexOutOfBoundsException»
    //    ● Вызвав свой вариант ошибки через оператор throw

import java.util.Arrays;

class HelloWorld {
      String Hello;
      String World;
      public void Test (HelloWorld x){
          x.Hello="Hello";
      }
}

class ArrayIndex {
    int[] myArray = {1, 2, 3, 4, 5};

    public void DisPlay(int n) {
        myArray[n] = 8;
    }
}

class MyException {
    String name = "кошка";

    public void Cat(String k) throws CatException {
        if (k == name)
            System.out.println(" любимое животное");
        else throw new CatException ();

    }
}
class CatException extends Exception {


}



class Main {
    public static void main(String[] args) {
        try {                                       //выполняется код
            int g;
            System.out.println("Hello, World!");
            HelloWorld n = new HelloWorld();
            n.Test(null);
        } catch (NullPointerException I) {
            System.out.println("Не обьявлен класс HelloWorld ");
        }
        try {
            ArrayIndex D = new ArrayIndex();
            D.DisPlay(7);
        } catch (ArrayIndexOutOfBoundsException O) {
            System.out.println("Ошибка при обращении к элементу массива по отрицательному или превышающему размер массива индексу");

        }
        try {
            MyException S = new MyException();
            S.Cat("собака");


        } catch (CatException W) {
            System.out.println("Введено не правильное имя домашнего животного, получили ошибку");
        }
    }
}



