/**
 * The service implements of Academy，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.specialitymanagement.academy.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.specialitymanagement.academy.dao.UniSpeAcademyMapper;
import universityrecruit.university.specialitymanagement.academy.entity.Academy;
import universityrecruit.university.specialitymanagement.academy.service.IAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniSpeAcademyService")
public class UniSpeAcademyServiceImpl extends BaseServiceImpl<Academy> implements IAcademyService {

    private UniSpeAcademyMapper oAcademyDao;

    @Autowired
    public UniSpeAcademyServiceImpl(UniSpeAcademyMapper oTempAcademyDao){
        this.oAcademyDao = oTempAcademyDao;
        this.baseDao = oAcademyDao;
    }
}
