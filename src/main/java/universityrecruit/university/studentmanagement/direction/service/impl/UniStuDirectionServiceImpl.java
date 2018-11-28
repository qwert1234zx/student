/**
 * The service implements of Direction，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.studentmanagement.direction.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.studentmanagement.direction.dao.UniStuDirectionMapper;
import universityrecruit.university.studentmanagement.direction.entity.Direction;
import universityrecruit.university.studentmanagement.direction.service.IDirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniStuDirectionService")
public class UniStuDirectionServiceImpl extends BaseServiceImpl<Direction> implements IDirectionService {

    private UniStuDirectionMapper oDirectionDao;

    @Autowired
    public UniStuDirectionServiceImpl(UniStuDirectionMapper oTempDirectionDao){
        this.oDirectionDao = oTempDirectionDao;
        this.baseDao = oDirectionDao;
    }
}
