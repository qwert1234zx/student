/**
 * The service implements of Government，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.government.passwordmanagement.government.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.government.passwordmanagement.government.dao.GovPasGovernmentMapper;
import universityrecruit.government.passwordmanagement.government.entity.Government;
import universityrecruit.government.passwordmanagement.government.service.IGovernmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GovPasGovernmentService")
public class GovPasGovernmentServiceImpl extends BaseServiceImpl<Government> implements IGovernmentService {

    private GovPasGovernmentMapper oGovernmentDao;

    @Autowired
    public GovPasGovernmentServiceImpl(GovPasGovernmentMapper oTempGovernmentDao){
        this.oGovernmentDao = oTempGovernmentDao;
        this.baseDao = oGovernmentDao;
    }
}
