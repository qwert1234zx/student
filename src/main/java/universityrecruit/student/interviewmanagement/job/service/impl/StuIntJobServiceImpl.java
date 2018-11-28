/**
 * The service implements of Job，该文件继承于BaseServiceImpl
 * Created 2018/9/18
 * @author Howard
 */
 package universityrecruit.student.interviewmanagement.job.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.student.interviewmanagement.job.dao.StuIntJobMapper;
import universityrecruit.student.interviewmanagement.job.entity.Job;
import universityrecruit.student.interviewmanagement.job.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuIntJobService")
public class StuIntJobServiceImpl extends BaseServiceImpl<Job> implements IJobService {

    private StuIntJobMapper oJobDao;

    @Autowired
    public StuIntJobServiceImpl(StuIntJobMapper oTempJobDao){
        this.oJobDao = oTempJobDao;
        this.baseDao = oJobDao;
    }
}
