package com.example.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

public class chaoluon extends Activity {
    Button BT;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chaoluon);
        BT = (Button) findViewById(R.id.BtnBackFromChaoluon);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
