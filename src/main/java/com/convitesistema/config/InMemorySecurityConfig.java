package com.convitesistema.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
	throws Exception {
		builder.inMemoryAuthentication().withUser("thiago").password("123").roles("ADMIN").and()
		.withUser("t").password("321").roles("USER");
	}

}
