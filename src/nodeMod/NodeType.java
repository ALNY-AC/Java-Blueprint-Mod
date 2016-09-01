package nodeMod;

/**
 * �˽ӿڼ�¼�����нڵ������
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

	void setNodeType(int type);

	int getNodeType();

}
