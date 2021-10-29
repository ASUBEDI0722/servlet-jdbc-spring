package com.ektha.app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConfig {
	
	@Bean(name= "datasource")
	public BasicDataSource getDataSource() {

		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/vehicleregistration?useState");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("java");
		basicDataSource.setInitialSize(5);
		basicDataSource.setMaxTotal(10);

		return basicDataSource;

	}

	@Bean(name="jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;

	}
}
