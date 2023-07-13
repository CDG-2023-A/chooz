package com.cdg.chooz.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.cdg.chooz.db.mapper")
public class MybatisConfig {

}
