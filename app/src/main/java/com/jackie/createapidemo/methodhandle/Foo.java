package com.jackie.createapidemo.methodhandle;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Description:
 *
 * @author feifei5292190@gmail.com
 * @date 2020-02-16
 */
public class Foo {

//    public void print(String s){
//        System.out.println("hello, "+s);
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.O)
//    public static void main(String[] args) throws Throwable {
//        Foo foo = new Foo();
//
//        MethodType methodType = MethodType.methodType(void.class,String.class);
//        MethodHandle methodHandle = MethodHandles
//                .lookup().findVirtual(Foo.class,"print",methodType);
//        methodHandle.invokeExact(foo,"world");
//
//
//    }

}
