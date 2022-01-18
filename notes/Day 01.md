# 1. 기본 문법

## 1.1 변수와 타입

### 1.1.1 운영체제와 프로그램

- 정보와 데이터
    - 데이터 : 자료를 수집한 것 그 자체
    - 정보 : 데이터를 의미있게 가공한 것
- 운영체제(OS; Operating System)
    - **시스템 하드웨어를 관리할 뿐만 아니라 응용 소프트웨어를 실행**하기 위하여 하드웨어 추상화 플랫폼과 공통 시스템 서비스를 제공하는 시스템 소프트웨어
    - 운영체제가 제공하는 추상화 플랫폼에 해당하지 않는 기기(하드웨어)를 사용할 때 driver를 설치해서 사용
- 프로그램
    - 컴퓨터에서 실행될 때 특정 작업(Task)을 수행하는 일련의 **명령어**들의 모음(집합)

### 1.1.2 JVM

- JVM(Java Virtual Machine)
    - 컴파일 : 자바 문법을 기반으로 작업 지침서를 만든 것을 바이트코드로 번역하는 과정
    - JDK(Java Development Kit) : 컴파일하는 프로그램
    - JVM은 자바 바이트코드를 실행할 수 있는 주체
    - 자바 바이트코드는 플랫폼에 독립적
    - 모든 자바 가상 머신은 자바 가상 머신 규격에 정의된 대로 자바 바이트코드를 실행

### 1.1.3 컴퓨터의 자료표현

- 비트(Bit)
    - 0이나 1을 표현할 수 있는 데이터 자리
    - $n$개의 비트로 표현할 수 있는 데이터의 수 : $2^n$
    - 아스키코드표 : 7개의 비트로 문자별 코드를 정리한 표
    - 패리티 비트 : 전체 1의 개수가 짝수가 되도록 7개의 비트에 추가되는 1 비트
- 바이트(Byte)
    - 8비트
- 2진수(Binary)
    - 00001001 ⇒ 9
    - 10001001 ⇒ -119
    - 맨 앞의 1은 부호를 의미 : 0은 양수, 1은 음수
    - 음수 표현 : 양수의 2진수를 전체 반전한 후 1을 더함
    - 부호 표현
        - 정수 : 2의 보수
        - 문자 : 아스키(ASCII) 코드
        - 실수 : 부동소수점 표현

### 1.1.3 메인 메소드

- 메인 메소드
    - 실행 명령인 java를 실행 시 가장 먼저 호출되는 부분
    - `main()` 메소드가 없으면 절대로 실행될 수 없음
    - Application의 시작 = 특정 클래스의 `main()` 실행
    - 형태
      
        ```java
        public static void main(String[] args){}
        ```
        

### 1.1.4 출력문

- 출력문
    - `print` : 줄바꿈 없이 출력
    - `println` : 줄바꿈 있는 출력
    - `\n` : 줄바꿈
    - `printf` : 서식화된 출력
- 출력문 예시
  
    ```java
    package sec01;
    
    public class PrintTest {
    	public static void main(String[] args) {
    
    		System.out.print("Hello World");
    		System.out.print("Hello World \n");
    
    		System.out.println("\\");
    		System.out.println("'");
    
    		// 주석입니다
    
    		/*
    		 * 여러 줄 주석입니다.
    		 */
    
    		System.out.printf("%d \n", 10); // 정수(10)를 10진수로 출력
    		System.out.printf("%o \n", 10); // 정수(10)를 8진수로 출력
    		System.out.printf("%x \n", 10); // 정수(10)를 16진수로 출력
    
    		System.out.printf("%4d \n", 10); // 4칸 확보 후 오른쪽부터 차지
    		System.out.printf("%-4d \n", 10); // 4칸 확보 후 왼쪽부터 차지
    		System.out.printf("%04d \n", 10); // 4칸 확보 후 오른쪽부터 차지 (빈공간은 0)
    
    		System.out.printf("%f \n", 10.1); // 실수
    		System.out.printf("%.2f \n", 10.1); // 실수(소수점 둘째자리까지)
    
    		System.out.printf("%s \n", "홍길동"); // 문자열
    		System.out.printf("%s의 나이는 %d 입니다.", "홍길동", 26);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        Hello WorldHello World 
        \
        '
        10 
        12 
        a 
          10 
        10   
        0010 
        10.100000 
        10.10 
        홍길동 
        홍길동의 나이는 26 입니다.
        ```
    
- 주석
    - 작업 지침에서 열외
    - 한줄 주석 : `/`
    - 여러 줄 주석 : `/* */`
    - 주석 단축키 : `ctrl+shift+c`, `ctrl+/`
- 코드 정렬
    - 단축키 : `ctrl + shift + f`

### 1.1.5 변수

- 정의
    - 데이터를 저장할 메모리의 위치를 나타내는 이름
    - 메모리 상에 데이터를 보관할 수 있는 공간 확보
    - 적절한 메모리 공간을 확보하기 위해서 변수의 타입 등장
    - `=`를 통해서 CPU에게 연산작업 의뢰
- 메모리의 단위
    - 0과 1을 표현하는 bit
- 선언
    - 구문
      
        ```java
        자료형 변수명;
        int age;
        String name;
        ```
    
- 초기화
    - 구문
      
        ```java
        변수명 = 저장할 값;
        
        age = 30;
        name = "철수";
        ```
    
- 선언과 초기화 동시 수행
    - 구문
      
        ```java
        자료형 변수명 = 저장할 값;
        int age = 30;
        ```
    
- 변수명 규칙
    - 대소문자 구분
    - 공백 허용 안됨
    - 숫자로 시작 불가
    - 특수문자는 `$`와 `_`만 가능
    - 예약어 사용 불가
        - 예약어 : 자바 문법을 위해 미리 지정되어 있는 단어
- 예약어
  
  
    | abstract | default | if | private | throw |
    | --- | --- | --- | --- | --- |
    | boolean | do | implements | protected | throws |
    | break | double | import | public | transient |
    | byte | else | instanceof | return | try |
    | case | exrtends | int | short | woid |
    | catch | final | interface | static | volatile |
    | char | finally | long | super | while |
    | class | float | native | switch |  |
    | const | for | new | synchronized |  |
    | continue | goto | package | this |  |
- 변수 예제
    1. 예제 1 - 기본
       
        ```java
        package sec01;
        
        public class VariableTest {
        
        	public static void main(String[] args) {
        		// TODO Auto-generated method stub
        
        		int a = 10;
        		int b = a; // a값을 b에 대입
        
        		System.out.println("a : " + a);
        		System.out.println("b : " + b);
        
        		System.out.println("");
        
        		a = 12;
        
        		System.out.println("a값 변경 후 a와 b");
        		System.out.printf("a : %d \n", a);
        		System.out.printf("b : %d \n", b);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            a : 10
            b : 10
            
            a값 변경 후 a와 b
            a : 12 
            b : 10
            ```
            
        1. 예제 2 - 값 출력
           
            ```java
            package sec01;
            
            public class VariableTest2 {
            
            	public static void main(String[] args) {
            		// TODO Auto-generated method stub
            
            		// 개인정보
            		String name = "홍길동";
            		int age = 26;
            		int height = 170;
            		int weight = 65;
            
            		// 개인정보 출력
            		System.out.printf("고객님 이름은 %s이고, 나이는 %d입니다.", name, age);
            		System.out.println("");
            		System.out.printf("고객님 신체정보는 키 %dcm이고 체중은 %dkg입니다.", height, weight);
            
            	}
            
            }
            ```
            
            - 결과
              
                ```
                고객님 이름은 홍길동이고, 나이는 26입니다.
                고객님 신체정보는 키 170cm이고 체중은 65kg입니다.
                ```
                

### 1.1.6 자료형

- 자료형
    - 기본 자료형과 참조 자료형으로 분류
    - 기본 자료형
      
      
        | 타입 | 세부타입 | 데이터형 | 크기 | 기본값 |
        | --- | --- | --- | --- | --- |
        | 논리형 |  | boolean | 1byte | false |
        | 문자형 |  | char | 2byte | null(\u0000) |
        | 숫자형 | 정수형 | byte | 1byte | (byte)0 |
        |  |  | short | 2byte | (short)0 |
        |  |  | int | 4byte | 0 |
        |  |  | long | 8byte | 0L |
        |  | 실수형 | float | 4byte | 0.0f |
        |  |  | double | 8byte | 0.0d |
- 크기 비교
  
    byte < short < int < long < float < double
    
             < char < int < long < float < double
    
- 데이터 형변환
    1. 묵시적(Implicit Casting)
        - 범위가 넓은 데이터 형으로 변환
        - 예시
          
            ```java
            byte b = 100;
            int i = b;
            ```
        
    2. 명시적(Explicit Casting)
        - 범위가 좁은 데이터 형으로 변환
        - 형변환 연산자 사용 : (타입) 값;
        - 예시
          
            ```java
            int i = 100;
            byte b = i // 불가
            byte b = (byte) i // 가능
            ```
            

## 1.2 연산자

### 1.2.1 연산자

- 산술 연산자
    - 종류
        1. `+` : 더하기
        2. `-` : 빼기
        3. `*` : 곱하기
        4. `/` : 나눈 후 몫
        5. `%` : 나눈 후 나머지
    - 정수와 정수 연산 결과는 정수
    - 정수와 실수 연산 결과는 실수
- 산술 연산자 예제
  
    ```java
    package sec01;
    
    public class OperatorTest1 {
    
    	// 산술 연산자 실습
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		int a = 10;
    		int b = 3;
    
    		int c = a + b;
    		int d = a - b;
    		int e = a / b;
    		int f = a % b;
    
    		System.out.println(c);
    		System.out.println(d);
    		System.out.println(e);
    		System.out.println(f);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        13
        7
        3
        1
        ```
    
- 증감 연산자
    - 선행처리
        1. `++변수` : 1 더한 후의 값을 취함
        2. `--변수` : 1 뺀 후의 값을 취함
    - 후행처리
        1. `변수++` : 변수 값을 취한 후 1 더하기
        2. `변수--` : 변수 값을 취한 후 1 빼기
- 증감 연산자 예제
  
    ```java
    package sec01;
    
    public class OperatorTest2 {
    
    	// 증감 연산자 실습
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		int a = 10;
    
    		System.out.println(a++);
    		System.out.println(a--);
    		System.out.println(++a);
    		System.out.println(--a);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        10
        11
        11
        10
        ```
    
- 비교 연산자
    - 비교 결과를 참 또는 거짓으로 반환
    - 종류
        1. 크기 비교 : `>`, `<`, `>=`, `<=`
        2. 동일 값인지 비교 : `==`
        3. 값이 다른지 비교 : `!=`
        4. 객체 타입 비교 : `instanceof`
- 비교 연산자 예제
  
    ```java
    package sec01;
    
    public class OperatorTest3 {
    
    	// 비교 연산자 실습
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		
    		int a = 10;
    		
    		boolean b = a > 10;
    		boolean c = a != 10;
    		boolean d = a >= 10;
    		boolean e = a == 10;
    		
    		System.out.println(b);
    		System.out.println(c);
    		System.out.println(d);
    		System.out.println(e);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        false
        false
        true
        true
        ```
    
- 3항 연산자
    - 형식
      
        ```java
        조건식 ? 수식1 : 수식2;
        // 조건식 결과가 참이면 수식1
        // 조건식 결과가 거짓이면 수식2
        ```
        
    - 예시
      
        ```java
        int a = 5;
        int b = 15;
        
        int c = (a == b) ? a : b;
        // c는 15
        ```
    
- 3항 연산자 예제
  
    ```java
    package sec01;
    
    public class OperatorTest4 {
    
    	// 삼항 연산자 실습 - BMI 계산기
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		String name = "김철수";
    		int height = 170;
    		int weight = 75;
    
    		// BMI
    		double bmiScore = (weight / ((height / 100) * (height / 100)));
    
    		System.out.printf("%s씨는 키 %dcm, 몸무게 %dkg로 BMI 결과는 %s입니다.", name, height, weight, bmiScore > 30 ? "비만" : "정상");
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        김철수씨는 키 170cm, 몸무게 75kg로 BMI 결과는 비만입니다.
        ```
    
- 조건 연산자
    - 결과 값이 참이나 거짓으로 반환되는 연산자
    - 종류
        1. `&&` : 둘 다 참이어야 참
        2. `||` : 둘 중 하나라도 참이면 참
        3. `!` : 반대 값을 반환
- 배정 연산자
    1. `+=` : 더한 값을 대입
    2. `-=` : 뺀 값을 대입
    3. `*=` : 곱한 값을 대입
    4. `/=` : 나눈 몫 값을 대입

## 1.3 조건문

### 1.3.1 조건문

- 조건문
    - 특정 조건의 결과에 따라 실행문을 실행할지 판단하는 구문
- if 문
    - 단일 if 구문
      
        ```java
        if(조건식) {
        	실행문;
        }
        
        if(조건식) {
        	실행문;
        } else {
        	조건식이 거짓일 때 실행문;
        }
        ```
        
    - 다중 if문
      
        ```java
        if (조건식1) {
        	조건식1이 참이면 실행할 문장;
        } else if (조건식2) {
        	조건식1은 거짓이고 조건식2가 참이면 실행할 문장;
        }
        ```
    
- if 문 예제
    1. 예제 1 - 단일 if문
       
        ```java
        package sec03;
        
        public class IfTest1 {
        
        	public static void main(String[] args) {
        		// TODO Auto-generated method stub
        
        		int a = 5;
        
        		if (a < 10) {
        			System.out.println(a + "는 10보다 작은 수이다.");
        		}
        
        		String name = "홍길동";
        		int age = 25;
        
        		if (age < 20) {
        			System.out.println(name + "은 미성년자입니다.");
        		} else {
        			System.out.println(name + "은 성인입니다.");
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            5는 10보다 작은 수이다.
            홍길동은 성인입니다.
            ```
        
    2. 예제 2 - 다중 if 문
       
        ```java
        package sec03;
        
        public class IfTest2 {
        
        	// 다중 if문 실습
        	public static void main(String[] args) {
        		// TODO Auto-generated method stub
        
        		int score = 93;
        
        		if (score >= 97) {
        			System.out.println("Grade : A+");
        		} else if (score >= 95) {
        			System.out.println("Grade : A");
        		} else if (score >= 93) {
        			System.out.println("Grade : A-");
        		} else if (score >= 90) {
        			System.out.println("Grade : B+");
        		} else {
        			System.out.println("Grade : B");
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            Grade : A-
            ```
    
- switch 문
    - 수식이나 변수 값이 해당하는 case의 실행문을 실행
    - 수식 자리에 넣을 수 있는 것
        - 1.4 버전 : byte, short, char, int
        - 1.5 버전 : enum 클래스 타입
        - 1.7 버전 : String 클래스 타입
    - break 없어도 작동
    - 어느 경우에도 해당하지 않으면 default 실행문 실행
    - 구문
      
        ```java
        switch (수식 또는 변수) {
        	case value1:
        		expression1;
        		break;
        	case value2:
        		expression2;
        		break;
        	...
        	case valuen:
        		expressionn;
        		break;
        	default:
        		expression;
        }
        ```
    
- switch 문 예제
  
    ```java
    package sec03;
    
    public class SwitchTest {
    
    	// switch 문 실습 - 월말일 계산하기
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		int month = 3;
    
    		System.out.println("Month : " + month);
    
    		switch (month) {
    		case 1:
    		case 3:
    		case 5:
    		case 7:
    		case 8:
    		case 10:
    		case 12:
    			System.out.println("Last day : 31");
    			break;
    		case 4:
    		case 6:
    		case 9:
    		case 11:
    			System.out.println("Last day : 30");
    			break;
    		case 2:
    			System.out.println("We have to chech the year.");
    			break;
    		default:
    			System.out.println("There is no such month.");
    		}
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        Month : 3
        Last day : 31
        ```
        

## 1.4 반복문

### 1.4.1 반복문

- while 문
    - 조건을 만족하지 않을 때까지 계속 해서 반복
    - 구문
      
        ```java
        while(조건문) {
        	반복문;
        }
        ```
    
- while 문 예제
  
    ```java
    package sec04;
    
    public class WhileTest {
    
    	// while 문 실습
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		int n = 5;
    
    		while (n < 10) {
    			System.out.println(n);
    
    			n++; // 이 문장이 없다면 무한 반복될 것
    		}
    
    		System.out.println("");
    		System.out.println(n);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        5
        6
        7
        8
        9
        
        10
        ```
    
- for 문
    - 초기화, 조건, 변수 변화의 내용이 필요한 반복문
    - 구문
      
        ```java
        for (초기값 ; 조건 ; 증감) {
        	반복문 ;
        }
        ```
    
- for 문 예제
  
    ```java
    package sec04;
    
    public class ForTest {
    
    	// for문 실습
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		for (int i = 0; i < 10; i++) {
    			System.out.println(i+1);
    		}
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        ```
    
- do-while 문
    - 일단 do 블록을 수행한 후 while 조건에 따라 추가로 수행할지 결정
    - 구문
      
        ```java
        do {
        	expression;
        } while(조건문);
        ```
    
- do-while 문 예제
  
    ```java
    package sec04;
    
    import java.util.Scanner;
    
    public class DoWhileTest {
    
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		Scanner scanner = new Scanner(System.in);
    
    		int inputNum;
    
    		do {
    			System.out.println("숫자를 입력하세요 >> ");
    			inputNum = scanner.nextInt();
    			System.out.println("입력한 숫자 : " + inputNum);
    		} while (inputNum <= 5);
    
    		System.out.println("입력한 숫자가 " + inputNum + "으로 5보다 큽니다.");
    		System.out.println("프로그램 종료");
    
    		scanner.close();
    
    	}
    
    }
    ```
    
- break
    - switch case 문을 벗어나는데 사용
    - 반복문에서 반복루프를 벗어나는데 사용
    - 중첩된 반복문을 한번에 빠져나갈 때 사용
- continue
    - 남은 구문을 수행하지 않고 다시 조건문으로 이동
- continue 예제
  
    ```java
    package sec04;
    
    public class ContinueTest {
    
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    
    		for (int i = 0; i < 10; i++) {
    			if (i == 7) {
    				continue;
    			}
    			System.out.println(i + 1);
    		}
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        1
        2
        3
        4
        5
        6
        7
        9
        10
        ```
        

---