package lucas.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentWithPageOne.newInstance();
            case 1:
                return FragmentWithPageTwo.newInstance();
            case 2:
                return FragmentWithPageThree.newInstance();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator

    @Override

    public CharSequence getPageTitle(int position) {
        return "Part " + (position+1);
    }


}