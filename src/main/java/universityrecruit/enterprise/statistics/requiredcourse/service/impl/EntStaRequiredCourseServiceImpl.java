/**
 * The service implements of RequiredCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.requiredcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.requiredcourse.dao.EntStaRequiredCourseMapper;
import universityrecruit.enterprise.statistics.requiredcourse.entity.RequiredCourse;
import universityrecruit.enterprise.statistics.requiredcourse.service.IRequiredCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaRequiredCourseService")
public class EntStaRequiredCourseServiceImpl extends BaseServiceImpl<RequiredCourse> implements IRequiredCourseService {

    private EntStaRequiredCourseMapper oRequiredCourseDao;

    @Autowired
    public EntStaRequiredCourseServiceImpl(EntStaRequiredCourseMapper oTempRequiredCourseDao){
        this.oRequiredCourseDao = oTempRequiredCourseDao;
        this.baseDao = oRequiredCourseDao;
    }
}
