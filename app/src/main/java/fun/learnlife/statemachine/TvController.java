package fun.learnlife.statemachine;

public class TvController implements PowerController, TvState {

    private TvState powerOffState = new PowerOffState();
    private TvState powerOnState = new PowerOnState();
    private TvState curentState = powerOffState;

    @Override
    public String powerOff() {
        curentState = powerOffState;
        return "关机了";
    }

    @Override
    public String powerOn() {
        curentState = powerOnState;
        return "开机了";
    }

    @Override
    public String turnUp() {
        return curentState.turnUp();
    }

    @Override
    public String turnDown() {
        return curentState.turnDown();
    }

    @Override
    public String nextChannel() {
        return curentState.nextChannel();
    }

    @Override
    public String prevChannel() {
        return curentState.prevChannel();
    }
}
