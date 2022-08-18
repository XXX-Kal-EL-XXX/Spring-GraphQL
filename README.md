# Spring-GraphQL<br/>
<br/>
Spring Boot Application with the implementation of GraphQL.
<br/>
<br/>
<b>Systematic Diagram for GraphQL:</b>
<img src="images/GraphQL_spring-1-1536x922.png" width="60%" height="50%" >


==============================================================
<br/>
<br/>
<img src="images/graphql.png" width="60%" height="50%">
<br/>
<br/>
1.<b>@SchemaMapping:</b> This annotation maps and binds a handler with the field in the GraphQL schema, it can be used at the method or class</br> level.
It accepts two parameters typeName= and field=. It’s also the parent annotations of the other query-specific annotations.</br>
2.<b>@QueryMapping:</b> @QueryMapping is a composed annotation that acts as a shortcut for @SchemaMapping with typeName="Query".</br>
3.<b>@MutationMapping:</b> This annotation maps handler methods with the mutation query in the GraphQL schema.<br/>
4.<b>@SubscriptionMapping:</b> Similar to a query allowing you to fetch data from the server. Subscriptions offer a long-lasting</br>
operation that can change their result over time.

