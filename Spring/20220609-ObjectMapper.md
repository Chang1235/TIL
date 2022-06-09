## ObjectMapper

### ObjectMapper란?

Text JSON 을 Object로 Object를 Text JSON으로 바꿔주는 역할을 한다.

### Object  → Text

- Object mapper는 text 전환시 **get method**를 활용한다. ( 없으면 오류)
- `writeValueAsString()`  을 사용하여 text로 전환한다.
- `JsonProcessingException`을  throws 해줘야 한다.

```java
@Test
void contextLoads() throws JsonProcessingException {
var objectMapper = new ObjectMapper();

     // object -> text
     // 
     var user = new User("steve",10,"010-4443-3244");

     var text = objectMapper.writeValueAsString(user);
     
}
```

### Text  → Object

- Object mapper는 object 전환 시 defalut 생성자를 필요로 한다. ( 없으면 오류)
- `.readValue(text,class파일)` 로 전환한다.
- JsonProcessingException을  throws 해줘야한다.

```java
@Test
void contextLoads() throws JsonProcessingException {
var objectMapper = new ObjectMapper();

    // text -> object
    // 
    var user = new User("steve",10,"010-4443-3244");

    // Object mapper는 defalut 생성자를 필요로 한다.
    var objectUser = objectMapper.readValue(text,User.class);
     
}
```