package pinMod;

import nodeMod.Node;

/**
 * ���ŵĻ������ýӿ�
 */
public interface PinMod {

	/**
	 * ��������Ҫ��ʾ��name
	 * 
	 * @param name
	 *            Ҫ���õ�name
	 */
	void setPinName(String name);

	/**
	 * 
	 * ȡ�ڵ��name
	 * 
	 * @return ȡ�õ�name
	 */
	String getPinName();

	/**
	 * ȡ�ô��������ڽڵ�
	 * 
	 * @return ���ش��������ڵĽڵ�
	 */
	Node getNode();

}
