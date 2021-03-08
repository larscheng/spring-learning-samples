package com.larscheng.www.impl;

import com.larscheng.www.DubboSampleService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("annotationSamplesConsumer")
public class AnnotationComponent {
    @Reference
    private DubboSampleService dubboSampleService;

    public String doBalalala(String str){
        System.out.println("Consumer ----> "+str);
        return dubboSampleService.balabalbala(str);
    }
}
