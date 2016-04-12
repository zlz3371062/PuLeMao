package zlz.by.com.pulemao.activity;

import android.os.Bundle;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.BaseActivity;

/**
 * Created by mac on 16/4/11.
 */
public class Changepassword extends BaseActivity{
    private TextView apptitile,apptitlelefttxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changepassword);
        super.apptitleset(this);
        apptitile = (TextView) findViewById(R.id.headapptitle);
        apptitlelefttxt = (TextView) findViewById(R.id.headtitlelefttxt);
        apptitlelefttxt.setText("修改密码");
        apptitile.setText("");

    }
}
