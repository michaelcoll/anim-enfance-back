package fr.animenfance.creche.config;

import fr.animenfance.common.config.TestConfiguration;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TestConfiguration.class)
public class TestCrecheConfiguration {

  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer() {
    MapperScannerConfigurer configurer = new MapperScannerConfigurer();
    configurer.setBasePackage("fr.animenfance.creche.dao");
    configurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
    return configurer;
  }
}