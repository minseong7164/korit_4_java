package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );
        // 별개의 PowerButton 객체를 생성해서 메서드 호출이 가능한가?
        PowerButton powerButton = new PowerButton();

        tvRemoteController.onPressedPowerButton();          // 결과값 : 전원을 켭니다.
        powerButton.onPressed();    // 물론 가능합니다.            결과값 : 전원을 켭니다 -> 별개로 굴러가네
        tvRemoteController.onPressedPowerButton();          // 결과값 : 전원을 끕니다.
        tvRemoteController.onPressedChannelDownButton();      // 결과값 : TV의 채널을 한 칸 내립니다.
        tvRemoteController.onDownChannelDownButton();       // 결과값 : TV의 채널을 계속 내립니다.
        tvRemoteController.onPressedChannelUpButton();      // 결과값 : TV의 채널을 한 칸 올립니다.
        tvRemoteController.onUpChannelUpButton();           // 결과값 : TV의 채널을 계속 올립니다.

//        VolumeDownButton volumeDownButton = new VolumeDownButton();

        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeUpButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
    }
}
