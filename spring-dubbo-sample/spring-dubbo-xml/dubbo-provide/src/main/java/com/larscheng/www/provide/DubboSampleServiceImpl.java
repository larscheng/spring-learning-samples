package com.larscheng.www.provide;

import com.larscheng.www.DubboSampleService;

public class DubboSampleServiceImpl implements DubboSampleService {
    public String sayHi(String name) {
        return "Hi " + name;
    }
}
