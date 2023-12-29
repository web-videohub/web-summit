package com.teamrocket.summit.config;

import com.teamrocket.summit.interceptor.AfterLoginInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {

    private final AfterLoginInterceptor afterLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(afterLoginInterceptor)
                .addPathPatterns("/login", "/register", "/find-pw");
    }
}
