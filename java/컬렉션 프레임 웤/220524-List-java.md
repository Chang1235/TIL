## List

### 1. List인터페이스

| 메서드 | 설명 |
| --- | --- |
| void add(int index, Object element)
boolean addAll(int index, Collection c) | 지정된 위치(index)에 객체(element) 또는 컬렉션에 포함된 객체들을  추가한다. |
| Object get(int index) | 지정된 위치(index)에 있는 객체를 반환한다. |
| int indexOf(Object o) | 지정된 객체의 위치(index)를 반환한다.
(List의 첫 번째 요소부터 순방향으로 찾는다.) |
| ListIterator listIterator()
ListIterator listIterator(int index)
 | List의 객체에 접근할 수 있는 ListIterator를 반환한다. |
| Object remove(int index) | 지정된 위치(index)에 있는 객체를 삭제하고 삭제된 객체를 반환한다. |
| Object set(int index, Object element) | 지정된 위치 (index)에 객체(element)를 저장한다. |
| void sort(Compartor c) | 지정된 비교자(Comparator c)로 List를 정렬한다. |
| List subList(intfromIndex, int toIndex) | 지정된 범위(fromIndex부터 toIndex)에 있는 객체를 반환한다. |

## 2. ArrayList

- List 인터페이스를 구현하므로 , 저장순서가 유지되고 중복을 허용한다.
- 데이터의 저장공간으로 배열을 사용한다.
- 배열의 길이가 자동으로 늘어난다.
- 비어있는 공간을 허용하지 않는다. (삭제 시 앞으로 밀착)

- ArrayList의 메서드(간략하게 핵심만)

| 메서드 | 설명 |
| --- | --- |
| ArrayList() | 크기가 10인 ArrayList를 생성 |
| bollean add(Object o) | ArrayList의 마지막에 객체를 추가, 성공하면  true; |
| void add(int index, Object element) | 지정된 위치(index)에 객체를 저장 |
| boolean contains(Object o) | 지정된 객체(o)가 araayList에 포함되어 있는지 확인 |
| Object get (int index) | 지정된 위치(index)에 저장된 객체를 반환한다. |
| int indexOf(Object o) | 지정된 객체가 저장된 위치를 찾아 반환한다. |
| void trimToSize() | 용량을 크기에 맞게 줄인다.(빈 공간을 없앤다.) |
| List subList(int fromIndex, inttoIndex) | fromIndex부터 toIndex사이에 저장된 객체를 반환한다. |

## 3. LikedList

- 배열과 달리 링크드 리스트는 불연속적으로 존재하는 데이터를 연결한다.(link)
- 데이터의 삭제 : 단 한번의 참조변경만으로 가능하다.
- 데이터의 추가: 한번의 Node객체생성과 두 번의 참조변경만으로 가능하다.

## LikedList **종류**

- 링크드 리스트 : 연결리스트. 데이터 접근성이 나쁘다.
- 더블 링크드 리스트 : 이중 연결 리스트, 접근성이 향상된 링크드 리스트이다.
- 더블 써큘러 링크드 리스트 : 처음과 끝을 연결한 더블링크드 리스트라고 생각하면된다.

## ArrayList vs LinkedList 성능 비교

- 순차적으로 데이터를 추가/삭제 - **ArrayList**가 빠름
- 비 순차적으로 데이터를 추가/삭제 - **LinkedList**가 빠름
- 접근시간(acess time) - **ArrayList**가 빠름

## 4. 스택과 큐(Stack & Queue)

- 스택: **LIFO구조**, 마지막에 저장된 것을 제일 먼저 꺼내게 된다.
    - ArrayList로 구현하는게 좋다
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b2766831-5fa4-486f-b00b-8da858a30e46/Untitled.png)
    
- 스택의 메서드

| 메서드 | 설명 |
| --- | --- |
| boolean empty() | Stack이 비어있는지 알려준다. |
| Object peek() | Stack의 맨 위에 저장된 객체를 반환. pop()과 달리 Stack에서 객체를 꺼내지는 않음.(비었을 떄는 EmptyStackException발생) |
| Object pop() | Stack의 맨 위에 저장된 객체를 꺼낸다..(비었을 때는 EmptyStackException 발생 |
| Object push(Object o) | Stack에서 객체(item)를 저장한다. |
| int search(Object o) | Stack에서 주어진 객체(0)를 찾아서 그 위치를 반환, 못찾으면 -1을 반환.
(배열과 달리 위치는 0이 아닌 1부터 시작 |

- **큐(QUEUE)** : **FIFO구조**, 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다.
    - LinkedList로 구현하는게 좋다
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5e91f7ec-620c-48ef-98dc-27464851eaf6/Untitled.png)
    
- 스택의 메서드

| 메서드 | 설명 |
| --- | --- |
| boolean add(Object o) | 지정된 객체를 Queue에 추가한다. 성공하면 true를 반환. 저장공간이 부족하면 IllegalStateException발생 |
| Object remove() | Queue에서 객체를 꺼내 반환. 비어있으면 NoSuchElementException발생 |
| Object element() | 삭제없이 요소를 읽어온다. peek와 달리 Queue가 비었을 때 NoSuchElementException발생 |
| boolean offer(Object o) | Queue에 객체를 저장. 성공하면 true. 실패하면 false를 반환 |
| Object poll() | Queue에서 객체를 꺼내서 반환. 비어있으면 null을 반환 |
| Object peek() | 삭제없이 요소를 읽어 온다. Queue가 비어있으면 null을 반환 |

## 5. 스택과 큐의 활용

**스택의 활용 예** - 수식계산, 수식괄호검사, 워드프로세서의 undo/redo  웹브라우저의 뒤로/앞으로

**큐의 활용 예**  -  최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)