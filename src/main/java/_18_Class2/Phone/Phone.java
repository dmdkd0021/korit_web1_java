package _18_Class2.Phone;

public class Phone {
    int battery;
    boolean isPowerOn;

    void turnOn() {
        if (battery >= 10) {
            isPowerOn = true;
            System.out.println("전원이 켜집니댜");
        } else {
            System.out.println("배터리가 부족합니댜");
        }
    }

    void turnOff() {
        if (isPowerOn == false) {
            System.out.println("전원이 꺼집니댜");
        } else {
            System.out.println("이미 전원이 꺼져있습니댜");
        }
    }

    void playYoutube() {
        if (isPowerOn == true) {
            if (battery >= 5) {
                battery -= 5;
                System.out.println("유튜브를 재생합니다");
            } else {
                System.out.println("배터리가 부족합니다");
            }
        } else {
            System.out.println("전원이 꺼져있습니다");
        } if else {
            System.out.println("전원이 꺼져있습니다");
        }
    }

    void charge() {

    }
}
