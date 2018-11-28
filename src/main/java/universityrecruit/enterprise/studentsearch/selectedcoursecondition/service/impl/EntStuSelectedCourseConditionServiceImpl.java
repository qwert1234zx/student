/**
 * The service implements of SelectedCourseCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.selectedcoursecondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.selectedcoursecondition.dao.EntStuSelectedCourseConditionMapper;
import universityrecruit.enterprise.studentsearch.selectedcoursecondition.entity.SelectedCourseCondition;
import universityrecruit.enterprise.studentsearch.selectedcoursecondition.service.ISelectedCourseConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuSelectedCourseConditionService")
public class EntStuSelectedCourseConditionServiceImpl extends BaseServiceImpl<SelectedCourseCondition> implements ISelectedCourseConditionService {

    private EntStuSelectedCourseConditionMapper oSelectedCourseConditionDao;

    @Autowired
    public EntStuSelectedCourseConditionServiceImpl(EntStuSelectedCourseConditionMapper oTempSelectedCourseConditionDao){
        this.oSelectedCourseConditionDao = oTempSelectedCourseConditionDao;
        this.baseDao = oSelectedCourseConditionDao;
    }
}
