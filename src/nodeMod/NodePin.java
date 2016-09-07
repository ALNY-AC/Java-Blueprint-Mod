package nodeMod;

import java.util.ArrayList;

import pinMod.Pin;

/** �������ڵ�������ţ�����ʵ�ִ˽ӿ� */

public interface NodePin {

	ArrayList<Pin> PINS = new ArrayList<Pin>();

	/**
	 * ���ڵ����һ������
	 * 
	 * @param pin
	 *            Ҫ��ӵ�����
	 */
	void addPin(Pin pin);

	/**
	 * �Ƴ�һ������
	 * 
	 * @param index
	 *            Ҫ�Ƴ�����������
	 */
	void remove(int index);

	/**
	 * ����indexȡ��һ������
	 * 
	 * @param index
	 *            Ҫȡ�����ŵ�����
	 * @return ����ָ������������
	 * 
	 */
	Pin getPin(int index);

	/**
	 * ���������Ž������򣬸��������ڼ����е�������������
	 */
	void sortPin();

}
