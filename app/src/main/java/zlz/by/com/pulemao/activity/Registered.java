package zlz.by.com.pulemao.activity;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;
import zlz.by.com.pulemao.util.BaseActivity;

public class Registered extends BaseActivity {
    private TextView loginbtnback;
    private TextView registeredtitle,registerrdbtnprotocol;
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
        registerrdbtnprotocol = (TextView) findViewById(R.id.registerrdbtnprotocol);
        registerrdbtnprotocol.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        registerrdbtnprotocol.getPaint().setAntiAlias(true);//抗锯齿
        registerrdbtnprotocol.setOnClickListener(new myonclick());

    }
//    tvTest.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG ); //下划线
//    tvTest.getPaint().setAntiAlias(true);//抗锯齿
        private  class myonclick implements View.OnClickListener {


             @Override
             public void onClick(View v) {
                  switch (v.getId()) {
                      case R.id.registerrdbtnprotocol:
                          showprotocol();

                        break;


                                   }


             }
         }
       @TargetApi(Build.VERSION_CODES.LOLLIPOP)
       private void   showprotocol(){
             Dialog dialog;
             dialog = new AlertDialog.Builder(this)//
                  .setView(R.layout.protocol).create();
           dialog.show();
           dialog.getWindow().setLayout(Screen.ScreenWidth/6*5,Screen.ScreenHeight/4*3);


         }

}
