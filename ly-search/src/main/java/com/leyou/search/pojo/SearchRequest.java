package com.leyou.search.pojo;

import java.util.Map;

public class SearchRequest {

    private String key; //搜索字段

    private Integer page; //当前页

    private Map<String,String> filter;

    private static final Integer DEFAULT_SIZE = 20;//每页大小，固定
    private static final Integer DEFAULT_PAGE = 1; //默认页

    public Map<String, String> getFilter() {
        return filter;
    }

    public void setFilter(Map<String, String> filter) {
        this.filter = filter;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getPage() {
        if (page == null) {
            return DEFAULT_PAGE;
        }
        //获取页码时做一些校验，不能小于11
        return Math.max(DEFAULT_PAGE,page);
    }

    public void setPage(Integer page) {
        this.page = page;
    }
    public Integer getSize() {
        return DEFAULT_SIZE;
    }
}
