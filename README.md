# java-spring-junit-TestProperties
examples on how to handle junit tests environment with test properites

Dealing with system or env properties while working with Spring and writing unit tests with Junit can be a bit tricky sometimes. 

In some contexts you need to write the code in that manner that it can be easily tested with as much coverage as possible. 
Thats's why they call it test driven development.

One of the aspects you really have to keep in mind and it can really avoid you spending too much time on writing unit tests is the way you are handling JVM system properties (that System.getProperty("something")) or Spring Environment properties (that env.getProperty("something")).

For the beginning, just keep in mind these things:
- while running an Unit Test, you are out of the Spring context (so, you will see other properties)
- sometimes you need to reuse the same properties as in production (and for that you will need to run the test with SpringRunner)
- other times you will need to manually mock some properties and to avoid using them as in production, which will require activation of the test profile 
- it is not ideal to statically set directly in your code System properties, because it will be harder to use another set from Junit context, if necessary (this will require rewriting of you methods, if overwriting from Junit is not possible between method calls). So, better set dynamically your system properties or pass them from the outside of the context

// Other details to come (running with Mockito and mocking classes or injecting test properties in env)