package com.feiyou.headstyle.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.feiyou.headstyle.R;
import com.feiyou.headstyle.bean.CommentReplyInfo;

import java.util.List;

/**
 * Created by myflying on 2018/12/25.
 */
public class CommentReplyAdapter extends BaseQuickAdapter<CommentReplyInfo, BaseViewHolder> {

    private Context mContext;

    private List<CommentReplyInfo> replyInfos;

    @Override
    public int getItemCount() {
        return replyInfos == null?2:replyInfos.size();
    }

    public void setReplyInfos(List<CommentReplyInfo> replyInfos) {
        this.replyInfos = replyInfos;
    }

    public CommentReplyAdapter(Context context, List<CommentReplyInfo> list) {
        super(R.layout.comment_reply_item, list);
        this.mContext = context;
    }

    @Override
    protected void convert(final BaseViewHolder helper, final CommentReplyInfo item) {
        helper.setText(R.id.tv_comment_reply, item.getName());
    }
}