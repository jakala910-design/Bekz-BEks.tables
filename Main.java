import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // 1. Student
    static class Student {
        String name, group;
        int age;
        double averageGrade;
        int grade;

        Student(String name, int age, String group) {
            this.name = name;
            this.age = age;
            this.group = group;
        }

        Student(String name, double averageGrade) {
            this.name = name;
            this.averageGrade = averageGrade;
        }

        Student(String name, int grade, boolean exam) {
            this.name = name;
            this.grade = grade;
        }

        void show() {
            System.out.println("Имя: " + name + ", возраст: " + age + ", группа: " + group);
        }

        boolean passedExam() {
            return grade >= 50;
        }
    }

    // 2 и 26. Car
    static class Car {
        String brand, model;
        int year;
        double mileage, fuel;

        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        Car(String brand, double mileage, double fuel) {
            this.brand = brand;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        void drive(double distance, double fuelUsed) {
            if (distance < 0 || fuelUsed < 0 || fuelUsed > fuel) {
                System.out.println("Недостаточно топлива или неверные данные.");
                return;
            }
            mileage += distance;
            fuel -= fuelUsed;
            System.out.println("Поездка выполнена. Пробег: " + mileage + " км, топливо: " + fuel + " л");
        }
    }

    // 3. Book
    static class Book {
        String title, author;
        int pages;
        Book(String title, String author, int pages) {
            this.title = title; this.author = author; this.pages = pages;
        }
    }

    // 4. Phone
    static class Phone {
        String brand, model;
        double price;
        Phone(String brand, String model, double price) {
            this.brand = brand; this.model = model; this.price = price;
        }
        void show() {
            System.out.println(brand + " " + model + ", цена: " + price);
        }
    }

    // 5. Cat
    static class Cat {
        String name; int age;
        Cat(String name, int age) { this.name = name; this.age = age; }
        void meow() { System.out.println(name + " мяукает: Мяу-мяу!"); }
    }

    // 6. Dog
    static class Dog {
        String name, breed;
        Dog(String name, String breed) { this.name = name; this.breed = breed; }
        void bark() { System.out.println(name + " лает: Гав-гав!"); }
    }

    // 7. Rectangle
    static class Rectangle {
        double width, height;
        Rectangle(double width, double height) { this.width = width; this.height = height; }
        double area() { return width * height; }
        double perimeter() { return 2 * (width + height); }
    }

    // 8. Circle
    static class Circle {
        double radius;
        Circle(double radius) { this.radius = radius; }
        double area() { return Math.PI * radius * radius; }
    }

    // 9. Employee
    static class Employee {
        String name, position;
        double salary;
        Employee(String name, String position, double salary) {
            this.name = name; this.position = position; this.salary = salary;
        }
    }

    // 10. Laptop
    static class Laptop {
        String brand; int ram; double price;
        Laptop(String brand, int ram, double price) {
            this.brand = brand; this.ram = ram; this.price = price;
        }
    }

    // 11 и 22. BankAccount
    static class BankAccount {
        String owner; double balance;
        BankAccount(String owner, double balance) { this.owner = owner; this.balance = balance; }
        void deposit(double amount) {
            if (amount > 0) balance += amount;
            else System.out.println("Сумма должна быть положительной.");
        }
        void withdraw(double amount) {
            if (amount <= 0) System.out.println("Сумма должна быть положительной.");
            else if (amount > balance) System.out.println("Недостаточно средств.");
            else balance -= amount;
        }
        void show() { System.out.println(owner + ": баланс = " + balance); }
    }

    // 12. Product
    static class Product {
        String name; double price; int quantity;
        Product(String name, double price, int quantity) {
            this.name = name; this.price = price; this.quantity = quantity;
        }
        double totalValue() { return price * quantity; }
    }

    // 14. Counter
    static class Counter {
        int count;
        void increase() { count++; }
        void decrease() { count--; }
        void reset() { count = 0; }
    }

    // 15. Movie
    static class Movie {
        String title, genre; int duration;
        Movie(String title, String genre, int duration) {
            this.title = title; this.genre = genre; this.duration = duration;
        }
        void show() { System.out.println(title + " | " + genre + " | " + duration + " мин."); }
    }

    // 16. Temperature
    static class Temperature {
        double celsius;
        Temperature(double celsius) { this.celsius = celsius; }
        double toFahrenheit() { return celsius * 9 / 5 + 32; }
        double toKelvin() { return celsius + 273.15; }
    }

    // 17. Point
    static class Point {
        double x, y;
        Point(double x, double y) { this.x = x; this.y = y; }
        double distance() { return Math.sqrt(x * x + y * y); }
    }

    // 18. ShoppingCart
    static class ShoppingCart {
        String productName; double price; int quantity;
        ShoppingCart(String productName, double price, int quantity) {
            this.productName = productName; this.price = price; this.quantity = quantity;
        }
        double total() { return price * quantity; }
        void changeQuantity(int newQuantity) {
            if (newQuantity >= 0) quantity = newQuantity;
            else System.out.println("Количество не может быть отрицательным.");
        }
    }

    // 19. Clock
    static class Clock {
        int hours, minutes, seconds;
        Clock(int hours, int minutes, int seconds) {
            this.hours = hours; this.minutes = minutes; this.seconds = seconds;
        }
        void show() { System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds); }
    }

    // 20. Flight
    static class Flight {
        String flightNumber, destination; int availableSeats;
        Flight(String flightNumber, String destination, int availableSeats) {
            this.flightNumber = flightNumber; this.destination = destination; this.availableSeats = availableSeats;
        }
        void bookSeat() {
            if (availableSeats > 0) {
                availableSeats--;
                System.out.println("Место забронировано. Осталось мест: " + availableSeats);
            } else System.out.println("Свободных мест нет.");
        }
    }

    // 21. Computer
    static class Computer {
        String brand, processor; int ram; double price;
        Computer(String brand, String processor, int ram, double price) {
            this.brand = brand; this.processor = processor; this.ram = ram; this.price = price;
        }
        void show() {
            System.out.println(brand + " | " + processor + " | RAM: " + ram + " GB | Цена: " + price);
        }
    }

    // 23. LibraryBook
    static class LibraryBook {
        String title, author; boolean isAvailable;
        LibraryBook(String title, String author) {
            this.title = title; this.author = author; this.isAvailable = true;
        }
        void borrow() {
            if (isAvailable) { isAvailable = false; System.out.println("Книга выдана."); }
            else System.out.println("Книга уже выдана.");
        }
        void returnBook() {
            if (!isAvailable) { isAvailable = true; System.out.println("Книга возвращена."); }
            else System.out.println("Книга уже находится в библиотеке.");
        }
    }

    // 25. MobilePhone
    static class MobilePhone {
        String brand; int batteryLevel; boolean isOn;
        MobilePhone(String brand, int batteryLevel) {
            this.brand = brand; this.batteryLevel = Math.max(0, Math.min(100, batteryLevel));
        }
        void turnOn() {
            if (batteryLevel > 0) { isOn = true; System.out.println("Телефон включён."); }
            else System.out.println("Батарея разряжена.");
        }
        void turnOff() { isOn = false; System.out.println("Телефон выключен."); }
        void useBattery(int amount) {
            if (amount < 0) { System.out.println("Неверное значение."); return; }
            batteryLevel = Math.max(0, batteryLevel - amount);
            if (batteryLevel == 0) isOn = false;
            System.out.println("Заряд батареи: " + batteryLevel + "%");
        }
    }

    // 27. Order
    static class Order {
        int orderNumber, quantity; String productName; double price;
        Order(int orderNumber, String productName, double price, int quantity) {
            this.orderNumber = orderNumber; this.productName = productName;
            this.price = price; this.quantity = quantity;
        }
        double total() { return price * quantity; }
        void changeQuantity(int quantity) {
            if (quantity >= 0) this.quantity = quantity;
            else System.out.println("Количество не может быть отрицательным.");
        }
    }

    // 28. Player
    static class Player {
        String name; int health, damage;
        Player(String name, int health, int damage) {
            this.name = name; this.health = Math.max(0, health); this.damage = Math.max(0, damage);
        }
        void takeDamage(int amount) {
            if (amount > 0) health = Math.max(0, health - amount);
            System.out.println(name + " получил урон. Здоровье: " + health);
        }
        void attack(Player other) {
            System.out.println(name + " атакует персонажа " + other.name);
            other.takeDamage(damage);
        }
    }

    // 29. Warehouse
    static class Warehouse {
        String productName; int quantity, capacity;
        Warehouse(String productName, int quantity, int capacity) {
            this.productName = productName; this.capacity = Math.max(0, capacity);
            this.quantity = Math.max(0, Math.min(quantity, capacity));
        }
        void add(int amount) {
            if (amount <= 0) System.out.println("Количество должно быть положительным.");
            else if (quantity + amount > capacity) System.out.println("Превышена вместимость склада.");
            else { quantity += amount; System.out.println("Добавлено. Остаток: " + quantity); }
        }
        void remove(int amount) {
            if (amount <= 0) System.out.println("Количество должно быть положительным.");
            else if (amount > quantity) System.out.println("На складе недостаточно товара.");
            else { quantity -= amount; System.out.println("Удалено. Остаток: " + quantity); }
        }
    }

    // 30. University
    static class Teacher {
        String name, subject;
        Teacher(String name, String subject) { this.name = name; this.subject = subject; }
        void show() { System.out.println("Преподаватель: " + name + ", предмет: " + subject); }
    }
    static class Course {
        String title; Teacher teacher; int hours;
        Course(String title, Teacher teacher, int hours) {
            this.title = title; this.teacher = teacher; this.hours = hours;
        }
        void show() {
            System.out.println("Курс: " + title + ", преподаватель: " + teacher.name + ", часов: " + hours);
        }
    }

    static void task1() {
        Student s = new Student("Али", 16, "2ПО525");
        s.show();
    }

    static void task2() {
        Car c1 = new Car("Toyota", "Camry", 2022);
        Car c2 = new Car("BMW", "M5", 2024);
        System.out.println(c1.brand + " " + c1.model + ", " + c1.year);
        System.out.println(c2.brand + " " + c2.model + ", " + c2.year);
    }

    static void task3() {
        Book b = new Book("Java для начинающих", "Иван Иванов", 250);
        System.out.println("Название: " + b.title + ", автор: " + b.author + ", страниц: " + b.pages);
    }

    static void task4() {
        Phone[] phones = {
            new Phone("Apple", "iPhone 14", 350000),
            new Phone("Samsung", "S24", 400000),
            new Phone("Xiaomi", "Redmi Note", 120000)
        };
        for (Phone p : phones) p.show();
    }

    static void task5() { new Cat("Мурка", 2).meow(); }
    static void task6() { new Dog("Рекс", "Овчарка").bark(); }

    static void task7() {
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Площадь: " + r.area() + ", периметр: " + r.perimeter());
    }

    static void task8() {
        Circle c = new Circle(5);
        System.out.printf("Площадь круга: %.2f%n", c.area());
    }

    static void task9() {
        Employee e = new Employee("Иван", "Программист", 350000);
        System.out.println(e.name + ", должность: " + e.position + ", зарплата: " + e.salary);
    }

    static void task10() {
        Laptop l1 = new Laptop("Lenovo", 16, 280000);
        Laptop l2 = new Laptop("ASUS", 32, 420000);
        System.out.println(l1.brand + ": " + l1.price);
        System.out.println(l2.brand + ": " + l2.price);
        System.out.println(l1.price > l2.price ? "Первый ноутбук дороже." :
                           l1.price < l2.price ? "Второй ноутбук дороже." : "Цены одинаковые.");
    }

    static void task11() {
        BankAccount a = new BankAccount("Али", 10000);
        a.deposit(5000); a.withdraw(2000); a.show();
    }

    static void task12() {
        Product p = new Product("Ноутбук", 300000, 4);
        System.out.println("Общая стоимость на складе: " + p.totalValue());
    }

    static void task13() {
        Student s = new Student("Али", 75, true);
        System.out.println(s.name + (s.passedExam() ? " сдал экзамен." : " не сдал экзамен."));
    }

    static void task14() {
        Counter c = new Counter();
        c.increase(); c.increase(); c.decrease();
        System.out.println("Счётчик: " + c.count);
        c.reset();
        System.out.println("После сброса: " + c.count);
    }

    static void task15() {
        new Movie("Интерстеллар", "Фантастика", 169).show();
    }

    static void task16() {
        Temperature t = new Temperature(25);
        System.out.println("Цельсий: " + t.celsius);
        System.out.println("Фаренгейт: " + t.toFahrenheit());
        System.out.println("Кельвин: " + t.toKelvin());
    }

    static void task17() {
        Point p = new Point(3, 4);
        System.out.println("Расстояние до начала координат: " + p.distance());
    }

    static void task18() {
        ShoppingCart cart = new ShoppingCart("Наушники", 15000, 2);
        System.out.println("Сумма: " + cart.total());
        cart.changeQuantity(3);
        System.out.println("После изменения количества: " + cart.total());
    }

    static void task19() {
        new Clock(9, 5, 7).show();
    }

    static void task20() {
        Flight f = new Flight("KC123", "Астана", 2);
        f.bookSeat(); f.bookSeat(); f.bookSeat();
    }

    static void task21() {
        Computer[] computers = {
            new Computer("HP", "Intel Core i5", 16, 300000),
            new Computer("Lenovo", "Intel Core i7", 32, 450000),
            new Computer("Apple", "M3", 16, 700000)
        };
        for (Computer c : computers) c.show();
    }

    static void task22() {
        BankAccount a1 = new BankAccount("Али", 10000);
        BankAccount a2 = new BankAccount("Данияр", 20000);
        a1.deposit(5000);
        a2.withdraw(3000);
        a1.show();
        a2.show();
    }

    static void task23() {
        LibraryBook b = new LibraryBook("Абай жолы", "Мухтар Ауэзов");
        b.borrow(); b.borrow(); b.returnBook();
    }

    static void task24() {
        Student[] students = {
            new Student("Али", 4.2), new Student("Данияр", 4.8),
            new Student("Аружан", 4.5), new Student("Айдана", 4.9),
            new Student("Еркебулан", 4.1)
        };
        Student best = students[0];
        for (Student s : students) if (s.averageGrade > best.averageGrade) best = s;
        System.out.println("Лучший студент: " + best.name + ", средний балл: " + best.averageGrade);
    }

    static void task25() {
        MobilePhone phone = new MobilePhone("Samsung", 80);
        phone.turnOn(); phone.useBattery(25); phone.turnOff();
    }

    static void task26() {
        Car car = new Car("Toyota", 50000, 40);
        car.drive(120, 10);
    }

    static void task27() {
        Order order = new Order(101, "Клавиатура", 12000, 2);
        System.out.println("Заказ №" + order.orderNumber + ", сумма: " + order.total());
        order.changeQuantity(3);
        System.out.println("Новая сумма: " + order.total());
    }

    static void task28() {
        Player p1 = new Player("Герой", 100, 25);
        Player p2 = new Player("Противник", 80, 20);
        p1.attack(p2);
        p2.attack(p1);
    }

    static void task29() {
        Warehouse w = new Warehouse("Монитор", 10, 15);
        w.add(3); w.add(5); w.remove(4);
    }

    static void task30() {
        Teacher t1 = new Teacher("Иван Петров", "Java");
        Teacher t2 = new Teacher("Анна Смирнова", "Математика");
        Student s1 = new Student("Али", 16, "IT-1");
        Student s2 = new Student("Данияр", 17, "IT-2");
        Course c1 = new Course("Основы Java", t1, 72);
        Course c2 = new Course("Математика", t2, 60);

        System.out.println("СТУДЕНТЫ:");
        s1.show(); s2.show();
        System.out.println("\nПРЕПОДАВАТЕЛИ:");
        t1.show(); t2.show();
        System.out.println("\nКУРСЫ:");
        c1.show(); c2.show();
    }

    public static void main(String[] args) {
        Runnable[] tasks = {
            Main::task1, Main::task2, Main::task3, Main::task4, Main::task5,
            Main::task6, Main::task7, Main::task8, Main::task9, Main::task10,
            Main::task11, Main::task12, Main::task13, Main::task14, Main::task15,
            Main::task16, Main::task17, Main::task18, Main::task19, Main::task20,
            Main::task21, Main::task22, Main::task23, Main::task24, Main::task25,
            Main::task26, Main::task27, Main::task28, Main::task29, Main::task30
        };

        while (true) {
            System.out.println("\n========== JAVA OOP: 30 ЗАДАНИЙ ==========");
            System.out.println("Введите номер задания от 1 до 30.");
            System.out.println("Введите 0 для выхода.");
            System.out.print("Ваш выбор: ");

            if (!sc.hasNextInt()) {
                System.out.println("Введите целое число.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }
            if (choice < 1 || choice > 30) {
                System.out.println("Нет задания с таким номером.");
                continue;
            }

            System.out.println("\n--- ЗАДАНИЕ " + choice + " ---");
            tasks[choice - 1].run();
        }
    }
}
