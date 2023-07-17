package cn.jiuxiao.middleware.db.router.dynamic;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import cn.jiuxiao.middleware.db.router.DBContextHolder;
/**
 * 动态数据源
 * @author jiuxiao
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }
}
