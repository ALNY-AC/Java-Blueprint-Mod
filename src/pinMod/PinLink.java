package pinMod;

import pinMod.linkMod.Link;

/**
 * �˽ӿ�����ʵ�����ŵ�link��link�������������Ľڵ�<br>
 * �������һ������ʵ�����������ڵ�Ĺ��ܣ��ͱ���ʵ������ӿڡ�
 */
public interface PinLink {

	/**
	 * �ô����Ź���һ��link
	 * 
	 * @param link
	 *            ��Ҫ������link
	 * 
	 */
	void setLink(Link link);

	/**
	 * ȡ�ô����Ź�����link
	 * 
	 * @return ���ش����Ź���link
	 */
	Link getLink();

}
