package com.feiyou.headstyle.ui.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.feiyou.headstyle.R;
import com.feiyou.headstyle.bean.CommentInfo;
import com.feiyou.headstyle.bean.HeadType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by myflying on 2018/12/25.
 */
public class CommentAdapter extends BaseQuickAdapter<CommentInfo, BaseViewHolder> {

    private Context mContext;

    public CommentAdapter(Context context, List<CommentInfo> list) {
        super(R.layout.comment_item, list);
        this.mContext = context;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final CommentInfo item) {
        helper.setText(R.id.tv_comment_content, item.getName());
        RecyclerView mCommentReplyListView = helper.itemView.findViewById(R.id.comment_reply_list);
        mCommentReplyListView.setLayoutManager(new LinearLayoutManager(mContext));
        final CommentReplyAdapter commentReplyAdapter = new CommentReplyAdapter(mContext, item.getReplyList());
        mCommentReplyListView.setAdapter(commentReplyAdapter);

        LinearLayout moreLayout = helper.itemView.findViewById(R.id.layout_more);
        moreLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commentReplyAdapter.setReplyInfos(item.getReplyList());
                commentReplyAdapter.notifyDataSetChanged();
            }
        });
    }
}