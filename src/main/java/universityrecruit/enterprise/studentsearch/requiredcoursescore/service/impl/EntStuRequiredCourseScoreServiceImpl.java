/**
 * The service implements of RequiredCourseScore，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.requiredcoursescore.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.requiredcoursescore.dao.EntStuRequiredCourseScoreMapper;
import universityrecruit.enterprise.studentsearch.requiredcoursescore.entity.RequiredCourseScore;
import universityrecruit.enterprise.studentsearch.requiredcoursescore.service.IRequiredCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuRequiredCourseScoreService")
public class EntStuRequiredCourseScoreServiceImpl extends BaseServiceImpl<RequiredCourseScore> implements IRequiredCourseScoreService {

    private EntStuRequiredCourseScoreMapper oRequiredCourseScoreDao;

    @Autowired
    public EntStuRequiredCourseScoreServiceImpl(EntStuRequiredCourseScoreMapper oTempRequiredCourseScoreDao){
        this.oRequiredCourseScoreDao = oTempRequiredCourseScoreDao;
        this.baseDao = oRequiredCourseScoreDao;
    }
}
