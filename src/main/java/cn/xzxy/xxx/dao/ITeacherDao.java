package cn.xzxy.xxx.dao;

import cn.xzxy.xxx.pojo.Teacher;

public interface ITeacherDao extends IBaseDao<Teacher> {
    public Teacher login(String username);

    public long loadByTeacherUserName(String username);
}
