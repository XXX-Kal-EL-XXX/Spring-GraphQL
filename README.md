# Spring-GraphQL</br>
Spring Boot Application with the implementation of GraphQL.<br/>
Systematic Diagram for GraphQL:<br/>
![graphql](https://user-![GraphQL_spring-1-1536x922](https://user-images.githubusercontent.com/96761317/185198939-15dbf9f1-f051-4827-8053-80b67ecfceca.png)
<br/>
images.githubusercontent.com/96761317/185198136-7b23af6a-fa4a-44d9-970d-489c8a76ca67.png)
<br/>
1.@SchemaMapping: This annotation maps and binds a handler with the field in the GraphQL schema, it can be used at the method or class level.<br/>
It accepts two parameters typeName= and field=. It’s also the parent annotations of the other query-specific annotations.
2.@QueryMapping: @QueryMapping is a composed annotation that acts as a shortcut for @SchemaMapping with typeName="Query".<br/>
3.@MutationMapping: This annotation maps handler methods with the mutation query in the GraphQL schema.<br/>
4.@SubscriptionMapping: Similar to a query allowing you to fetch data from the server. Subscriptions offer a long-lasting<br/>
operation that can change their result over time.
