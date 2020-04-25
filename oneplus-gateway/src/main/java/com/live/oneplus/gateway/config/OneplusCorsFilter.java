package com.live.oneplus.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class OneplusCorsFilter {

    @Bean
    public CorsWebFilter corsWebFilter(){
        //cors跨域配置
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://localhost:1000");//请求域名
        corsConfiguration.setAllowCredentials(true);//是否携带cookies为了单点登录
        corsConfiguration.addAllowedMethod("*");//请求方法
        corsConfiguration.addAllowedHeader("*");//请求头信息
        //配置元对象
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
        //cors过炉器对象
        return  new CorsWebFilter(urlBasedCorsConfigurationSource);
    }
}
