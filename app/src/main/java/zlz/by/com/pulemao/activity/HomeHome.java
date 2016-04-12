package zlz.by.com.pulemao.activity;

import android.content.Context;
import android.view.View;
import android.widget.ListView;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.HomeListAdapter;

/**
 * Created by mac on 16/4/11.
 */
public class HomeHome {
    private ListView ls;
    private HomeListAdapter myadapter;
    private Context con;
    private View view;

    public void init(View v,Context context){
        this.con = context;
        this.view = v;
        ls = (ListView) v.findViewById(R.id.homelist);
        myadapter = new HomeListAdapter(con);
        ls.setAdapter(myadapter);







    }





}
