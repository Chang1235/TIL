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