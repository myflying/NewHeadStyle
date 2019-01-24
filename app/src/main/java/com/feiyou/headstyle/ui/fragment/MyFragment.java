package com.feiyou.headstyle.ui.fragment;

import android.view.LayoutInflater;
import android.view.View;

import com.feiyou.headstyle.R;
import com.feiyou.headstyle.ui.base.BaseFragment;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

import butterknife.ButterKnife;

/**
 * Created by myflying on 2019/1/24.
 */
public class MyFragment extends BaseFragment {

    @Override
    protected View onCreateView() {

        View root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_my, null);
        ButterKnife.bind(this, root);
        QMUIStatusBarHelper.translucent(getActivity());
        return root;
    }


}
