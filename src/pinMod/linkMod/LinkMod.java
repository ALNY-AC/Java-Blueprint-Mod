package pinMod.linkMod;

import java.util.ArrayList;

import nodeMod.Node;
import pinMod.Pin;

/**
 * link�Ļ������ýӿ�
 */
public interface LinkMod {

	ArrayList<Link> LINKS = new ArrayList<>();

	/**
	 * ����link���һ�����ӵ���һ���ڵ��ϵ�link
	 * 
	 * @param link
	 *            ��Ҫ���ӵ���һ���ڵ��link
	 */
	void add(Link link);

	/**
	 * �Ƴ�һ�����ӵ�link
	 * 
	 * @param index
	 *            Ҫ�Ƴ������ӵ�link������
	 */
	void remove(int index);

	/**
	 * ����ָ��index��ȡ������λ�õ�link
	 * 
	 * @param index
	 *            Ҫȡ��link������ֵ
	 * 
	 * @return ����ָ��������link
	 */
	Link getLink(int index);

	/**
	 * ����һ��linkȡ��������������ţ���������link����Ҳ������ȡ��link���ӵ�link
	 * 
	 * @param link
	 *            ��Ҫȡ����pin��link
	 * 
	 * @return pin ����ָ��link��pin
	 */
	Pin getPin(Link link);

	/**
	 * ���ش�link���ڵĽڵ�
	 * 
	 * @return ���ش�link���ڵĽڵ�
	 * 
	 */
	Node getNode();

	/**
	 * ȡ�ô�link������<br>
	 * ��ʵ������У�һ������ڵ�������Ӷ������ڵ㣬����һ������ڵ㣬ֻ��������һ������ڵ㣬��һ���ֻ���ڳ������ڵ��ǲ����õġ�
	 * 
	 * @return ���ش�link������
	 */
	int getLinkType();

}
