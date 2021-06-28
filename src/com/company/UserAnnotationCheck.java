package com.company;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args){
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass){
        Method[] methods = useClass.getDeclaredMethods(); // 메소드를 호출하면 해당 클래스에 선언되어 있는 메소드들의 목록을 배열로 리턴
        for(Method tempMethod:methods){
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class); // 해당 메소드에 선언되어 있는 매개변수로 넘겨준 어노테이션이 있는지 확인하고 있을 경우 그 어노테이션의 객체를 리턴

            if(annotation != null){
                int number = annotation.number(); //어노테이션에 선언된 메소드를 호출하면, 그 값을 리턴한다.
                String text = annotation.text();
                System.out.println(tempMethod.getName()+"() : number="+number+" text="+text);
            } else{
                System.out.println(tempMethod.getName()+"() : annotation is null.");
            }
        }
    }
}
