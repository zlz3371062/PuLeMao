package zlz.by.com.pulemao.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;
import zlz.by.com.pulemao.util.BaseActivity;

/**
 * Created by mac on 16/4/11.
 */
public class ThingDetil extends BaseActivity{
    private TextView apptitlelefttxt;
    private int ScreenWidth = Screen.ScreenWidth;
    private int ScreenHeight = Screen.ScreenHeight;
    private ScrollView Sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.apptitleset(this);
        apptitlelefttxt = (TextView) findViewById(R.id.headtitlelefttxt);
        apptitlelefttxt.setText("商品详情");
        Sv = (ScrollView) findViewById(R.id.thingdetilsv);
        initSv();

    }









    private void initSv(){
        //o.44 imgheight

        LinearLayout.LayoutParams imgparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                (int)(ScreenHeight * 0.44));

        ImageView thingdetilimg = new ImageView(this);

        Sv.addView(thingdetilimg,imgparams);



    }
}
