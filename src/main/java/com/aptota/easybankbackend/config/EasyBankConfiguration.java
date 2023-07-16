package com.aptota.easybankbackend.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import javax.sql.DataSource;
import java.util.Properties;

//@Configuration
public class EasyBankConfiguration {

//    @Bean
    public DataSource getDataSource(){
        return DataSourceBuilder.create()
//                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/easybank")
                .username("root")
                .password("root")
                .build();
    }

//    @Bean(name="entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource){
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        //properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.setProperty("hibernate.show_sql","true");
        localSessionFactoryBean.setPackagesToScan("com.aptota.easybankbackend");
        localSessionFactoryBean.setHibernateProperties(properties);
        return localSessionFactoryBean;
    }

}
