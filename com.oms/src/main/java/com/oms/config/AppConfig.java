package com.oms.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan("com.ektha.springjdbc")
@Configuration
public class AppConfig {

	// configuring the BasicDataSource bean is from apachdbvb2 that implements
	// DataSource
	@Bean(name = "basicDataSource")
	public BasicDataSource getDataSource() {

		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(null);
		basicDataSource.setUrl(null);
		basicDataSource.setUsername(null);
		basicDataSource.setPassword(null);
		basicDataSource.setInitialSize(0);
		basicDataSource.setMaxTotal(0);

		return basicDataSource;
	}

	// configuring jdbcTemplate bean from spring-jdbc and with it's dependency.
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

}
