## Arrays

1. 배열의 출력 - toString()
2. 배열의 복사 - copyOf(),copyOfRange()
3. 배열 채우기 - fill(), setAll()
    
    ```java
    int[] arr = new int[5];
    Arrays.fill(arr, 9);    // arr = [9,9,9,9,9]
    Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1); // arr = [1,4,3,4,2]
    ```
    
4. 배열의 정렬과 검색 - sort(),binarySearch()
    1. binarySearch() 즉 이진탐색은 정렬(sort)이 되어있어야 올바른 값을 가져온다.
    
    ```java
    int[] arr = (3,2,1,5,6}
    int idx = Arrays.binarySearch(arr,2)            //idx=-5 <- 잘못된 결과
    Arrays.sort(arr); //배열 arr을 정렬한다.
    System.out.println(Arrays.toString(arr));       // [0, 1, 2, 3, 4]
    int idx = Arrays.binarySearch(arr, 2);          // idx=2 <-올바른 결과
    ```
    
    - 순차검색 : 차례대로 검색하는 방법
    - 이진검색 : 반으로 나눠가면서 검색하는 방법(정렬을 해야만 가능)
5. 다차원 배열의 출력 - deepToString()
6. 다차원 배열의 비교 - deepEquals()
7. 배열을 List로 변환 - asList(Object… a)