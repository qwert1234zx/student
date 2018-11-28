/**
 * The service implements of Enterprise，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.government.statistics.enterprise.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.government.statistics.enterprise.dao.GovStaEnterpriseMapper;
import universityrecruit.government.statistics.enterprise.entity.Enterprise;
import universityrecruit.government.statistics.enterprise.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GovStaEnterpriseService")
public class GovStaEnterpriseServiceImpl extends BaseServiceImpl<Enterprise> implements IEnterpriseService {

    private GovStaEnterpriseMapper oEnterpriseDao;

    @Autowired
    public GovStaEnterpriseServiceImpl(GovStaEnterpriseMapper oTempEnterpriseDao){
        this.oEnterpriseDao = oTempEnterpriseDao;
        this.baseDao = oEnterpriseDao;
    }
}
