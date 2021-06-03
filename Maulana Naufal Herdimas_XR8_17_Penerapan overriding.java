/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
/**
 *
 * @author MOKLET-1
 */
class Nama{
 public void Sapa(){
  System.out.println("Maulana Naufal herdimas");
 }
 public static void main(String [] args){
  Siapa ss;
  Nama nn;
  ss = new Siapa();
  nn = new Nama();
  
  ss.Sapa();//memanggil method Sapa() pada class Siapa
  nn.Sapa();//memanggil method Sapa() pada class Nama
 }
}
class Siapa extends Nama{
 //Method Sapa() pada class Nama di override
 public void Sapa(){
  System.out.println("Lestari Unah Uwaw");
 }
}