/*
Bài tập
Bạn hãy điền code vào dấu ... để màn hình hiển thị ra thông tin sau:

some sound
bow wow
meow meow
quack quack
 */
package BT41_tinh_da_hinh;

class Animals {
    void sound(){
        System.out.println("some sound");
    }
}

class Dog extends Animals{

    @Override
    void sound() {
        System.out.println("bow wow");
    }
}
class Cat extends Animals{

    @Override
    void sound() {
        System.out.println("meow meow");
    }
}

class Duck extends Animals {

    @Override
    void sound() {
        System.out.println("quack quack");
    }
}

public class TestAnimal {

    public static void main(String[] args) {
        // khai báo mảng
        Animals[] animal = new Animals[4];
        //gán phần tử mảng
        animal[0] = new Animals();
        animal[1] = new Dog();
        animal[2] = new Cat();
        animal[3] = new Duck();
        //dung vòng lặp để print phần tử
        for (int i = 0; i < 4; i++) {
            animal[i].sound();
        }
    }
}

