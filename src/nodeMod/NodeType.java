package nodeMod;

/**
 * 此接口记录着所有节点的类型
 */
public interface NodeType {

	// 流程控制开始

	/** if...else类型 */
	int TYPE_IF_ELSE = 0;

	/** for类型 */
	int TYPE_FOR = 1;

	/** while类型 */
	int TYPE_WHILE = 2;

	/** switch类型 */
	int TYPE_SWITCH = 3;

	// 流程控制结束

	/** 变量节点类型 */
	int TYPE_CALL_VAR = 4;

	/** 方法节点类型 */
	int TYPE_METHOD = 5;

	void setNodeType(int type);

	int getNodeType();

}
