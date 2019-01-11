package com.feiyou.headstyle.ui.fragment.sub;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.feiyou.headstyle.App;
import com.feiyou.headstyle.R;
import com.feiyou.headstyle.bean.HeadInfo;
import com.feiyou.headstyle.bean.HeadType;
import com.feiyou.headstyle.bean.NoteInfo;
import com.feiyou.headstyle.ui.activity.CommunityTypeActivity;
import com.feiyou.headstyle.ui.adapter.NoteInfoAdapter;
import com.feiyou.headstyle.ui.adapter.TopicAdapter;
import com.feiyou.headstyle.ui.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by myflying on 2018/11/26.
 */
public class RecommendFragment extends BaseFragment {

    @BindView(R.id.topic_list_view)
    RecyclerView mTopicListView;

    @BindView(R.id.recommend_list)
    RecyclerView mRecommendListView;

    TopicAdapter topicAdapter;

    NoteInfoAdapter noteInfoAdapter;

    public static RecommendFragment getInstance() {
        return new RecommendFragment();
    }

    @Override
    protected View onCreateView() {
        View root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_tab_recommend, null);
        ButterKnife.bind(this, root);
        initData();
        return root;
    }

    public void initData() {
        List<NoteInfo> list = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            list.add(new NoteInfo());
        }

        topicAdapter = new TopicAdapter(getActivity(), null);
        mTopicListView.setLayoutManager(new GridLayoutManager(getActivity(), 5));
        mTopicListView.setAdapter(topicAdapter);

        noteInfoAdapter = new NoteInfoAdapter(getActivity(), list);
        mRecommendListView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecommendListView.setAdapter(noteInfoAdapter);
    }

    void friends() {
        Intent intent = new Intent(getActivity(), CommunityTypeActivity.class);
        startActivity(intent);
    }
}
