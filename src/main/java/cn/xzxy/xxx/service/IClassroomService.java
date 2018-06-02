package cn.xzxy.xxx.service;

import cn.xzxy.xxx.pojo.Classroom;

import java.util.List;

public interface IClassroomService {

    public void add(Classroom classroom);

    public void delete(int id);

    public void update(Classroom classroom);

    public Classroom load(int id);

    public Classroom get(int id);

    public List<Classroom> list();

}
