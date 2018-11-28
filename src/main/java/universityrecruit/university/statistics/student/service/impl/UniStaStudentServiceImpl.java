/**
 * The service implements of Student，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.student.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.student.dao.UniStaStudentMapper;
import universityrecruit.university.statistics.student.entity.Student;
import universityrecruit.university.statistics.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaStudentService")
public class UniStaStudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    private UniStaStudentMapper oStudentDao;

    @Autowired
    public UniStaStudentServiceImpl(UniStaStudentMapper oTempStudentDao){
        this.oStudentDao = oTempStudentDao;
        this.baseDao = oStudentDao;
    }
}
