/**
 * The service implements of ChargeRule，该文件继承于BaseServiceImpl
 * Created 2018/9/16
 * @author Howard
 */
 package universityrecruit.enterprise.feemanagement.chargerule.service.impl;

import com.each.common.base.service.impl.BaseServiceImpl;
import java.util.Date;
import universityrecruit.enterprise.feemanagement.chargerule.dao.EntFeeChargeRuleMapper;
import universityrecruit.enterprise.feemanagement.chargerule.entity.ChargeRule;
import universityrecruit.enterprise.feemanagement.chargerule.service.IChargeRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EntFeeChargeRuleService")
public class EntFeeChargeRuleServiceImpl extends BaseServiceImpl<ChargeRule> implements IChargeRuleService {

    private EntFeeChargeRuleMapper oChargeRuleDao;

    @Autowired
    public EntFeeChargeRuleServiceImpl(EntFeeChargeRuleMapper oTempChargeRuleDao){
        this.oChargeRuleDao = oTempChargeRuleDao;
        this.baseDao = oChargeRuleDao;
    }
}
