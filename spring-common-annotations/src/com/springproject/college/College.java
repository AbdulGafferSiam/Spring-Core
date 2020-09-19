package com.springproject.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${college.name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */
/*	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void setPrincipal(Principal principal) {
		System.out.println("Using setPrincipal method");
		this.principal = principal;
	}
*/
	public void test() {
		System.out.println("test college");
		System.out.println("College name: " + collegeName);
		principal.principalInfo();
		teacher.teach();
	}

}
