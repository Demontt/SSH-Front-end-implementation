package cn.xzxy.xxx.service.impl;

import cn.xzxy.xxx.dao.IStudentDao;
import cn.xzxy.xxx.exception.UserException;
import cn.xzxy.xxx.pojo.Student;
import cn.xzxy.xxx.service.IStudentService;
import cn.xzxy.xxx.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentDao studentDao;

    public void add(Student student) {
        long count = studentDao.loadByStudentNum(student.getNum());
        if(count > 0) {
            throw new UserException("该学生已存在");
        }
        student.setPassword(CodeUtil.getMD5Encoding("888888"));//统一密码都为888888
        studentDao.add(student);
    }

    public void delete(int id) {
        Student student = studentDao.load(id);
        studentDao.delete(student);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public Student load(int id) {
        return studentDao.load(id);
    }

    public Student get(int id) {
        return studentDao.get(id);
    }

    public List<Student> list() {
        String hql = "select s from Student s";
        List<Student> students = studentDao.list(hql, null);
        return students;
    }

    public List<Student> list(Object arg) {
        List<Student> students = this.list(new Object[]{arg});
        return students;
    }

    public List<Student> list(Object[] args) {
        String hql = "select s from Student s where ";
        for(int i = 0; i < args.length; i++) {
            if(i == 0) {
                hql += args[i] + "=?";
            }
            hql += "," + args[i] + "=?";
        }
        List<Student> students = studentDao.list(hql, args);
        return students;
    }

    public Student login(String num, String password) {
        Student student = studentDao.login(num);
        if(student == null) {
            throw new UserException("该学生不存在");
        }
        if(!student.getPassword().equals(CodeUtil.getMD5Encoding(password))) {
            throw new UserException("密码错误");
        }
        return student;
    }
}
