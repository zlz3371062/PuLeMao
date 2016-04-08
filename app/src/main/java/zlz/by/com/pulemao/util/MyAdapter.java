package zlz.by.com.pulemao.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;


import java.util.ArrayList;
import java.util.List;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.model.Screen;

/**
 * Created by mac on 16/4/8.
 */
public  class MyAdapter extends BaseAdapter{
     private Context con;
     private List<String> list = new ArrayList<String>();
    
     public    MyAdapter(Context context , List<String> list){
      this.list = list ;
      this.con = context;


    }



    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
          LinearLayout buyitemfirstll;

            LayoutInflater in = LayoutInflater.from(con);
            convertView  =  in.inflate(R.layout.buyingitem , null);


        buyitemfirstll = (LinearLayout) convertView.findViewById(R.id.buyitemfirstll);

        LinearLayout.LayoutParams  params  = (LinearLayout.LayoutParams) buyitemfirstll.getLayoutParams();
        params.height = Screen.ScreenHeight / 9 * 2;
        buyitemfirstll.setLayoutParams(params);



        return convertView;
    }





    @Override
    public boolean isEmpty() {
        return false;
    }
}
