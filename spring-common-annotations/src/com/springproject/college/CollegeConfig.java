package com.springproject.college;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.springproject.college")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
	/*
	 * @Bean(name="colBean") public College collegeBean() { // collegeBean - bean ID
	 * 
	 * return new College(principalBean());
	 * 
	 * }
	 */
	
/*
	@Bean(name = "colBean")
	public College collegeBean() { // collegeBean - bean ID
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}

	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
*/
}
