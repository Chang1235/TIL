## **Comparator와 Comparable**

객체 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스

- **Comparable :**  기본 정렬기준을 구현하는데 사용
    
    compare(Object o1, Object o2)
    
    - 두 객체를 비교
- **Comparator :**  기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
    
    compareTo(Object o)
    
    - 주어진 객체를 자신(this)과 비교
    
- **결과값**
    - 양수(+) : 왼쪽이 크다.
    - 0 : 양쪽이 같다.
    - 음수 (-): 오른쪽이 크다