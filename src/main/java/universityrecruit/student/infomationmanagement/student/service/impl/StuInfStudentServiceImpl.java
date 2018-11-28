/**
 * The service implements of Student，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.student.infomationmanagement.student.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.student.infomationmanagement.student.dao.StuInfStudentMapper;
import universityrecruit.student.infomationmanagement.student.entity.Student;
import universityrecruit.student.infomationmanagement.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StuInfStudentService")
public class StuInfStudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    private StuInfStudentMapper oStudentDao;

    @Autowired
    public StuInfStudentServiceImpl(StuInfStudentMapper oTempStudentDao){
        this.oStudentDao = oTempStudentDao;
        this.baseDao = oStudentDao;
    }
}
