package zlz.by.com.pulemao.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.BaseActivity;

public class MainActivity extends BaseActivity {
     private TextView loginbtnback;
     private TextView loginbtnregistered;

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
         loginbtnregistered.setOnClickListener(new myonclick());


     }
     private class  myonclick implements  View.OnClickListener{


         @Override
         public void onClick(View v) {
               switch (v.getId())
               {
                   case  R.id.loginbtnregistered :
                       Intent registered = new Intent(MainActivity.this,Registered.class);
                       startActivity(registered);
               }
         }
     }
}
