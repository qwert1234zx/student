/**
 * The service implements of UniversityTypeCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.universitytypecondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.universitytypecondition.dao.EntStuUniversityTypeConditionMapper;
import universityrecruit.enterprise.studentsearch.universitytypecondition.entity.UniversityTypeCondition;
import universityrecruit.enterprise.studentsearch.universitytypecondition.service.IUniversityTypeConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuUniversityTypeConditionService")
public class EntStuUniversityTypeConditionServiceImpl extends BaseServiceImpl<UniversityTypeCondition> implements IUniversityTypeConditionService {

    private EntStuUniversityTypeConditionMapper oUniversityTypeConditionDao;

    @Autowired
    public EntStuUniversityTypeConditionServiceImpl(EntStuUniversityTypeConditionMapper oTempUniversityTypeConditionDao){
        this.oUniversityTypeConditionDao = oTempUniversityTypeConditionDao;
        this.baseDao = oUniversityTypeConditionDao;
    }
}
