/**
 * The service implements of SelectedUniversityCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.selecteduniversitycondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.selecteduniversitycondition.dao.EntStuSelectedUniversityConditionMapper;
import universityrecruit.enterprise.studentsearch.selecteduniversitycondition.entity.SelectedUniversityCondition;
import universityrecruit.enterprise.studentsearch.selecteduniversitycondition.service.ISelectedUniversityConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuSelectedUniversityConditionService")
public class EntStuSelectedUniversityConditionServiceImpl extends BaseServiceImpl<SelectedUniversityCondition> implements ISelectedUniversityConditionService {

    private EntStuSelectedUniversityConditionMapper oSelectedUniversityConditionDao;

    @Autowired
    public EntStuSelectedUniversityConditionServiceImpl(EntStuSelectedUniversityConditionMapper oTempSelectedUniversityConditionDao){
        this.oSelectedUniversityConditionDao = oTempSelectedUniversityConditionDao;
        this.baseDao = oSelectedUniversityConditionDao;
    }
}
