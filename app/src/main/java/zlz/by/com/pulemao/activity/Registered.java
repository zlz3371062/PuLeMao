package zlz.by.com.pulemao.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.BaseActivity;

public class Registered extends BaseActivity {
    private TextView loginbtnback;
    private TextView registeredtitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registered);
        init();
    }

    private void init() {
        loginbtnback = (TextView) findViewById(R.id.headtitlelefttxt);
        loginbtnback.setVisibility(View.INVISIBLE);
        registeredtitle= (TextView) findViewById(R.id.headapptitle);
        registeredtitle.setText("注册");
    }
//    tvTest.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG ); //下划线
//    tvTest.getPaint().setAntiAlias(true);//抗锯齿

}
