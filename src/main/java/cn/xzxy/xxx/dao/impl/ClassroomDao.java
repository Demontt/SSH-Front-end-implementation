package cn.xzxy.xxx.dao.impl;

import cn.xzxy.xxx.dao.IClassroomDao;
import cn.xzxy.xxx.pojo.Classroom;
import org.springframework.stereotype.Repository;

@Repository
public class ClassroomDao extends BaseDao<Classroom> implements IClassroomDao {

    /**
     * 根据班级名称查询是否存在一个相同的班级
     */
    public long loadByClassroomName(String name) {
        String hql = "select count(*) from Classroom where name=?";
        Long count = (Long) openSession().createQuery(hql)
                .setParameter(0, name).uniqueResult();
        return count;
    }
}
