package zlz.by.com.pulemao.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.BaseActivity;

/**
 * Created by mac on 16/4/6.
 */
public class FindPassword extends BaseActivity {
     private TextView apptitle,applefttxt;
     private LinearLayout headtitleleftll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findpassword);
        super.apptitleset(this);
        init();

    }

    private void init() {
        apptitle = (TextView) findViewById(R.id.headapptitle);
        applefttxt = (TextView) findViewById(R.id.headtitlelefttxt);
        apptitle.setText("找回密码");
        applefttxt.setVisibility(View.INVISIBLE);
        headtitleleftll = (LinearLayout) findViewById(R.id.headtitleleftll);


    }
}
