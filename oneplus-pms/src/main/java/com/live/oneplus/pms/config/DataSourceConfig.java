
package com.live.oneplus.pms.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据源配置
 *
 * @author HelloWoodes*/


@Configuration
public class DataSourceConfig {



/**
     * 需要将 DataSourceProxy 设置为主数据源，否则事务无法回滚
     *
     * @return The default datasource*/


    @Primary
    @Bean("dataSource")
    public DataSource dataSource(@Value("${spring.datasource.url}") String url,@Value("${spring.datasource.driver-class-name}") String classname,
    @Value("${spring.datasource.username}") String name,@Value("${spring.datasource.password}") String password) {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDriverClassName(classname);
        hikariDataSource.setPassword(password);
        hikariDataSource.setUsername(name);
        hikariDataSource.setJdbcUrl(url);
        return new DataSourceProxy(hikariDataSource);
    }
}

