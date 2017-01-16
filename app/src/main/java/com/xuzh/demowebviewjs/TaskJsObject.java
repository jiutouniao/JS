package com.xuzh.demowebviewjs;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * 描述：作业详情界面中的js交互
 * 作者：shaobing
 * 时间： 2017/1/13 17:20
 */
public class TaskJsObject {

    public TaskJsObject() {
    }
    Context mContxt;

    public TaskJsObject(Context mContxt) {
        this.mContxt = mContxt;
    }

    @JavascriptInterface
    public void onAnwser(String name) {
        Toast.makeText(mContxt, name, Toast.LENGTH_LONG).show();
    }
    @JavascriptInterface
    public void fun1FromAndroid(String name) {
        Toast.makeText(mContxt, name, Toast.LENGTH_LONG).show();
    }
    @JavascriptInterface
    public void fun2(String name) {
        Toast.makeText(mContxt, "调用fun2:" + name, Toast.LENGTH_SHORT).show();
    }

}
