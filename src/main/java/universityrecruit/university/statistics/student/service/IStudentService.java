/**
 * The service interface of Student，该文件继承于IBaseService，其中insert、update、deleteByIdList、selectByID、selectByCondition可不用写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.statistics.student.service;

import com.each.common.base.service.IBaseService;
import java.util.Date;
import universityrecruit.university.statistics.student.entity.Student;

public interface IStudentService extends IBaseService<Student> {

}
