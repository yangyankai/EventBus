package com.sf.manager.eventbus2;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.greenrobot.event.EventBus;

public class ItemDetailFragment extends Fragment {

    private TextView tvDetail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // register 订阅事件
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // Unregister 取消订阅
        EventBus.getDefault().unregister(this);
    }

    /**
     * List点击时会发送些事件，接收到事件后更新详情
     */
    public void onEventMainThread(String str) {
        Log.e("eve", "Item  do in other class");
        if (str != null)
            tvDetail.setText(str);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmemt_item_detail, container, false);
        tvDetail = (TextView) rootView.findViewById(R.id.item_detail);
        return rootView;
    }
}
