# QueryDSL 설정 정리

공식 문서 - http://querydsl.com/static/querydsl/5.0.0/reference/html_single/#d0e147

기준 버전: `5.0.0`

## Spring Boot 3

* 기준 버전: `3.0.2`
* `javax` 에서 `jakarta` 로 변경되면서 버전을 단순히 `5.0.0` 으로 맞추면 안되고, `5.0.0:jakarta` 로 해주어서 classifier 를 붙임
  * `com.ewerk.gradle.plugins.querydsl` ([Repo](https://github.com/ewerk/gradle-plugins/tree/master/querydsl-plugin)) 플러그인은 2018년도에 업데이트 중단되고 지원 버전이 `4.4.0` 이기 때문에 호환이 맞지 않을 수 있음
* p6spy 계속 지원중