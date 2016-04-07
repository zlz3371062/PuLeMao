package zlz.by.com.pulemao.activity;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;
import zlz.by.com.pulemao.util.BaseActivity;

public class Registered extends BaseActivity {
    private TextView loginbtnback;
    private TextView registeredtitle,registerrdbtnprotocol;
    private ImageView registeredbtnyes;
    private  boolean flat = false ;
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
        registeredbtnyes = (ImageView) findViewById(R.id.registerbtnyes);
        registerrdbtnprotocol.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        registerrdbtnprotocol.getPaint().setAntiAlias(true);//抗锯齿
        registerrdbtnprotocol.setOnClickListener(new myonclick());
        registeredbtnyes.setOnClickListener(new myonclick());

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
                      case R.id.registerbtnyes:
                          showyes();
                          break;

                                   }


             }
         }
       @TargetApi(Build.VERSION_CODES.LOLLIPOP)
       private void   showprotocol(){
           LayoutInflater in = LayoutInflater.from(this);
           View view = in.inflate(R.layout.protocol, null);
           TextView txt = (TextView) view.findViewById(R.id.protocoltxt);
           txt.setText("普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫普乐猫");
             Dialog dialog;
             dialog = new AlertDialog.Builder(this)//
                  .create();
              dialog.show();
             dialog.getWindow().setContentView(view);
             dialog.getWindow().setLayout(Screen.ScreenWidth / 6 * 5, Screen.ScreenHeight / 4 * 3);


         }

     private  void   showyes(){
         if(flat == false){

             registeredbtnyes.setImageResource(R.drawable.register_yes);
             flat = true;

         } else {
             registeredbtnyes.setImageResource(R.drawable.register_no);
             flat = false;

         }



     }


}
