package com.larscheng.www.impl;

import com.larscheng.www.DubboSampleService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class AnnotationSamplesServiceImpl implements DubboSampleService {

    public String balabalbala(String str) {
        System.out.println("Provider ----> "+str);
        return "balblablalblablala....: "+str;
    }
}
