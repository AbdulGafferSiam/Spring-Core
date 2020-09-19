Autowiring: Inject Object dependency automatically. So, No need to write property explicitly in the bean.xml

Autowire Types:

1. byName: 
  Check the name of your dependency in the class.
  Ex: 
  class Human {	
    private Heart heart;
  }
  beans.xml :
  <bean id="heart" class=“com.springproject.Heart” ></bean>
  <bean id=“human” class="com.springproject.Human" autowire="byName"></bean>

Here, “heart” is the variable name and the dependency of Human class.
So, the bean id in beans.xml for Heart class also need to be “heart”.
Inject object in the setter method.

2. byType:
  Check the type of the dependency in the class.
  Ex:
  class Human {	
    private Heart heart;
  }
  beans.xml :
  <bean id="heart" class=“com.springproject.Heart” ></bean>
  <bean id=“human” class="com.springproject.Human" autowire="byName"></bean>

Here, In the Human class the type of variable heart is “Heart”.
The bean class name need to be similar as like the dependency type.

3. constructor:
  Every argument passing through the constructor will be injected.
  For more number of bean, it is difficult to debug when using constructor autowiring.

@autowired annotation:

To use @Autowired annotation and to call our desired constructor we have to activate it by using
  <context:annotation-config/>
in the beans.xml file.

How autowiring works:
  1. First it tries to resolves with “byType”
  2. If byType fails then it goes with “byName”
Notes:
Autowiring is not possible for primitive or String type 
reason:
1. It's because Autowiring is just an alternative for referencing your existing beans in ApplicationContext. 
  It expects a bean or a class, primitive is not a class and it differs from Object. 
  Which is why you can't Autowire primitive types. 
  You can use wrapper classes of the primitive types such as Integer, Double etc... 
  to be able to use Autowiring for such types because you are now referring to a class.
2. How spring could know my data that I wanted to enter?
       ex: my rollNo, myName etc…

@qualifier annotation:
  When I do have multiple implementation or multiple objects
  for the same class and if the ID also different then, to resolve
  the object we need to use qualifier.

* No need to write setter if you are using @Autowired before the dependency

