package com.practice.javase.annotation;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

/**
 * @author Luo Bao Ding
 * @since 2019/12/10
 */
public class DemoAnnotationTest {


    @Test
    public void testOverride() {
        DemoAnnotation annotation = new DemoAnnotation() {
            @Override
            public String tag() {
                return "human";
            }

            @Override
            public Class<? extends Annotation> annotationType() {
                return DemoAnnotation.class;
            }
        };

    }
}
