package cn.xzxy.xxx.dao;

import cn.xzxy.xxx.pojo.Student;

public interface IStudentDao extends IBaseDao<Student> {
    public Student login(String num);

    public long loadByStudentNum(String num);
}
