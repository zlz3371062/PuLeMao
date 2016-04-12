package zlz.by.com.pulemao.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;

/**
 * Created by mac on 16/4/12.
 */
public class YuXueTang {

    private TextView apptitle;
    private ImageView headtitleimg2;


   public void init(View v){

       apptitle = (TextView) v.findViewById(R.id.headapptitle);
       headtitleimg2 = (ImageView) v.findViewById(R.id.headtitleimg2);
       headtitleimg2.setImageResource(R.drawable.question);
       headtitleimg2.setVisibility(View.VISIBLE);
       LinearLayout.LayoutParams img2params  = new LinearLayout.LayoutParams(Screen.ScreenWidth / 12,Screen.ScreenWidth / 12);
       headtitleimg2.setLayoutParams(img2params);
       apptitle.setText("育学堂");




    }
}
