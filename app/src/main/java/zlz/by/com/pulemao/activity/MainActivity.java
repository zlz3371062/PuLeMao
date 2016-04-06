package zlz.by.com.pulemao.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.BaseActivity;

public class MainActivity extends BaseActivity {
     private TextView loginbtnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();

    }
     private void init(){

         loginbtnback = (TextView) findViewById(R.id.headtitlelefttxt);
         loginbtnback.setVisibility(View.INVISIBLE);

     }

}
