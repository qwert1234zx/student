/**
 * The entity of Province，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.enterprise.statistics.province.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Province")
public class Province implements Serializable {

	private Integer ProvinceID;
	private String ProvinceName;


	public Integer getProvinceID() { return ProvinceID; } 
	public String getProvinceName() { return ProvinceName; } 


	public void setProvinceID( Integer pProvinceID ) { this.ProvinceID = pProvinceID; } 
	public void setProvinceName( String pProvinceName ) { this.ProvinceName = pProvinceName; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", ProvinceID=").append(ProvinceID);
		sb.append(", ProvinceName=").append(ProvinceName);
		sb.append("]");
		return sb.toString();
	}

}