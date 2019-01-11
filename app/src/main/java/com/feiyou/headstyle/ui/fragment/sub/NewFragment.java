package com.feiyou.headstyle.ui.fragment.sub;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.feiyou.headstyle.R;
import com.feiyou.headstyle.ui.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by myflying on 2018/12/24.
 */
public class NewFragment extends BaseFragment {

    public static NewFragment newInstance(String cid) {
        NewFragment fragment = new NewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("category_id", cid);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected View onCreateView() {
        View root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_new, null);
        ButterKnife.bind(this, root);
        return root;
    }
}
