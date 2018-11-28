/**
 * The service implements of Specialty，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.coursemanagement.specialty.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.coursemanagement.specialty.dao.UniCouSpecialtyMapper;
import universityrecruit.university.coursemanagement.specialty.entity.Specialty;
import universityrecruit.university.coursemanagement.specialty.service.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniCouSpecialtyService")
public class UniCouSpecialtyServiceImpl extends BaseServiceImpl<Specialty> implements ISpecialtyService {

    private UniCouSpecialtyMapper oSpecialtyDao;

    @Autowired
    public UniCouSpecialtyServiceImpl(UniCouSpecialtyMapper oTempSpecialtyDao){
        this.oSpecialtyDao = oTempSpecialtyDao;
        this.baseDao = oSpecialtyDao;
    }
}
