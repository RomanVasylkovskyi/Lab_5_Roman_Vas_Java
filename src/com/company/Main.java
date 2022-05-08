package com.company;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);


                System.out.print("введіть номер завдання >> ");
                int x = sc.nextInt();

                if (x == 1)
                {
                        Task1();
                }
                else {
                        Task2();
                }

        }

        public static void Task1()
        {
                quadrangle Quad1 = new quadrangle();
                quadrangle Quad2 = new quadrangle();

                System.out.println("////////////////////////// \n  Інформація 1 чотирикутника >>");
                Quad1.CreatPoint();
                Quad1.PointInfo();
                Quad1.getInfo();

                System.out.println("////////////////////////// \n  Інформація 2 чотирикутника >>");

                Quad2.CreatPoint();
                Quad2.PointInfo();
                Quad2.getInfo();

                if (Quad1.P()<Quad2.P()){
                        System.out.println(" \n Периметр 1 чотирикутника менший за периметр 2.");
                }
                if (Quad1.P()>Quad2.P()){
                        System.out.println(" \n Периметр 2 чотирикутника менший за периметр 1.");
                }
        }

        public  static  void Task2(){

                trapezoid Trapez1 = new trapezoid();
                trapezoid Trapez2 = new trapezoid();
                trapezoid Trapez3 = new trapezoid();

                System.out.println("трапеція 1");
                Trapez1.CreatPoint();
                System.out.println("трапеція 2");
                Trapez2.CreatPoint();
                System.out.println("трапеція 3");
                Trapez3.CreatPoint();

                System.out.println("\n");
                if (Trapez1.SL()> Trapez2.SL() && Trapez1.SL()> Trapez3.SL()){

                        System.out.println("У трапеції 1 максимальна середня лінія");

                }
                if (Trapez2.SL()> Trapez1.SL() && Trapez2.SL()> Trapez3.SL()){

                        System.out.println("У трапеції 2 максимальна середня лінія");

                }
                if (Trapez3.SL()> Trapez2.SL() && Trapez3.SL()> Trapez1.SL()){

                        System.out.println("У трапеції 3 максимальна середня лінія");

                }





        }



}
