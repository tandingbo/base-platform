package com.tanbobo.platform.common.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 获取spring上下文
 */
@Lazy(value = false)
@Component
public class BaseApplicationContext implements ApplicationContextAware {
    private static ApplicationContext ctx;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return ctx;
    }
}
