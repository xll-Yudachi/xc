package entity;

import java.util.List;

/**
 * @Name PageResult
 * @Description 分页查询结果对象
 * @Auther Yudachi
 * @Craetetime 2019-03-18-21:57
 * @Version 1.0
 **/
public class PageResult<T> {
    private long total;
    private List<T> rows;

    public PageResult(){

    }

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}