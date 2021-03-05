package com.jojoldu.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 세션을 어노테이션 기반으로 개선
@Target(ElementType.PARAMETER) // 이 어노테이션이 생성될 수 있는 위치 지정, PARAMETER = 파라미터로 선언된 객체에서만 사용
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser { // @interface : 이 파일을 어노테이션 클래스로 지정
}
