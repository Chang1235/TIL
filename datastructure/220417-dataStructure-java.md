# 02. 배열(Array) 구현하기

## ArrayList의 특징

- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
- 정해진 크기가 있음
- 요소의 추가와 제거시 다른 요소들의 이동이 필요함
- 배열의 i 번째 요소를 찾는 인덱스 연산이 빠름
- jdk 클래스 : ArrayList, Vector

```
public class MyArray {

	int[] intArr;   	//int array
	int count;  		//개수
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	//요소 추가하기
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}
	
	// 원하는 위치에 요소 추가하기
	public void insertElement(int position, int num)
	{
		int i;
		
		if(position < 0 || position> count) {
			
			return; 
		}
		
		if(count >= ARRAY_SIZE) {
			return;
		}
		
		for( i = count - 1 ; i >= position;i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count ++;
		
	}
	
	// 제거
	public int removeElement(int position)
	{
		int ret = ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return ret;
		}
		
		if(position <0|| position>count-1) {
			return ret;
		}
		
		ret = intArr[position];
		for(int i = position; i < count-1; i++) {
			
			intArr[i] = intArr[i+1];
		}
		count--;
		
		return ret;			
	}
	
	
	// 배열의 크기 체크
	public int getSize()
	{
		return count;
	}
	
	// 빈 배열인지 체크
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	// 원하는 위치에 있는 배열 return
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}

```

# 연결 리스트 (LinkedList) 구현하기

## LinkedList 특징

- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
- 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
- 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)
- 연결 리스트의 i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)
- jdk 클래스 : LinkedList

```
package ch03;

public class MyLinkedList {
	private MyListNode head;
	int count;

	public MyLinkedList() {
		head = null;
		count = 0;
	}

	public MyListNode addElement(String data) {
		
		MyListNode newNode;
		
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;			
		}
		count++;
		
		return newNode;
	}

	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);

		if (position < 0 || position > count) {
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}

		if (position == 0) { // 맨 앞으로 들어가는 경우
			newNode.next = head;
			head = newNode;
		} else {
			MyListNode preNode = null;
			for (i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;

			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}

	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;

		if (position >= count) {
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}

		if (position == 0) { // 맨 앞을 삭제하는
			head = tempNode.next;
		} else {
			MyListNode preNode = null;
			for (i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");

		return tempNode;
	}

	public String getElement(int position) {
		int i;
		MyListNode tempNode = head;

		if (position >= count) {
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return new String("error");
		}

		if (position == 0) { // 맨 인 경우

			return head.getData();
		}

		for (i = 0; i < position; i++) {
			tempNode = tempNode.next;

		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position) {
		int i;
		MyListNode tempNode = head;

		if (position >= count) {
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}

		if (position == 0) { // 맨 인 경우

			return head;
		}

		for (i = 0; i < position; i++) {
			tempNode = tempNode.next;

		}
		return tempNode;
	}

	public void removeAll() {
		head = null;
		count = 0;

	}

	public int getSize() {
		return count;
	}

	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		MyListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

}

```
