package pinMod;

/** 如果想要一个引脚拥有源码，就是实现这个接口 */
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
