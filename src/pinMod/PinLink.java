package pinMod;

import pinMod.linkMod.Link;

public interface PinLink {

	/**
	 * 让此引脚关联一个link
	 * 
	 * @param link
	 *            想要关联的link
	 * 
	 */
	void addLink(Link link);

	/**
	 * 取得此引脚关联的link
	 * 
	 * @return 返回此引脚关联link
	 */
	Link getLink();

}
