/**
 * The service implements of RequiredCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.scoremanagement.requiredcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.scoremanagement.requiredcourse.dao.UniScoRequiredCourseMapper;
import universityrecruit.university.scoremanagement.requiredcourse.entity.RequiredCourse;
import universityrecruit.university.scoremanagement.requiredcourse.service.IRequiredCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniScoRequiredCourseService")
public class UniScoRequiredCourseServiceImpl extends BaseServiceImpl<RequiredCourse> implements IRequiredCourseService {

    private UniScoRequiredCourseMapper oRequiredCourseDao;

    @Autowired
    public UniScoRequiredCourseServiceImpl(UniScoRequiredCourseMapper oTempRequiredCourseDao){
        this.oRequiredCourseDao = oTempRequiredCourseDao;
        this.baseDao = oRequiredCourseDao;
    }
}
