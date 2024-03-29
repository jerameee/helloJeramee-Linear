package com.example.hellojeramee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.hellojeramee.Jeramee.makeText;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showJeramee(View view) {

        Jeramee jeramee = makeText(this, R.string.jeramee_message, Jeramee.LENGTH_SHORT);

        jeramee.show();
    }

    public void countUp(View view) {

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
