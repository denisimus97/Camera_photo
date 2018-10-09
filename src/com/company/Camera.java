package com.company;

public class Camera {
    enum Plenka {on,off} // есть ли пленка
    enum Peremot {on,off} // перемотан ли кадр
    Peremot o;
    Plenka not;
    final  int emkost=10 ; // емкость пленки
     static int cadr=0;
    int ost;
    String model;    // модель
    double pixel;        // число мегапикселей
    Camera(String model, double pixel) {
        this.model = model;
        this.pixel = pixel;
        cadr=0;
        not=Plenka.off;
        o=Peremot.on;
    }
    void peremot() //перемотка кадра
    {
     if (not==Plenka.off )
     {System.out.print("");}
     else
     if (cadr==emkost | cadr==0|o==Peremot.on)
    {System.out.println("Нельзя перемотать!"); }
    else
        System.out.println("Перемотка выполнена!");
        o=Peremot.on;
    }
    void makephoto() //делаем фото
    {  if (cadr<10 &  o==Peremot.on& not==Plenka.on)
    {
        cadr=cadr+1;
        ost=emkost-cadr;
        System.out.println("Фото сделано! "+ "Осталось "+ ost+"  кадров" );
        o=Peremot.off;}
        else
        if (cadr==emkost)
        System.out.println("Пленка заполнена! Смените!");
        else
        if (not==Plenka.off)
            System.out.print("");
        else
        if (o==Peremot.off )
            System.out.println("Нажмите кнопку перемотка! ");
    }
    void change() //смена пленки
    { if (not==Plenka.off |cadr==emkost | ost==0 )
    { System.out.println("Новая пленка вставлена!");
       not=Plenka.on;
    }
    else System.out.println("Руки прочь! Старая пленка еще не заполнена!");

    }
    void displayInfo(){
        System.out.println("Model: "+model+ " Pixel:"+ pixel+"    ");
    }
}
