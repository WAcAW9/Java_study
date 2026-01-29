# 📌 배열

## ✅ 배열(Array) vs 리스트(List)

데이터를 관리하는 두 방식의 주요 차이점은 **메모리 구조**와 **유연성**에 있습니다.

|**구분**|**배열 (Java Array)**|**리스트 (Python List 등)**|
|---|---|---|
|**크기**|정적 (고정 크기)|동적 (가변 크기)|
|**메모리**|연속된 공간에 저장|흩어진 메모리 공간 활용 가능|
|**접근 속도**|매우 빠름 (인덱스 활용)|상대적으로 느림|
|**특징**|삽입/삭제가 불편함|삽입/삭제가 용이함|

## ✅ 배열의 기초 사용법

배열은 동일한 타입의 데이터를 연속된 공간에 저장하며, 생성 시 반드시 길이를 지정해야 합니다.

```java
// 1. 선언과 동시에 초기화
int[] scores = {100, 90, 85};

// 2. 출력 및 수정
System.out.println("배열 scores의 크기: " + scores.length); // 3
scores[1] = 70; // 인덱스 1번(두 번째) 요소 수정

// 3. 반복문을 이용한 출력
for(int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

## ✅ 다차원 배열

행(Row)과 열(Column)로 구성된 구조로, 배열 안에 또 다른 배열이 들어있는 형태입니다.

```Java
// 2행 3열의 2차원 배열
int[][] termScores = {{90, 95, 80}, {95, 100, 75}};

for(int row = 0; row < termScores.length; row++) {
    int sum = 0;
    for(int col = 0; col < termScores[row].length; col++) {
        System.out.print(termScores[row][col] + " ");
        sum += termScores[row][col];
    }
    System.out.println("평균: " + ((double)sum / termScores[row].length));
}
```

## ✅ 확장 for문 (Enhanced For Loop)

인덱스를 사용하지 않고 배열의 모든 요소를 순차적으로 순회할 때 사용하며, 코드가 간결해집니다.

```Java
int[] scores = {100, 90, 85};
for(int element : scores) {
    System.out.println(element); // 배열의 각 요소를 직접 꺼냄
}
```
