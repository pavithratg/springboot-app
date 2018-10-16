package org.eviac.blog.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    // allow all requests to the root url ("/")
    // allow all requests to the H2 database console url ("/console/**")
    httpSecurity
        .authorizeRequests()
        .antMatchers("/")
        .permitAll()
        .and()
        .authorizeRequests()
        .antMatchers("/console/**")
        .permitAll();

    // disable CSRF protection
    httpSecurity.csrf().disable();
    // disable X-Frame-Options in Spring Security
    httpSecurity.headers().frameOptions().disable();
  }
}
