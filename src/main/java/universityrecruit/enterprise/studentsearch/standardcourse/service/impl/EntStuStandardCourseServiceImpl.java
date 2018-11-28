/**
 * The service implements of StandardCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.standardcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.standardcourse.dao.EntStuStandardCourseMapper;
import universityrecruit.enterprise.studentsearch.standardcourse.entity.StandardCourse;
import universityrecruit.enterprise.studentsearch.standardcourse.service.IStandardCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuStandardCourseService")
public class EntStuStandardCourseServiceImpl extends BaseServiceImpl<StandardCourse> implements IStandardCourseService {

    private EntStuStandardCourseMapper oStandardCourseDao;

    @Autowired
    public EntStuStandardCourseServiceImpl(EntStuStandardCourseMapper oTempStandardCourseDao){
        this.oStandardCourseDao = oTempStandardCourseDao;
        this.baseDao = oStandardCourseDao;
    }
}
