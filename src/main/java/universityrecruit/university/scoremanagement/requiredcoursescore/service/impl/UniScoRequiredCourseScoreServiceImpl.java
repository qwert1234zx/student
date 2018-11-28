/**
 * The service implements of RequiredCourseScore，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.scoremanagement.requiredcoursescore.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.scoremanagement.requiredcoursescore.dao.UniScoRequiredCourseScoreMapper;
import universityrecruit.university.scoremanagement.requiredcoursescore.entity.RequiredCourseScore;
import universityrecruit.university.scoremanagement.requiredcoursescore.service.IRequiredCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniScoRequiredCourseScoreService")
public class UniScoRequiredCourseScoreServiceImpl extends BaseServiceImpl<RequiredCourseScore> implements IRequiredCourseScoreService {

    private UniScoRequiredCourseScoreMapper oRequiredCourseScoreDao;

    @Autowired
    public UniScoRequiredCourseScoreServiceImpl(UniScoRequiredCourseScoreMapper oTempRequiredCourseScoreDao){
        this.oRequiredCourseScoreDao = oTempRequiredCourseScoreDao;
        this.baseDao = oRequiredCourseScoreDao;
    }
}
