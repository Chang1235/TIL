# 지네릭스

## 1. 지네릭스란?

- 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능이다.
- 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여준다.

<aside>
💡 **지네릭스의 장점**
 1.   타입 안정성을 제공한다.

1. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.
</aside>

## 2. 타입 변수

- 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용.

```java
public class ArrayList extends Abstract List{
	private transient Object[] elementData;
	public booleand add(Object o) {내용생략 }
	public Object get (int index) {내용생략}
	....
}

// 위 코드를  타입변수로 변환
public class ArrayList<E> extends Abstract List<E>{
	private transient E[] elementData;
	public booleand add(E o) {내용생략 }
	public E get (int index) {내용생략}
	....
}
```

**<임의의 참조형 타입>**

```java
<T> : 타입변수 (type variable)
<E> : 요소 (Element)
<K> : 키 (Key)
<V> : 값 (value)
```

> 무조건 **T**를 사용하기보다 가능하면 상황에 맞게 의미있는 문자를 선택해서 사용하는 것이 좋다
> 

## 3. 타입 변수에 대입하기

- 객체를 생성시, 타입 변수( E) 대신 실제 타입(Tv)을 지정(대입)
    
    ```java
    //타입변수 E  대신에 실제 타입  TV를 대입
    ArrayList<Tv>  tvList = new ArrayList<Tv>();
    ```
    
    이렇게 생성 해놓으면 tvList라는 ArrayList에는 Tv객체만 생성할 수 있다는 뜻이된다.
    

## 4. 지네릭스 용어

```markdown
**Box<T>** 지네릭 클래스 'T의 Box' 또는 'T Box'라고 읽는다.
**T**      타입변수 또는 타입 매게 변수.(T는 타입 문자)
**Box**    원시 타입(raw type)
```

## 5. 지네릭 타입과 다형성

- 참조 변수와 생성자의 대입된 타입은 일치해야 한다.
- 지네릭 클래스간의 다형성은 성립(여전히 대입된 타입은 일치해야한다.)
    
    ```markdown
    List<TV> list = new ArrayList<Product>(); // ArrayList가 List를 구현
    List<TV> list = new LinkedList<Product>(); // LinkedList가 List를 구현
    ```
    

 

- 매게 변수의 다형성도 성립한다.