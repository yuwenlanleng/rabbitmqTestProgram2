package com.gomefinance;

/**
 * Created by Administrator on 2017/4/6.
 */
public class ThrowTest {

    public static void noRun1(){
        if(1==1){
            throw new    IllegalArgumentException("ddd");
        }
    }

    public static void main(String[] args ){
        try {
            noRun1();
        }catch (IllegalArgumentException i){
            throw new IllegalArgumentException("catch ");
        }

        System.out.println("eeeee");
    }

}
