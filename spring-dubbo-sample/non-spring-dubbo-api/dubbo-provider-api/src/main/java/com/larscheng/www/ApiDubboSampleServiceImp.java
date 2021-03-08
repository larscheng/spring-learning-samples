package com.larscheng.www;

public class ApiDubboSampleServiceImp implements DubboSampleService {
    public String dubboApi(String str) {
        System.out.println("Provider ..... ");
        return "Api Sample..... "+str;
    }
}
