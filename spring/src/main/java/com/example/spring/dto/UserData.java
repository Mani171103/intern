package com.example.spring.dto;



public class UserData
{

    private String me;
    private String designation;
    UserData(){

    }
    UserData(String b,String c) {
        this.me = b;
        this.designation = c;
    }
    public String getName(){
        return me;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setMe(String name) {
        this.me=name;
    }

    @Override
    public String toString() {
        return me + " " + designation;
    }
}
