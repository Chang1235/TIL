## Iterator, ListIterator, Enumeration

- 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
- ListIterator는 Iterator의 접근성을 향상시킨 것이다. ( 단방향 → 양방향) (잘 안쓰인다.)
    - Enumeration은 Iterator의 구버젼이다.

 **<literator 주요메서드>**

- hasNext() : 읽어 올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false
- next() : 다음 요소를 읽어 온다. next()를 호출하기 전에 hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전하다.

- 컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
    
    ```java
    List list = new ArrayList(); //다른 컬렉션으로 변경할 떄는 이 부분만 고치면 됨
    Iterator it = list.iterator();
    
    while(it.hasNext()){ //hasNext()가 false가될 때까지
    		System.out.println(it.next());
    }
    ```
    

장점

- Iterator 코드를 변경할 일이 없다.( 유지보수성 상승)

## Map 과 Iterator

- Map에는 iterator()가 없다. (Collection 객체가 아니기 때문)
- keySet(), entrySet(), values()를 호출해야한다.
    
    ```java
    Map map = new HashMap()
    Iterator it = map.entrySet().iterator();
    ```