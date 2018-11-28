/**
 * The service implements of TestTable，该文件继承于BaseServiceImpl
 * Created 2018/6/5
 * @author Howard Chung
 */
 package universityrecruit.student.statistics.impl;

import universityrecruit.student.statistics.dao.TestTableMapper;
import universityrecruit.student.statistics.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("TestTableService")
public class TestTableServiceImpl  implements ITestTableService {

    @Autowired
    private TestTableMapper oTestTableDao;


     public  TestTable selectByCondition(Map<String, Object> var3){
         return oTestTableDao.selectByCondition(var3);
     }


}
