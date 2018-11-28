/**
 * The service implements of InterviewRecord，该文件继承于BaseServiceImpl
 * Created 2018/9/18
 * @author Howard
 */
 package universityrecruit.student.interviewmanagement.interviewrecord.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.student.interviewmanagement.interviewrecord.dao.StuIntInterviewRecordMapper;
import universityrecruit.student.interviewmanagement.interviewrecord.entity.InterviewRecord;
import universityrecruit.student.interviewmanagement.interviewrecord.service.IInterviewRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuIntInterviewRecordService")
public class StuIntInterviewRecordServiceImpl extends BaseServiceImpl<InterviewRecord> implements IInterviewRecordService {

    private StuIntInterviewRecordMapper oInterviewRecordDao;

    @Autowired
    public StuIntInterviewRecordServiceImpl(StuIntInterviewRecordMapper oTempInterviewRecordDao){
        this.oInterviewRecordDao = oTempInterviewRecordDao;
        this.baseDao = oInterviewRecordDao;
    }
}
