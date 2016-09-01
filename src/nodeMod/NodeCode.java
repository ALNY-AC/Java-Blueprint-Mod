package nodeMod;

/**
 * 此接口用来取得节点的源码
 */
public interface NodeCode {

	/**
	 * 设置if语句的源码
	 * 
	 * @param if_code
	 *            要设置的源码
	 */
	void setIfCode(String if_code);

	/**
	 * 取得if类型节点的源码
	 * 
	 * @return 返回此节点源码
	 */
	String getIfCode();

	/**
	 * 设置for语句的源码
	 * 
	 * @param for_code
	 *            要设置的源码
	 */
	void setForCode(String for_code);

	/**
	 * 取得for类型节点的源码
	 * 
	 * @return 返回此节点源码
	 */
	String getForCode();

	/**
	 * 设置while语句的源码
	 * 
	 * @param while_code
	 *            要设置的源码
	 */
	void setWhileCode(String while_code);

	/**
	 * 取得while类型节点的源码
	 * 
	 * @return 返回此节点源码
	 */
	String getWhileCode();

	/**
	 * 设置switch语句的源码
	 * 
	 * @param switch_code
	 *            要设置的源码
	 */
	void setSwitchCode(String switch_code);

	/**
	 * 取得switch类型节点的源码
	 * 
	 * @return 返回此节点源码
	 */
	String getSwitchCode();

	/**
	 * 设置cal语句的源码
	 * 
	 * @param call_code
	 *            要设置的源码
	 */
	void setCallVar(String call_code);

	/**
	 * 取得调用类型节点的源码
	 * 
	 * @return 返回此节点源码
	 */
	String getCallVar();

	/**
	 * 设置Method语句的源码
	 * 
	 * @param method_code
	 *            要设置的源码
	 */
	void setMethodCode(String method_code);

	/**
	 * 取得方法的源码
	 * 
	 * @return 返回此节点源码
	 */
	String getMethodCode();

}
