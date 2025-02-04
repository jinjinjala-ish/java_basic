package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
            MusicPlayerData mpd = new MusicPlayerData();

            on(mpd);

            volumeUp(mpd);
            volumeUp(mpd);
            volumeDown(mpd);

            off(mpd);

    }
    static void on(MusicPlayerData mpd) {
        mpd.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData mpd) {
        mpd.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData mpd) {
        mpd.volume++;
        System.out.println("음악 플레이어 볼륨: " + mpd.volume);
    }
    static void volumeDown(MusicPlayerData mpd) {
        mpd.volume--;
        System.out.println("음악 플레이어 볼륨: " + mpd.volume);
    }
}
