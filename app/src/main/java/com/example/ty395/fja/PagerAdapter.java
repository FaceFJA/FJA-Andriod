package com.example.ty395.fja;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(android.support.v4.app.FragmentManager fm)
    {
        super(fm);
    }
    //어느 부분에서 어떤 화면이 나오는지 정하는 코드
    @Override
    public android.support.v4.app.Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            case 3:
                return new Fragment4();
            default:
                return null;
        }
    }
    //화면 갯수
    @Override
    public int getCount()
    {
        return 4;
    }
}
