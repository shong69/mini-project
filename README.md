# 🎯 미니 프로젝트 모음

학습 및 실습을 통해 개발한 미니 프로젝트들을 정리한 저장소입니다.  
각 폴더는 독립적인 프로젝트이며, 각자 실행 방법과 설명이 포함되어 있습니다.

## 📁 프로젝트 목록

| 프로젝트명 | 설명 | 주요 기술 |
|------------|------|-----------|
| [inkTalk](./inkTalk) | 실시간 채팅 기능을 포함한 웹 채팅+그림 그리기 서비스 | GUI, JAVA, Spring FrameWork |
| [jspProject](./jspProject) | JSP 기반의 간단한 게시판 웹 애플리케이션 | Java, JSP, Servlet, jQuery, MySQL, Srping FrameWork |

## 🔧 실행 방법

각 프로젝트 폴더에 들어가서 해당 `README.md` 파일의 실행 방법을 참고해주세요.


cd inkTalk  # 또는 jspProject
# README.md 참고하여 실행
📌 참고사항
모든 프로젝트는 개인 학습 및 포트폴리오 목적입니다.

일부 프로젝트는 간단한 데모 수준이며, 지속적으로 개선될 수 있습니다.

---

## 📄 `inkTalk/README.md`


# 💬 inkTalk

GUI와 Java Websocket을 활용한 실시간 채팅 애플리케이션입니다.  
사용자는 닉네임으로 입장해 실시간으로 메시지를 주고받을 수 있습니다.

## 🛠️ 사용 기술
- JAVA GUI
- JAVA Websocket
- Spring Framework


📌 기능
실시간 채팅 기능

실시간 페인팅 화면 공유 기능

닉네임 설정 및 로그인

사용자 별 채팅 색 구분 및 자동 스크롤

🙋‍♀️ 만든이
[shong69](https://github.com/shong69)

---

## 📄 `jspProject/README.md`


# 📘 JSP 게시판 프로젝트

기본적인 CRUD 기능이 포함된 JSP 기반 게시판 웹 애플리케이션입니다.

## 🛠️ 사용 기술

- Java, JSP, Servlet
- MySQL
- Apache Tomcat

## 🗃️ 기능

- 게시글 목록 보기
- 게시글 검색과 페이징
- 게시글 작성, 수정, 삭제
- 상세 페이지 보기
- 댓글과 대댓글 작성
- 간단한 유효성 검사

## ⚙️ 실행 방법

1. MySQL에 DB 및 테이블 생성 (SQL 파일 제공 시 import)
2. `jspProject`를 Eclipse나 IntelliJ의 동적 웹 프로젝트로 임포트
3. `web.xml` 및 Mysql.java의 DB 연결 정보 확인
4. Tomcat 서버에 배포 후 실행

## 🙋‍♂️ 만든이

[shong69](https://github.com/shong69)
