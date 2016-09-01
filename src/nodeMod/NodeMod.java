package nodeMod;

/**
 * 此节点用于设置节点基本的设置
 */
public interface NodeMod {

	/**
	 * 设置节点name
	 *
	 * @param name
	 *            要设置的name
	 */
	void setNodeName(String name);

	/**
	 * 取节点的name
	 * 
	 * @return 取得的节点的name
	 */
	String getNodeName();

}
