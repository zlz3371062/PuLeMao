package zlz.by.com.pulemao.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;

/**
 * Created by mac on 16/4/6.
 */
public class BaseActivity extends Activity{

    private ImageView apptitlebackimg;
    private LinearLayout apptitleleftimgll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //得到屏幕长款px的方法一：
        WindowManager wn = this.getWindowManager();
        Screen.ScreenHeight = wn.getDefaultDisplay().getHeight();
        Screen.ScreenWidth = wn.getDefaultDisplay().getWidth();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(R.color.colorheadback);//通知栏所需颜色
        }

    }

    public void apptitleset(Context con) {
        LayoutInflater apptitlein =  LayoutInflater.from(con);
        View view  = apptitlein.inflate(R.layout.head,null);
        apptitleleftimgll = (LinearLayout) findViewById(R.id.apptitleleftimgll);

        apptitlebackimg = new ImageView(BaseActivity.this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Screen.ScreenWidth/25, Screen.ScreenHeight/30);
        apptitlebackimg.setImageResource(R.drawable.nav_arrow);
        apptitleleftimgll.addView(apptitlebackimg, layoutParams);
        apptitleleftimgll.setOnClickListener(new myonclick());


    }

    private void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
    private  class myonclick implements  View.OnClickListener{


        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case  R.id.apptitleleftimgll:
                    finish();
                    break;


            }



        }
    }
}
