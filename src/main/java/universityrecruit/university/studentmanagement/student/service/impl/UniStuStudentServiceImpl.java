/**
 * The service implements of Student，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.studentmanagement.student.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.studentmanagement.student.dao.UniStuStudentMapper;
import universityrecruit.university.studentmanagement.student.entity.Student;
import universityrecruit.university.studentmanagement.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStuStudentService")
public class UniStuStudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    private UniStuStudentMapper oStudentDao;

    @Autowired
    public UniStuStudentServiceImpl(UniStuStudentMapper oTempStudentDao){
        this.oStudentDao = oTempStudentDao;
        this.baseDao = oStudentDao;
    }
}
