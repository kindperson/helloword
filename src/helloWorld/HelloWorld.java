package helloWorld;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wb-tjh438466
 * @date: 2018/8/8
 * @since: 1
 * description:
 */
public class HelloWorld {
    public static void main(String[] args){
        /*System.out.println("hello world! 啦啦");

        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组

        int a=1;
        String b="张三";
        String obj=getInfo(a,"张三");
        System.out.println(obj);

        List<String> list =new ArrayList<String>();
        list.add("1");*/

        System.out.println(1<<30);

        //java里面的堆和栈的意义
        System.out.println("我已经做好了准别");
    }

    // 泛型方法 printArray
    public static < E > void printArray( E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static < M,Z > Z getInfo(M obj0,Z obj1){
        System.out.println(obj0+"---"+obj1);
        return  obj1;
    }
}
