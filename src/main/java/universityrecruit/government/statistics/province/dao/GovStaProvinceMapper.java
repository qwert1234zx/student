/**
 * The dao of Province，该文件继承于BaseMapper，基本的CURD方法采用基类中的方法，若无必要可不用重写
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.government.statistics.province.dao;

import com.each.common.base.dao.BaseMapper;
import java.util.Date;
import universityrecruit.government.statistics.province.entity.Province;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GovStaProvinceMapper extends BaseMapper<Province>{

}