package cn.xzxy.xxx.service.impl;


import cn.xzxy.xxx.dao.ISWDao;
import cn.xzxy.xxx.pojo.Sw;
import cn.xzxy.xxx.service.ISWService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWService implements ISWService {
    @Autowired
    private ISWDao swDao;

    public void add(Sw Sw) {
        swDao.add(Sw);
    }

    public void delete(int id) {
        Sw sw = swDao.load(id);
        swDao.delete(sw);
    }

    public void update() {
        Sw sw = swDao.get(1);
        sw.setFlag(!sw.isFlag());
        swDao.update(sw);
    }

    public Sw load(int id) {
        return swDao.load(id);
    }

    public Sw get(int id) {
        return swDao.get(id);
    }

    public List<Sw> list() {
        String hql = "from Sw";
        return swDao.list(hql, null);
    }
}
