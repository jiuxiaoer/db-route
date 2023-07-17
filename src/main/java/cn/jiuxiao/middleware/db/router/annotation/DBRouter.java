package cn.jiuxiao.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * 数据库路由注解
 *
 * @author jiuxiao
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {
    String key() default "";
}
