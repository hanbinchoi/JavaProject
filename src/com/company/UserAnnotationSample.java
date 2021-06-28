package com.company;

public class UserAnnotationSample {
    @UserAnnotation(number=0)
    public static void main(String[] args){
        UserAnnotationSample sample = new UserAnnotationSample();
    }

    @UserAnnotation(number = 1) // text는 default값을 지정했으므로 초기화 안해도 문제x
    public void annotationSample1(){

    }
    @UserAnnotation(number = 2,text = "second")
    public void annotationSample2(){

    }
    @UserAnnotation(number = 3,text = "third")
    public void annotationSample3(){

    }
}
