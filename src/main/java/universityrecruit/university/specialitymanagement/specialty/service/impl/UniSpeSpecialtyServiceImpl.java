/**
 * The service implements of Specialty，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.specialitymanagement.specialty.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.specialitymanagement.specialty.dao.UniSpeSpecialtyMapper;
import universityrecruit.university.specialitymanagement.specialty.entity.Specialty;
import universityrecruit.university.specialitymanagement.specialty.service.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniSpeSpecialtyService")
public class UniSpeSpecialtyServiceImpl extends BaseServiceImpl<Specialty> implements ISpecialtyService {

    private UniSpeSpecialtyMapper oSpecialtyDao;

    @Autowired
    public UniSpeSpecialtyServiceImpl(UniSpeSpecialtyMapper oTempSpecialtyDao){
        this.oSpecialtyDao = oTempSpecialtyDao;
        this.baseDao = oSpecialtyDao;
    }
}
