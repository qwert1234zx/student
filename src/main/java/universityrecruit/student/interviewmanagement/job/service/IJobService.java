/**
 * The service interface of Job，该文件继承于IBaseService，其中insert、update、deleteByIdList、selectByID、selectByCondition可不用写
 * Created 2018/9/18
 * @author Howard
 */
package universityrecruit.student.interviewmanagement.job.service;

import com.each.common.base.service.IBaseService;
import java.util.Date;
import universityrecruit.student.interviewmanagement.job.entity.Job;

public interface IJobService extends IBaseService<Job> {

}
