### 기본 패키지 (코틀린 표준 라이브러리)

- kotlin.* : Any, Int, Double 등 코어 함수와 자료형
- kotlin.text.* : 문자와 관련된 API
- kotlin.sequences.* : 컬렉션 자료형의 하나로 반복이 허용되는 개체를 열거
- kotlin.ranges.* : If 문이나 for문에서 사용할 범위 관련 요소
- kotlin.io.* : 입출력 관련 API
- kotlin.collections.* : List, Set, Map 등의 컬렉션
- kotlin.annotaion.* : 애노테이션 관련 API

(기본 패키지이므로 import 없이 사용 가능)

### **자료형과 변수**

자료형

- 정수형
    - 음수가 사용되는 부호 있는 자료형
        - Long - 8Byte (64bit)
        - Int - 4Byte (32bit)
        - Short - 2Byte (16bit)
        - Byte - 1Byte (8bit)
    - 부호 없는 정수형 (1.3 버전 베타)
        - ULong - 8Byte (64bit)
        - UInt - 4Byte (32bit)
        - UShort - 2Byte (16bit)
        - UByte - 1Byte (8bit)
- 실수형
    - Double - 8Byte (64bit)
    - Float - 4Byte (32bit)
- 논리형
    - Boolean - 1bit / true, false
- 문자
    - Char - 2Byte (16bit)
- 문자열
    - String

변수

- val (value) - 불변형
- var (variable) - 가변형

기본형 (Primitive data type)

- 가공되지 않은 순수한 자료형으로 프로그래밍 언어에 내장
- int, long, float, double, 등

참조형(Reference type)

- 동적 공간에 데이터를 둔 다음 이것을 참조하는 자료형
- Int, Long, Float, Double, 등

코틀린에서는 기본형을 모두 내부로 숨긴다. 그리고 참조형을 사용하게되는데 컴파일 과정 후에 기본형이 사용되게 된다. (Java와 달리 프로그래머가 별도로 처리할 게 없어지므로 간편하다)

### 자료형 검사와 변환

**NPE(NullPointerException)**

- 코틀린 변수 선언은 기본적으로 null을 허용하지 않는다.
- null로 선언하려면 "?" 을 사용하면 된다.

Safe-call 과 non-null 단정 기호

- ? ← Safe-call ("변수가 null일 수도 있다" 라고 경고의 의미 )
- !! ← non-null ("변수가 null이 아니다" 라고 단정)

엘비스 연산자

- 엘비스 연산자를 통해 변수의 값이 null 일 때, 간편하게 삼항연산자를 작성할 수 있다.
- 기호 : "?:"

이중 등호(==)와 삼중 등호(===)

- == : 값만 비교할 때
- === : 값과 참조 주소를 비교할 때
- (코틀린의 ==는 Java의 Equal()과 같이 값을 비교할때 사용된다.)
- !! 참조형으로 선언한 값의 범위가 -128~127 범위에 있으면 캐시에 그 값을 저장하게 된다.
→ 참조 주소를 비교할때 예상했던 결과와 다르게 나올 수 있다.

스마트 캐스트

- 값에 따라 자료형이 결정되는 것을 말한다.
- Number형은 숫자(Long, Int, ...)를 저장하기 위한 특수한 자료형으로 스마트 캐스트가 된다.

is 키워드

- is 키워드를 통해 자료형을 검사할 수 있다.

묵시적 변환 - Any

<img src="/img/1.png" width="500px;">

- Int, String 는 Any의 자식이다.
- Any는 언제든 필요한 자료형으로 자동 변환(스마트 캐스트) 가능하다.
