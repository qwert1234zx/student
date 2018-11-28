/**
 * The service implements of InterviewRecord，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.interviewrecord.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.interviewrecord.dao.EntStaInterviewRecordMapper;
import universityrecruit.enterprise.statistics.interviewrecord.entity.InterviewRecord;
import universityrecruit.enterprise.statistics.interviewrecord.service.IInterviewRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaInterviewRecordService")
public class EntStaInterviewRecordServiceImpl extends BaseServiceImpl<InterviewRecord> implements IInterviewRecordService {

    private EntStaInterviewRecordMapper oInterviewRecordDao;

    @Autowired
    public EntStaInterviewRecordServiceImpl(EntStaInterviewRecordMapper oTempInterviewRecordDao){
        this.oInterviewRecordDao = oTempInterviewRecordDao;
        this.baseDao = oInterviewRecordDao;
    }
}
