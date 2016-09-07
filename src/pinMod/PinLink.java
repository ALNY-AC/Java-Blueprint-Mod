package pinMod;

import pinMod.linkMod.Link;

/**
 * 此接口用于实现引脚的link，link用于连接其他的节点<br>
 * 如果想让一个引脚实现连接其他节点的功能，就必须实现这个接口。
 */
public interface PinLink {

	/**
	 * 让此引脚关联一个link
	 * 
	 * @param link
	 *            想要关联的link
	 * 
	 */
	void setLink(Link link);

	/**
	 * 取得此引脚关联的link
	 * 
	 * @return 返回此引脚关联link
	 */
	Link getLink();

}
