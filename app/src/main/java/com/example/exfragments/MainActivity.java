package com.example.exfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Flash FragFlash = new Flash();
        Superman FragSuperman = new Superman();
        MujerMaravilla FragMujerMaravilla = new MujerMaravilla();
        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

        fragmentList.add(FragFlash);
        fragmentList.add(FragSuperman);
        fragmentList.add(FragMujerMaravilla);

        MyPagerAdapter mSectionsPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragmentList);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
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
