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

### 카드 (클로버, 다이아몬드, 하트, 스페이드)
- [ ] ACE 는 1 or 11로 계산 가능
- [ ] king, queen, jack은 10으로 계산
- [ ] 지급된 카드는 없어지는 것으로 간주해야함

### 플레이어
- [ ] 2장의 카드를 지급 받음
- [ ] 2장의 카드 모두 공개해야함
- [ ] 점수가 21 이하일 경우 카드를 더 받을지 선택하는 기능
- [ ] 가지고 있는 돈
- [ ] ace를 자기에게 유리하도록 선택하는 기능

### 딜러
- [ ] 2장의 카드를 지급 받음
- [ ] 2장 중 1장의 카드를 공개 (점수가 적은 것을 공개하는듯)
- [ ] 2장의 카드가 16점 이하이면 자동으로 카드 받음
- [ ] 이후 카드가 17점 이상이면 카드 받기 정지
- [ ] 가지고 있는 돈
- [ ] ace를 자기에게 유리하도록 선택하는 기능