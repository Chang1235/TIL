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