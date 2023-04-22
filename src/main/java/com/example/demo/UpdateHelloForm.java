package com.example.demo;

public class UpdateHelloForm {
    private String name;

    public UpdateHelloForm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //bean を作って、更新情報をビーンへ入れ込む。ビーンはテーブルと同じ形式なので、dbと会話できる。
}
