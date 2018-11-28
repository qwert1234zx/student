/**
 * The service implements of Job，该文件继承于BaseServiceImpl
 * Created 2018/9/18
 * @author Howard
 */
 package universityrecruit.enterprise.interviewmanagement.job.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.interviewmanagement.job.dao.EntIntJobMapper;
import universityrecruit.enterprise.interviewmanagement.job.entity.Job;
import universityrecruit.enterprise.interviewmanagement.job.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntIntJobService")
public class EntIntJobServiceImpl extends BaseServiceImpl<Job> implements IJobService {

    private EntIntJobMapper oJobDao;

    @Autowired
    public EntIntJobServiceImpl(EntIntJobMapper oTempJobDao){
        this.oJobDao = oTempJobDao;
        this.baseDao = oJobDao;
    }
}
