/**
 * The service implements of InterviewRecord，该文件继承于BaseServiceImpl
 * Created 2018/9/18
 * @author Howard
 */
 package universityrecruit.enterprise.interviewmanagement.interviewrecord.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.interviewmanagement.interviewrecord.dao.EntIntInterviewRecordMapper;
import universityrecruit.enterprise.interviewmanagement.interviewrecord.entity.InterviewRecord;
import universityrecruit.enterprise.interviewmanagement.interviewrecord.service.IInterviewRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntIntInterviewRecordService")
public class EntIntInterviewRecordServiceImpl extends BaseServiceImpl<InterviewRecord> implements IInterviewRecordService {

    private EntIntInterviewRecordMapper oInterviewRecordDao;

    @Autowired
    public EntIntInterviewRecordServiceImpl(EntIntInterviewRecordMapper oTempInterviewRecordDao){
        this.oInterviewRecordDao = oTempInterviewRecordDao;
        this.baseDao = oInterviewRecordDao;
    }
}
