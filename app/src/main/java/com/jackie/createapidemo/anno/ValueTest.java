package com.jackie.createapidemo.anno;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Description:
 *
 * @author feifei5292190@gmail.com
 * @date 2020-01-21
 */
public class ValueTest {
    public static void main(String[] args) throws Exception {
        User user = new User();
        // 1、 获取 User类上的注解 @ConsAnnotation
        ConsAnnotation anno = user.getClass().getAnnotation(ConsAnnotation.class);
        String[] arr = anno.request();
        System.out.println(Arrays.toString(arr)); // [hello, world, annotation!]

        // 2、 获取User类中 private String userName; 变量上的注解 @Field
        Field f = user.getClass().getDeclaredField("length");
        SerializedName anno2 = f.getAnnotation(SerializedName.class);
        user.setLength(anno2.value());
        System.out.println(user.length); // 中华人民共和国

//        Field f1 = user.getClass().getDeclaredField("name");
//        Fields anno3 = f.getAnnotation(Fields.class);
//        //user.setUserName(anno2.value());
//        System.out.println(user.getUserName()); // 中华人民共和国
    }


//    @Fields("测试")
//    private String name;
//
//    @SerializedName("seriable_length")
//    private String length;
}
