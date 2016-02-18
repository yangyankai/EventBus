package com.sf.manager.eventbus2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 1. 在 onCrete 中 Register 订阅事件
 EventBus.getDefault().register(this);
 2. 在 onDestroy 中Unregister 取消订阅
 EventBus.getDefault().unregister(this);
 3. 声明接受方法
 public void onEventMainThread(Event.ItemListEvent event) {}
 4. 发送对应事件
 EventBus.getDefault().post(event);
 */
 
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
