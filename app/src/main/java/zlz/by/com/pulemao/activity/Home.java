package zlz.by.com.pulemao.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import zlz.by.com.pulemao.R;
import zlz.by.com.pulemao.util.DepthPageTransformer;
import zlz.by.com.pulemao.util.SystemBarTintManager;

/**
 * Created by mac on 16/4/11.
 */
public class Home extends Activity {
    private int page;
    private ViewPager vp;
    private PagerAdapter pa;
    private List<View> Views = new ArrayList<View>();
    private HomeHome homecoll = new HomeHome();
    private YuXueTang yuxuetang = new YuXueTang();
    private Mine minecoll = new Mine();
    private ImageView home1img1,home1img2,home1img3,home1img4;
    private LinearLayout  homebtnhome1,homebtnhome2,homebtnhome3,homebtnhome4;
    private View homehome,yuxuertang,car,mine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);
//        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setStatusBarTintResource(R.color.colorheadback);//通知栏所需颜色
        }

        homebtnhome1 = (LinearLayout) findViewById(R.id.homebtnhome1);
        homebtnhome2 = (LinearLayout) findViewById(R.id.homebtnhome2);
        homebtnhome3 = (LinearLayout) findViewById(R.id.homebtnhome3);
        homebtnhome4 = (LinearLayout) findViewById(R.id.homebtnhome4);
        homebtnhome1.setOnClickListener(new myclicklisten(this,1));
        homebtnhome2.setOnClickListener(new myclicklisten(this,2));
        homebtnhome3.setOnClickListener(new  myclicklisten(this,3));
        homebtnhome4.setOnClickListener(new myclicklisten(this,4));
        init();

    }

    private void init() {
        vp = (ViewPager) findViewById(R.id.homevp);
        LayoutInflater myin = LayoutInflater.from(this);
         homehome = myin.inflate(R.layout.homehome, null);
         yuxuertang = myin.inflate(R.layout.yuxuetang, null);
         car = myin.inflate(R.layout.homehome,null);
         mine = myin.inflate(R.layout.mine, null);
        home1img1 = (ImageView) findViewById(R.id.home1img1);
        home1img2 = (ImageView) findViewById(R.id.home1img2);
        home1img3 = (ImageView) findViewById(R.id.home1img3);
        home1img4 = (ImageView) findViewById(R.id.home1img4);
        Views.add(homehome);
        Views.add(yuxuertang);
        Views.add(car);
        Views.add(mine);
        homecoll.init(homehome, Home.this);

        pa = new PagerAdapter() {
            @Override
            public int getCount() {
                return Views.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                ((ViewPager) container).removeView(Views.get(position));

            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ((ViewPager) container).addView(Views.get(position));
                return Views.get(position);
            }
        };

         vp.setAdapter(pa);

      vp.setPageTransformer(true,new DepthPageTransformer());
      vp.addOnPageChangeListener(new pagechange());

    }

private class pagechange implements ViewPager.OnPageChangeListener{


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {





    }

    @Override
    public void onPageSelected(int position) {
        Log.e("zlz",position + "");
        switch (position) {
            case  0 :


                home1img1.setImageResource(R.drawable.tab11);
                home1img2.setImageResource(R.drawable.tab2);
                home1img3.setImageResource(R.drawable.tab30);
                home1img4.setImageResource(R.drawable.tab40);

                  break;
            case  1 :


                home1img1.setImageResource(R.drawable.tab1);
                home1img2.setImageResource(R.drawable.tab21);
                home1img3.setImageResource(R.drawable.tab30);
                home1img4.setImageResource(R.drawable.tab40);
                yuxuetang.init(yuxuertang);
                break;
            case  2 :


                home1img1.setImageResource(R.drawable.tab1);
                home1img2.setImageResource(R.drawable.tab2);
                home1img3.setImageResource(R.drawable.tab31);
                home1img4.setImageResource(R.drawable.tab40);
                break;
            case  3 :

                home1img1.setImageResource(R.drawable.tab1);
                home1img2.setImageResource(R.drawable.tab2);
                home1img3.setImageResource(R.drawable.tab30);
                home1img4.setImageResource(R.drawable.tab41);
                minecoll.init(mine,Home.this);
                break;
        }


    }




    @Override
    public void onPageScrollStateChanged(int state) {

    }




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



    private class myclicklisten implements  View.OnClickListener {
        private Context con;
        private int  id;
         public myclicklisten(Context con,int id){
             this.con=con;
             this.id= id;

        }


        @Override
        public void onClick(View v) {

            vp.setCurrentItem(id - 1);

        }



    };


}
