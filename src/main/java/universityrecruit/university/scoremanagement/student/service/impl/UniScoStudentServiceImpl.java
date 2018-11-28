/**
 * The service implements of Student，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.scoremanagement.student.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.scoremanagement.student.dao.UniScoStudentMapper;
import universityrecruit.university.scoremanagement.student.entity.Student;
import universityrecruit.university.scoremanagement.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniScoStudentService")
public class UniScoStudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    private UniScoStudentMapper oStudentDao;

    @Autowired
    public UniScoStudentServiceImpl(UniScoStudentMapper oTempStudentDao){
        this.oStudentDao = oTempStudentDao;
        this.baseDao = oStudentDao;
    }
}
