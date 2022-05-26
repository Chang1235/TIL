# Map인터페이스
| 메서드  | 설명 |
| --- | --- |
| void clear() | Map의 모든 객체를 삭제한다. |
|  boolean containsKey(Object key) | 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인한다. |
| boolean containsValue(Object value) | 지정된 value객체와 일치하는 Map의 vlaue객체가 있는지 확인한다.. |
| boolean isEmpty() | Map이 비어있는지 확인한다. |
| Set entrySet() | Map애 저장되어 있는 key-value쌍을 Map.Entry타입의 객체로 저장한 Set으로 반환한다. |
| Set keySet() | Map에 저장된 모든 key객체를 반환한다. |
| Collection values() | Map에 저장된 모든 value객체를 반환한다. |
| int size() | Map에 저장된 key-value쌍의개수를 반환한다. |
| Object put(Objcet key, Object value) | Map에 value객체를 key객체에 연결(mapping)하여 저장한다. |
| void putAll(Map t) | 지정된 Map의 모든 key-value쌍을 추가한다. |
| Objectremove(Object key) | 지정된 key객체와 일치하는 key-value객체를 삭제한다. |

### HashMap과 Hashtable

- Map 인터페이스를 구현, 데이터를 키와 값의 쌍으로 지정
- **순서X**  , **키 중복 불가 , 값은 중복가능**
- HashMap(동기화X)은 Hashtable(동기화O)의 신버젼

### HashMap

- Map 인터페이스를 구현한 대표적인 컬렉션 클래스
- 순서를 유지하려면,LinkedHashMap클래스를 사용하면 된다.

### HashMap의 키(key)와 값(value)

- 해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다

```
**키(key) :** 컬렉션 내의 키(key) 중에서 유일해야 한다.

**값(value) :** 키(key)와 달리 데이터의 중복을 허용한다.
```

### 해싱(hashing)

- 해시함수(hash function)로 해시테이블(hash table)에 데이터를 저장하고 검색하는 기법을 해싱이라고 한다.
- 해시함수는 데이터가 저장되어 있는 곳을 알려 주기 때문에 다량의 데이터 중에서도 원하는 데이터를 빠르게 찾을 수있다.
- 해시테이블은 배열과 링크드 리스트가 조합된 형태이다.

**해시테이블에 저장된 데이터를 가져오는 과정**

1. 키로 해시함수를 호출해서 해시코드를 얻는다.
2. 해시코드(해시함수의 반환값)에 대응하는 링크드리스트를 배열에서 찾는다.
3. 링크드리스트에서 키와 일치하는 데이터를 찾는다.
    1. 해시함수는 같은 키에 대해 하상 같은 해시코드를 반환해야한다
    2. 서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다.