# 니가 사는 그 집 🏡
<br/>

## 💡 프로젝트 개요
- 삼성청년SW아카데미 - 1학기 HappyHouse 관통 프로젝트(2021 하반기)
- 공공 데이터를 활용한 주택거래정보 검색 사이트

Spring Framework와 Vue를 이용하여 부동산과 관련된 다양한 웹, 앱 사이트들을 사용하면서 바라던 점을 차별화하여 **주택 주변 상업 편의시설정보, 해당 지역 산책길, 주택 주변 업종별 상업시설 개수**와 기능을 가진 부동산 웹 애플리케이션을 제작하였습니다.

## 🚩 프로젝트 기간 & 팀원

- 2021년 11월 
- 정광균(팀장), 박현우, 이준현

## ⚙️ 기술 스택
<p align="center">
   <img src="https://img.shields.io/badge/API-Kakao_Map-red?style=flat">&nbsp  
  <img src="https://img.shields.io/badge/API-Naver_News-skyblue?style=flat">&nbsp 
  <img src="https://img.shields.io/badge/Library-vue_Chart-4285F4?style=flat&logo=google&logoColor=white">&nbsp 
  <img src="https://img.shields.io/badge/Library-vuetify-1867C0?style=flat&logo=vuetify&logoColor=white">&nbsp 
  <img src="https://img.shields.io/badge/Language-Java_8-007396?style=flat&logo=java&logoColor=white">&nbsp 
  <img src="https://img.shields.io/badge/Language-JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=white">&nbsp 
  <img src="https://img.shields.io/badge/Database-MySql-F80000?style=flat&logo=oracle&logoColor=white">&nbsp 
  <img src="https://img.shields.io/badge/Framework-Vue-D22128?style=flat&logo=apahce&logoColor=white">&nbsp 
  <img src="https://img.shields.io/badge/Framework-SpringBoot-6DB33F?style=flat&logo=spring&logoColor=white">&nbsp 

</p>

## ⚒ 개발 도구

|도구|버전|설명|
|:---:|:---:|:---:|
|STS|3.9.14|Backend|
|VSCode|1.56.2|Frontend|

## 🔧 개발 환경

|환경|버전|설명|
|:---:|:---:|:---:|
|JAVA|zulu 1.8|Backend|
|MySQL|8.0.25|DB|
|mybatis|2.1.3|Backend|
|Vue.js|2.6.12|Frontend|
|Springboot|5.3.12|Backend|

## 🖥 기능
> * 회원관리
>   * 회원가입
>   * 로그인
>   * 회원정보 수정
>   * 마이페이지
>   * 로그아웃
>   * 위시리스트
>   
> * 게시판
>   * 게시판 목록
>   * 게시판 상세 정보 
>   * 등록 & 수정 & 삭제
>   * 댓글
>   
> * 아파트 검색
>   * 검색화면
>   * 아파트 상세 정보
>
> * 추가 정보 제공
>   * 상권 정보 제공
>   * 산책길 정보 제공
>   * 뉴스 정보 제공
>   
  
**Pic 1** 📷 : **메인 페이지**

![메인화면](https://user-images.githubusercontent.com/59038419/150630725-1aaf7ed5-b49f-42bb-9ed8-bbade99edf26.PNG)

**Pic 2** 📷 : 아파트 검색 기능 마커를 이용해 위치제공 **(KakaoMap API 이용)**

![아파트조회](https://user-images.githubusercontent.com/59038419/150630344-5a949b2b-4e99-4920-b7cb-ac3fcfbb5e9b.PNG)

**Pic 3** 📷 : 마커 클릭시 해당 주택에 대한 상세정보 제공

![상세조회아파트](https://user-images.githubusercontent.com/59038419/150630346-39c5fe85-2c92-4f2a-8cac-edf80cb20965.PNG)

**Pic 4** 📷 : 원하는 지역의 상업시설 업종별로 개수를 차트로 보여주는 기능 **(Vue Chart Library 이용)**

![vuechart](https://user-images.githubusercontent.com/59038419/150630416-94d01476-ff2a-48b7-adac-2a3014def49a.png)

**Pic 5** 📷 : Naver API를 통해 부동산 관련 뉴스정보들을 보여주는 기능

![부동산 뉴스](https://user-images.githubusercontent.com/59038419/150630520-7323ddbe-e6d3-469d-8db2-bad932d21ea1.png)
![부동산 이동](https://user-images.githubusercontent.com/59038419/150630837-b1156d47-503b-4d23-906c-3e3582ca50fe.PNG)

**Pic 6** 📷 : simple java mail을 통해 구독자에게 메일 보내는 기능

![메일](https://user-images.githubusercontent.com/59038419/150630699-e00f9894-a985-49d3-9910-27be36de9c2d.png)
![메일받기](https://user-images.githubusercontent.com/59038419/150630620-30b36467-4a6c-494a-8aef-bca65f500cef.PNG)

**Pic 7** 📷 : 마이페이지(위시리스트) 및 회원 수정, 탈퇴

![회원정보](https://user-images.githubusercontent.com/59038419/150630962-2938228d-bb65-4805-8c19-4a942294041c.png)
![회원수정](https://user-images.githubusercontent.com/59038419/150630966-721d0279-ef85-409a-8a7f-f20de37e8b25.png)

**Pic 8** 📷 : 주변 산책길 추천

![산책길](https://user-images.githubusercontent.com/59038419/150631073-11572d27-01ca-4ada-bfc6-1f7f3ebaab11.PNG)

**Pic 9** 📷 : 게시판과 댓글 기능

![게시판](https://user-images.githubusercontent.com/59038419/152670861-ae34cab3-1b2a-46dd-b4e5-6dc0b6ed77ce.PNG)
![게시판_글_댓글](https://user-images.githubusercontent.com/59038419/152670870-eeca4117-dab9-4c37-bf09-45e67c7e8b02.PNG)


## 🔗 HappyHouse 깃허브 주소

👉🏻 [HappyHouse github](https://github.com/jeongkwangkyun/happyhouse_ssafy)


