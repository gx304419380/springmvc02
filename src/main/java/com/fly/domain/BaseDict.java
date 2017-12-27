package com.fly.domain;

public class BaseDict {
    private String dictId;

    private String dictTypeCode;

    private String dictTypeName;

    private String dictItemName;

    private String dictItemCode;

    private Integer dictSort;

    private String dictEnable;

    private String dictMemo;

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName;
    }

    public String getDictItemCode() {
        return dictItemCode;
    }

    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode;
    }

    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictEnable() {
        return dictEnable;
    }

    public void setDictEnable(String dictEnable) {
        this.dictEnable = dictEnable;
    }

    public String getDictMemo() {
        return dictMemo;
    }

    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dictId=").append(dictId);
        sb.append(", dictTypeCode=").append(dictTypeCode);
        sb.append(", dictTypeName=").append(dictTypeName);
        sb.append(", dictItemName=").append(dictItemName);
        sb.append(", dictItemCode=").append(dictItemCode);
        sb.append(", dictSort=").append(dictSort);
        sb.append(", dictEnable=").append(dictEnable);
        sb.append(", dictMemo=").append(dictMemo);
        sb.append("]");
        return sb.toString();
    }
}