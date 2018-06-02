package cn.xzxy.xxx.service;

import cn.xzxy.xxx.pojo.Teacher;

import java.util.List;

public interface ITeacherService {
    public void add(Teacher teacher);

    public void delete(int id);

    public void update(Teacher teacher);

    public Teacher load(int id);

    public Teacher get(int id);

    public List<Teacher> list();

    public List<Teacher> list(Object arg);

    public List<Teacher> list(Object args[]);

    public Teacher login(String username, String password);
}
