# SpringCore-part-8


@Component
Don’t configure the bean inside xml file.
configure the bean in Java side.

@Component(“collegeBean”)
Is similar as :
<bean id="collegeBean” class="com.springproject.college.College"></bean>

In layman terms, a Component is responsible for some operations. Spring framework provides three other specific annotations to be used when marking a class as Component.
1. Service: Denotes that the class provides some services. Our utility classes can be marked as Service classes.
2. Repository: This annotation indicates that the class deals with CRUD operations, usually it’s used with DAO implementations that deal with database tables.
3. Controller: Mostly used with web applications or REST web services to specify that the class is a front controller and responsible to handle user request and return appropriate response.
Note that all these four annotations are in package org.springframework.stereotype and part of spring-context jar.

@Configuaration 
Spring @Configuration annotation helps in Spring annotation based configuration. @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.

Configuration class act same as beans.xml config file.
We need to define component-scan in Configuration class.

In beans.xml we need to use:
<context:component-scan base-package=""></context:component-scan>
For component. Now we add @ComponentScan annotation in the @Configuration class with the base-pachage.

As there have Configuration class created, we need not create bean by @Component annotation.

Bean can be created inside Configuration class by using @Bean annotation.

Create bean in the config class:
Step 1: Create a method to return college object.
Note: method name is the default bean id/ bean name. 
But you can change the bean id by using name keyword. 
EX: @Bean(name="colBean")
You can give multiple bean name by using curly bracket.
Ex: @Bean(name={“colBean”, “anotherName”})
Step 2: Use @Bean annotation before the method.

@primary annotation used when one interface have multiple class implementation and can not determine which class object need to inject.

If @primary annotation use in one class then Interface will inject that class object by autowiring. 

If use @Qualifier annotation, then we need to explicitly set the class name to inject its object through autowiring. 

