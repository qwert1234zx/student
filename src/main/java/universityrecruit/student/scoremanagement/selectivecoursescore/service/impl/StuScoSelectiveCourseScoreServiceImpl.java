/**
 * The service implements of SelectiveCourseScore，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.student.scoremanagement.selectivecoursescore.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.student.scoremanagement.selectivecoursescore.dao.StuScoSelectiveCourseScoreMapper;
import universityrecruit.student.scoremanagement.selectivecoursescore.entity.SelectiveCourseScore;
import universityrecruit.student.scoremanagement.selectivecoursescore.service.ISelectiveCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuScoSelectiveCourseScoreService")
public class StuScoSelectiveCourseScoreServiceImpl extends BaseServiceImpl<SelectiveCourseScore> implements ISelectiveCourseScoreService {

    private StuScoSelectiveCourseScoreMapper oSelectiveCourseScoreDao;

    @Autowired
    public StuScoSelectiveCourseScoreServiceImpl(StuScoSelectiveCourseScoreMapper oTempSelectiveCourseScoreDao){
        this.oSelectiveCourseScoreDao = oTempSelectiveCourseScoreDao;
        this.baseDao = oSelectiveCourseScoreDao;
    }
}
