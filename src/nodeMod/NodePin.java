package nodeMod;

import java.util.ArrayList;

import pinMod.Pin;

/** 如果想给节点添加引脚，必须实现此接口 */

public interface NodePin {

	ArrayList<Pin> PINS = new ArrayList<Pin>();

	/**
	 * 给节点添加一个引脚
	 * 
	 * @param pin
	 *            要添加的引脚
	 */
	void addPin(Pin pin);

	/**
	 * 移除一个引脚
	 * 
	 * @param index
	 *            要移除的引脚索引
	 */
	void remove(int index);

	/**
	 * 根据index取得一个引脚
	 * 
	 * @param index
	 *            要取得引脚的索引
	 * @return 返回指定索引的引脚
	 * 
	 */
	Pin getPin(int index);

	/**
	 * 对所有引脚进行排序，根据引脚在集合中的索引进行排序
	 */
	void sortPin();

}
