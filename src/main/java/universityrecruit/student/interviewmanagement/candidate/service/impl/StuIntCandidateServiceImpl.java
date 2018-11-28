/**
 * The service implements of Candidate，该文件继承于BaseServiceImpl
 * Created 2018/9/18
 * @author Howard
 */
 package universityrecruit.student.interviewmanagement.candidate.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.student.interviewmanagement.candidate.dao.StuIntCandidateMapper;
import universityrecruit.student.interviewmanagement.candidate.entity.Candidate;
import universityrecruit.student.interviewmanagement.candidate.service.ICandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuIntCandidateService")
public class StuIntCandidateServiceImpl extends BaseServiceImpl<Candidate> implements ICandidateService {

    private StuIntCandidateMapper oCandidateDao;

    @Autowired
    public StuIntCandidateServiceImpl(StuIntCandidateMapper oTempCandidateDao){
        this.oCandidateDao = oTempCandidateDao;
        this.baseDao = oCandidateDao;
    }
}
