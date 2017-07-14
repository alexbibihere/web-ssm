import com.yan.ssm.controller.AdminServiceBean;
import com.yan.ssm.dao.AdminDao;
import com.yan.ssm.model.Admin;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

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



  /*  @Test
    public void testAdmin() {
        //HttpServletRequest request = new HttpSer
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword("123");
        admin.setModifiedTime(new Date());
        String admins =  adminServiceBean.addAdmin(admin);
         System.out.println(admins
         );

    }*/


}
