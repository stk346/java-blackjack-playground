## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

-----
# 기능 구현 목록

* 카드
  * [x] 타입: 클로버, 하트, 다이아몬드, 스페이드 총 4개
  * [x] 숫자: ACE, 2, 3, 4, ... , Jack, King, Queen 총 13개가 있음
    * ACE는 1, 11 중 자신에게 유리한 쪽으로 선택 가능
    * J, K, Q는 10으로 계산
  * [x] 블랙잭 게임에서 사용되는 카드는 총 1벌(52장)
  
* 카드 발급
  * 딜러
    * [x] 카드 2장을 제공 받음
    * [x] 제공된 카드 중 1장 오픈 가능
    * [ ] 카드의 점수 합이 16 이하이면 카드 한 장을 추가로 뽑는다.
    * [ ] 카드의 점수 합계가 17 이상이면 추가로 뽑을 수 없음.
    * [ ] 에이스를 자기에게 유리하게 점수 계산
      * 점수 합계가 21점 이하인 경우 10
      * 점수 합계가 21점 이상인 경우 1
    * [ ] 카드 합계가 21을 초과한 경우 게임 종료. (베팅 금액 돌려줌)
  * 플레이어
    * [ ] 카드 2장을 제공 받음
    * [ ] 제공된 카드 모두 오픈
    * [ ] 점수 합계가 21점 이하인 경우 카드 발급 여부 선택 가능
    * [ ] 에이스를 자기에게 유리하게 점수 계산
      * 점수 합계가 21점 이하인 경우 10
      * 점수 합계가 21점 이상인 경우 1
* 게임 규칙
  * [ ] 딜러와 플레이어의 카드 점수 합계를 비교해서 21점에 가까운 사람이 승리
  * [ ] 처음 두 장의 카드 합이 21일 경우(블랙잭) 딜러에게 배팅 금액의 1.5배를 받는다.
  * [ ] 딜러와 플레이어가 동시에 블랙잭인 경우 배팅한 금액을 돌려받는다.
* 뷰
  * 이름 입력 (쉼표를 기준으로 분리)
    * [ ] 쉼표 이외 사용 불가
    * [ ] null, 공백 단독으로은 이름으로 사용 불가
  * 처음 카드 공개
    * [ ] 딜러는 한 장(점수가 낮은 카드) 공개
    * [ ] 플레이어는 모두 공개
  * 이후 카드 공개
    * [ ] 플레이어에게 카드 추가 발급 여부 묻기
    * [ ] 플레이어의 카드 상태 공개
    * [ ] 딜러의 카드 상태에 따라 발급 여부
  * 결과 공개
    * [ ] 딜러, 모든 플레이어의 카드, 점수 합계 공개
    * [ ] 최종 수익 출력

---
# 기능 목록 및 commit 로그 요구사항
* commit message 종류는 다음과 같이 구분
  * feat (feature)  
  * fix (bug fix)  
  * docs (documentation)  
  * style (formatting, missing semi colons, …)  
  * refactor  
  * test (when adding missing tests)  
  * chore (maintain)  