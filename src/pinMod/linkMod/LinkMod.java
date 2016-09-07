package pinMod.linkMod;

import java.util.ArrayList;

import nodeMod.Node;
import pinMod.Pin;

/**
 * link的基本设置接口
 */
public interface LinkMod {

	ArrayList<Link> LINKS = new ArrayList<>();

	/**
	 * 给此link添加一个链接的另一个节点上的link
	 * 
	 * @param link
	 *            想要链接的另一个节点的link
	 */
	void add(Link link);

	/**
	 * 移除一个链接的link
	 * 
	 * @param index
	 *            要移除的链接的link的索引
	 */
	void remove(int index);

	/**
	 * 根据指定index，取得索引位置的link
	 * 
	 * @param index
	 *            要取得link的索引值
	 * 
	 * @return 返回指定索引的link
	 */
	Link getLink(int index);

	/**
	 * 根据一个link取得与其关联的引脚，可以用于link本身，也可用于取得link链接的link
	 * 
	 * @param link
	 *            想要取得其pin的link
	 * 
	 * @return pin 返回指定link的pin
	 */
	Pin getPin(Link link);

	/**
	 * 返回此link所在的节点
	 * 
	 * @return 返回此link所在的节点
	 * 
	 */
	Node getNode();

	/**
	 * 取得此link的类型<br>
	 * 在实际情况中，一个输出节点可以链接多个输入节点，但是一个输入节点，只可以链接一个输出节点，这一情况只有在程序流节点是不适用的。
	 * 
	 * @return 返回此link的类型
	 */
	int getLinkType();

}
