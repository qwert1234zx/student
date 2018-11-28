/**
 * The service implements of CourseRelationship，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.courserelationship.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.courserelationship.dao.EntStuCourseRelationshipMapper;
import universityrecruit.enterprise.studentsearch.courserelationship.entity.CourseRelationship;
import universityrecruit.enterprise.studentsearch.courserelationship.service.ICourseRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuCourseRelationshipService")
public class EntStuCourseRelationshipServiceImpl extends BaseServiceImpl<CourseRelationship> implements ICourseRelationshipService {

    private EntStuCourseRelationshipMapper oCourseRelationshipDao;

    @Autowired
    public EntStuCourseRelationshipServiceImpl(EntStuCourseRelationshipMapper oTempCourseRelationshipDao){
        this.oCourseRelationshipDao = oTempCourseRelationshipDao;
        this.baseDao = oCourseRelationshipDao;
    }
}
