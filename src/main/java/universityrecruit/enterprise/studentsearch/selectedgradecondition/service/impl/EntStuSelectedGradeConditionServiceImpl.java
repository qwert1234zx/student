/**
 * The service implements of SelectedGradeCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.selectedgradecondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.selectedgradecondition.dao.EntStuSelectedGradeConditionMapper;
import universityrecruit.enterprise.studentsearch.selectedgradecondition.entity.SelectedGradeCondition;
import universityrecruit.enterprise.studentsearch.selectedgradecondition.service.ISelectedGradeConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuSelectedGradeConditionService")
public class EntStuSelectedGradeConditionServiceImpl extends BaseServiceImpl<SelectedGradeCondition> implements ISelectedGradeConditionService {

    private EntStuSelectedGradeConditionMapper oSelectedGradeConditionDao;

    @Autowired
    public EntStuSelectedGradeConditionServiceImpl(EntStuSelectedGradeConditionMapper oTempSelectedGradeConditionDao){
        this.oSelectedGradeConditionDao = oTempSelectedGradeConditionDao;
        this.baseDao = oSelectedGradeConditionDao;
    }
}
