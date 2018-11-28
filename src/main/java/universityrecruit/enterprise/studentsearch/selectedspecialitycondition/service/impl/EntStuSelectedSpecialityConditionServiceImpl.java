/**
 * The service implements of SelectedSpecialityCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.selectedspecialitycondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.selectedspecialitycondition.dao.EntStuSelectedSpecialityConditionMapper;
import universityrecruit.enterprise.studentsearch.selectedspecialitycondition.entity.SelectedSpecialityCondition;
import universityrecruit.enterprise.studentsearch.selectedspecialitycondition.service.ISelectedSpecialityConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuSelectedSpecialityConditionService")
public class EntStuSelectedSpecialityConditionServiceImpl extends BaseServiceImpl<SelectedSpecialityCondition> implements ISelectedSpecialityConditionService {

    private EntStuSelectedSpecialityConditionMapper oSelectedSpecialityConditionDao;

    @Autowired
    public EntStuSelectedSpecialityConditionServiceImpl(EntStuSelectedSpecialityConditionMapper oTempSelectedSpecialityConditionDao){
        this.oSelectedSpecialityConditionDao = oTempSelectedSpecialityConditionDao;
        this.baseDao = oSelectedSpecialityConditionDao;
    }
}
