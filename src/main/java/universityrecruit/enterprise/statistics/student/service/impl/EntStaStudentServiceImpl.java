/**
 * The service implements of Student，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.statistics.student.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.statistics.student.dao.EntStaStudentMapper;
import universityrecruit.enterprise.statistics.student.entity.Student;
import universityrecruit.enterprise.statistics.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntStaStudentService")
public class EntStaStudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    private EntStaStudentMapper oStudentDao;

    @Autowired
    public EntStaStudentServiceImpl(EntStaStudentMapper oTempStudentDao){
        this.oStudentDao = oTempStudentDao;
        this.baseDao = oStudentDao;
    }
}
