package by.htp.homework;

public class Dog extends Animal {

	public Dog() { //пустой конструктор
	}

	public int run(int legsNumber) { // перегружаем функцию бегать
		return legsNumber; // добавляем количество ног у животного
	}

	public int jump(int height) { // перегружаем функцию прыгать
		return height; // добавляем высоту прыжка животного

	}

	public String say(String voise) { // перегружаем функцию лаять
		return voise; // лай передаем словами "woof"

	}

	public String bite(String teeth) { // перегружаем функцию укусить
		return teeth; // кусаем зубами ,находящиеся в челлюстях
	}
}
