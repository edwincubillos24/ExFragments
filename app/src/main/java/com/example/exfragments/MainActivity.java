package com.example.exfragments;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private ViewPager viewPager;

    private LinearLayout page1;
    private LinearLayout page2;
    private LinearLayout page3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);

        viewPager.setAdapter(new MyPageAdapter());

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { //Se genera automaticamente los 3 metodos
            @Override
            public void onPageScrolled(int i, float v, int i2) {
            }

            @Override
            public void onPageSelected(int i) {
                Toast.makeText(MainActivity.this, "page " + (i + 1), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
    }

        class MyPageAdapter extends PagerAdapter{

            public int getCount() {
                return 3;
            }
            public Object instantiateItem(ViewGroup container, int position) {
                View page = null;
                switch (position){
                    case 0: if (page1==null)
                                page1=(LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.fragment_flash,null);
                            page=page1;
                            break;
                    case 1: if (page2==null)
                                page2=(LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.fragment_superman,null);
                            page=page2;
                            break;
                    default: if (page3==null)
                                page3=(LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.fragment_mujer_maravilla,null);
                            page=page3;
                            break;
                }
                ((ViewPager) container).addView(page,0);
                return page;
            }

            public boolean isViewFromObject(View view, Object o) {
                return view==o;
            }

            public void destroyItem(ViewGroup container, int position, Object object) {
                ((ViewPager) container).removeView((View) object);
            }
        }


       /* FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Flash fragment = new Flash();
        fragmentTransaction.add(android.R.id.content, fragment).commit();*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

      /*  FragmentManager fragmentManager = getFragmentManager();
       FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (id == R.id.menu_flash) {
            Flash fragment = new Flash();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        if (id == R.id.menu_superman) {
            Superman fragment = new Superman();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }*/

        return super.onOptionsItemSelected(item);
    }
}
