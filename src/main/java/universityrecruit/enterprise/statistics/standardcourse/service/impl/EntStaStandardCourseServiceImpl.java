/**
 * The service implements of StandardCourse，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.standardcourse.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.standardcourse.dao.EntStaStandardCourseMapper;
import universityrecruit.enterprise.statistics.standardcourse.entity.StandardCourse;
import universityrecruit.enterprise.statistics.standardcourse.service.IStandardCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaStandardCourseService")
public class EntStaStandardCourseServiceImpl extends BaseServiceImpl<StandardCourse> implements IStandardCourseService {

    private EntStaStandardCourseMapper oStandardCourseDao;

    @Autowired
    public EntStaStandardCourseServiceImpl(EntStaStandardCourseMapper oTempStandardCourseDao){
        this.oStandardCourseDao = oTempStandardCourseDao;
        this.baseDao = oStandardCourseDao;
    }
}
