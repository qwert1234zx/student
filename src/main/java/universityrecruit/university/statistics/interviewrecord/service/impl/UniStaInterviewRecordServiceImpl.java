/**
 * The service implements of InterviewRecord，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.interviewrecord.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.interviewrecord.dao.UniStaInterviewRecordMapper;
import universityrecruit.university.statistics.interviewrecord.entity.InterviewRecord;
import universityrecruit.university.statistics.interviewrecord.service.IInterviewRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaInterviewRecordService")
public class UniStaInterviewRecordServiceImpl extends BaseServiceImpl<InterviewRecord> implements IInterviewRecordService {

    private UniStaInterviewRecordMapper oInterviewRecordDao;

    @Autowired
    public UniStaInterviewRecordServiceImpl(UniStaInterviewRecordMapper oTempInterviewRecordDao){
        this.oInterviewRecordDao = oTempInterviewRecordDao;
        this.baseDao = oInterviewRecordDao;
    }
}
