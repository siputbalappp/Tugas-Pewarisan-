/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author ASUS
 */
public interface Phone {
int MAX_VOLUME = 100;
  int MIN_VOLUME = 0;
  
  void powerOn ();
  void powerOff ();
  void volumeUp ();
  void volumeDown ();
}
