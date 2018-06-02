package cn.xzxy.xxx.dao;

import cn.xzxy.xxx.pojo.Course;

public interface ICourseDao extends IBaseDao<Course>{
    public long loadByCourseName(String name);
}
