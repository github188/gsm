package org.zxl.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.dialect.SpringStandardDialect;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.zxl.utils.Path;

/**
 * Created by zxl_lls@foxmail.com on 2018/3/2.
 */
@Configuration
public class ThymeleafConfig {

//	@Bean
//	public ServletContextTemplateResolver templateResolver() {
//		ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
//		resolver.setPrefix("templates/");
//		resolver.setTemplateMode("HTML5");
//		resolver.setOrder(1);
//		return resolver;
//	}

//	@Bean
//	public SpringTemplateEngine templateEngine() {
//		SpringTemplateEngine engine = new SpringTemplateEngine();
//		engine.setTemplateResolver(templateResolver());
//		engine.addDialect(new LayoutDialect());
//		engine.addDialect(new SpringStandardDialect());
//		return engine;
//	}
//
//	@Bean
//	public ThymeleafViewResolver thymeleafViewResolver() {
//		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//		resolver.setTemplateEngine(templateEngine());
//		return resolver;
//	}
}
