package ss.pku.vibrantdiary.tags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ss.pku.vibrantdiary.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
