# 클래스

# 1. 클래스

객체를 프로그래밍 하기 위해 코드로 정의해 놓은 상태를 말한다.

## **1) 클래스의 구조**

클래스의 구조는 클래스선언부, 클래스이름, 맴버변수 선언, 생성자 메소드, 메소드로 만들어진다.

```java
//클래스 선언부
class 클래스이름{

	//맴버변수 선언

	//생성자 메소드 선언

	//메소드 선언
}
```

### (1) 클래스 선언부

class 예약어 뒤에 클래스 이름을 적는다. 이름은 대문자로 시작하는것 이 묵언의 규칙이다. 

### (2) 멤버변수(Member Value)

클래스 선언부 바로 밑에 일반적으로 위치하며 ‘클래스 변수’ 또는 ‘필드’라고도 한다.

- 클래스로부터 객체가 생성될 때 객체에 포함되는 유일한 요소이다.
- 객체를 이용한다는 것은  멤버변수에 할당된 데이터를 이용한다는 것과 같다.

### (3) 생성자 메소드 (Constructior  Method)

- 생성자는 클래스 이름과 동일한 이름의 메소드이다.
- 객체의 멤버변수 초기화를 담당한다.

# 2. 객체의 생성과 사용

## 1) 객체의 생성과 사용

클래스로부터 객체를 생성하기 위해서는 new를 사용한다.

```java
new 생성자();
```

참조 변수선언과 객체할당을 한 줄로 작성할 수도 있다.

```java
클래스이름 참조변수 == new 생성자();
```

## 2) 참조 변수의 특징

- 참조 변수는 기본 타입의 변수와 달리 **객체의 주소 정보**가 할당이 된다.

# 3. 객체와 접근 제어

## 1) 접근 제어 개념

- 외부에 공개할 정보와 그렇지 않은 정보를 구분하여 접근을 제어하기 위해 사용한다.

## 2) 접근제어 지시자

- 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수있는지여부를 지정하는 키워드

| 키워드 | 설명 |
| --- | --- |
| 아무것도 없음 ( default ) | 같은 패키지 내부에서만 접근 가능 (상속 관계라도 패키지가 다르면 접근 불가) |
| public | 클래스의 외부 어디서나 접근할 수있음 |
| protected | 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음 |
| private | 같은 클래스 내부에서만 접근 가능( 외부 클래스, 상속관계의 클래스에서도 접근 불가) |

## 

# 4. 메소드

## 1) 메소드의 구조

```java
리턴타입 메소드이름 (매게변수목록){
//메소드의 기능(로직)
	return 메소드 실행결과;
}
```

### (1) 리턴타입

- 메소드가 리턴할 데이터 타입이다.
- 반드시 리턴타입으로 선언한 데이터를 리턴해야 한다.
- 아무것도 리턴하지 않는다면 리턴타입을 **void**로 선언한다.

### (2) 메소드 이름

- 메소드이름을 너무 축약해서 쓰게되면 기능을 유추할 수없기때문에 되도록 축약하지 않도록 쓰는 것이 좋다

### (3) 매게변수

- 매게변수를 통해 메소드이 기능 수행에 필요한 데이터를 받아들인다.
- 멤버변수만으로 기능을 처리할 수 있는 경우 매게변수를 선언하지 않아도 된다.  ()는 써줘야한다.
- 메소드가 종료되는 순간 삭제된다.
- 매게변수의 개수는 적을수록 좋다.
- 매개변수는 매개변수가 선언된 메소드 안에서만 사용할 수 있는 로컬 변수다.

## 2) get()/set()메서드

- private 으로 선언된 멤버 변수 (필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공
- get() 메서드만 제공 되는 경우 read-only 필드
- 이클립스에서 자동으로 생성됨 ( `Shift` + `Alt`+ `s`  →**Genrate Getters and Setters** 클릭)

## 3) 메소드 오버로딩

하나의 클래스에 이름이 같은 메소드를 여러 개 선언하는 것을 메소드 오버로딩이라고 한다.

```java
int print(int number){
    return number; 
}

int print(int number, int score){
    
 return number+score;
}

int print(double avg, int number){
    return avg
}
```

### (1) 오버로딩의 조건

1. 메서드 이름이 같아야 한다
2. 매개변수의 개수 또는 타입이 달라야 한다
3. 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다
( 리턴타입은 오버로딩을 구성하는데 아무런 영향도 주지 못한다.)

### (2) 오버로딩의 장점

1. 메서드의 이름을 절약할 수있다.
2. 하나의 이름만 기억하면 되므로 기억하기도 쉽고 이름도 짧게 할 수 있어서 오류의 가능성을 많이 줄일 수 있다.