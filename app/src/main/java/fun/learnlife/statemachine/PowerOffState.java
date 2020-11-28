package fun.learnlife.statemachine;

import android.util.Log;

public class PowerOffState implements TvState {
    private static final String TAG = "PowerOffState";
    @Override
    public String turnUp() {
        Log.i(TAG,"PowerOff----ignore");
        return "PowerOff----ignore";
    }

    @Override
    public String turnDown() {
        Log.i(TAG,"PowerOff----ignore");
        return "PowerOff----ignore";
    }

    @Override
    public String nextChannel() {
        Log.i(TAG,"PowerOff----ignore");
        return "PowerOff----ignore";
    }

    @Override
    public String prevChannel() {
        Log.i(TAG,"PowerOff----ignore");
        return "PowerOff----ignore";
    }
}
