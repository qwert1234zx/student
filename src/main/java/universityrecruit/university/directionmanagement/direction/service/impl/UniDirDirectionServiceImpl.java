/**
 * The service implements of Direction，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.university.directionmanagement.direction.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.university.directionmanagement.direction.dao.UniDirDirectionMapper;
import universityrecruit.university.directionmanagement.direction.entity.Direction;
import universityrecruit.university.directionmanagement.direction.service.IDirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UniDirDirectionService")
public class UniDirDirectionServiceImpl extends BaseServiceImpl<Direction> implements IDirectionService {

    private UniDirDirectionMapper oDirectionDao;

    @Autowired
    public UniDirDirectionServiceImpl(UniDirDirectionMapper oTempDirectionDao){
        this.oDirectionDao = oTempDirectionDao;
        this.baseDao = oDirectionDao;
    }
}
