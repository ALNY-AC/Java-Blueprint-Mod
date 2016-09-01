package pinMod;

import nodeMod.Node;

/**
 * 引脚的基本设置接口
 */
public interface PinMod {

	/**
	 * 设置引脚要显示的name
	 * 
	 * @param name
	 *            要设置的name
	 */
	void setPinName(String name);

	/**
	 * 
	 * 取节点的name
	 * 
	 * @return 取得的name
	 */
	String getPinName();

	/**
	 * 取得此引脚所在节点
	 * 
	 * @return 返回此引脚所在的节点
	 */
	Node getNode();

}
