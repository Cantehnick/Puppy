package by.htp.homework;

public class Dog extends Animal {

	public Dog() { //������ �����������
	}

	public int run(int legsNumber) { // ����������� ������� ������
		return legsNumber; // ��������� ���������� ��� � ���������
	}

	public int jump(int height) { // ����������� ������� �������
		return height; // ��������� ������ ������ ���������

	}

	public String say(String voise) { // ����������� ������� �����
		return voise; // ��� �������� ������� "woof"

	}

	public String bite(String teeth) { // ����������� ������� �������
		return teeth; // ������ ������ ,����������� � ���������
	}
}
