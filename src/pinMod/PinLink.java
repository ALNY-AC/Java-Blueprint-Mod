package pinMod;

import pinMod.linkMod.Link;

public interface PinLink {

	/**
	 * �ô����Ź���һ��link
	 * 
	 * @param link
	 *            ��Ҫ������link
	 * 
	 */
	void addLink(Link link);

	/**
	 * ȡ�ô����Ź�����link
	 * 
	 * @return ���ش����Ź���link
	 */
	Link getLink();

}
