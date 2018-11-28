/**
 * The service implements of Academy，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.directionmanagement.academy.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.directionmanagement.academy.dao.UniDirAcademyMapper;
import universityrecruit.university.directionmanagement.academy.entity.Academy;
import universityrecruit.university.directionmanagement.academy.service.IAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniDirAcademyService")
public class UniDirAcademyServiceImpl extends BaseServiceImpl<Academy> implements IAcademyService {

    private UniDirAcademyMapper oAcademyDao;

    @Autowired
    public UniDirAcademyServiceImpl(UniDirAcademyMapper oTempAcademyDao){
        this.oAcademyDao = oTempAcademyDao;
        this.baseDao = oAcademyDao;
    }
}
