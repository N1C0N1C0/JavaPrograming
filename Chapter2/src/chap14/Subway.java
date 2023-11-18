package chap14;

public class Subway {
    String subwayName;
    int passengerCount;
    int money;

    public Subway(String subwayName) {
        this.subwayName = subwayName;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayName + "번의 승객 수는 " + passengerCount +
                "명 이고, 수입은 " + money + "원 입니다.");
    }
}
