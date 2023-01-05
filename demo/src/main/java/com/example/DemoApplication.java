package com.example;

import com.example.model.Doctor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        SampleObject sampleObject=new SampleObject();
        SampleObject sampleObject1=new SampleObject();

        sampleObject.setFirstName("firstNAME");
        sampleObject.setName("Name");
        sampleObject1.setFirstName("firstNAME1");
        sampleObject1.setName("Name1");
        List<SampleObject> l =new ArrayList<>() ;
        l.add(sampleObject);
        l.add(sampleObject1);

        Object a= l.get(0);
        System.out.println("list is"+a);

        Doctor d1=new Doctor();
        Doctor d2=new Doctor();
        Doctor d3=new Doctor();
        Doctor d4=new Doctor();
        Doctor d5=new Doctor();
        Doctor d6=new Doctor();

        HashSet<Doctor> hashSet=new HashSet<>();
        hashSet.add(d1);
        hashSet.add(d2);
        hashSet.add(d3);
        hashSet.add(d4);
        hashSet.add(d5);
        hashSet.add(d6);

        System.out.println("hashset size -"+hashSet.size()); //
        System.out.println(d1);
        d1.equals(d1);

        Object o =new Object();
        int aA=d1.hashCode();

        HashMap<Integer,String> hashMap=new HashMap<>();




    }

}
