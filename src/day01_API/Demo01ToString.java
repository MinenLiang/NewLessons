package day01_API;

import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

/*
* java .Lang.object类
* 类object是类层次结构的根(最顶层)类。每个类都使用object作为超(父)类。
* 所有对象（包括数组)都实现这个类的方法。
* */
public class Demo01ToString {
    public static void main(String[] args) {
        /*
        * Person类默认继承了object类,所以可以使用object类中的toString方法
        * String toString()返回该对象的字符串表示。
        * */
        Person person = new Person("张三", 18);
        String s = person.toString();
        //直接打印对象的名字,其实就是调用对象的toString方法 p = p.toString( );
        System.out.println(s);//day01_API.Person@6d03e736

        System.out.println(person); //day01_API.Person@6d03e736

        //看一个类是否重写了toString方法,直接打印这个类对应对象的名字即可
        //如果没有重写toString方法,那么打印的就是对象的地址值(默认)
        // 如果没有重写toString方法，那么就按照重写的方式打印

        Random random = new Random();
        System.out.println(random); //java.util.Random@7291c18f 没有重写toString方法

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);//java.util.Scanner[delimiters=\p{javaWhitespace}+... 重写toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1, 2] 重写toString方法
    }

}
