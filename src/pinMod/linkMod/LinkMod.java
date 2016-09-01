package pinMod.linkMod;

import java.util.ArrayList;

import nodeMod.Node;
import pinMod.Pin;

public interface LinkMod {

	ArrayList<Link> LINKS = new ArrayList<>();

	/**
	 * 给此link添加一个链接的另一个节点上的link
	 * 
	 * @param link
	 *            想要链接的另一个节点的link
	 */
	void add(Link link);

	void remove(int index);

	Link getLink(int index);

	Pin getPin(Link link);

	Node getNode();

}
