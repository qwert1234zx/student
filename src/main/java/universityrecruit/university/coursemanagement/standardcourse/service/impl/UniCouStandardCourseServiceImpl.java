/**
 * The service implements of StandardCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.coursemanagement.standardcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.coursemanagement.standardcourse.dao.UniCouStandardCourseMapper;
import universityrecruit.university.coursemanagement.standardcourse.entity.StandardCourse;
import universityrecruit.university.coursemanagement.standardcourse.service.IStandardCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniCouStandardCourseService")
public class UniCouStandardCourseServiceImpl extends BaseServiceImpl<StandardCourse> implements IStandardCourseService {

    private UniCouStandardCourseMapper oStandardCourseDao;

    @Autowired
    public UniCouStandardCourseServiceImpl(UniCouStandardCourseMapper oTempStandardCourseDao){
        this.oStandardCourseDao = oTempStandardCourseDao;
        this.baseDao = oStandardCourseDao;
    }
}
