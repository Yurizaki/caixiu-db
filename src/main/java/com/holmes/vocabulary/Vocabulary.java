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

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == Vocabulary.class) {
            Vocabulary vocabularyCompare = (Vocabulary) obj;
            return this.chinese.equals(vocabularyCompare.chinese)
                    && this.pinyin.equals(vocabularyCompare.pinyin);
        }
        return false;
    }
}
