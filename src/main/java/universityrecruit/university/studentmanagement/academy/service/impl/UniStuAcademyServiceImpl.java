/**
 * The service implements of Academy，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.studentmanagement.academy.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.studentmanagement.academy.dao.UniStuAcademyMapper;
import universityrecruit.university.studentmanagement.academy.entity.Academy;
import universityrecruit.university.studentmanagement.academy.service.IAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStuAcademyService")
public class UniStuAcademyServiceImpl extends BaseServiceImpl<Academy> implements IAcademyService {

    private UniStuAcademyMapper oAcademyDao;

    @Autowired
    public UniStuAcademyServiceImpl(UniStuAcademyMapper oTempAcademyDao){
        this.oAcademyDao = oTempAcademyDao;
        this.baseDao = oAcademyDao;
    }
}
