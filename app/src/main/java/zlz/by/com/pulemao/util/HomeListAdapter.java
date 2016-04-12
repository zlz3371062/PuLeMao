package zlz.by.com.pulemao.util;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;

/**
 * Created by mac on 16/4/11.
 */
public class HomeListAdapter extends BaseAdapter{
    private Context con;
    final int VIEW_TYPE = 3;
    final int TYPE_1 = 0;
    final int TYPE_2 = 1;
    final int TYPE_3 = 2;

    public HomeListAdapter(Context context){


        this.con = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        int p = position;
        if (p == 0)
            return TYPE_1;
        else if (p == 1)
            return TYPE_2;
        else
            return TYPE_3;
    }
    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        int type = getItemViewType(position);
         if(type == TYPE_1)
         {
             convertView = LayoutInflater.from(con).inflate(R.layout.home1,
                     null);

             ImageView  home1icon1 = (ImageView) convertView.findViewById(R.id.home1icon1);
             ImageView  home1icon2 = (ImageView) convertView.findViewById(R.id.home1icon2);
             ImageView  home1icon3 = (ImageView) convertView.findViewById(R.id.home1icon3);
             ImageView  home1icon4 = (ImageView) convertView.findViewById(R.id.home1icon4);
             ImageView  home1icon5 = (ImageView) convertView.findViewById(R.id.home1icon5);
             ImageView  home1icon6 = (ImageView) convertView.findViewById(R.id.home1icon6);
             ImageView  home1icon7 = (ImageView) convertView.findViewById(R.id.home1icon7);
             ImageView  home1icon8 = (ImageView) convertView.findViewById(R.id.home1icon8);

             LinearLayout home1 = (LinearLayout) convertView.findViewById(R.id.home1);

             LinearLayout.LayoutParams home1params = new LinearLayout.LayoutParams(
                     ViewGroup.LayoutParams.MATCH_PARENT, (int)((Screen.ScreenHeight - Screen.barheight ) * 0.5) + 45);
             home1.setLayoutParams(home1params);
             LinearLayout.LayoutParams home1icon1params = new LinearLayout.LayoutParams(
                     (int)(Screen.ScreenWidth / 8), (int)(Screen.ScreenHeight / 12));
             home1icon1.setLayoutParams(home1icon1params);
             home1icon2.setLayoutParams(home1icon1params);
             home1icon3.setLayoutParams(home1icon1params);
             home1icon4.setLayoutParams(home1icon1params);
             home1icon5.setLayoutParams(home1icon1params);
             home1icon6.setLayoutParams(home1icon1params);
             home1icon7.setLayoutParams(home1icon1params);
             home1icon8.setLayoutParams(home1icon1params);
             home1icon1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Log.e("zlz","i fuck u");
                 }
             });

         }else if(type == TYPE_2){
             convertView = LayoutInflater.from(con).inflate(R.layout.home2, null);
             LinearLayout home2 = (LinearLayout) convertView.findViewById(R.id.home2);
             LinearLayout.LayoutParams home2params = new LinearLayout.LayoutParams(
                     ViewGroup.LayoutParams.MATCH_PARENT, Screen.ScreenHeight - dip2px(con,45) - Screen.barheight );
             home2.setLayoutParams(home2params);
         }else
         {

             convertView = LayoutInflater.from(con).inflate(R.layout.home3, null);
             LinearLayout home3 = (LinearLayout) convertView.findViewById(R.id.home3);
             LinearLayout.LayoutParams home2params = new LinearLayout.LayoutParams(
                     ViewGroup.LayoutParams.MATCH_PARENT, Screen.ScreenHeight - dip2px(con,45) - Screen.barheight);
             home3.setLayoutParams(home2params);

         }



        return convertView;
    }


    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
