package com.ektha.cms.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan("com.ektha.cms")
@Configuration

public class AppConfig {
	
	@Bean(name = "basicDataSource")
	public BasicDataSource getDataSource() {

		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/sys?useSSL=false");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("java");
		basicDataSource.setInitialSize(5);
		basicDataSource.setMaxTotal(10);

		return basicDataSource;

	}

	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;

	}

//	@Bean(name = "namedParameterJdbcTemplate")
//	public NamedParameterJdbcTemplate getnaNamedParameterJdbcTemplate() {
//		NamedParameterJdbcTemplate parameterJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
//		return parameterJdbcTemplate;
//	}
}
