/**
 * The service implements of RequiredCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.coursemanagement.requiredcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.coursemanagement.requiredcourse.dao.UniCouRequiredCourseMapper;
import universityrecruit.university.coursemanagement.requiredcourse.entity.RequiredCourse;
import universityrecruit.university.coursemanagement.requiredcourse.service.IRequiredCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniCouRequiredCourseService")
public class UniCouRequiredCourseServiceImpl extends BaseServiceImpl<RequiredCourse> implements IRequiredCourseService {

    private UniCouRequiredCourseMapper oRequiredCourseDao;

    @Autowired
    public UniCouRequiredCourseServiceImpl(UniCouRequiredCourseMapper oTempRequiredCourseDao){
        this.oRequiredCourseDao = oTempRequiredCourseDao;
        this.baseDao = oRequiredCourseDao;
    }
}
