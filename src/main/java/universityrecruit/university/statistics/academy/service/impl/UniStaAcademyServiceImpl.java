/**
 * The service implements of Academy，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.statistics.academy.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.statistics.academy.dao.UniStaAcademyMapper;
import universityrecruit.university.statistics.academy.entity.Academy;
import universityrecruit.university.statistics.academy.service.IAcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStaAcademyService")
public class UniStaAcademyServiceImpl extends BaseServiceImpl<Academy> implements IAcademyService {

    private UniStaAcademyMapper oAcademyDao;

    @Autowired
    public UniStaAcademyServiceImpl(UniStaAcademyMapper oTempAcademyDao){
        this.oAcademyDao = oTempAcademyDao;
        this.baseDao = oAcademyDao;
    }
}
