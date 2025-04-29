package ch14_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(
            PowerButton powerButton,
            ChannelDownButton channelDownButton,
            ChannelUpButton channelUpButton,
            VolumeDownButton volumeDownButton,
            VolumeUpButton volumeUpButton
    ) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이상의 field들을 이용한 메서드들을 정의
    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        System.out.print("TV의 ");
        channelDownButton.onDown();
    }

    // onPressedChannelUpButton() 메서드와 onUpChannelUpButton() 메서드를 구현하시ㅗㅇ.
    // Main에서 둘 다 호출하세요.

    public void onPressedChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton() {
        System.out.print("TV의 ");
        channelUpButton.onUp();
    }

    public void onDownVolumeUpButton() {
        System.out.print("TV의 ");
        System.out.println(channelUpButton.onUp());
    }

    //    VolumeDownButton / VolumeUpButton 클래스를 만들고 ChannelDown/Up과 같은 방식으로 작성하시오.
    // VolumeUpButton은 작성안하셔도 됩니다.
    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }


}
