/**
 * The service implements of DegreeTypeCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.degreetypecondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.degreetypecondition.dao.EntStuDegreeTypeConditionMapper;
import universityrecruit.enterprise.studentsearch.degreetypecondition.entity.DegreeTypeCondition;
import universityrecruit.enterprise.studentsearch.degreetypecondition.service.IDegreeTypeConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuDegreeTypeConditionService")
public class EntStuDegreeTypeConditionServiceImpl extends BaseServiceImpl<DegreeTypeCondition> implements IDegreeTypeConditionService {

    private EntStuDegreeTypeConditionMapper oDegreeTypeConditionDao;

    @Autowired
    public EntStuDegreeTypeConditionServiceImpl(EntStuDegreeTypeConditionMapper oTempDegreeTypeConditionDao){
        this.oDegreeTypeConditionDao = oTempDegreeTypeConditionDao;
        this.baseDao = oDegreeTypeConditionDao;
    }
}
