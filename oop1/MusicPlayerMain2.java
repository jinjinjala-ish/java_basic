package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData mpd = new MusicPlayerData();

        mpd.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        mpd.volume++;
        System.out.println("음악 플레이어 볼륨: " + mpd.volume);

        mpd.volume++;
        System.out.println("음악 플레이어 볼륨: " + mpd.volume);

        mpd.volume--;
        System.out.println("음악 플레이어 볼륨: " + mpd.volume);

        System.out.println("음악 플레이어 상태 확인");
        if (mpd.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + mpd.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        mpd.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
