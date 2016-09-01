package pinMod.linkMod;

import java.util.ArrayList;

import nodeMod.Node;
import pinMod.Pin;

public interface LinkMod {

	ArrayList<Link> LINKS = new ArrayList<>();

	/**
	 * ����link���һ�����ӵ���һ���ڵ��ϵ�link
	 * 
	 * @param link
	 *            ��Ҫ���ӵ���һ���ڵ��link
	 */
	void add(Link link);

	void remove(int index);

	Link getLink(int index);

	Pin getPin(Link link);

	Node getNode();

}
