/**
 * The service implements of Candidate，该文件继承于BaseServiceImpl
 * Created 2018/9/18
 * @author Howard
 */
 package universityrecruit.enterprise.interviewmanagement.candidate.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.interviewmanagement.candidate.dao.EntIntCandidateMapper;
import universityrecruit.enterprise.interviewmanagement.candidate.entity.Candidate;
import universityrecruit.enterprise.interviewmanagement.candidate.service.ICandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntIntCandidateService")
public class EntIntCandidateServiceImpl extends BaseServiceImpl<Candidate> implements ICandidateService {

    private EntIntCandidateMapper oCandidateDao;

    @Autowired
    public EntIntCandidateServiceImpl(EntIntCandidateMapper oTempCandidateDao){
        this.oCandidateDao = oTempCandidateDao;
        this.baseDao = oCandidateDao;
    }
}
