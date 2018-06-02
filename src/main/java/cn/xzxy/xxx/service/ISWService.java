package cn.xzxy.xxx.service;


import cn.xzxy.xxx.pojo.Sw;

import java.util.List;

public interface ISWService {

    public void update();

    public Sw load(int id);

    public Sw get(int id);

    public List<Sw> list();
}
