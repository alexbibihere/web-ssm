import com.yan.ssm.controller.AdminServiceBean;
import com.yan.ssm.controller.UseServiceBean;
import com.yan.ssm.controller.UserServiceBean;
import com.yan.ssm.dao.AdminDao;
import com.yan.ssm.dao.UserDao;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by yan on 2017/6/27/0027.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class AdminServiceBeanTester {
    private static Logger logger = Logger.getLogger(AdminServiceBeanTester.class);

        @Autowired
        private AdminDao adminDao;
        @Autowired
        private AdminServiceBean adminServiceBean;



    @Test
    public void testAdmin() {
        String username ="admin";

       // String admins =  adminServiceBean.login(username);
         System.out.println(username
         );

    }


}
