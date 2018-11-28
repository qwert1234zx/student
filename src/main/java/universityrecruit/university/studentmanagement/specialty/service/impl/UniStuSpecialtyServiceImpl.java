/**
 * The service implements of Specialty，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.studentmanagement.specialty.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.studentmanagement.specialty.dao.UniStuSpecialtyMapper;
import universityrecruit.university.studentmanagement.specialty.entity.Specialty;
import universityrecruit.university.studentmanagement.specialty.service.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStuSpecialtyService")
public class UniStuSpecialtyServiceImpl extends BaseServiceImpl<Specialty> implements ISpecialtyService {

    private UniStuSpecialtyMapper oSpecialtyDao;

    @Autowired
    public UniStuSpecialtyServiceImpl(UniStuSpecialtyMapper oTempSpecialtyDao){
        this.oSpecialtyDao = oTempSpecialtyDao;
        this.baseDao = oSpecialtyDao;
    }
}
