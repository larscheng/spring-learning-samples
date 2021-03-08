package com.larscheng.www;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

public class ConsumerApplication {
    public static void main(String[] args) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("Consumer");

        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        ReferenceConfig<DubboSampleService> reference = new ReferenceConfig<DubboSampleService>();
        reference.setApplication(applicationConfig);
        reference.setRegistry(registryConfig);
        reference.setInterface(DubboSampleService.class);
        reference.setVersion("1.0.0");

        DubboSampleService dubboSampleService = reference.get();

        System.out.println(dubboSampleService.dubboApi("hahahhahahah"));
    }
}
