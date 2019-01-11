package com.feiyou.headstyle.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.feiyou.headstyle.R;
import com.feiyou.headstyle.ui.adapter.CommonTabPagerAdapter;
import com.feiyou.headstyle.ui.base.BaseFragmentActivity;
import com.feiyou.headstyle.ui.fragment.sub.NewFragment;

import java.util.Arrays;

/**
 * Created by myflying on 2018/11/28.
 */
public class CommunityType1Activity extends BaseFragmentActivity {

    @Override
    protected int getContextViewId() {
        return R.layout.activity_community_type1;
    }
}
