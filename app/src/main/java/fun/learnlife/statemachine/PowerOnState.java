package fun.learnlife.statemachine;

import android.util.Log;

public class PowerOnState implements TvState {
    private static final String TAG = "PowerOffState";

    @Override
    public String turnUp() {
        Log.i(TAG, "PowerOn-turnUp--Done");
        return "PowerOn-turnUp--Done";
    }

    @Override
    public String turnDown() {
        Log.i(TAG, "PowerOn-turnDown-Done");
        return "PowerOn-turnDown-Done";
    }

    @Override
    public String nextChannel() {
        Log.i(TAG, "PowerOn-nextChannel-Done");
        return "PowerOn-nextChannel-Done";
    }

    @Override
    public String prevChannel() {
        Log.i(TAG, "PowerOn-prevChannel-Done");
        return "PowerOn-prevChannel-Done";
    }
}
