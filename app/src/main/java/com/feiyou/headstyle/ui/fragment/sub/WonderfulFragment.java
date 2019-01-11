package com.feiyou.headstyle.ui.fragment.sub;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.feiyou.headstyle.R;
import com.feiyou.headstyle.bean.CommentInfo;
import com.feiyou.headstyle.bean.CommentReplyInfo;
import com.feiyou.headstyle.ui.adapter.CommentAdapter;
import com.feiyou.headstyle.ui.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by myflying on 2018/11/26.
 */
public class WonderfulFragment extends BaseFragment {

    @BindView(R.id.wonderful_list)
    RecyclerView mWonderfulListView;

    private CommentAdapter commentAdapter;

    public static WonderfulFragment getInstance() {
        return new WonderfulFragment();
    }

    @Override
    protected View onCreateView() {
        View root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_wonderful, null);
        ButterKnife.bind(this, root);
        initViews();
        return root;
    }

    public void initViews() {
        List<CommentInfo> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            CommentInfo commentInfo = new CommentInfo();
            commentInfo.setName("内容" + i);

            List<CommentReplyInfo> replyInfos = new ArrayList<>();
            for (int m = 0; m < 8; m++) {
                CommentReplyInfo commentReplyInfo = new CommentReplyInfo();
                commentReplyInfo.setName("回复内容" + i);
                replyInfos.add(commentReplyInfo);
            }
            commentInfo.setReplyList(replyInfos);

            list.add(commentInfo);
        }

        mWonderfulListView.setLayoutManager(new LinearLayoutManager(getActivity()));
        commentAdapter = new CommentAdapter(getActivity(), list);
        mWonderfulListView.setAdapter(commentAdapter);
    }
}
