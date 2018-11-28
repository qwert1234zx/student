/**
 * The service implements of Job，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.recruitinformationmanagement.job.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.recruitinformationmanagement.job.dao.EntRecJobMapper;
import universityrecruit.enterprise.recruitinformationmanagement.job.entity.Job;
import universityrecruit.enterprise.recruitinformationmanagement.job.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntRecJobService")
public class EntRecJobServiceImpl extends BaseServiceImpl<Job> implements IJobService {

    private EntRecJobMapper oJobDao;

    @Autowired
    public EntRecJobServiceImpl(EntRecJobMapper oTempJobDao){
        this.oJobDao = oTempJobDao;
        this.baseDao = oJobDao;
    }
}
