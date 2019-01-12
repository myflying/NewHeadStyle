package com.feiyou.headstyle.ui.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.blankj.utilcode.util.TimeUtils;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.feiyou.headstyle.R;
import com.feiyou.headstyle.bean.HeadInfo;
import com.feiyou.headstyle.bean.NoteInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/1/8.
 */

public class NoteInfoAdapter extends BaseQuickAdapter<NoteInfo, BaseViewHolder> {

    private Context mContext;

    public NoteInfoAdapter(Context context, List<NoteInfo> datas) {
        super(R.layout.note_item, datas);
        this.mContext = context;
    }

    @Override
    protected void convert(final BaseViewHolder helper, final NoteInfo item) {
        helper.setText(R.id.tv_nick_name, item.getNickname())
                .setText(R.id.tv_topic_name, item.getName())
                .setText(R.id.tv_note_date, TimeUtils.millis2String(item.getAddTime() * 1000))
                .setText(R.id.tv_note_content, item.getContent())
                .setText(R.id.tv_message_count, item.getCommentNum() + "")
                .setText(R.id.tv_zan_count, item.getZanNum() + "");

        Glide.with(mContext).load(item.getUserimg()).into((ImageView) helper.itemView.findViewById(R.id.iv_user_head));

        List<HeadInfo> headInfos = new ArrayList<>();
        String[] tempImg = item.getImageArr();

        for (int i = 0; i < tempImg.length; i++) {
            HeadInfo headInfo = new HeadInfo();
            headInfo.setImgurl(tempImg[i]);
            headInfos.add(headInfo);
        }

        HeadInfoAdapter headInfoAdapter = new HeadInfoAdapter(mContext, headInfos);
        RecyclerView noteImageListView = helper.itemView.findViewById(R.id.note_img_list);
        noteImageListView.setLayoutManager(new GridLayoutManager(mContext, 3));
        noteImageListView.setAdapter(headInfoAdapter);
    }
}