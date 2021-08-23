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
