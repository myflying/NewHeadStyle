package com.feiyou.headstyle;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.Utils;
import com.feiyou.headstyle.bean.TopicInfo;
import com.feiyou.headstyle.utils.AppContextUtil;

import java.util.List;

/**
 * Created by admin on 2017/3/24.
 */

public class App extends Application {
    public static Context applicationContext;

    public static Context getContext() {
        return applicationContext;
    }

    public static List<TopicInfo> topicInfoList;

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        AppContextUtil.init(this);
        applicationContext = this;
    }
}
