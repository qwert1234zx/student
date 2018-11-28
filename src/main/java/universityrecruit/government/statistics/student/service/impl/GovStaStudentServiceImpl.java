/**
 * The service implements of Student，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.government.statistics.student.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.government.statistics.student.dao.GovStaStudentMapper;
import universityrecruit.government.statistics.student.entity.Student;
import universityrecruit.government.statistics.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GovStaStudentService")
public class GovStaStudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

    private GovStaStudentMapper oStudentDao;

    @Autowired
    public GovStaStudentServiceImpl(GovStaStudentMapper oTempStudentDao){
        this.oStudentDao = oTempStudentDao;
        this.baseDao = oStudentDao;
    }
}
