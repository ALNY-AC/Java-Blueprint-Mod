package pinMod;

/** �������ͽӿ� */
public interface PinType {

	// �����������Ϳ�ʼ
	int PIN_BYTE = 101;
	int PIN_SHORT = 102;
	int PIN_INT = 103;
	int PIN_LONG = 104;

	int PIN_DOUBLE = 105;
	int PIN_FLOAT = 106;

	int PIN_BOOLEAN = 107;

	int PIN_CHAR = 108;

	int PIN_STRING = 109;

	// �����������ͽ���

	// �����������
	/** �������� */
	int PIN_IN = 1111;

	/** ������� */
	int PIN_OUT = 0000;

	void setPinType(int type);

	int getPinType();

}
