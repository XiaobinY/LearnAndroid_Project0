package com.example.xiaobin.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    static Toast toast = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Button b = (Button) view;
        String text = null;

        switch (b.getId()){
            case R.id.spotifyBtn:   text = getString(R.string.spotify_btn_toast);
                                    break;
            case R.id.scoreBtn:     text = getString(R.string.score_btn_toast);
                                    break;
            case R.id.libraryByn:   text = getString(R.string.library_btn_toast);
                                    break;
            case R.id.biggerBtn:    text = getString(R.string.bigger_btn_toast);
                                    break;
            case R.id.xyzBtn:       text = getString(R.string.xyz_btn_toast);
                                    break;
            case R.id.capStoneBtn:  text = getString(R.string.capstone_btn_toast);
                                    break;
            default:                text = "Hidden Toast!";
                                    break;
        }

        if (toast != null) toast.cancel();
        toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.show();
    }

}
