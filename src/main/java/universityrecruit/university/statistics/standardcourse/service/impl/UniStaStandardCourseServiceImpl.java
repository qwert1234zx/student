/**
 * The service implements of StandardCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.standardcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.standardcourse.dao.UniStaStandardCourseMapper;
import universityrecruit.university.statistics.standardcourse.entity.StandardCourse;
import universityrecruit.university.statistics.standardcourse.service.IStandardCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaStandardCourseService")
public class UniStaStandardCourseServiceImpl extends BaseServiceImpl<StandardCourse> implements IStandardCourseService {

    private UniStaStandardCourseMapper oStandardCourseDao;

    @Autowired
    public UniStaStandardCourseServiceImpl(UniStaStandardCourseMapper oTempStandardCourseDao){
        this.oStandardCourseDao = oTempStandardCourseDao;
        this.baseDao = oStandardCourseDao;
    }
}
