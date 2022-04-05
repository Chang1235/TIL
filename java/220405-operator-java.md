#  연산자(Operator)

## 1. 산술연산 

| 연산자| 설명|
| +  | 더하기|
| - | 빼기|
| * | 곱하기|
| / | 나누기|
| % | 나머지|

** 복합 할당 연산자**

- sum += number : sum = sum + number
- sum -= number : sum = sum - number
- sum *= number : sum = sum * number
- sum /= number : sum = sum / number
- sum %= number : sum = sum % number

## 2. 증감 연산자 

변수 앞이나 뒤에 붙어서 변수의 값을 1씩 증가시키거나 1씩 감소시킬 때 사용한다.

- (1) 증가 연산자 : ++ 
= (2) 감소 연산자 : --

## 3. 비교 연산자 

비교 연산자의 반환값은 true or false 이다.

- > : ~보다 크다.
- >= : ~ 보다 크거나 같다.
- < : ~보다 작다.
- <= : ~ 보다 작거나 같다.
- == : 같다
- != : 다르다

## 4. 논리 연산자

논리 연산자의 반환값은 true or false 이다.

**(1) AND(&) 연산** : 양 쪽의 조건이 모두 참(true)이면 전체 결과를 참으로 처리한다.

**(2) OR(|) 연산 : 양 쪽의 조건중 하나만 참(true)이면 전체 결과를 참으로 처리한다.

## 5. 조건 연산자

특정 조건이 참인지, 거짓인지에 따라 결과 값이 달라지는 연산자로서 ** 삼 항 연산자 **라고도 한다.

- ` String resul = a > b ? "true" : "false" ` : a 가 b 보다 크면 "true"를 적고 b가 크다면 "false" 룰 result 값으로 반환하라

