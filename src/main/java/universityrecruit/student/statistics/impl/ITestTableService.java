/**
 * The service interface of TestTable，该文件继承于IBaseService，其中insert、update、deleteByIdList、selectByID、selectByCondition可不用写
 * Created 2018/6/5
 * @author Howard Chung
 */
package universityrecruit.student.statistics.impl;

import universityrecruit.student.statistics.entity.*;

import java.util.Map;

public interface ITestTableService {
   TestTable selectByCondition(Map<String, Object> var3);

}
