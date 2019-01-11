package com.feiyou.headstyle.ui.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.feiyou.headstyle.R;
import com.feiyou.headstyle.bean.HeadInfo;
import com.feiyou.headstyle.bean.NoteInfo;

import java.util.List;

/**
 * Created by admin on 2018/1/8.
 */

public class NoteInfoAdapter extends BaseQuickAdapter<NoteInfo, BaseViewHolder> {

    private Context mContext;

    String baseUrl = "http://192.168.80.97:8888/words/";

    public NoteInfoAdapter(Context context, List<NoteInfo> datas) {
        super(R.layout.note_item, datas);
        this.mContext = context;
    }

    @Override
    protected void convert(final BaseViewHolder helper, final NoteInfo item) {

    }
}