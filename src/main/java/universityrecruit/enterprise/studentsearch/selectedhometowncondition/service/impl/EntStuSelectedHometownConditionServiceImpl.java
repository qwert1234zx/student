/**
 * The service implements of SelectedHometownCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.selectedhometowncondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.selectedhometowncondition.dao.EntStuSelectedHometownConditionMapper;
import universityrecruit.enterprise.studentsearch.selectedhometowncondition.entity.SelectedHometownCondition;
import universityrecruit.enterprise.studentsearch.selectedhometowncondition.service.ISelectedHometownConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuSelectedHometownConditionService")
public class EntStuSelectedHometownConditionServiceImpl extends BaseServiceImpl<SelectedHometownCondition> implements ISelectedHometownConditionService {

    private EntStuSelectedHometownConditionMapper oSelectedHometownConditionDao;

    @Autowired
    public EntStuSelectedHometownConditionServiceImpl(EntStuSelectedHometownConditionMapper oTempSelectedHometownConditionDao){
        this.oSelectedHometownConditionDao = oTempSelectedHometownConditionDao;
        this.baseDao = oSelectedHometownConditionDao;
    }
}
