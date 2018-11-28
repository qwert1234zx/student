/**
 * The service implements of CourseRelationship，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.coursemanagement.courserelationship.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.coursemanagement.courserelationship.dao.UniCouCourseRelationshipMapper;
import universityrecruit.university.coursemanagement.courserelationship.entity.CourseRelationship;
import universityrecruit.university.coursemanagement.courserelationship.service.ICourseRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniCouCourseRelationshipService")
public class UniCouCourseRelationshipServiceImpl extends BaseServiceImpl<CourseRelationship> implements ICourseRelationshipService {

    private UniCouCourseRelationshipMapper oCourseRelationshipDao;

    @Autowired
    public UniCouCourseRelationshipServiceImpl(UniCouCourseRelationshipMapper oTempCourseRelationshipDao){
        this.oCourseRelationshipDao = oTempCourseRelationshipDao;
        this.baseDao = oCourseRelationshipDao;
    }
}
