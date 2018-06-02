package cn.xzxy.xxx.dao.impl;

import cn.xzxy.xxx.dao.ITeacherDao;
import cn.xzxy.xxx.pojo.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDao extends BaseDao<Teacher> implements ITeacherDao {

    /**
     * 教师登录
     */
    public Teacher login(String username) {
        // TODO Auto-generated method stub
        String hql = "select t from Teacher t where username=?";
        Teacher teacher = (Teacher) openSession()
                .createQuery(hql).setParameter(0, username).uniqueResult();
        return teacher;
    }

    public long loadByTeacherUserName(String username) {
        String hql = "select count(*) from Teacher where username=?";
        Long count = (Long) openSession().createQuery(hql)
                .setParameter(0, username).uniqueResult();
        return count;
    }

}

