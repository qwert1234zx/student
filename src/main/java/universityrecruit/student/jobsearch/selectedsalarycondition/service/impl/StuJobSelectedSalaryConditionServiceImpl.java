/**
 * The service implements of SelectedSalaryCondition，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.student.jobsearch.selectedsalarycondition.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.student.jobsearch.selectedsalarycondition.dao.StuJobSelectedSalaryConditionMapper;
import universityrecruit.student.jobsearch.selectedsalarycondition.entity.SelectedSalaryCondition;
import universityrecruit.student.jobsearch.selectedsalarycondition.service.ISelectedSalaryConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuJobSelectedSalaryConditionService")
public class StuJobSelectedSalaryConditionServiceImpl extends BaseServiceImpl<SelectedSalaryCondition> implements ISelectedSalaryConditionService {

    private StuJobSelectedSalaryConditionMapper oSelectedSalaryConditionDao;

    @Autowired
    public StuJobSelectedSalaryConditionServiceImpl(StuJobSelectedSalaryConditionMapper oTempSelectedSalaryConditionDao){
        this.oSelectedSalaryConditionDao = oTempSelectedSalaryConditionDao;
        this.baseDao = oSelectedSalaryConditionDao;
    }
}
