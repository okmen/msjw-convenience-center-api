package cn.convenience.bean;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreenTraveTemplateVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String type;    //业务类型 1 办理类 2 预约类
	private String numberPlate;    //车牌号码
	private String businessType; //具体业务类型,例如 绿色出行申请
	private String reserveNumber;    //申请天数
	private Integer cryearNo;         //年度累计申报天数
	
	public String getType() {
		return type;
	}
	/**
	 * 业务类型
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getNumberPlate() {
		return numberPlate;
	}
	/**
	 * 车牌号
	 * @param numberPlate
	 */
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getBusinessType() {
		return businessType;
	}
	/**
	 * 业务类型
	 * @param businessType
	 */
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	
	public String getReserveNumber() {
		return reserveNumber;
	}
	/**
	 * 申请停驶天数
	 * @param reserveNumber
	 */
	public void setReserveNumber(String reserveNumber) {
		this.reserveNumber = reserveNumber;
	}
	
	
	public Integer getCryearNo() {
		return cryearNo;
	}
	public void setCryearNo(Integer cryearNo) {
		this.cryearNo = cryearNo;
	}
	public GreenTraveTemplateVo(){}
	
	
	public GreenTraveTemplateVo(String type, String numberPlate, String businessType,String reserveNumber,Integer cryearNo) {
		this.type = type;
		this.numberPlate = numberPlate;
		this.businessType = businessType;
		this.reserveNumber = reserveNumber;
		this.cryearNo=cryearNo;
	}
	
	public static String getUrl(GreenTraveTemplateVo greenTraveTemplateVo,String baseUrl) throws Exception{
		StringBuffer sBuffer = new StringBuffer();
		Map<String, Object> map = beanToMap(greenTraveTemplateVo);
		String paramsStr = getUrlParamsByMap(map, true);
		sBuffer.append(baseUrl).append(paramsStr);
		return sBuffer.toString();
	}
	/**
     * javaBean 转 Map
     * @param object 需要转换的javabean
     * @return  转换结果map
     * @throws Exception
     */
    public static Map<String, Object> beanToMap(Object object) throws Exception
    {
        Map<String, Object> map = new HashMap<String, Object>();
        Class cls = object.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if(null != field.get(object)){
            	map.put(field.getName(), field.get(object));
            }
        }
        return map;
    }
	public static String getUrlParamsByMap(Map<String, Object> map,boolean isSort) {
	      if (map == null) {
	          return "";
	      }
	      StringBuffer sb = new StringBuffer();
	      List<String> keys = new ArrayList<String>(map.keySet());
	      if (isSort) {
	          Collections.sort(keys);
	      }
	      for (int i = 0; i < keys.size(); i++) {
	          String key = keys.get(i);
	          String value = map.get(key).toString();
	          sb.append(key + "=" + value);
	          sb.append("&");
	      }
	      String s = sb.toString();
	      if (s.endsWith("&")) {
	          s = s.substring(0, s.lastIndexOf("&"));
	      }
	      return s;
	}

}
