import com.yan.ssm.controller.NoticeServiceBean;
import com.yan.ssm.dao.NoticeDao;
import com.yan.ssm.model.Notice;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by yandeguang on 2017/7/13/0013.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class NoticeServiceBeanTester {
    private static Logger logger = Logger.getLogger(NoticeServiceBeanTester.class);

    @Autowired
    private NoticeDao noticeDao;
    @Autowired
    private NoticeServiceBean noticeServiceBean;


    @Test
    public void testNotice() {
        Notice notice = new Notice();
        notice.setCategoryAlias("1");
        notice.setCategoryFname("1");
        notice.setCategoryName("1");
        notice.setCreateTime(new Date());
        notice.setdescription("1");
        notice.setKeywords("1");


        String notice1 = noticeServiceBean.addNotice(notice);
        System.out.println(notice1);

    }
}
