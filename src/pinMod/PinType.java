package pinMod;

/**
 * 引脚类型接口<br>
 * 如果想让引脚拥有类型，就必须实现这个接口
 * 
 */
public interface PinType {

	// 基本数据类型开始
	int PIN_BYTE = 101;
	int PIN_SHORT = 102;
	int PIN_INT = 103;
	int PIN_LONG = 104;

	int PIN_DOUBLE = 105;
	int PIN_FLOAT = 106;

	int PIN_BOOLEAN = 107;

	int PIN_CHAR = 108;

	int PIN_STRING = 109;

	// 基本数据类型结束

	// 输出输入类型
	/** 输入类型 */
	int PIN_IN = 1111;

	/** 输出类型 */
	int PIN_OUT = 0000;

	/**
	 * 设置此引脚的类型
	 * 
	 * @param tpye
	 *            此引脚的类型，这些类型包括基本数据类型和自定义类型，一般来说基本数据类型是固定的，自定义类型是不固定的，所以自定义类型全部为统一的颜色表示。
	 * 
	 */
	void setPinType(int type);

	/**
	 * 取得此引脚的类型
	 * 
	 * @return 取得的此引脚的类型
	 */
	int getPinType();

}
