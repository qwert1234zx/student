/**
 * The service implements of InterviewRecord，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.government.statistics.interviewrecord.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.government.statistics.interviewrecord.dao.GovStaInterviewRecordMapper;
import universityrecruit.government.statistics.interviewrecord.entity.InterviewRecord;
import universityrecruit.government.statistics.interviewrecord.service.IInterviewRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GovStaInterviewRecordService")
public class GovStaInterviewRecordServiceImpl extends BaseServiceImpl<InterviewRecord> implements IInterviewRecordService {

    private GovStaInterviewRecordMapper oInterviewRecordDao;

    @Autowired
    public GovStaInterviewRecordServiceImpl(GovStaInterviewRecordMapper oTempInterviewRecordDao){
        this.oInterviewRecordDao = oTempInterviewRecordDao;
        this.baseDao = oInterviewRecordDao;
    }
}
