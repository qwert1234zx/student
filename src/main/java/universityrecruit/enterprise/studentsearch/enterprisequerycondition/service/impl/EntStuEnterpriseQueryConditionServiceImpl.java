/**
 * The service implements of EnterpriseQueryCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.enterprisequerycondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.enterprisequerycondition.dao.EntStuEnterpriseQueryConditionMapper;
import universityrecruit.enterprise.studentsearch.enterprisequerycondition.entity.EnterpriseQueryCondition;
import universityrecruit.enterprise.studentsearch.enterprisequerycondition.service.IEnterpriseQueryConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuEnterpriseQueryConditionService")
public class EntStuEnterpriseQueryConditionServiceImpl extends BaseServiceImpl<EnterpriseQueryCondition> implements IEnterpriseQueryConditionService {

    private EntStuEnterpriseQueryConditionMapper oEnterpriseQueryConditionDao;

    @Autowired
    public EntStuEnterpriseQueryConditionServiceImpl(EntStuEnterpriseQueryConditionMapper oTempEnterpriseQueryConditionDao){
        this.oEnterpriseQueryConditionDao = oTempEnterpriseQueryConditionDao;
        this.baseDao = oEnterpriseQueryConditionDao;
    }
}
