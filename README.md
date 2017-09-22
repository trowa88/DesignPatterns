# DesignPatterns

##### 디자인 원칙 #####
1. 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.
2. 상속보다는 구성을 활용한다.
3. 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
4. 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.
5. 추상화된 것에 의존하도록 만든다. 구상 클래스에 의존하도록 만들지 않도록 한다.

## 1. Strategy Pattern
  - 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
  - Strategy를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경 할 수 있다.
## 2. Observer Pattern
  - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의한다.
## 3. Decorator Pattern
  - 객체에 추가 요소를 동적으로 더할 수 있다.
  - 데코레이터를 사용하면 서브 클래스를 만드는 경우에 비해 훨씬 유연하게 기능을 확장할 수 있다.
## 4. Factory Method Pattern
  - 팩토리 메소드 패턴에서는 객체를 생성하기 위한 인터페이스를  어떤 클래스의 인스턴스를 만들지는 서브클래에서 결정하게 만든다.
  - 팩토리 메소드 패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브클래스에게 맡길 수 있다.
## 5. Singleton Pattern
  - 싱글톤 패턴은 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기 위한 패턴.
