package com.example.demo;


import com.gw.GwService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private GwService gwService;

    @org.junit.Test
    public void test(){

        gwService.Hello();
    }
}
