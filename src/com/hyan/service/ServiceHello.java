package com.hyan.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceHello
{
    public String getValue(String name)
    {
        return "我叫" + name;
    }

    public String getAge(String age)
    {
        return "我今年" + age;
    }

    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:9001/Service/ServiceHello", new ServiceHello());
        System.out.println("通过http://localhost:9001/Service/ServiceHello?wsdl访问");
    }
}
