## 4. 지네릭스

1) 지네릭스란?

- 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능이다.

2) 지네릭스의 장점

1. 타입 안정성을 제공한다.
2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.

3) 지네릭 클래스의 선언

```java
// 클래스 box
classs Box{
	Object item:
	
	void setItem(Object item) {this.item =item;}
	Object getItem() {return item;}
}

// 지네릭 클래스로 선언한 box
classs Box<T>{
	T item:
	
	void setItem(T item) {this.item =item;}
	T getItem() {return item;}
}
```

**<임의의 참조형 타입>**

```java
<T> : 타입변수 (type variable)
<E> : 요소 (Elemnt)
<K> : 키 (Key)
<V> : 값 (value)
```

> 무조건 **T**를 사용하기보다 가능하면 상황에 맞게 의미있는 문자를 선택해서 사용하는 것이 좋다
> 

```java
class Box<String>{
	String item;
	
	void setItem(String item) {this.item = item;
	String getItem() {return item;}
}
```

4) 지네릭스의 제한