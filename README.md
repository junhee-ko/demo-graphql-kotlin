## Sample Query

Test by this query in play ground (http://localhost:8080/playground)

```graphql
{
  conference{
    name
  }
  
  people (nameStartWith : "j"){
    name
    ... on Attendee{
      ticket
    }
    ... on Speaker {
      talks
    }
  }
  
  s1: schedule {
    greetings
    talks
  }
  
  s2: schedule {
    greetings
    talks
  }
  
  s2: schedule {
    greetings
    talks
  }
}
```

## Reference

KotlinConf 2019: Bootiful GraphQL with Kotlin by Dariusz Kuc & Guillaume Scheibel
(https://www.youtube.com/watch?v=7YJyPXjLdug)
