package com.feiyou.headstyle.ui.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.blankj.utilcode.util.SizeUtils;
import com.feiyou.headstyle.R;
import com.feiyou.headstyle.ui.adapter.DetailFragmentAdapter;
import com.feiyou.headstyle.ui.base.BaseFragmentActivity;
import com.feiyou.headstyle.ui.fragment.sub.RecommendFragment;
import com.feiyou.headstyle.ui.fragment.sub.VideoFragment;
import com.feiyou.headstyle.ui.fragment.sub.WonderfulFragment;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by myflying on 2018/11/28.
 */
public class CommunityArticleActivity extends BaseFragmentActivity {

    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;

    @BindView(R.id.appBarLayout)
    AppBarLayout appBarLayout;

    @BindView(R.id.collapsingToolbarLayout)
    CollapsingToolbarLayout collapsingToolbarLayout;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.top_content_layout)
    LinearLayout mTopContentLayout;

    List<String> mTitleDataList;

    private String newsId;

    @Override
    protected int getContextViewId() {
        return R.layout.activity_article_detail;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        initFragments();
    }

    public void initViews() {
        QMUIStatusBarHelper.setStatusBarLightMode(this);
        mTopContentLayout.setLayoutParams(new CollapsingToolbarLayout.LayoutParams(CollapsingToolbarLayout.LayoutParams.MATCH_PARENT, SizeUtils.dp2px(280)));
    }

    public void initFragments() {
        Fragment[] fragments = new Fragment[]{new WonderfulFragment(), new VideoFragment()};
        mTitleDataList = new ArrayList<>();
        mTitleDataList.add("精彩评论");
        mTitleDataList.add("最新评论");

        if (mTitleDataList.size() > 0) {
            DetailFragmentAdapter viewPageAdapter = new DetailFragmentAdapter(getSupportFragmentManager(), fragments, mTitleDataList);
            mViewPager.setAdapter(viewPageAdapter);

            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            tabLayout.setupWithViewPager(mViewPager);
        }
    }



}
