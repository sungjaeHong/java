##String : 문자열을 저장하는 클래스 타입

```java
String name;
name = "홍성재";
String hobby = "자바";
```
![img](https://github.com/sungjaeHong/java/blob/master/image/String.PNG?raw=true)

객체를 생성하면 힙 메모리에 생성된다.
이때 스택영역에는 힙메모리의 주소가 기록된다.
하지만 문자열 리터럴이 동일하면 String 객체를 공유한다.

```java
String name1 = "홍성재";
String name2 = "홍성재";
```
![](https://github.com/sungjaeHong/java/blob/master/image/String2.PNG?raw=true)

단 new 키워드를 사용한다면 서로 다른 객체를 힙 메모리에 할당한다.
![](https://github.com/sungjaeHong/java/blob/master/image/String3.PNG?raw=true)

```java
String name1 = "홍성재";
String name2 = "홍성재";
String name3 = new String("홍성재");

name1 == name2		//true
name1 == name3		//false

name1.equals(name3)	//true
```
![](https://github.com/sungjaeHong/java/blob/master/image/String4.PNG?raw=true)

