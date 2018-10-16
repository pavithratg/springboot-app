package org.eviac.blog.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages= {"org.eviac.blog.model"})
@EnableJpaRepositories(basePackages= {"org.eviac.blog.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {}
