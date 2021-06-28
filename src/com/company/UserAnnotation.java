package com.company;

import java.lang.annotation.*;

@Target(ElementType.METHOD) // 해당 어노테이션 사용 대상 지정 -> 메소드에 사용할 수 있다고 정의함.
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 유지 정보를 지정하는데 사용 -> RUNTIME
public @interface UserAnnotation{ // 클래스나 인터페이스를 선언할 때 처럼 @interface로 선언하면 @UserAnnotation으로 어노테이션 사용이 가능해짐
    public int number(); // 메소드처럼 어노테이션 안에 선언해 놓으면, 이 어노테이션을 사용할 떄 해당 항목에 대한 타입으로 값을 지정이 가능하다.
    public String text() default "This is first annotation."; // default라는 예약어를 사용하여 어노테이션을 사용할떄의 기본값을 지정한다.
}
