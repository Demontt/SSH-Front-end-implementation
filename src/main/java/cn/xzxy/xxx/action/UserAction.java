package cn.xzxy.xxx.action;

import cn.xzxy.xxx.pojo.User;
import cn.xzxy.xxx.service.ITeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
    @Autowired
    private ITeacherService teacherService;


    public User getModel() {
        // TODO Auto-generated method stub
        return null;
    }


}
