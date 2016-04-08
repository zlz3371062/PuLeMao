package zlz.by.com.pulemao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;
import zlz.by.com.pulemao.util.BaseActivity;

public class MainActivity extends BaseActivity {
     private TextView loginbtnback,loginbtnregistered,loginbtnfindpassword,loginapptitlename;
     private TextView loginbtnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        super.apptitleset(this);

//        得到屏幕长款px的方法二：
//        DisplayMetrics  metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        Screen.ScreenHeight = metrics.heightPixels;
//        Screen.ScreenWidth = metrics.widthPixels;
         init();

    }
     private void init(){
         loginapptitlename = (TextView) findViewById(R.id.headapptitle);
         loginapptitlename.setText("登录");
         loginbtnback = (TextView) findViewById(R.id.headtitlelefttxt);
         loginbtnback.setVisibility(View.INVISIBLE);
         loginbtnregistered = (TextView) findViewById(R.id.loginbtnregistered);
         loginbtnfindpassword = (TextView) findViewById(R.id.loginbtnfindpassword);
         loginbtnlogin = (TextView) findViewById(R.id.loginbtnlogin);
         loginbtnlogin.setOnClickListener(new myonclick());
         loginbtnregistered.setOnClickListener(new myonclick());
         loginbtnfindpassword.setOnClickListener(new myonclick());

     }
     private class  myonclick implements  View.OnClickListener{


         @Override
         public void onClick(View v) {
               switch (v.getId())
               {
                   case  R.id.loginbtnregistered :
                       Intent registered = new Intent(MainActivity.this,Registered.class);
                       startActivity(registered);
                       break;
                   case  R.id.loginbtnfindpassword :
                       Intent findpassword = new Intent(MainActivity.this,FindPassword.class);
                       startActivity(findpassword);
                       break;
                   case  R.id.loginbtnlogin :
                       Intent login = new Intent(MainActivity.this,BuyIng.class);
                       startActivity(login);
                       break;
               }
         }
     }
}
