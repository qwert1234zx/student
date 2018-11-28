/**
 * The dao of TestTable，该文件继承于BaseMapper，基本的CURD方法采用基类中的方法，若无必要可不用重写
 * Created 2018/6/5
 * @author Howard Chung
 */
package universityrecruit.student.statistics.dao;

import universityrecruit.student.statistics.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface TestTableMapper {
    TestTable selectByCondition(Map<String, Object> var1);

}