package com.holmes.vocabulary;

public class Vocabulary {

    String chinese;

    String pinyin;

    public Vocabulary(String chinese, String pinyin) {
        this.chinese = chinese;
        this.pinyin = pinyin;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
