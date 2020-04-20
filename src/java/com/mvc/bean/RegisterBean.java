/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.bean;

/**
 *
 * @author USER
 */
public class RegisterBean {
    
private String name;
 private String address;
 private String phone;
 private String gender;
 private String email;
 private String password;
 
 public void setname(String name) {
 this.name = name;
 }
 public String getname() {
 return name;
 }
 
 public String getaddress() {
 return address;
 }
 public void setaddress(String address) {
 this.address = address;
 }
 
 public String getphone() {
 return phone;
 }
 public void setphone(String phone) {
 this.phone = phone;
 }
 
 public String getgender() {
 return gender;
 }
 public void setgender(String gender) {
 this.gender = gender;
 }
 
 public String getPassword() {
 return password;
 }
 public void setPassword(String password) {
 this.password = password;
 }

 public void setEmail(String email) {
 this.email = email;
 }
 public String getEmail() {
 return email;
 }
}