## Kotlin Basic

### 코틀린이란?
- 구글에서 안드로이드 어플 공식 언어로 추가
- JVM에서 동작하는 언어
- 확장자는 .kt, .kts 이다
- 젯브레인 회사에서 만들었다.
- 간결한 문법 (생산성 증가)
- 안전한 처리
  - null point Exception
  - compile에서 auto-cast
- Java와 코틀린 100% 상호작용 가능

**자바와 동일한 점**
- package, import 방

**함수선언**
- fun 키워드로 정의
- 함수 내용이 Expression(식) 일때 return 생략 가능
- java의 void와 같은 기능을 하는 건 Unit이다. (Unit는 Object를 리턴함)

**지역 변수 선언**
- val : 읽기 전용 (Java의 final과 유사)
- var : Mutable(변하는) 변수

**nullable**
- 값이 null 일 수 있는 경우 type에 nullable 마크를 명시해야 함
- nullable 타입에 변수를 접근할 때는 반드시 null 체크가 필요하다. (그렇지 않으면 컴파일 오류 발)

**자동 타입 변환**
- 타입 체크만해도 자동으로 타입이 변환된다.

**기본타입**
- 모든 것은 객체다. (모든 것에 멤버함수, 프로퍼티를 호출 가능하다는 의미에)
- Numbers(숫자) : Java에서 숫자형이던 char가 코틀린에서는 숫자 형이 아니다.
- Explicit Conversions : 작은 타입은 큰 타입의 하위가 아니다. 즉 작은 타입에서 큰 타입으로 대입이 안되므로 명시적으로 변환필요 long -> Long 일때
- String : 문자열은 String Class로 표현되고, characters로 구성된다. (immutable 이므로 변경은 불가능하다.)

**Control Flow**
