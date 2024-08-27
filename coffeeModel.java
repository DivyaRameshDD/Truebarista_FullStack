package com.coffee.barista;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Customer")
public class coffeeModel {
   @Id     //primary key
   @GeneratedValue
   int sno;
   String name; //default column name
   void setSno(int sno){
    this.sno=sno;
}
void setName(String name){
    this.name=name;
}
int getSno(){
    return this.sno;
}
String getName(){
    return this.name;

}
}
