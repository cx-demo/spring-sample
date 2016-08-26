package ru.kpfu.itis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import ru.kpfu.itis.config.hibernate.HibernateConfig;
import ru.kpfu.itis.config.security.SecurityConfig;

@Configuration
@Import({ HibernateConfig.class, SecurityConfig.class })
@ComponentScan(basePackages = {"ru.kpfu.itis.service", "ru.kpfu.itis.validator", "ru.kpfu.itis.security"})
@PropertySource("classpath:/api/email_verification_api.properties")
public class RootConfig {

}
