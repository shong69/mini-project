# 📋 myReceipt2

<p align="center">
<img src="https://github.com/shong69/mini-project/blob/main/jspProject/myReceipt2/src/main/webapp/resources/imgs/logo.png" width="250px" height="250px" alt="myReceipt2 logo">
</p>

<p align="center">
JSP와 Servlet, MySQL을 활용한 간단한 영수증/거래 내역 관리 웹 애플리케이션입니다.
사용자는 회원가입 후 로그인하여 개인별 지출 내역을 등록하고 관리할 수 있습니다.
</p>

# 📌 Table of Contents
- [🎬 시연 영상](#-시연-영상)
- [🛠 기술 스택](#-기술-스택)
- [💡 동기](#-동기)
- [⚙️ 설계 및 준비 과정](#-설계-및-준비-과정)
- [🔥 도전](#-도전)
- [📝 회고](#-회고)

# 🎬 시연 
## 메인페이지
- slick slider을 사용한 캐러셀을 배치하였습니다.
- 헤더에서 로그인상태에 따른 버튼 선택 분기처리(회원가입&로그인 혹은 로그아웃 선택 가능)를 하였습니다. 
https://github.com/shong69/mini-project/blob/main/images/index.png

## intro 페이지
https://github.com/shong69/mini-project/blob/main/images/intro.png

## 게시판 페이지
- 게시글의 CRUD와 댓글, 대댓글 작성이 가능합니다.
https://github.com/shong69/mini-project/blob/main/images/board.png
https://github.com/shong69/mini-project/blob/main/images/detail.png

## 로그인과 회원가입 페이지
로그인 페이지
- 유효성 체크를 통해 닉네임과 비밀번호를 미리 확인합니다.
https://github.com/shong69/mini-project/blob/main/images/login.png
회원가입 페이지
https://github.com/shong69/mini-project/blob/main/images/signup.png
- 정규표현식을 활용한 유효성 체크를 통해 형식을 가진 값을 가질 수 있습니다.
# 🛠 기술 스택

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JSP](https://img.shields.io/badge/JSP-007396?style=for-the-badge&logo=java&logoColor=white)
![Servlet](https://img.shields.io/badge/Servlet-6DB33F?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/Tomcat-F8DC75?style=for-the-badge&logo=apachetomcat)

# 💡 동기

단순한 게시판 형태를 넘어서 **실생활에 도움이 되는 웹 서비스를 만들어보고 싶다는 생각**에서 출발했습니다.  
일상적인 지출을 기록하고 정리하는 습관을 길러줄 수 있는 서비스를 목표로,  
JSP와 Servlet을 통해 구현하게 되었습니다.

개발 과정에서 JSP/SERVLET을 활용한 데이터 흐름과 사용자 인증, CRUD 처리를 경험함으로써  
**기초적인 웹 개발의 구조와 로직을 익히는 데 큰 도움이 되었습니다.**

# ⚙️ 설계 및 준비 과정

### 🗂 ERD 및 기능 정리
https://github.com/shong69/mini-project/blob/main/images/jspPrject_erd.png
- 회원 정보, 게시글 정보 테이블을 중심으로 한 ER 다이어그램 구성
- 주요 기능: 회원가입 / 로그인 / 게시글 등록 / 수정 / 삭제 / 댓글 작성 등
- 프로젝트 초기 설계에 집중하며 **MVC 패턴 학습 및 적용**에 중점

# 🔥 도전

### 🔐 사용자 인증 처리
- 로그인 시 세션을 통해 사용자 인증을 유지
- 페이지 이동 시 권한 확인이 누락되는 문제를 발견하여 추후 필터 추가로 보완 예정

### 📦 DB 연동
- DAO 패턴을 도입하여 데이터 분리의 구조적 이점을 경험
- SQL Injection에 대비한 PreparedStatement 사용


# 💭 회고

- **JSP/Servlet 기반의 웹 개발 흐름을 실전처럼 체험**할 수 있었습니다.  
이전까지는 maven이나 gradle 기반의 Spring Boot 프레임워크와 바닐라 js를 주로 사용하며 JSP/Servlet과 jQuery를 자주 접하지 못했습니다.
하지만 이번 기회를 통해 전통적 jsp 프로젝트를 개발하며

클라이언트 요청 → 컨트롤러 → DAO → DB → View 응답까지의 흐름과
MVC 패턴의 기본 구조를 몸에 익힐 수 있었습니다.

---

추후에는 해당 애플리케이션에 아래 기능을 추가하고 싶습니다:

- 차트 라이브러리를 활용한 지출 통계 시각화
- 카테고리/태그 기반 분류 기능
- OAuth 기반 간편 로그인 연동
- filter와 interceptor를 사용한 사용자 접근 제어 및 흐름 분기 처리
---

