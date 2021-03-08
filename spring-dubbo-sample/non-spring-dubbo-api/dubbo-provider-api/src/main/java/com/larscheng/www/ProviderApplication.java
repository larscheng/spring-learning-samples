package com.larscheng.www;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.util.concurrent.CountDownLatch;

public class ProviderApplication {
    public static void main(String[] args) throws InterruptedException {
        //当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("Provider");

        //注册中心配置
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");

        //服务提供者的协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(8899);

        //服务提供者暴露服务配置
        ServiceConfig<DubboSampleService> serviceConfig = new ServiceConfig<DubboSampleService>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setInterface(DubboSampleService.class);
        serviceConfig.setRef(new ApiDubboSampleServiceImp());
        serviceConfig.setVersion("1.0.0");

        //暴露及注册服务
        serviceConfig.export();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
