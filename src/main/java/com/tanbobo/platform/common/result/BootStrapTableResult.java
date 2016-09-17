package com.tanbobo.platform.common.result;

import java.io.Serializable;
import java.util.List;

/**
 * ajax 请求的返回类型封装JSON结果
 * <p>
 * 主要用于bootstrap table
 */
public class BootStrapTableResult<T> implements Serializable {

    private static final long serialVersionUID = 7071492345889772860L;

    private List<T> data;

    public BootStrapTableResult(List<T> data) {
        super();
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
