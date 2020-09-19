# SpringCore-part-6
Required and Value Annotation

<b>@Value Annotaion</b><br>
Use to inject value of literals. <br>
No need to use property tag inside bean.<br>
To inside value dynamically, we can use .properties file to inject value.

We can write @Value annotation on both setter and field.

<b>@Required Annotation </b><br>
Don’t create the bean(student object) if the value for
particular dependency is not given.<br>
If the required value is not provided,
then spring will not create the bean/ object for the class. 
Exception Occur:
1. BeanCreationException
2. BeanInitializationException

@Required checks if a particular property has been set or not. If a field has been annotated with @Required annotation and that field is not set, you will get org.springframework.beans.factory.BeanInitializationException.

@Requird Annotation can only use on setter not field.
