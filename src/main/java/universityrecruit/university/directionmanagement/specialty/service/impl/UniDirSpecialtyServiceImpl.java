/**
 * The service implements of Specialty，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.directionmanagement.specialty.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.directionmanagement.specialty.dao.UniDirSpecialtyMapper;
import universityrecruit.university.directionmanagement.specialty.entity.Specialty;
import universityrecruit.university.directionmanagement.specialty.service.ISpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniDirSpecialtyService")
public class UniDirSpecialtyServiceImpl extends BaseServiceImpl<Specialty> implements ISpecialtyService {

    private UniDirSpecialtyMapper oSpecialtyDao;

    @Autowired
    public UniDirSpecialtyServiceImpl(UniDirSpecialtyMapper oTempSpecialtyDao){
        this.oSpecialtyDao = oTempSpecialtyDao;
        this.baseDao = oSpecialtyDao;
    }
}
