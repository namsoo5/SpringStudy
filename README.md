# Spring 스터디
### 2019.11.02 ~ 

<br>

### 환경 
* JDK 11.0.1
* IntelliJ

<br>

## 목차
* [1회 스터디](#1회)
* [2회 스터디](#2회)


***

## 1회(OT)
### 2019.11.02
* 스터디 방향 결정

<br>
<br>

## 2회
### 2019.11.09
* 스프링부트 아키텍쳐
* 스프링부트 프로젝트 만들기
* 간단한 계산기 만들기
    * Controller 생성
    * Service 생성

``` java
@RestController    
//객체 반환시 JSON타입으로 리턴

@RequestMapping("/")
//API의 공통주소 지정가능

@GetMapping("/")
//API의 공통주소아래의 서브주소 지정가능

@RequestParam("str1") String s
//URL에 'str1'이라는 매개변수를 받고 선언한 함수안에서 s로 사용가능 

@Service
//Bean,등 시스템자원 활용시 선언
```

