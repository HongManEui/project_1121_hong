![image](https://user-images.githubusercontent.com/487999/79708354-29074a80-82fa-11ea-80df-0db3962fb453.png)

Level 2 실습 예제

![Inked1_LI](https://user-images.githubusercontent.com/30682608/202982589-33b9a037-fe64-4ce7-b3f3-4e9f9d5355fa.jpg)

1. 고객이 메뉴를 선택하여 주문한다.
2. 고객이 선택한 메뉴에 대해 결제한다.
3. 주문이 되면 주문 내역이 입점상점주인에게 전달된다.
4. 상점주는 주문을 수락하거나 거절할 수 있다.
5. 상점주는 요리시작때와 완료 지점에 시스템에 상태를 입력한다.
6. 고객은 아직 요리가 시작되지 않은 주문은 취소할 수 있다.
7. 요리가 완료되면 고객의 지역 인근의 라이더들에 의해 배송건 조회가 가능하다.
8. 라이더가 해당 요리를 pick 한 후, pick했다고 앱을 통해 통보한다.
9. 고객이 주문 상태를 중간중간 조회한다.
10. 주문상태가 바뀔때 마다 카톡으로 알림을 보낸다.
11. 고객이 요리를 배달 받으면 배송 확인 버튼을 탭하여, 모든 거래가 완료된다.



구현 요구사항
1. 고객이 메뉴를 선택하여 주문한다.
2. 고객이 선택한 메뉴에 대해 결제한다.



체크포인트
1. Sage(Pub/Sub)
2. CQRS
3. Compensation / Correlation
4. Request / Response
5. Circuit Breaker
6. Gateway / Breaker
