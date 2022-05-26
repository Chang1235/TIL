## Set인터페이스

- Set인터페이스의 메서드는  **Collection인터페이스**와 동일하다.
- 집합과 관련된메서드(Collection에 변화가 있으면 true, 아니면 false를 반환

| 메서드 | 설명 |
| --- | --- |
| boolean addAll(Collection c) | 지정된 Collection(c)의 객체들을 Collection에 추가한다.(합집합) |
| boolean contains(Collection c)
 | 지정된 Collection의 객체들이 Collection에 포함되어 있는지 확인한다. (부분집합) |
| boolean removeAll(Collection c) | 지정된 Collection에 포함된 객체들을 삭제한다. (차집합) |
| boolean retainAll(Collection c) | 지정된 Collection에 포함된 객체만을 남기고 나머지는 Collection에서 삭제한다. (교집합) |


## HashSet

- Set인터페이스를 구현한 대표적인 컬렉션 클래스
- set은 정렬이 불가능하다.(sort()메서드가 존재하지 않음)
- 순서를 유지하려면,LinkedHashSet클래스를 사용하면된다.

### HashSet - 주요 메서드

**생성 메서드**

- HashSet() , HashSet(Collection c), HashSet(int initialCapacity), HashSet(int initialCapacity, float loadFactor)

**추가&삭제메서드**

- add(Object o), addAll(Collection c)
- remove(Object o), removeAll(Collection c), retainAll(Collection c), clear()

이외에도 Colletion인터페이스에서 상속받은 메서드들이 존재한다.

## TreeSet

- 범위 검색과 정렬에 유리한 컬렉션 클래스
- HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
- 이진 트리로 구현한다.
- 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖는다.

### 이진 탐색 트리(binary search tree)

- 반으로 나눠가면서 검색하는 방법
- 부모보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장한다.
- 데이터가 많아질 수록 추가,삭제에 시간이 더 많이 걸린다.

### 저장과정

1. 첫 번째로 저장되는 값은 루트가 된다.
2.  두 번째 값은 트리의 루트부터 시작해서 값의 크기를 비교하면서 트리를 따라 내려간다.
3. 작은 값은 왼쪽에 큰 값은 오른쪽에 저장한다.

이렇게 트리를 구성하면 왼쪽 마지막 레벨이 제일 작은 값

오른쪽 마지막 레벨의 값이 제일 큰 값이 된다.

### 주요 생성자와 메서드

### 트리 순회

이진 트리의 모든 노드를 한 번씩 읽는 것을 틀리 순회라고 한다.

전위, 중위, 후의 순회법이 있으며, 중위 순회하면 오름차순 으로 정렬된다.