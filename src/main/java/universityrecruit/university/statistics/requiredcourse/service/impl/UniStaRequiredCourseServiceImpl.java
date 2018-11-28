/**
 * The service implements of RequiredCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.requiredcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.requiredcourse.dao.UniStaRequiredCourseMapper;
import universityrecruit.university.statistics.requiredcourse.entity.RequiredCourse;
import universityrecruit.university.statistics.requiredcourse.service.IRequiredCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaRequiredCourseService")
public class UniStaRequiredCourseServiceImpl extends BaseServiceImpl<RequiredCourse> implements IRequiredCourseService {

    private UniStaRequiredCourseMapper oRequiredCourseDao;

    @Autowired
    public UniStaRequiredCourseServiceImpl(UniStaRequiredCourseMapper oTempRequiredCourseDao){
        this.oRequiredCourseDao = oTempRequiredCourseDao;
        this.baseDao = oRequiredCourseDao;
    }
}
