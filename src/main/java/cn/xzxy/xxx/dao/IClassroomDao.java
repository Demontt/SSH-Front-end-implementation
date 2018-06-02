package cn.xzxy.xxx.dao;

import cn.xzxy.xxx.pojo.Classroom;

public interface IClassroomDao extends IBaseDao<Classroom> {

    public long loadByClassroomName(String name);
}
