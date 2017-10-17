package droidtuts4you.com.dynamicthemeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Theme.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.theme1).setOnClickListener(this);
        findViewById(R.id.theme2).setOnClickListener(this);
        findViewById(R.id.theme3).setOnClickListener(this);
        findViewById(R.id.theme4).setOnClickListener(this);
        findViewById(R.id.theme5).setOnClickListener(this);
        findViewById(R.id.theme6).setOnClickListener(this);
        findViewById(R.id.theme7).setOnClickListener(this);
        findViewById(R.id.theme8).setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.theme1:
                Theme.changeToTheme(this, Theme.theme1);
                break;
            case R.id.theme2:
                Theme.changeToTheme(this, Theme.theme2);
                break;
            case R.id.theme3:
                Theme.changeToTheme(this, Theme.theme3);
                break;
            case R.id.theme4:
                Theme.changeToTheme(this, Theme.theme4);
                break;
            case R.id.theme5:
                Theme.changeToTheme(this, Theme.theme5);
                break;
            case R.id.theme6:
                Theme.changeToTheme(this, Theme.theme6);
                break;
            case R.id.theme7:
                Theme.changeToTheme(this, Theme.theme7);
                break;
            case R.id.theme8:
                Theme.changeToTheme(this, Theme.theme8);
                break;
        }
    }
}