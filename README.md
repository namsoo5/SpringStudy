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
* [3회 스터디](#3회)
* [4회 스터디](#4회스터디)

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


<br>
<br>

## 3회
### 2019.11.14

* POST,GET,PUT,DELETE
* 간단한 도서관리 API설계시작
* RequestBody
* PathVariable

``` java
//포스트 형식
 @PostMapping("")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

//Query형식이아닌 PathValue형식
 @GetMapping("/{bookId}")
    public Book getBooksById(@PathVariable int bookId){
        return bookService.getBooksById(bookId);
    }

```

<br>

> 과제
``` java
@GetMapping
    public List<Borrowing> getBorrowListById(@RequestParam(value = "memberId", required = false, defaultValue = "-1") int memberId, @RequestParam(value = "bookId", required = false, defaultValue = "-1") int bookId) {

            return borrowingService.getBorrowListById(memberId, bookId);
    }
```
* RequestPara에 옵션을 설정할 수 있음
    * value = 가져올 키값
    * required = 필수로 가져올건지 여부
    * defaultValue = 없을경우 기본값(String형태만 가능 0표시 -> "0")

<br>
<br>

## 4회스터디
### 2019.11.23

* DB모델링
* MyBatis
* AWS RDS
* MyBatis와 RDS연동하기

<br>

> 과제

* Mapper생성

  * interface

    * xml mapper에서 사용할 함수를 모아놓음

    ``` java
    @Mapper
    @Component  //bean역할
    public interface MemberMapper {
    
        public List<Member> getAllMembers();
    
        public Member getMemberById(@Param("id") int id);
    
        public int insertMember(@Param("member") Member member);
    
        public int updateMember(@Param("id") int id, @Param("member") Member member);
    
        public int deleteMember(@Param("id") int id);
    }
    ```

    

  * xml

    * db의 실행문을 작성
    * interface의 매개변수를 사용 할 수 있음

  ``` java
  <mapper namespace="com.example.demo.mapper.MemberMapper">
  
      <insert id="insertMember" useGeneratedKeys="true">
          INSERT INTO member(email, password, name, phone_number)
              VALUE (#{member.email}, #{member.password}, #{member.name}, #{member.phoneNumber});
      </insert>
  
      <select id="getAllMembers" resultType="com.example.demo.model.Member">
          SELECT * FROM member;
      </select>
  
      <select id="getMemberById" resultType="com.example.demo.model.Member">
          SELECT * FROM member WHERE id = #{id};
      </select>
  
      <update id="updateMember" useGeneratedKeys="true">
          UPDATE member SET email = #{member.email}, password = #{member.password}
                          , name = #{member.name}, phone_number = #{member.phoneNumber}
          WHERE id = #{id};
      </update>
  
      <delete id="deleteMember">
          DELETE FROM member WHERE id = #{id};
      </delete>
  
  </mapper>
  ```

  

<br>
<br>

## 5회스터디
### 2019.12.01

* Lombok
* DTO생성
* EC2에 배포하기

<br>

> 과제




