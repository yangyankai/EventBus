package com.sf.manager.eventbus2;


import java.util.List;

public class Event {
    /**
     * 列表加载事件
     */
    public static class ItemListEvent {
        private List<String> items;

        public ItemListEvent(int n) {
            items = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                items.add("第" + (i + 1) + "个");
            }
        }

        public List<String> getItems() {
            return items;
        }
    }
}

