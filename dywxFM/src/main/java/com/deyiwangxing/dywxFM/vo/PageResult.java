package com.deyiwangxing.dywxFM.vo;

import java.util.List;

/**
 * @author softtwilight
 * @vesion create on 2019/1/21
 */
public class PageResult {

    private Integer pageNum;
    private Integer pageSize;
    private Integer pages;
    private Integer total;

    private List list;

    public Integer getPageNum() {
        return pageNum;
    }

    public PageResult setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public PageResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public PageResult setPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public PageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public List getList() {
        return list;
    }

    public PageResult setList(List list) {
        this.list = list;
        return this;
    }
}
