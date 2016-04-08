package zlz.by.com.pulemao.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.BaseActivity;
import zlz.by.com.pulemao.util.MyAdapter;

public class BuyIng extends BaseActivity {
    private ListView buylistview;
    private MyAdapter myAdapter;
    private List<String>  zlzlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buying);
        super.apptitleset(this);
        init();

    }
    private void init(){
        buylistview = (ListView) findViewById(R.id.list);
        zlzlist = new ArrayList<String>();
        myAdapter = new MyAdapter(BuyIng.this,zlzlist);
        buylistview.setAdapter(myAdapter);
        zlzlist.add("zlz");




    }

}
