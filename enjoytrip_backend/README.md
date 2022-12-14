
# EnjoyTrip

코로나로 인한 지역 경기 침체에 도움을 주고자 지역 관광 활성화를 위한 지역 관광 소개 페이지를 구축하였습니다. 한국관광공사에서 제공하는 국문관광정보서비스_GW의 다양한 상세기능정보 API를 활용하여 지역별 관광지 data를 분석하고 화면에 표시하였습니다. 또한 여행계획을 위한 스케줄과 여행경로 공유 등 사용자 편의 기능을 구현하였습니다. 추가적으로 나만의 숨은 관광지를 소개하는 페이지와 자유롭게 토론이 가능한 게시판을 구현하였습니다.



## 사용데이터

공공데이터 포털, 한국관광공사_국문관광정보 서비스_GW 데이터



## 개발언어 및 프로그램

- HTML / CSS / JavaScript
- VS Code


## 클래스다이어 그램
![클래스다이어그램](/uploads/e318aaa99cda5943b4d5724c7788dd2d/클래스다이어그램.png)
## 유스케이스 다이어그램
![유수케이스](/uploads/af646a5d8cf17e8aa42602e71e45290a/유수케이스.png)


## 기능

구현기능 | 비고
--|--
메인페이지 및 메뉴 구성 | -관광지 키워드 검색
로그인 및 회원가입 / 비밀번호 찾기 | 로그인 / 회원 가입 /비밀 번호 찾기
관광지 정보 조회 | -지역별, 카테고리별 관광지 정보 조회
여행정보공유 | 게시판을 이용한 글 등록, 수정, 삭제, 조회



### 메인페이지

![main](/uploads/b8f4184bc981fe33c7b8d2a3a640591c/main.png)



### 메인페이지 > 관광지 키워드 검색

![main_gif](https://lab.ssafy.com/rlaehddus815/enjoytrip_frontend_team_11/uploads/1d4820f080420f355ed5917d4f720052/%EB%A9%94%EC%9D%B8-%EA%B2%80%EC%83%89%EA%B8%B0%EB%8A%A5.gif);


- 메인페이지에서 키워드로 관광지를 검색할 수 있습니다.

### 로그인 및 회원가입 페이지 : 로그인 / 비밀번호 찾기 / 회원가입

![로그인](https://lab.ssafy.com/rlaehddus815/enjoytrip_frontend_team_11/uploads/a06dbb2f54c18b998ddf177ecde9001f/%EB%A1%9C%EA%B7%B8%EC%9D%B8_%EA%B8%B0%EB%8A%A5.gif)
![GIF 2022-10-03 오후 10-23-59](https://user-images.githubusercontent.com/48662662/193598290-bdb62425-320b-49c8-9064-c6ed62c8bc45.gif)

- 로그인 / 회원가입 / 비밀번호 찾기를 할 수 있습니다.


### 마이페이지 : 회원관리 (수정, 조회, 탈퇴)
![GIF 2022-10-03 오후 10-56-55](https://user-images.githubusercontent.com/48662662/193596357-e57f2d2e-0008-4501-823a-7fcf1d82ecad.gif)

- 로그인에 성공하였을 경우 회원정보 수정하거나 회원탈퇴를 할 수 있는 마이페이지를 들어갈 수 있습니다.



### “지역으로 찾기” 페이지 : 지역별 / 카테고리별 관광지 조회
![지역으로찾기2](https://lab.ssafy.com/rlaehddus815/enjoytrip_frontend_team_11/uploads/cdeeef90db0a08569706dfe786ab02b2/%EC%A7%80%EC%97%AD_%EA%B4%80%EA%B4%91%EC%A7%80_%EA%B2%80%EC%83%89.gif)

- 지역별 관광지 정보 또는 지역별 관광지 정보의 카테고리별 조회가 가능합니다.
- 우측에서 상점을 선택하면 해당 상점을 지도에 표시하고 마커를 클릭하면 상세정보를 확인할 수 있습니다.


### “여행정보공유” 페이지 : 게시판 등록, 수정, 삭제, 조회


![1](/uploads/4ace2672992b678473abe284b6222fa7/1.png)

- 여행정보공유글 리스트를 조회할 수 있습니다.

![22](/uploads/e8ff030d60286d0bcc34fa06f22490dc/22.png)

- 글을 선택하면 해당 글을 상세조회 할 수 있습니다.

![333](/uploads/418d9c0d34beead8effaf3d40309334c/333.png)

- 여행정보공유 글을 등록과 수정을할 수 있습니다.
