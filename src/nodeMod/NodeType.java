package nodeMod;

/**
 * �˽ӿڼ�¼�����нڵ������<br>
 * �����Ҫ��һ���ڵ�ӵ�����ͣ��ͱ���ʵ������ӿ�
 */

public interface NodeType {

	// ���̿��ƿ�ʼ

	/** if...else���� */
	int TYPE_IF_ELSE = 0;

	/** for���� */
	int TYPE_FOR = 1;

	/** while���� */
	int TYPE_WHILE = 2;

	/** switch���� */
	int TYPE_SWITCH = 3;

	// ���̿��ƽ���

	/** �����ڵ����� */
	int TYPE_CALL_VAR = 4;

	/** �����ڵ����� */
	int TYPE_METHOD = 5;

	/**
	 * ���ýڵ������
	 * 
	 * @param type
	 *            Ҫ���õ����ͣ�����ģ����Դ�NodeType��ѡ��
	 */
	void setNodeType(int type);

	/**
	 * ȡ�ô˽ڵ������
	 * 
	 * @return ���ؽڵ�����
	 */
	int getNodeType();

}
