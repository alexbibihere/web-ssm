import com.alibaba.fastjson.JSONObject;
import com.yan.ssm.controller.AdminServiceBean;
import com.yan.ssm.controller.UseServiceBean;
import com.yan.ssm.controller.UserServiceBean;
import com.yan.ssm.dao.AdminDao;
import com.yan.ssm.dao.UserDao;
import com.yan.ssm.model.TblUser;
import com.yan.ssm.model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

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
    private AdminServiceBean adminServiceBean;
    @Autowired
    private UserServiceBean userServiceBean;
    @Autowired
    private UseServiceBean useServiceBean;
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
        List<TblUser> user =  userServiceBean.getAllUser();
        // System.out.println(user.getUserName());
        for (TblUser tblUser:user){
         logger.info("值："+tblUser+user);
        }
        System.out.println(JSONObject.toJSONString(user));
    }


  /*  @Test
    public void testAdd() throws Exception {
        User u = new User();
        u.setUsername("yan");
        u.setPassword("deguang");
         //String user =  useServiceBean.register(u.getPassword(),u.getUsername());
        String user =  useServiceBean.register(u);
        System.out.println(user);
            logger.info("值："+user);

        System.out.println(JSONObject.toJSONString(user));
    }*/
}
