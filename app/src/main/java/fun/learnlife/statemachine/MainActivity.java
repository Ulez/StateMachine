package fun.learnlife.statemachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TvController controller;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new TvController();
        textView = findViewById(R.id.tv_result);
        findViewById(R.id.tv_down).setOnClickListener(this);
        findViewById(R.id.tv_up).setOnClickListener(this);
        findViewById(R.id.tv_on).setOnClickListener(this);
        findViewById(R.id.tv_off).setOnClickListener(this);
        findViewById(R.id.tv_pre).setOnClickListener(this);
        findViewById(R.id.tv_next).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_on:
                textView.setText(controller.powerOn());
                break;
            case R.id.tv_off:
                textView.setText(controller.powerOff());
                break;
            case R.id.tv_down:
                textView.setText(controller.turnDown());
                break;
            case R.id.tv_up:
                textView.setText(controller.turnUp());
                break;
            case R.id.tv_next:
                textView.setText(controller.nextChannel());
                break;
            case R.id.tv_pre:
                textView.setText(controller.prevChannel());
                break;
        }
    }
}
