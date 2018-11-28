/**
 * The service implements of RequiredCourseScore，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.requiredcoursescore.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.requiredcoursescore.dao.EntStaRequiredCourseScoreMapper;
import universityrecruit.enterprise.statistics.requiredcoursescore.entity.RequiredCourseScore;
import universityrecruit.enterprise.statistics.requiredcoursescore.service.IRequiredCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaRequiredCourseScoreService")
public class EntStaRequiredCourseScoreServiceImpl extends BaseServiceImpl<RequiredCourseScore> implements IRequiredCourseScoreService {

    private EntStaRequiredCourseScoreMapper oRequiredCourseScoreDao;

    @Autowired
    public EntStaRequiredCourseScoreServiceImpl(EntStaRequiredCourseScoreMapper oTempRequiredCourseScoreDao){
        this.oRequiredCourseScoreDao = oTempRequiredCourseScoreDao;
        this.baseDao = oRequiredCourseScoreDao;
    }
}
