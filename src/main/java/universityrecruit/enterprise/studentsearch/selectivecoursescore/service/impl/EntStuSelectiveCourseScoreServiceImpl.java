/**
 * The service implements of SelectiveCourseScore，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.selectivecoursescore.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.selectivecoursescore.dao.EntStuSelectiveCourseScoreMapper;
import universityrecruit.enterprise.studentsearch.selectivecoursescore.entity.SelectiveCourseScore;
import universityrecruit.enterprise.studentsearch.selectivecoursescore.service.ISelectiveCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuSelectiveCourseScoreService")
public class EntStuSelectiveCourseScoreServiceImpl extends BaseServiceImpl<SelectiveCourseScore> implements ISelectiveCourseScoreService {

    private EntStuSelectiveCourseScoreMapper oSelectiveCourseScoreDao;

    @Autowired
    public EntStuSelectiveCourseScoreServiceImpl(EntStuSelectiveCourseScoreMapper oTempSelectiveCourseScoreDao){
        this.oSelectiveCourseScoreDao = oTempSelectiveCourseScoreDao;
        this.baseDao = oSelectiveCourseScoreDao;
    }
}
