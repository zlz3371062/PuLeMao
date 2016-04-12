package zlz.by.com.pulemao.activity;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;

/**
 * Created by mac on 16/4/12.
 */
public class Mine {
    private Context con;

    private  View view1,view2;//竖线



    public void init(View v,Context con){

        view1 = v.findViewById(R.id.mineview1);
        view2 = v.findViewById(R.id.mineview2);
        LinearLayout.LayoutParams viewparams = new LinearLayout.LayoutParams(  dip2px(con,1), (Screen.ScreenHeight - dip2px(con,45)- Screen
        .barheight) / 20 );

        view1.setLayoutParams(viewparams);
        view2.setLayoutParams(viewparams);

    }
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}
