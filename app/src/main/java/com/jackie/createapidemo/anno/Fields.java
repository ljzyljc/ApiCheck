package com.jackie.createapidemo.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description:
 *
 * @author feifei5292190@gmail.com
 * @date 2020-01-21
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value= ElementType.FIELD)
public @interface Fields {
    int sort() default 0 ;
    String value() ;
}
