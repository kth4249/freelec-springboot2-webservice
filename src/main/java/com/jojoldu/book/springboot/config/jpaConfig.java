package com.jojoldu.book.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


// @WebMvcTest는 @Configuration을 스캔하지 않고
// @SpringBootTest는 @Configuration을 스캔하므로
// @EnableJpaAuditing을 차별적으로 적용할 수 있음.
@Configuration
@EnableJpaAuditing
public class jpaConfig {}
