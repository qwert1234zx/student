/**
 * The entity of Direction，该文件主要用于传递数据
 * Created 2018/9/16
 * @author Howard
 */
package universityrecruit.university.studentmanagement.direction.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("Direction")
public class Direction implements Serializable {

	private Integer DirectionID;
	private String Description;
	private String DirectionName;
	private Integer SpecialtyID;


	public Integer getDirectionID() { return DirectionID; } 
	public String getDescription() { return Description; } 
	public String getDirectionName() { return DirectionName; } 
	public Integer getSpecialtyID() { return SpecialtyID; } 


	public void setDirectionID( Integer pDirectionID ) { this.DirectionID = pDirectionID; } 
	public void setDescription( String pDescription ) { this.Description = pDescription; } 
	public void setDirectionName( String pDirectionName ) { this.DirectionName = pDirectionName; } 
	public void setSpecialtyID( Integer pSpecialtyID ) { this.SpecialtyID = pSpecialtyID; } 


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", DirectionID=").append(DirectionID);
		sb.append(", Description=").append(Description);
		sb.append(", DirectionName=").append(DirectionName);
		sb.append(", SpecialtyID=").append(SpecialtyID);
		sb.append("]");
		return sb.toString();
	}

}