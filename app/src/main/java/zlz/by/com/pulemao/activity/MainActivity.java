package zlz.by.com.pulemao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.BaseActivity;

public class MainActivity extends BaseActivity {
     private TextView loginbtnback,loginbtnregistered,loginbtnfindpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();

    }
     private void init(){

         loginbtnback = (TextView) findViewById(R.id.headtitlelefttxt);
         loginbtnback.setVisibility(View.INVISIBLE);
         loginbtnregistered = (TextView) findViewById(R.id.loginbtnregistered);
         loginbtnfindpassword = (TextView) findViewById(R.id.loginbtnfindpassword);
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
               }
         }
     }
}
