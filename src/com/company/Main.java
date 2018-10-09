package com.company;

public class Main {

    public static void main(String[] args) {

        Camera samsung = new Camera("Samsung", 25); // вызов третьего конструктора с двумя параметрами
        samsung.displayInfo();
        //1.тыкаем  на кнопки без пленки. Ничего не выводит ");
        samsung.makephoto();
        samsung.peremot();
        //2. Вставили пленку и пытаемся перемотать  без фоток.2-3 строка вывода
        samsung.change();
        samsung.peremot();
         //3. фото, перемотка 4-5 строка вывода.
        samsung.makephoto();
        samsung.peremot();
         //4.Пытаемся сменить незаполненную пленку. 6 строка вывода
        samsung.change();
        // 5.Пытаемся фоткать без перемокти. 7-8 строка вывода.  Только 1 фото без перемотки!
        samsung.makephoto();
        samsung.makephoto();

}
}
