package com.mysite.sbb2;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
//@Setter
@RequiredArgsConstructor
public class HelloLombok {
//    private String hello;
//    private int lombok;
    private final String Hello;
    private final int Lombok;

//    public String getHello() {
//        return hello;
//    }
//
//    public void setHello(String hello) {
//        this.hello = hello;
//    }
//
//    public int getLombok() {
//        return lombok;
//    }
//
//    public void setLombok(int lombok) {
//        this.lombok = lombok;
//    }

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로",5);
//        helloLombok.setHello("헬로");
//        helloLombok.setLombok(5);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
