package com.jdk.test;

import com.dal.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: wb-tjh438466
 * @date: 2018/8/8
 * @since: 1
 * description:
 */
public class NewCharacter {
    public static void main(String[] args){
        //Lambda 表达式
        MathOperation  addtion;
        addtion =( a,b) -> a+b;
        System.out.println("1+2="+addtion.operation(1,2));
        //System.out.println("1-2="+new NewCharacter().subration(1,2));
        List<Student> students=new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Student student = new Student();
            student.setAge(i+1);
            student.setGrade(+1+"");
            student.setName("张三");
            students.add(student);

        }
        students.forEach(p -> System.out.println("name:"+p.getName()));
        students.forEach(Student::getGrade);
    }

    interface MathOperation {
        int operation(int a, int b);
        default int subration(int a,int b){
            return  a-b;
        }
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
