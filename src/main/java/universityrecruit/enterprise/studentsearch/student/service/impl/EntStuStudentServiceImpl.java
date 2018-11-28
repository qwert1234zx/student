/**
 * The service implements of Student，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.studentsearch.student.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.studentsearch.student.dao.EntStuStudentMapper;
import universityrecruit.enterprise.studentsearch.student.entity.Student;
import universityrecruit.enterprise.studentsearch.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStuStudentService")
public class EntStuStudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    private EntStuStudentMapper oStudentDao;

    @Autowired
    public EntStuStudentServiceImpl(EntStuStudentMapper oTempStudentDao){
        this.oStudentDao = oTempStudentDao;
        this.baseDao = oStudentDao;
    }
}
