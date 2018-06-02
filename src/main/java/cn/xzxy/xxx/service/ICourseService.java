package cn.xzxy.xxx.service;

import cn.xzxy.xxx.pojo.Course;

import java.util.List;

public interface ICourseService {
    public void add(Course course);

    public void delete(int id);

    public void update(Course course);

    public Course load(int id);

    public Course get(int id);

    public List<Course> list();
}
