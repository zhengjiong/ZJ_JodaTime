package com.zj.example.joda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.joda.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textview);

        textView.append(TimeTestUtils.test1());
        textView.append("\n");
        textView.append(TimeTestUtils.test2());
        textView.append("\n");
        textView.append(TimeTestUtils.test3());
        textView.append("\n");
        textView.append(TimeTestUtils.test4());
        textView.append("\n");
        textView.append(TimeTestUtils.test5());
        textView.append("\n");
        textView.append(TimeTestUtils.test6());
        textView.append("\n");
        textView.append(TimeTestUtils.test7());
        textView.append("\n");
        textView.append(TimeTestUtils.test8());
    }
}
