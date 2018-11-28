/**
 * The service implements of EnterpriseAddressCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.student.jobsearch.enterpriseaddresscondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.student.jobsearch.enterpriseaddresscondition.dao.StuJobEnterpriseAddressConditionMapper;
import universityrecruit.student.jobsearch.enterpriseaddresscondition.entity.EnterpriseAddressCondition;
import universityrecruit.student.jobsearch.enterpriseaddresscondition.service.IEnterpriseAddressConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuJobEnterpriseAddressConditionService")
public class StuJobEnterpriseAddressConditionServiceImpl extends BaseServiceImpl<EnterpriseAddressCondition> implements IEnterpriseAddressConditionService {

    private StuJobEnterpriseAddressConditionMapper oEnterpriseAddressConditionDao;

    @Autowired
    public StuJobEnterpriseAddressConditionServiceImpl(StuJobEnterpriseAddressConditionMapper oTempEnterpriseAddressConditionDao){
        this.oEnterpriseAddressConditionDao = oTempEnterpriseAddressConditionDao;
        this.baseDao = oEnterpriseAddressConditionDao;
    }
}
