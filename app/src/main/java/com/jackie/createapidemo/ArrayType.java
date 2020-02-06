package com.jackie.createapidemo;

import com.google.gson.JsonObject;

/**
 * Description:
 *
 * @author feifei5292190@gmail.com
 * @date 2020-01-19
 */
public class ArrayType {
    /**
     * 集合中泛型的类型
     */
    private Class<?> type;
    /**
     * 如果集合泛型为自定义类型,用此参数保存数据
     */
    private JsonObject jo;
    /**
     * 集合深度,如果是3则为ArrayList<ArrayList<ArrayList<>>>
     */
    private int arrayDeep;

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public JsonObject getJo() {
        return jo;
    }

    public void setJo(JsonObject jo) {
        this.jo = jo;
    }

    public int getArrayDeep() {
        return arrayDeep;
    }

    public void setArrayDeep(int arrayDeep) {
        this.arrayDeep = arrayDeep;
    }
}
