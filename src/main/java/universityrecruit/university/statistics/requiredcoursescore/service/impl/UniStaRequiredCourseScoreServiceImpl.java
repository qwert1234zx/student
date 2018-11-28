/**
 * The service implements of RequiredCourseScore，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.requiredcoursescore.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.requiredcoursescore.dao.UniStaRequiredCourseScoreMapper;
import universityrecruit.university.statistics.requiredcoursescore.entity.RequiredCourseScore;
import universityrecruit.university.statistics.requiredcoursescore.service.IRequiredCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaRequiredCourseScoreService")
public class UniStaRequiredCourseScoreServiceImpl extends BaseServiceImpl<RequiredCourseScore> implements IRequiredCourseScoreService {

    private UniStaRequiredCourseScoreMapper oRequiredCourseScoreDao;

    @Autowired
    public UniStaRequiredCourseScoreServiceImpl(UniStaRequiredCourseScoreMapper oTempRequiredCourseScoreDao){
        this.oRequiredCourseScoreDao = oTempRequiredCourseScoreDao;
        this.baseDao = oRequiredCourseScoreDao;
    }
}
