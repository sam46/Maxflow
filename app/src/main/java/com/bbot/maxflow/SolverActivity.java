package com.bbot.maxflow;

import android.os.Bundle;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

public class SolverActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Bundle bundle = getIntent().getExtras();
        String serialized = "";
        if (bundle != null)
            serialized = bundle.getString("serialized");
        System.out.println(serialized);
        setContentView(new SolverPanel(this, serialized));
    }

}