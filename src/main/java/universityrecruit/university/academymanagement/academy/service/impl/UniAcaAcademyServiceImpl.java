/**
 * The service implements of Academy，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.academymanagement.academy.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.academymanagement.academy.dao.UniAcaAcademyMapper;
import universityrecruit.university.academymanagement.academy.entity.Academy;
import universityrecruit.university.academymanagement.academy.service.IAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniAcaAcademyService")
public class UniAcaAcademyServiceImpl extends BaseServiceImpl<Academy> implements IAcademyService {

    private UniAcaAcademyMapper oAcademyDao;

    @Autowired
    public UniAcaAcademyServiceImpl(UniAcaAcademyMapper oTempAcademyDao){
        this.oAcademyDao = oTempAcademyDao;
        this.baseDao = oAcademyDao;
    }
}
