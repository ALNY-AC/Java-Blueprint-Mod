package pinMod;

/** 引脚源码接口 */
public interface PinCode {

	/**
	 * 设置节点的源码
	 * 
	 * @param code
	 *            要设置的源码
	 */
	void setPinCode(String code);

	/**
	 * 取节点的源码
	 * 
	 * @return 取得的源码
	 */
	String getPinCode();

}
