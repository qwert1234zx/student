/**
 * The service interface of Candidate，该文件继承于IBaseService，其中insert、update、deleteByIdList、selectByID、selectByCondition可不用写
 * Created 2018/9/18
 * @author Howard
 */
package universityrecruit.enterprise.interviewmanagement.candidate.service;

import com.each.common.base.service.IBaseService;
import java.util.Date;
import universityrecruit.enterprise.interviewmanagement.candidate.entity.Candidate;

public interface ICandidateService extends IBaseService<Candidate> {

}
