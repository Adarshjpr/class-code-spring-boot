Spring Boot Annotations


Annotations=> pre build method 
syntax=>>>   @RestController
1. @SpringBootApplication
This is the most important annotation in Spring Boot. It combines three key annotations:
@Configuration: Indicates that the class contains Spring configuration.
@EnableAutoConfiguration: Enables Spring Boot’s auto-configuration mechanism.
@ComponentScan: Tells Spring to scan the package for components, configurations, and services.
2. @RestController
This annotation is a shortcut for combining @Controller and @ResponseBody. It is used to create RESTful web services.
Usage:
3. @RequestMapping
This annotation is used to map web requests to specific handler methods or classes. It can handle various HTTP methods like GET, POST, PUT, and DELETE.
4. @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
These annotations are shortcuts for @RequestMapping for specific HTTP methods. They make the code more readable and focused.
5. @Autowired
This annotation is used to inject beans automatically by type. It can be used on constructors, setters, or fields.
6. @Service
This annotation is used to mark a class as a service, which typically contains business logic. Spring automatically detects it and registers it as a bean.
7. @Repository
This annotation indicates that a class is a repository, which interacts with the database. It is a specialized version of @Component and provides automatic exception translation for database errors.
8. @Component
This generic annotation marks a class as a Spring-managed component. It is a core stereotype annotation that helps in automatic bean discovery.
9. @Configuration
This annotation indicates that the class contains one or more Spring bean definitions. It’s used for configuration purposes.
10. @bean =>  object
This annotation is used to explicitly declare a Spring bean. It is typically used within @Configuration classes to define beans programmatically.
Medium =>  notes  basic 


