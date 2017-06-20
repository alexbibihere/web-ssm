import com.alibaba.fastjson.JSONObject;
import com.yan.controller.AdminServiceBean;
import com.yan.controller.UserServiceBean;
import com.yan.dao.AdminDao;
import com.yan.dao.UserDao;
import com.yan.model.TblAdmin;
import com.yan.model.TblUser;
import com.yan.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static com.sun.webpane.platform.ConfigManager.log;

/**
 * Created by yan on 2017/6/19/0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class UserServiceBeanTester {
    private static Logger logger = Logger.getLogger(UserServiceBeanTester.class);
    @Resource
    private UserDao userDao;
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private AdminServiceBean userServiceBean;
   /* *//*@Resource
    private UserService userService;*//*


    @Test
    public void showUser(){
        log.info("查询所有用户信息");
        List<TblUser> tblUserList = userService.getAllUser();
      System.out.println(tblUserList);

    }*/

   /* @Test
    public void testAdmin() {
        List<TblAdmin> admins =  userServiceBean.getAllUser();
        // System.out.println(user.getUserName());
        for (TblAdmin tblAdmin:admins){
            logger.info("值："+tblAdmin+admins);
        }
        System.out.println(JSONObject.toJSONString(admins));
    }*/

    @Test
    public void test1() {
/*
        List<TblUser> user =  userServiceBean.getAllUser();
        // System.out.println(user.getUserName());
        for (TblUser tblUser:user){
         logger.info("值："+tblUser+user);
        }
        System.out.println(JSONObject.toJSONString(user));*/
    }
}
