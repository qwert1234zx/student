/**
 * The service implements of RequiredCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.requiredcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.requiredcourse.dao.EntStuRequiredCourseMapper;
import universityrecruit.enterprise.studentsearch.requiredcourse.entity.RequiredCourse;
import universityrecruit.enterprise.studentsearch.requiredcourse.service.IRequiredCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuRequiredCourseService")
public class EntStuRequiredCourseServiceImpl extends BaseServiceImpl<RequiredCourse> implements IRequiredCourseService {

    private EntStuRequiredCourseMapper oRequiredCourseDao;

    @Autowired
    public EntStuRequiredCourseServiceImpl(EntStuRequiredCourseMapper oTempRequiredCourseDao){
        this.oRequiredCourseDao = oTempRequiredCourseDao;
        this.baseDao = oRequiredCourseDao;
    }
}
